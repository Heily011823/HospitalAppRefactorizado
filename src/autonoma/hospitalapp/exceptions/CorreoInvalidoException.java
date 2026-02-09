/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;

/**
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.exceptions.CorreoInvalidoException
 * @version 1.0.0
 */
public class CorreoInvalidoException extends Exception{ 
    public CorreoInvalidoException() {
        super("El correo electrónico debe contener '@'.");
    }
}
