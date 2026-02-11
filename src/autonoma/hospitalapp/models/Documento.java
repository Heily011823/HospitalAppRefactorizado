package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.DatoInvalidoException;

/**
 * Representa el documento de identidad de una persona.
 */
public class Documento {

    private String numero;

    /**
     * Constructor con validación.
     * 
     * @param numero número del documento
     * @throws DatoInvalidoException si el documento es inválido
     */
    public Documento(String numero) throws DatoInvalidoException {

        if(numero == null || numero.trim().isEmpty()) {
            throw new DatoInvalidoException("El documento no puede estar vacío");
        }

        if(!numero.matches("\\d+")) {
            throw new DatoInvalidoException("El documento solo debe contener números");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }

}
