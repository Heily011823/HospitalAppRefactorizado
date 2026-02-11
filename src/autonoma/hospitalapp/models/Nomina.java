/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.time.LocalDate;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @version 1.0.0
 * 
 */
public class Nomina {

    /**
     * Identificador del empleado al que corresponde la nómina.
     */
    private String id;

    /**
     * Fecha en la que se generó la nómina.
     */
    private LocalDate fecha;

    /**
     * Total pagado al empleado en la nómina.
     */
    private double totalPagado;

    /**
     * Constructor que permite crear una nueva instancia de {@code Nomina}.
     * 
     * @param id Identificador del empleado.
     * @param fecha Fecha de generación de la nómina.
     * @param totalPagado Monto total pagado.
     */
    public Nomina(String id, LocalDate fecha, double totalPagado) {
        this.id = id;
        this.fecha = fecha;
        this.totalPagado = totalPagado;
    }

    /**
     * Obtiene el identificador del empleado.
     * 
     * @return Identificador del empleado.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del empleado.
     * 
     * @param id Identificador a asignar.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha de la nómina.
     * 
     * @return Fecha de generación.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la nómina.
     * 
     * @param fecha Nueva fecha.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el total pagado en la nómina.
     * 
     * @return Total pagado.
     */
    public double getTotalPagado() {
        return totalPagado;
    }

    /**
     * Establece el total pagado en la nómina.
     * 
     * @param totalPagado Nuevo valor a pagar.
     */
    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }
    
    /**
     * Genera un resumen con la información de la nómina.
     * @return Retorna la información de la nomina.
     */
    public String generarDetalleNomina() {
        return "Empleado: " + id +
               ", Fecha: " + fecha +
               ", Total Pagado: $" + totalPagado;
    }

    /**
     * Valida si el pago de la nómina es correcto.
     * @return Retorna true si el pago es válido y false si no es válido.
     */
    public boolean esPagoValido() {
        if (totalPagado > 0) {
            System.out.println("El pago es valido");
            return true;
        } else {
            System.out.println("El pago no es valido");
            return false;
        }
    }

}