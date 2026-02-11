/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.CamposObligatoriosException;
import autonoma.hospitalapp.exceptions.CaracteresEspecialesException;
import autonoma.hospitalapp.exceptions.CorreoInvalidoException;
import autonoma.hospitalapp.exceptions.DatoInvalidoException;
import autonoma.hospitalapp.exceptions.EstadoDePacienteInvalidoException;
import autonoma.hospitalapp.exceptions.HospitalEnQuiebraException;
import autonoma.hospitalapp.exceptions.MedicamentoNoEncontradoException;
import autonoma.hospitalapp.exceptions.PacienteDuplicadoException;
import autonoma.hospitalapp.exceptions.PacienteNoEncontradoException;
import autonoma.hospitalapp.exceptions.PresupuestoNegativoException;
import java.util.ArrayList;

/**
 * @author Heily Yohana Rios Ayala
 * @version 1.0.0
 * @since 20250414
 */
public class SistemaCentral {

    /**
     * Hospital gestionado por el sistema central.
     */
    private Hospital hospital;

    /**
     * Crea una nueva instancia del sistema central con el hospital especificado.
     * 
     * @param hospital Hospital que se gestionará a través del sistema central.
     */
    public SistemaCentral(Hospital hospital) {
        this.hospital = hospital;
    }

    /**
     * Obtiene el hospital asociado.
     * 
     * @return El hospital.
     */
    public Hospital getHospital() {
        return hospital;
    }

    /**
     * Establece el hospital que será gestionado.
     * 
     * @param hospital El nuevo hospital.
     */
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    /**
     * Agrega un nuevo empleado al hospital.
     * 
     * @param empleado El empleado a agregar.
     */
    public void agregarEmpleados(Empleado empleado) {
        hospital.agregarEmpleado(empleado);
    }

    /**
     * Elimina un empleado por su nombre.
     * 
     * @param nombre Nombre del empleado a eliminar.
     * @return true si fue eliminado exitosamente, false en caso contrario.
     */
    public boolean eliminarEmpleado(String nombre) {
        return hospital.eliminarEmpleado(nombre);
    }

    /**
     * Busca un empleado por su nombre.
     * 
     * @param nombre Nombre del empleado.
     * @return El empleado encontrado o null si no existe.
     */
    public Empleado buscarEmpleado(String nombre) {
        return hospital.buscarEmpleado(nombre);
    }

    /**
     * Actualiza la información de un empleado existente.
     * 
     * @param empleado Empleado con los datos actualizados.
     */
    public void actualizarEmpleado(Empleado empleado) {
        hospital.actualizarEmpleado(empleado.getNombre(), empleado);
    }

    /**
     * Obtiene la lista de empleados registrados en el hospital.
     * 
     * @return Lista de empleados.
     */
    public ArrayList<Empleado> obtenerEmpleados() {
        return hospital.getEmpleados();
    }

    /**
     * Agrega un nuevo paciente al hospital.
     * 
     * @param paciente El paciente a agregar.
     * @throws DatoInvalidoException Si algún dato es inválido.
     * @throws CamposObligatoriosException Si hay campos obligatorios vacíos.
     * @throws PacienteDuplicadoException Si el paciente ya existe.
     * @throws CorreoInvalidoException Si el correo no es válido.
     * @throws CaracteresEspecialesException Si contiene caracteres inválidos.
     * @throws EstadoDePacienteInvalidoException Si el estado no es válido.
     */
    public void agregarPacientes(Paciente paciente) throws DatoInvalidoException, CamposObligatoriosException,
            PacienteDuplicadoException, CorreoInvalidoException, CaracteresEspecialesException,
            EstadoDePacienteInvalidoException {
        hospital.agregarPaciente(paciente);
    }

