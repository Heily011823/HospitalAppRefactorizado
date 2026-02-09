/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 *
 * @author Maria Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.models.Gerente
 * @version 1.0.0
 */
public class Gerente {
    /**
     * Nombre del gerente.
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
     * Carrera del gerente.
     */
    private String carrera;

    /**
     * Constructor de la clase Gerente
     * @param nombre Es el nombre del gerente.
     * @param documento Es el documento del gerente.
     * @param edad Es la edad del gerente.
     * @param carrera Es la carrera del gerente.
     */
    public Gerente(String nombre, String documento, int edad, String carrera) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.carrera = carrera;
    }
    
    /**
     * Obtiene el nombre de la persona.
     *
     * @return Retorna el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre Es el nombre que se asignará a la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento de identidad de la persona.
     *
     * @return Retorna el documento de la persona.
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Establece el documento de identidad de la persona.
     *
     * @param documento Es el documento que se asignará a la persona.
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return Retorna la edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad Es la edad que se asignará a la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la carrera que estudia la persona.
     *
     * @return Retorna la carrera de la persona.
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Establece la carrera que estudia la persona.
     *
     * @param carrera Es la carrera que se asignará a la persona.
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    /**
     * Devuelve una representación en forma de texto de la información del gerente.
     * 
     * @return información del gerente como cadena de texto.
     */
    public String toString() {
    return "\n" + "Nombre: " + nombre + "\n" +
           "Documento: " + documento + "\n" +
           "Edad: " + edad + "\n" +
           "Carrera: " + carrera + "\n";
    }
    
}
