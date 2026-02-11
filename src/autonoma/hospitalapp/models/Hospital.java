/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.HospitalEnQuiebraException;
import autonoma.hospitalapp.exceptions.MedicamentoNoEncontradoException;
import autonoma.hospitalapp.exceptions.PacienteNoEncontradoException;
import autonoma.hospitalapp.exceptions.PresupuestoNegativoException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.hospitalapp.models.Hospital
 * @version 1.0.0
 * 
 */
public class Hospital {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private String logo;
    private double presupuesto;
    private double metaVentasAnual;
    private LocalDate fechaFundacion;
    private boolean estadoHospital;
    private Localizacion localizacion;
    private Gerente gerente;
    private ArrayList<Empleado>empleados;
    private ArrayList<Paciente> pacientes;
    private Farmacia farmacia;
    private ArrayList<Nomina>nominas;

    public Hospital(String nombre, String direccion, String telefono, String logo, double presupuesto, double metaVentasAnual, LocalDate fechaFundacion, boolean estadoHospital, Localizacion localizacion, Gerente gerente, ArrayList<Empleado> empleados, ArrayList<Paciente> pacientes,Farmacia Farmacia , ArrayList<Nomina> nominas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estadoHospital = estadoHospital;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.empleados = empleados;
        this.pacientes = pacientes;
        this.farmacia =  Farmacia;
        this.nominas = nominas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstadoHospital() {
        return estadoHospital;
    }

    public void setEstadoHospital(boolean estadoHospital) {
        this.estadoHospital = estadoHospital;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

   

    public ArrayList<Nomina> getNominas() {
        return nominas;
    }

    public void setNominas(ArrayList<Nomina> nominas) {
        this.nominas = nominas;
    }
    
    /**
    * Agrega un nuevo empleado al hospital.
    *
    * @param empleado El empleado a agregar.
    */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    /**
    * Elimina un empleado por su nombre.
    *
    * @param nombre Nombre del empleado a eliminar.
    * @return true si fue eliminado, false si no se encontró.
    */
    public boolean eliminarEmpleado(String nombre) {
        Empleado empleadoAEliminar = buscarEmpleado(nombre);

        if (empleadoAEliminar != null) {
            empleados.remove(empleadoAEliminar); 
            System.out.println("Empleado eliminado: " + nombre);
            return true;  
        } else {
            
            return false;  
        }
    }
    
    /**
    * Actualiza los datos de un empleado existente.
    *
    * @param nombre Nombre del empleado a actualizar.
    * @param empleadoActualizado Objeto con los datos nuevos del empleado.
    */

    public void actualizarEmpleado(String nombre, Empleado empleadoActualizado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
                empleados.set(i, empleadoActualizado);
                System.out.println("Empleado actualizado: " + nombre);
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    /**
    * Busca un empleado por nombre.
    *
    * @param nombre Nombre del empleado.
    * @return El empleado encontrado o null si no existe.
    */
    public Empleado buscarEmpleado(String nombre) {
         for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }
    
    /**
     * Agrega un paciente al hospital.
     *
     * @param paciente El paciente a agregar.
     */

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente agregado: " + paciente.getNombre());
    }
    
    /**
     * Elimina un paciente del hospital.
     *
     * @param nombre Nombre del paciente a eliminar.
     * @return true si fue eliminado.
     * @throws PacienteNoEncontradoException Si no se encuentra al paciente.
     */
    
    public boolean eliminarPaciente(String nombre) throws PacienteNoEncontradoException {
        Paciente pacienteAEliminar = buscarPaciente(nombre);

        if (pacienteAEliminar != null) {
            pacientes.remove(pacienteAEliminar);
            System.out.println("Paciente eliminado: " + nombre);
            return true;
        } else {
            throw new PacienteNoEncontradoException();
        }
    }
    

    /**
     * Actualiza los datos de un paciente.
     *
     * @param nombre Nombre del paciente a actualizar.
     * @param pacienteActualizado El nuevo objeto del paciente.
     */

    public void actualizarPaciente(String nombre, Paciente pacienteActualizado) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNombre().equals(nombre)) {
                pacientes.set(i, pacienteActualizado);
                System.out.println("Paciente actualizado: " + nombre);
                return;
            }
        }
        System.out.println("Paciente no encontrado.");
    }

    /**
    * Busca un paciente por nombre.
    *
    * @param nombre Nombre del paciente.
    * @return El paciente encontrado o null si no existe.
    */
    public Paciente buscarPaciente(String nombre) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNombre().equals(nombre)) {
                return paciente;
            }
        }
        System.out.println("Paciente no encontrado.");
        return null;
    }
    
    /**
     * Genera la nómina de todos los empleados activos del hospital
     * y la agrega a la lista de nóminas.
     */
    
    public void generarNomina() {
        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSalario();
            String nombreEmpleado = empleado.getNombre();
            LocalDate fechaNomina = LocalDate.now();
            Nomina nomina = new Nomina(nombreEmpleado, fechaNomina, sueldo);
            nominas.add(nomina);
            
            // Probar los métodos nuevos de la clase Nomina refactorizada. 
            System.out.println(nomina.generarDetalleNomina());
            System.out.println(nomina.esPagoValido());

            nominas.add(nomina);
        }
    }

    /**
    * Aumenta el presupuesto del hospital con un patrocinio.
    *
    * @param monto El monto del patrocinio.
    */
    public void registrarPatrocinio(double monto) {
        if (monto > 0) {
            presupuesto += monto;
            System.out.println("Patrocinio registrado exitosamente. Monto recibido: " + monto);
        } else {
            System.out.println("El monto del patrocinio debe ser mayor que 0.");
        }
    }

   /**
 * @param monto El valor económico a deducir del presupuesto actual.
 * @throws PresupuestoNegativoException Si el monto a descontar es mayor al presupuesto 
 * actual, provocando el estado de quiebra.
 */
