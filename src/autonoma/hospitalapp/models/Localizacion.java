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
 * @see autonoma.hospitalapp.models.Localizacion
 */
public class Localizacion {
    
    /**
     * Latitud de la localización.
     */
    private double latitud;

    /**
     * Longitud de la localización.
     */
    private double longitud;

    /**
     * Constructor para crear una localización con valores específicos de latitud y longitud.
     * 
     * @param latitud Latitud geográfica.
     * @param longitud Longitud geográfica.
     */
    public Localizacion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    /**
     * Obtiene la latitud de la localización.
     * 
     * @return Latitud.
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Establece la latitud de la localización.
     * 
     * @param latitud Nueva latitud.
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Obtiene la longitud de la localización.
     * 
     * @return Longitud.
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Establece la longitud de la localización.
     * 
     * @param longitud Nueva longitud.
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    /**
     *  Devuelve una representación en forma de texto de la información de la localización.
     * 
     * @return Rotorna la información de la localización como cadena de texto.
     */
    @Override
    public String toString() {
        return "\n" + "Latitud: " + latitud + "\n" + "Longitud: " + longitud;
    }
}