    /**
     * Elimina un paciente por su nombre.
     * 
     * @param nombre Nombre del paciente.
     * @return true si fue eliminado exitosamente.
     * @throws PacienteNoEncontradoException Si no se encuentra el paciente.
     */
    public boolean eliminarPaciente(String nombre) throws PacienteNoEncontradoException {
        return hospital.eliminarPaciente(nombre);
    }

    /**
     * Busca un paciente por su nombre.
     * 
     * @param nombre Nombre del paciente.
     * @return El paciente encontrado o null si no existe.
     */
    public Paciente buscarPaciente(String nombre) {
        return hospital.buscarPaciente(nombre);
    }

    /**
     * Actualiza la información de un paciente existente.
     * 
     * @param paciente Paciente con datos actualizados.
     * @throws DatoInvalidoException Si hay un dato incorrecto.
     * @throws CamposObligatoriosException Si hay campos vacíos.
     * @throws PacienteDuplicadoException Si ya existe otro paciente con ese nombre.
     * @throws CorreoInvalidoException Si el correo no es válido.
     * @throws CaracteresEspecialesException Si hay caracteres especiales inválidos.
     * @throws EstadoDePacienteInvalidoException Si el estado no es permitido.
     */
    public void actualizarPaciente(Paciente paciente) throws DatoInvalidoException, CamposObligatoriosException,
            PacienteDuplicadoException, CorreoInvalidoException, CaracteresEspecialesException,
            EstadoDePacienteInvalidoException {
        hospital.actualizarPaciente(paciente.getNombre(), paciente);
    }

    /**
     * Realiza la compra de un medicamento para el hospital.
     * 
     * @param medicamento Medicamento a comprar.
     * @param cantidad Cantidad a comprar.
     * @throws HospitalEnQuiebraException Si el hospital no tiene presupuesto suficiente.
     */
    public void realizarCompra(Medicamento medicamento, int cantidad) throws HospitalEnQuiebraException, PresupuestoNegativoException {
        hospital.comprarMedicamento(medicamento, cantidad);
    }

    /**
     * Elimina un medicamento del inventario por su nombre.
     * 
     * @param nombre Nombre del medicamento.
     * @return true si fue eliminado.
     * @throws MedicamentoNoEncontradoException Si no se encuentra el medicamento.
     */
    public boolean eliminarMedicamento(String nombre) throws MedicamentoNoEncontradoException {
        return hospital.eliminarMedicamento(nombre);
    }

    /**
     * Obtiene la lista de medicamentos del hospital.
     * 
     * @return Lista de medicamentos.
     */
    public ArrayList<Medicamento> obtenerMedicamentos() {
        return hospital.obtenerMedicamentos();
    }

    /**
     * Busca un medicamento por su nombre.
     * 
     * @param nombre Nombre del medicamento.
     * @return El medicamento encontrado.
     * @throws MedicamentoNoEncontradoException Si el medicamento no está en el inventario.
     */
    public Medicamento buscarMedicamento(String nombre) throws MedicamentoNoEncontradoException {
        Medicamento medicamento = hospital.buscarMedicamento(nombre);
        if (medicamento != null) {
            return medicamento;
        } else {
            throw new MedicamentoNoEncontradoException();
        }
    }

    /**
     * Genera la nómina de los empleados, descontando el total del presupuesto.
     * 
     * @throws HospitalEnQuiebraException Si el presupuesto es insuficiente o el hospital está en quiebra.
     */
    public void generarNomina() throws HospitalEnQuiebraException, PresupuestoNegativoException {
        if (!hospital.isEstadoHospital()) {
            throw new HospitalEnQuiebraException();
        }

        double totalNomina = 0;
        for (Empleado empleado : hospital.getEmpleados()) {
            totalNomina += empleado.calcularSalario();
        }

        if (hospital.getPresupuesto() >= totalNomina) {
            hospital.generarNomina();
            hospital.descontarDelPresupuesto(totalNomina);
        } else {
            throw new HospitalEnQuiebraException();
        }
    }
}