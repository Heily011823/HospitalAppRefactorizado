/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.exceptions.DatoInvalidoException
 * @version 1.0.0
 */
public class DatoInvalidoException  extends RuntimeException{

    public DatoInvalidoException() {
        super("Los datos no pueden ser negativos");
    }
    
    
}
