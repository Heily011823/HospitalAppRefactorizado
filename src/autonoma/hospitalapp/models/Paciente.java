package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.CamposObligatoriosException;
import autonoma.hospitalapp.exceptions.CaracteresEspecialesException;
import autonoma.hospitalapp.exceptions.MedicamentoNoEncontradoException;
import autonoma.hospitalapp.exceptions.PacienteNoEncontradoException;
import java.util.ArrayList;

/**
 *
 * @author María Paz Puerta Acevedo
 * @since 20250414
 * @version 1.0.0
 */
public class Paciente {

    /**
     * Nombre completo del paciente.
     */
    private String nombre;

    /**
     * Número de documento del paciente.
     */
    private String documento;

    /**
     * Edad actual del paciente.
     */
    private int edad;

    /**
     * Correo electrónico del paciente.
     */
    private String correo;

    /**
     * Número de teléfono del paciente.
     */
    private String telefono;

    /**
     * Estado del paciente (ACTIVO o INACTIVO).
     */
    private EstadoPaciente estadoPaciente;

    /**
     * Lista de enfermedades que tiene o ha tenido el paciente.
     */
    private ArrayList<Enfermedad> enfermedades;

    /**
     * Lista de medicamentos asociados al paciente.
     */
    private ArrayList<Medicamento> medicinas;

    /**
     * Estados posibles del paciente.
     */
    public enum EstadoPaciente {
        SALUDABLE, CRITICO
    }

    /**
     * Constructor de la clase Paciente.
     */
    public Paciente(String nombre, String documento, int edad, String correo,
                    String telefono, String estadoPaciente,
                    ArrayList<Enfermedad> enfermedades,
                    ArrayList<Medicamento> medicinas) {

        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;

        // Conversión segura de String a Enum 
        this.estadoPaciente = EstadoPaciente.valueOf(estadoPaciente.toUpperCase());

        //Defensive Programming
        this.enfermedades = (enfermedades != null) ? enfermedades : new ArrayList<>();
        this.medicinas = (medicinas != null) ? medicinas : new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public EstadoPaciente getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(EstadoPaciente estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList<Medicamento> getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(ArrayList<Medicamento> medicinas) {
        this.medicinas = medicinas;
    }

    /**
     * Agrega una enfermedad al paciente si aún no la tiene.
     */
    public boolean agregarEnfermedad(Enfermedad enfermedad)
            throws CamposObligatoriosException,
                   PacienteNoEncontradoException,
                   CaracteresEspecialesException {

        for (Enfermedad e : enfermedades) {
            if (e.getNombre().equalsIgnoreCase(enfermedad.getNombre())) {
                return false;
            }
        }
        enfermedades.add(enfermedad);
        return true;
    }

    /**
     * Cura una enfermedad del paciente utilizando un medicamento.
     */
    public String curarEnfermedad(String enfermedad, Medicamento medicamento)
            throws CamposObligatoriosException,
                   PacienteNoEncontradoException,
                   CaracteresEspecialesException,
                   MedicamentoNoEncontradoException {

        for (Enfermedad e : enfermedades) {
            if (e.getNombre().equalsIgnoreCase(enfermedad)) {

                if (medicamento.getEnfermedadQueAlivia().equalsIgnoreCase(enfermedad)) {
                    enfermedades.remove(e);
                    medicinas.add(medicamento);
                    return "La enfermedad '" + enfermedad
                            + "' ha sido curada con el medicamento '"
                            + medicamento.getNombre() + "'.";
                } else {
                    return "El medicamento '" + medicamento.getNombre()
                            + "' no alivia la enfermedad '" + enfermedad + "'.";
                }
            }
        }
        return "La enfermedad '" + enfermedad + "' no fue encontrada en el paciente.";
    }
}