public void descontarDelPresupuesto(double monto) throws PresupuestoNegativoException {
    if ((this.presupuesto - monto) < 0) {
        this.estadoHospital = false; // El hospital entra en quiebra
        throw new PresupuestoNegativoException();
    }
    this.presupuesto -= monto;
}
    /**
    * Devuelve una representación textual del estado del hospital.
    *
    * @return "Activo" si está en funcionamiento, "Quiebra" si no.
    */
    public String visualizarEstado() {
        return estadoHospital ? "Activo" : "Quiebra";
    }

    /**
    * Intenta comprar un medicamento si el hospital tiene presupuesto y no está en quiebra.
    *
    * @param medicamento El medicamento a comprar.
    * @param cantidad La cantidad a comprar.
    */
    public void comprarMedicamento(Medicamento medicamento, int cantidad) {
        try {
           
            if (visualizarEstado().equals("Quiebra")) {
                throw new HospitalEnQuiebraException();
            }

           
            double costoTotal = medicamento.getCosto() * cantidad;

            
            if (presupuesto >= costoTotal) {
               
                farmacia.agregarMedicamento(medicamento, cantidad);
                presupuesto -= costoTotal;
                System.out.println("Medicamento comprado exitosamente: " + medicamento.getNombre() + ", Cantidad: " + cantidad);
            } else {
               
                System.out.println();
            }
        } catch (HospitalEnQuiebraException e) {
            
            System.out.println(e.getMessage());
        }
    }
    
    /**
    * Busca un medicamento en la farmacia.
    *
    * @param nombre Nombre del medicamento.
    * @return El medicamento encontrado.
    * @throws MedicamentoNoEncontradoException Si el medicamento no existe.
    */
    public Medicamento buscarMedicamento(String nombre) throws MedicamentoNoEncontradoException {
       Medicamento medicamento = farmacia.buscarMedicamento(nombre);
        if (medicamento != null) {
            return medicamento;
        } else {
            throw new MedicamentoNoEncontradoException();
        }
    }
    
    
    /**
    * Elimina un medicamento de la farmacia.
    *
    * @param nombre Nombre del medicamento.
    * @return true si fue eliminado.
    * @throws MedicamentoNoEncontradoException Si el medicamento no existe.
    */
    public boolean eliminarMedicamento(String nombre) throws MedicamentoNoEncontradoException {
        boolean eliminado = farmacia.eliminarMedicamento(nombre);
        if (eliminado) {
            return true;
        } else {
            throw new MedicamentoNoEncontradoException();
        }
    }
    
    /**
    * Obtiene todos los medicamentos disponibles en la farmacia.
    *
    * @return Una lista con todos los medicamentos.
    */
    public ArrayList<Medicamento> obtenerMedicamentos() {
        return farmacia.obtenerMedicamentos();
    }

    /**
     * Guarda la información general del hospital en un archivo de texto.
     * @throws IOException Lanza esta excepción ocurre un error al escribir el archivo
     */
    public void guardarInformacion() throws IOException {
        ArrayList<String> contenido = construirInformacionHospital();
        EscritorArchivoTextoPlano escritor =
            new EscritorArchivoTextoPlano("InformacionHospital.txt");
        escritor.escribir(contenido);
    }

    /**
     * Construye la información general del hospital en un archivo de texto.
     * @return Retorna una lista de lineas del archivo con la información del hospital.
     */
    private ArrayList<String> construirInformacionHospital() {
        ArrayList<String> contenido = new ArrayList<>();

        contenido.add("============= INFORMACIÓN DEL HOSPITAL =====================");
        contenido.add("Nombre: " + getNombre());
        contenido.add("Dirección: " + getDireccion());
        contenido.add("Teléfono: " + getTelefono());
        contenido.add("Gerente: " + getGerente());
        contenido.add("Logo: " + getLogo());
        contenido.add("Presupuesto: " + getPresupuesto());
        contenido.add("Meta de Ventas Anual: " + getMetaVentasAnual());
        contenido.add("Fecha de Fundación: " + getFechaFundacion());
        contenido.add("Estado: " + visualizarEstado());
        contenido.add("Localización: " + getLocalizacion());
        contenido.add("================================================");

        return contenido;
    }
    
    /**
     * Lee la información del hospital desde el archivo de texto "InformacionHospital.txt" y 
     * devuelve el contenido como una cadena de texto.
     * @return Retorna el contenido del archivo "InformacionHospital.txt" como una cadena de texto.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public String mostrarInformacion() throws IOException {
        LectorArchivoTextoPlano lector = new LectorArchivoTextoPlano();
        ArrayList<String> lineas = lector.leer("InformacionHospital.txt");

        StringBuilder resultado = new StringBuilder();
        for (String linea : lineas) {
            resultado.append(linea).append("\n");
        }
        return resultado.toString();
    }
   
}