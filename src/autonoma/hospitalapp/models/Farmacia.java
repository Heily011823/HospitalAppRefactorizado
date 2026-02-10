/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.HospitalEnQuiebraException;
import autonoma.hospitalapp.exceptions.MedicamentoNoEncontradoException;
import java.util.ArrayList;

/**
 * 
 * 
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @version 1.0.0
 */
public class Farmacia {
    
    /**
     * Inventario de medicamentos de la farmacia.
     */
    private Inventario inventario;
    
    /**
     * Hospital asociado a la farmacia.
     */
    private Hospital hospital;

    /**
     * Constructor de la clase Farmacia.
     * 
     * @param inventario El inventario de medicamentos.
     */
    public Farmacia(Inventario inventario, Hospital hospital) {
        this.inventario = inventario;
        this.hospital = hospital;
       
    }

    /**
     * Obtiene el inventario de la farmacia.
     * 
     * @return el inventario actual
     */
    public Inventario getInventario() {
        return inventario;
    }

    /**
     * Establece un nuevo inventario para la farmacia.
     * 
     * @param inventario nuevo inventario
     */
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

  
    

    /**
     * Agrega un medicamento al inventario de la farmacia y descuenta su costo del presupuesto del hospital.
     * Lanza una excepción si el hospital está en quiebra.
     * 
     * @param medicamento El medicamento a agregar
     * @param cantidad La cantidad del medicamento a agregar
     * @throws HospitalEnQuiebraException Si el hospital está en quiebra
     */
    public void agregarMedicamento(Medicamento medicamento, int cantidad) throws HospitalEnQuiebraException {
        if (hospital.visualizarEstado().equals("El hospital está en quiebra.")) {
            throw new HospitalEnQuiebraException();
        }
        
        double costoTotal = oganizarPreciosMed(medicamento, cantidad);
        hospital.descontarDelPresupuesto(costoTotal);
        inventario.agregarMedicamento(medicamento, cantidad);
        System.out.println("Medicamento " + medicamento.getNombre() + " agregado al inventario.");
    }
    
     /**
     * se organiza el precio total los medicamentos que s evan a comprar 
     * y los medicamentso se ponen en precio de venta 
     * 
     * @param medicamento El medicamento a agregar
     * @param cantidad La cantidad del medicamento a agregar
    */
    
    public double oganizarPreciosMed(Medicamento medicamento, int cantidad){
        
        double costoTotal = medicamento.getCosto() * cantidad;
        medicamento.calcularPrecioVenta(); 
        return costoTotal;    
    }

    /**
     * Elimina un medicamento del inventario por su nombre.
     * 
     * @param nombre Nombre del medicamento a eliminar
     * @return true si se eliminó exitosamente, false si no se encontró
     */
    public boolean eliminarMedicamento(String nombre) {
        return inventario.eliminarMedicamento(nombre);
    }

    /**
     * Busca un medicamento en el inventario por su nombre.
     * 
     * @param nombre Nombre del medicamento a buscar
     * @return El medicamento encontrado
     * @throws MedicamentoNoEncontradoException Si el medicamento no existe en el inventario
     */
    public Medicamento buscarMedicamento(String nombre) throws MedicamentoNoEncontradoException {
        Medicamento medicamento = inventario.buscarPorNombre(nombre);
        if (medicamento != null) {
            return medicamento;
        } else {
            throw new MedicamentoNoEncontradoException();
        }
    }

    /**
     * Obtiene la lista de todos los medicamentos disponibles en el inventario.
     * 
     * @return Lista de objetos {@link Medicamento}
     */
    public ArrayList<Medicamento> obtenerMedicamentos() {
        return inventario.obtenerListaMedicamentos();
    }
}
