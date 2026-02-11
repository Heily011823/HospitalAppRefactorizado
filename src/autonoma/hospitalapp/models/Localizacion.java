/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.LocalizacionInvalidaException;
/**
 *
* @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @version 1.0.0
 * @see autonoma.hospitalapp.models.Localizacion
 */



public class Localizacion {

    private final double latitud;
    private final double longitud;

    public Localizacion(double latitud, double longitud) {
        validar(latitud, longitud);
        this.latitud = latitud;
        this.longitud = longitud;
    }

    private void validar(double lat, double lon) {
        if (lat < -90 || lat > 90) {
            throw new LocalizacionInvalidaException("Latitud fuera de rango: " + lat);
        }
        if (lon < -180 || lon > 180) {
            throw new LocalizacionInvalidaException("Longitud fuera de rango: " + lon);
        }
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public double distancia(Localizacion otra) {
        return Math.sqrt(
            Math.pow(this.latitud - otra.latitud, 2) +
            Math.pow(this.longitud - otra.longitud, 2)
        );
    }

    @Override
    public String toString() {
        return "\nLatitud: " + latitud + "\nLongitud: " + longitud;
    }
}
