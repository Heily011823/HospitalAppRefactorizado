/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.ArrayList;


/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @version 1.0.0
 */
public class Inventario {
    
    /**
     * Código identificador del inventario.
     */
    private String codigo;

    /**
     * Año de la última actualización del inventario.
     */
    private int anioActualizacion;

    /**
     * Lista de medicamentos que contiene el inventario.
     */
    private ArrayList<Medicamento> medicamentos;

    /**
     * Constructor que inicializa el inventario con un código y año de actualización.
     * 
     * @param codigo Código identificador del inventario.
     * @param anioActualizacion Año en que se actualizó el inventario por última vez.
     */
    public Inventario(String codigo, int anioActualizacion) {
        this.codigo = codigo;
        this.anioActualizacion = anioActualizacion;
        this.medicamentos = new ArrayList<>();
    }

    /**
     * Obtiene el código del inventario.
     * 
     * @return Código del inventario.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del inventario.
     * 
     * @param codigo Nuevo código del inventario.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el año de actualización del inventario.
     * 
     * @return Año de la última actualización.
     */
    public int getAnioActualizacion() {
        return anioActualizacion;
    }

    /**
     * Establece el año de actualización del inventario.
     * 
     * @param anioActualizacion Año de actualización a establecer.
     */
    public void setAnioActualizacion(int anioActualizacion) {
        this.anioActualizacion = anioActualizacion;
    }

    /**
     * Obtiene la lista de medicamentos en el inventario.
     * 
     * @return Lista de medicamentos.
     */
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    /**
     * Establece la lista de medicamentos en el inventario.
     * 
     * @param medicamentos Nueva lista de medicamentos.
     */
    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    /**
     * Agrega un medicamento al inventario. Si el medicamento ya existe, incrementa su cantidad.
     * 
     * @param medicamento Medicamento a agregar o actualizar.
     * @param cantidad Cantidad del medicamento a agregar.
     */
    public void agregarMedicamento(Medicamento medicamento, int cantidad) {
        Medicamento existente = buscarPorNombre(medicamento.getNombre());

        if (existente != null) {
            existente.setCantidad(existente.getCantidad() + cantidad);
        } else {
            medicamento.setCantidad(cantidad);
            medicamentos.add(medicamento);
        }
    }

    /**
     * Elimina un medicamento del inventario por su nombre.
     * 
     * @param nombre Nombre del medicamento a eliminar.
     * @return {@code true} si se eliminó correctamente, {@code false} si no se encontró.
     */
    public boolean eliminarMedicamento(String nombre) {
        Medicamento medicamento = buscarPorNombre(nombre);
        if (medicamento != null) {
            medicamentos.remove(medicamento);
            return true; 
        }
        return false; 
    }

    /**
     * Busca un medicamento en el inventario por su nombre.
     * 
     * @param nombre Nombre del medicamento a buscar.
     * @return El medicamento encontrado o {@code null} si no se encuentra.
     */
    public Medicamento buscarPorNombre(String nombre) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equalsIgnoreCase(nombre)) {
                return medicamento;
            }
        }
        return null; 
    }

    /**
     * Obtiene la lista completa de medicamentos en el inventario.
     * 
     * @return Lista de todos los medicamentos disponibles.
     */
    public ArrayList<Medicamento> obtenerListaMedicamentos() {
        return medicamentos;
    }
}