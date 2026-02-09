/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.models.Escritor
 * @version 1.0.0
 */
public interface Escritor {
    /**
     * Escribe el archivo
     * @param archivo Es el archivo en el que se va a escribir.
     * @throws IOException Si el archivo no existe
     */
    public abstract void escribir(ArrayList<String> archivo) throws IOException ;
    
}
