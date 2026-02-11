/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * 
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @version 1.0.0
 */
public class EmpleadoOperativo extends Empleado {
    
    /**
     * Área del hospital en la que trabaja el empleado operativo.
     */
    private String area;
    
    /**
    * Porcentaje de incremento aplicado al salario base del empleado operativo (20%).
    */
    private static final double INCREMENTO_SALARIO_OPERATIVO = 0.20;

    /**
     * Constructor que inicializa los atributos del empleado operativo.
     * 
     * @param area Área de trabajo del empleado
     * @param nombre Nombre del empleado
     * @param documento Documento de identidad del empleado
     * @param edad Edad del empleado
     * @param salarioBase Salario base del empleado
     */
    public EmpleadoOperativo(String area, String nombre, String documento, int edad, double salarioBase) {
        super(nombre, documento, edad, salarioBase);
        this.area = area;
    }

    /**
     * Obtiene el área en la que trabaja el empleado operativo.
     * 
     * @return área de trabajo
     */
    public String getArea() {
        return area;
    }

    /**
     * Establece el área de trabajo del empleado operativo.
     * 
     * @param area nueva área de trabajo
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Calcula el salario total del empleado operativo.
     * El salario se incrementa en un 20% sobre el salario base.
     * 
     * @return salario total calculado
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + INCREMENTO_SALARIO_OPERATIVO);
    }

    /**
     * Devuelve el tipo de empleado.
     * 
     * @return cadena "Operativo"
     */
    @Override
    public String getTipoEmpleado() {
        return "Operativo";
    }

    /**
     * Devuelve una representación en forma de texto de la información del empleado operativo.
     * 
     * @return información detallada del empleado
     */
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Área de trabajo: " + area;
    }
}