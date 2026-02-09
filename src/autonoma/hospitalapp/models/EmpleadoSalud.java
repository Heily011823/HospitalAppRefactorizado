/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @version 1.0.0
 */
public class EmpleadoSalud extends Empleado {
    
    /**
     * Especialidad del empleado del área de salud por ejemplo: medicina general, pediatría, entre otros.
     */
    private String especialidad;

    /**
     * Número de horas trabajadas por el empleado.
     */
    private int horasTrabajadas;

    /**
     * Constructor para crear un empleado del área de salud.
     * 
     * @param especialidad Especialidad médica del empleado
     * @param horasTrabajadas Cantidad de horas trabajadas
     * @param nombre Nombre del empleado
     * @param documento Documento de identidad del empleado
     * @param edad Edad del empleado
     * @param salarioBase Salario base del empleado
     */
    public EmpleadoSalud(String especialidad, int horasTrabajadas, String nombre, String documento, int edad, double salarioBase) {
        super(nombre, documento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Obtiene la especialidad del empleado.
     * 
     * @return especialidad del empleado
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del empleado.
     * 
     * @param especialidad nueva especialidad
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Obtiene el número de horas trabajadas por el empleado.
     * 
     * @return horas trabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Establece la cantidad de horas trabajadas.
     * 
     * @param horasTrabajadas nuevas horas trabajadas
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Calcula el salario total del empleado del área de salud.
     * Se calcula como el salario base más un 1.2% por cada hora trabajada.
     * 
     * @return salario total calculado
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * 0.012 * horasTrabajadas);
    }

    /**
     * Devuelve el tipo de empleado.
     * 
     * @return cadena "Salud"
     */
    @Override
    public String getTipoEmpleado() {
        return "Salud";
    }

    /**
     * Devuelve una representación en forma de texto de la información del empleado de salud.
     * 
     * @return información detallada del empleado
     */
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Especialidad: " + especialidad + "\n" +
               "Horas de trabajo: " + horasTrabajadas;
    }
}