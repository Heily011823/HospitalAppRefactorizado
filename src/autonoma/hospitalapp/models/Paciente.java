/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.CamposObligatoriosException;
import autonoma.hospitalapp.exceptions.CaracteresEspecialesException;
import autonoma.hospitalapp.exceptions.MedicamentoNoEncontradoException;
import autonoma.hospitalapp.exceptions.PacienteDuplicadoException;
import autonoma.hospitalapp.exceptions.PacienteNoEncontradoException;
import java.util.ArrayList;

/**
 *
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.models.Paciente
 * @version 1.0.0
 * 
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
     * Estado del paciente (true si está activo, false si no lo está).
     */
    private String estadoPaciente;

    /**
     * Lista de enfermedades que tiene o ha tenido el paciente.
     */
    private ArrayList<Enfermedad> enfermedades;

    /**
     * Lista de medicamentos asociados al paciente.
     */
    private ArrayList<Medicamento> medicinas;

    /**
     * Constructor de la clase Paciente.
     * 
     * @param nombre Es el nombre del paciente.
     * @param documento Es el documento de identidad del paciente.
     * @param edad Es la edad del paciente.
     * @param correo Es el correo electrónico del paciente.
     * @param telefono Es el número de teléfono del paciente.
     * @param estadoPaciente Es el estado del paciente (activo o inactivo).
     * @param enfermedades Es la lista de enfermedades que tiene el paciente.
     * @param medicinas Es la lista de medicamentos que está tomando el paciente.
     */
    public Paciente(String nombre, String documento, int edad, String correo, String telefono, String estadoPaciente, ArrayList<Enfermedad> enfermedades, ArrayList<Medicamento> medicinas) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estadoPaciente = estadoPaciente;
        this.enfermedades = enfermedades;
        this.medicinas = medicinas;
    }

    /**
     * Obtiene el nombre del paciente.
     * @return Retorna el nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del paciente.
     * @param nombre Es el nombre del paciente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento del paciente.
     * @return Retorna el documento del paciente.
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Establece el documento del paciente.
     * @param documento Es el documento del paciente.
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Obtiene la edad del paciente.
     * @return Retorna la edad del paciente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del paciente.
     * @param edad Es la edad del paciente.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el correo electrónico del paciente.
     * @return Retorna el correo electrónico del paciente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del paciente.
     * @param correo Es el correo electrónico del paciente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el número de teléfono del paciente.
     * @return Retorna el número de teléfono del paciente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del paciente.
     * @param telefono Es el número de teléfono del paciente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el estado del paciente (activo o inactivo).
     * @return Retorna el estado del paciente.
     */
    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    /**
     * Establece el estado del paciente (activo o inactivo).
     * @param estadoPaciente Es el estado del paciente.
     */
    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    /**
     * Obtiene la lista de enfermedades del paciente.
     * @return La lista de enfermedades del paciente.
     */
    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    /**
     * Establece la lista de enfermedades del paciente.
     * @param enfermedades Es la lista de enfermedades del paciente.
     */
    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    /**
     * Obtiene la lista de medicamentos que el paciente está tomando.
     * @return Retorna la lista de medicamentos del paciente.
     */
    public ArrayList<Medicamento> getMedicinas() {
        return medicinas;
    }

    /**
     * Establece la lista de medicamentos que el paciente está tomando.
     * @param medicinas Es la lista de medicamentos del paciente.
     */
    public void setMedicinas(ArrayList<Medicamento> medicinas) {
        this.medicinas = medicinas;
    }
    
    /**
     * Agrega una enfermedad al paciente si aún no la tiene.
     * @param enfermedad La enfermedad que se desea agregar.
     * @return true si se agregó correctamente, false si ya existía.
     * @throws CamposObligatoriosException Si algún campo obligatorio no está presente al agregar la enfermedad.
     * @throws PacienteNoEncontradoException Si el paciente no se encuentra en el sistema.
     * @throws CaracteresEspecialesException Si la enfermedad contiene caracteres especiales no permitidos.
     */
    public boolean agregarEnfermedad(Enfermedad enfermedad) throws CamposObligatoriosException, PacienteNoEncontradoException, CaracteresEspecialesException{
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
     * 
     * Si el medicamento alivia la enfermedad especificada, se elimina la enfermedad de la lista de enfermedades del paciente
     * y el medicamento se añade a la lista de medicinas del paciente.
     * 
     * @param enfermedad Es el nombre de la enfermedad que se desea curar.
     * @param medicamento Es el medicamento que se utilizará para curar la enfermedad.
     * @return Retorna un mensaje indicando si la enfermedad fue curada o no.
     * @throws CamposObligatoriosException Si algún campo obligatorio no está presente.
     * @throws PacienteNoEncontradoException Si el paciente no se encuentra en el sistema.
     * @throws CaracteresEspecialesException Si alguno de los campos contiene caracteres especiales no permitidos.
     * @throws MedicamentoNoEncontradoException Si el medicamento no se encuentra en el sistema.
     */
    public String curarEnfermedad(String enfermedad, Medicamento medicamento) throws CamposObligatoriosException, PacienteNoEncontradoException, CaracteresEspecialesException, MedicamentoNoEncontradoException{
        for (Enfermedad e : enfermedades) {
            if (e.getNombre().equalsIgnoreCase(enfermedad)) {
                if (medicamento.getEnfermedadQueAlivia().equalsIgnoreCase(enfermedad)) {
                    enfermedades.remove(e);
                    medicinas.add(medicamento);
                    return "La enfermedad '" + enfermedad + "' ha sido curada con el medicamento '" + medicamento.getNombre() + "'.";
                } else {
                    return "El medicamento '" + medicamento.getNombre() + "' no alivia la enfermedad '" + enfermedad + "'.";
                }
            }
        }
        return "La enfermedad '" + enfermedad + "' no fue encontrada en el paciente.";
    }
}
