/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.models.MedicamentoGenerico
 * @version 1.0.0
 */
public class MedicamentoGenerico extends Medicamento{

    /**
     * Constructor heredado de la clase Medicamento.
     * @param nombre Es el nombre del medicamento.
     * @param descripcion Es la descripción del medicamento.
     * @param costo Es el costo del medicamento.
     * @param enfermedadQueAlivia Es la enfermedad que el medicamento está diseñado para aliviar.
     * @param cantidad Es la cantidad de medicamento.
     */
    public MedicamentoGenerico(String nombre, String descripcion, double costo,  String enfermedadQueAlivia, int cantidad) {   
        super(nombre, descripcion, costo, 0.0, enfermedadQueAlivia, cantidad);
         calcularPrecioVenta();
    }

    /**
     * Método que calcula el precio de venta de un medicamento genérico.
     * El precio de venta se calcula sumando un 10% al costo del medicamento.
     * Este método actualiza el valor del precio de venta del medicamento.
     */
    @Override
    public void calcularPrecioVenta() {
        setPrecioVenta(getCosto() + (getCosto() * 0.10));
    }
    
    /**
     * Devuelve una representación en cadena del objeto, utilizando la implementación 
     * de la clase padre para generar la cadena.
     * @return La representación en cadena del objeto, generada por la superclase.
     */
    @Override
    public String toString() {
        return super.toString();
    }
    
}
