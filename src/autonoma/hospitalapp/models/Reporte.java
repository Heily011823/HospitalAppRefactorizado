/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.models.Reporte
 * @version 1.0.0
 */
public class Reporte {
    /**
     * Lista de empleados
     */
    private ArrayList<Empleado> empleados;
    
    /**
     * Lista de pacientes.
     */
    private ArrayList<Paciente> pacientes; 
    
    /**
     * Objeto de Farmacia farmacia.
     */
    private Farmacia farmacia; 

    /**
     * Constructor vacío de la clase Reporte.
     * 
     */
    public Reporte(ArrayList<Empleado> empleados, ArrayList<Paciente> pacientes, Farmacia farmacia) {
        this.empleados = empleados;
        this.pacientes = pacientes;
        this.farmacia = farmacia;
    }

    /**
     * Obtiene la lista de empleados.
     * @return Retorna la lista de empleados.
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece la lista de empleados.
     * @param empleados Es la lista de empleados a asignar.
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Obtiene la lista de pacientes.
     * @return Retorna la lista de pacientes.
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    /**
     * Establece la lista de pacientes.
     * @param pacientes Es la lista de pacientes a asignar.
     */
    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    /**
     * Obtiene el objeto Farmacia.
     * @return Retorna el objeto Farmacia.
     */
    public Farmacia getFarmacia() {
        return farmacia;
    }

    /**
     * Establece el objeto Farmacia.
     * @param farmacia Es el objeto Farmacia a asignar.
     */
    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    /**
     * Genera un reporte de los empleados registrados.
     * Muestra el nombre, documento, edad y salario base de cada empleado.
     * Si no hay empleados, muestra un mensaje indicando que no hay registros.
     * @return El reporte de los empleados como una cadena de texto. Si no hay empleados registrados, 
     * el reporte indicará que no hay registros.
     * @throws IOException Si ocurre un error al escribir o leer el archivo de texto.
     */
    public String generarReporteEmpleados() throws IOException{
        ArrayList<String> archivo3 = new ArrayList<>();
    
        archivo3.add("===================== REPORTE DE EMPLEADOS =============================");

        if (empleados == null || empleados.isEmpty()) {
            archivo3.add("No hay empleados registrados.");
        } else {
            for (Empleado e : empleados) {
                archivo3.add("Nombre: " + e.getNombre());
                archivo3.add("Documento: " + e.getDocumento());
                archivo3.add("Edad: " + e.getEdad());
                archivo3.add("Salario Base: $" + e.getSalarioBase());
                archivo3.add("------------------------------------");
            }
        }

        Escritor escritor = new EscritorArchivoTextoPlano("reporteEmpleados.txt");
        escritor.escribir(archivo3);
        
        LectorArchivoTextoPlano lector = new LectorArchivoTextoPlano();
        ArrayList<String> lineas = lector.leer("reporteEmpleados.txt");
        
        StringBuilder reporteTexto = new StringBuilder();
        for (String linea : lineas) {
            reporteTexto.append(linea).append("\n");
        }

        return reporteTexto.toString();
    }

