/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.models.MedicamentoMarca
 * @version 1.0.0
 */
public class MedicamentoMarca extends Medicamento{
    
    /**
     * Fabricante del medicamento.
     */
    private String fabricante;

    /**
     * 
     * Constructor heredado de la clase Medicamento.
     * @param nombre Es el nombre del medicamento.
     * @param descripcion Es la descripción del medicamento.
     * @param costo Es el costo del medicamento.
     * @param cantidad Es la cantidad de medicamento.
     * @param enfermedadQueAlivia Es la enfermedad que el medicamento está diseñado para aliviar.
     * @param fabricante Es el fabricante del medicamento
     */
    public MedicamentoMarca(String fabricante, String nombre, String descripcion, double costo,  String enfermedadQueAlivia, int cantidad) {
        super(nombre, descripcion, costo,0.0, enfermedadQueAlivia, cantidad);
        this.fabricante = fabricante;
         calcularPrecioVenta();
    }

    /**
     * Obtiene el fabricante del medicamento de marca.
     * 
     * @return Retorna el nombre del fabricante del medicamento.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Establece el fabricante del medicamento de marca.
     * 
     * @param fabricante Es el nombre del fabricante del medicamento.
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Método que calcula el precio de venta de un medicamento de marca.
     * El precio de venta se calcula sumando un 25% al costo del medicamento.
     * Este método actualiza el valor del precio de venta del medicamento.
     */
    @Override
    public void calcularPrecioVenta() {
        setPrecioVenta(getCosto() + (getCosto() * 0.25));
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Fabricante: " + fabricante;
    }
    
}
