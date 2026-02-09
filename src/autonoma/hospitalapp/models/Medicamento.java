/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.models.Medicamento
 * @version 1.0.0
 */
public abstract class Medicamento {
    /**
     * Nombre del medicamento.
     */
    private String nombre;
    
    /**
     * Descripción general del medicamento.
     */
    private String descripcion;
    
    /**
     * Costo de fabricación del medicamento.
     */
    private double costo;
    
    /**
     * Precio de venta del medicamento.
     */
    private double precioVenta;
    
    /**
     * Enfermedad que alivia el medicamento.
     */
    private String enfermedadQueAlivia;
    
    
     private int cantidad;

    /**
     * Constructor de la clase Medicamento.
     * @param nombre Es el nombre del medicamento.
     * @param descripcion Es la descripción del medicamento.
     * @param costo Es el costo del medicamento.
     * @param precioVenta Es el precio de venta del medicamento.
     * @param enfermedadQueAlivia Es la enfermedad que el medicamento está diseñado para aliviar.
     */
    public Medicamento(String nombre, String descripcion, double costo, double precioVenta, String enfermedadQueAlivia, int cantidad) {    
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.enfermedadQueAlivia = enfermedadQueAlivia;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el nombre del medicamento.
     * 
     * @return Retorna el nombre del medicamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del medicamento.
     * 
     * @param nombre Es el nuevo nombre del medicamento.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del medicamento.
     * 
     * @return Retorna la descripción del medicamento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del medicamento.
     * 
     * @param descripcion Es la nueva descripción del medicamento.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el costo del medicamento.
     * 
     * @return Retorna el costo del medicamento.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Establece el costo del medicamento.
     * 
     * @param costo Es el nuevo costo del medicamento.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el precio de venta del medicamento.
     * 
     * @return Retorna el precio de venta del medicamento.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Establece el precio de venta del medicamento.
     * 
     * @param precioVenta Es el nuevo precio de venta del medicamento.
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Obtiene la enfermedad que el medicamento alivia.
     * 
     * @return Retorna el nombre de la enfermedad que alivia el medicamento.
     */
    public String getEnfermedadQueAlivia() {
        return enfermedadQueAlivia;
    }

    /**
     * Establece la enfermedad que el medicamento alivia.
     * 
     * @param enfermedadQueAlivia Es el nombre de la enfermedad que alivia el medicamento.
     */
    public void setEnfermedadQueAlivia(String enfermedadQueAlivia) {
        this.enfermedadQueAlivia = enfermedadQueAlivia;
    }

    /**
     * Obtiene la cantidad del medicamento.
     * @return Retorna la cantidad del medicamento.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del medicamento.
     * @param cantidad Es la cantidad del medicamento.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    /**
     * Método abstracto para calcular el precio de venta del medicamento.
     * Este método debe ser implementado en las subclases para calcular el precio de acuerdo
     * a las características específicas del tipo de medicamento.
     */
    public abstract void calcularPrecioVenta();
    
    /**
     * Devuelve una representación en forma de texto de la información del medicamento.
     * 
     * @return Retorna la información del medicamento como cadena de texto. 
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Descripcion: " + descripcion + "\n" +
               "Costo: " + costo+ "\n" +
               "Precio venta: " + precioVenta + "\n" +
               "Enfermedad que alivia : "+ enfermedadQueAlivia + "\n" +
                "Cantidad : " + cantidad;
    }
}
   