    /**
     * Genera un reporte de los pacientes registrados.
     * Muestra el nombre, documento, edad, correo, teléfono, estado y lista de enfermedades y medicamentos de cada paciente.
     * Si no hay pacientes, muestra un mensaje indicando que no hay registros.
     * @return El reporte de los pacientes como una cadena de texto. Si no hay pacientes registrados, 
     * el reporte indicará que no hay registros.
     * @throws IOException Si ocurre un error al escribir o leer el archivo de texto.
     */
    public String generarReportePacientes() throws IOException{
        ArrayList<String> archivo = new ArrayList<>();
    
        archivo.add("========================== REPORTE DE PACIENTES ======================");

        if (pacientes == null || pacientes.isEmpty()) {
            archivo.add("No hay pacientes registrados.");
        } else {
            for (Paciente p : pacientes) {
                archivo.add("Nombre: " + p.getNombre());
                archivo.add("Documento: " + p.getDocumento());
                archivo.add("Edad: " + p.getEdad());
                archivo.add("Correo: " + p.getCorreo());
                archivo.add("Teléfono: " + p.getTelefono());
                archivo.add("Estado: " + p.getEstadoPaciente());
            
                archivo.add("Enfermedades:");
                if (p.getEnfermedades().isEmpty()) {
                    archivo.add("  - No registra enfermedades.");
                } else {
                    for (Enfermedad e : p.getEnfermedades()) {
                        archivo.add("  - " + e.getNombre());
                    }
                }
            
                archivo.add("Medicamentos:");
                if (p.getMedicinas().isEmpty()) {
                    archivo.add("  - No tiene medicamentos asignados.");
                } else {
                    for (Medicamento m : p.getMedicinas()) {
                        archivo.add("  - " + m.getNombre());
                    }
                }
            
                archivo.add("------------------------------------");
            }
        }

        Escritor escritor = new EscritorArchivoTextoPlano("reportePacientes.txt");
        escritor.escribir(archivo);
        
        LectorArchivoTextoPlano lector = new LectorArchivoTextoPlano();
        ArrayList<String> lineas = lector.leer("reportePacientes.txt");
        
        StringBuilder reporteTexto = new StringBuilder();
        for (String linea : lineas) {
            reporteTexto.append(linea).append("\n");
        }

        return reporteTexto.toString();
    }

    /**
     * Genera un reporte de la farmacia registrada.
     * Muestra el nombre y dirección del hospital asociado, así como el inventario de medicamentos de la farmacia.
     * Si no hay información de la farmacia, muestra un mensaje indicando que no hay registros.
     * @return El reporte de la farmacia como una cadena de texto. Si no hay información de la farmacia registrada, 
     * el reporte indicará que no hay registros.
     * @throws IOException Si ocurre un error al escribir o leer el archivo de texto.
     */
    public String generarReporteFarmacia() throws IOException{
        ArrayList<String> archivo2 = new ArrayList<>();
    
        archivo2.add("======================== REPORTE DE FARMACIA ===========================");

        if (farmacia == null) {
            archivo2.add("No hay información de farmacia registrada.");
        } else {
            Hospital h = farmacia.getHospital();
            if (h == null) {
                archivo2.add("No se pudo obtener la información del hospital.");
            } else {
                archivo2.add(String.format("Hospital Asociado: %s", h.getNombre()));
                archivo2.add(String.format("Dirección del Hospital: %s", h.getDireccion()));

                archivo2.add("Inventario de Medicamentos:");

                ArrayList<Medicamento> medicamentos = farmacia.getInventario().getMedicamentos();
                if (medicamentos == null || medicamentos.isEmpty()) {
                    archivo2.add("No hay medicamentos en el inventario.");
                } else {
                    for (Medicamento m : medicamentos) {
                        archivo2.add(String.format("  - Nombre: %s", m.getNombre()));
                        archivo2.add(String.format("  - Descripción: %s", m.getDescripcion()));
                        archivo2.add(String.format("  - Cantidad: %s", m.getCantidad()));
                        archivo2.add(String.format("  - Precio: %s", m.getPrecioVenta()));
                        archivo2.add(String.format("  - Enfermedad que alivia: %s", m.getEnfermedadQueAlivia()));
                    }
                }

                archivo2.add("------------------------------------");
            }
        }

        Escritor escritor = new EscritorArchivoTextoPlano("reporteFarmacia.txt");
        escritor.escribir(archivo2);
        
        LectorArchivoTextoPlano lector = new LectorArchivoTextoPlano();
        ArrayList<String> lineas = lector.leer("reporteFarmacia.txt");
        
        StringBuilder reporteTexto = new StringBuilder();
        for (String linea : lineas) {
            reporteTexto.append(linea).append("\n");
        }

        return reporteTexto.toString();
    }
}
