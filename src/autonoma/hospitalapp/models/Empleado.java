/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/*
* @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @version 1.0.0
 */
public abstract class Empleado {
    /**
     * Nombre completo del gerente.
     */
    private String nombre;

    /**
     * Documento de identidad del gerente.
     */
    private String documento;

    /**
     * Edad del gerente.
     */
    private int edad;

    /**
     * Salario base mensual del gerente.
     */
    private double salarioBase;

    /**
     * Constructor que inicializa los atributos del empleado.
     * 
     * @param nombre Nombre del empleado
     * @param documento Documento de identidad del empleado
     * @param edad Edad del empleado
     * @param salarioBase Salario base del empleado
     */
    public Empleado(String nombre, String documento, int edad, double salarioBase) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento del empleado.
     * 
     * @return documento del empleado
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Establece el documento del empleado.
     * 
     * @param documento nuevo documento del empleado
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Obtiene la edad del empleado.
     * 
     * @return edad del empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del empleado.
     * 
     * @param edad nueva edad del empleado
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el salario base del empleado.
     * 
     * @return salario base
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Establece el salario base del empleado.
     * 
     * @param salarioBase nuevo salario base
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Método abstracto que debe implementar cada subclase para calcular el salario real del empleado.
     * 
     * @return salario calculado
     */
    public abstract double calcularSalario();

    /**
     * Método abstracto que debe implementar cada subclase para devolver el tipo de empleado.
     * 
     * @return tipo de empleado
     */
    public abstract String getTipoEmpleado();

    /**
     * Devuelve una representación en forma de texto de la información del empleado.
     * 
     * @return información del empleado como cadena de texto
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Documento: " + documento + "\n" +
               "Edad: " + edad + "\n" +
               "Salario: " + salarioBase;
    }
}