/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;

/**
 *
 * @author Maria Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hopitalapp.exceptions.MedicamentoDuplicadoException
 * @version 1.0.0
 */
public class MedicamentoDuplicadoException extends RuntimeException {

    public MedicamentoDuplicadoException() {
        super("El medicamento ya se encuentra en la lista");
    }
    
}
