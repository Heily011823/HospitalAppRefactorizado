/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.exceptions.HospitalEnQuiebraException
 * @version 1.0.0
 */
public class HospitalEnQuiebraException extends Exception{

    public HospitalEnQuiebraException() {
        super("El hospital se encunetra en quiebra");
    }
    
    
}
