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
public class Enfermedad {

    /**
     * Nombre de la enfermedad.
     */
    private String nombre;

    /**
     * Descripción de la enfermedad.
     */
    private String descripcion;

    /**
     * Constructor que inicializa los atributos de la enfermedad.
     * 
     * @param nombre Nombre de la enfermedad
     * @param descripcion Descripción de la enfermedad
     */
    public Enfermedad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre de la enfermedad.
     * 
     * @return nombre de la enfermedad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la enfermedad.
     * 
     * @param nombre nuevo nombre de la enfermedad
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la enfermedad.
     * 
     * @return descripción de la enfermedad
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la enfermedad.
     * 
     * @param descripcion nueva descripción de la enfermedad
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}