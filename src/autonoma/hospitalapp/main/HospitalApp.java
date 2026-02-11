/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.hospitalapp.main;

import autonoma.hospitalapp.models.Documento;
import autonoma.hospitalapp.models.Empleado;
import autonoma.hospitalapp.models.Farmacia;
import autonoma.hospitalapp.models.Gerente;
import autonoma.hospitalapp.models.Hospital;
import autonoma.hospitalapp.models.Inventario;
import autonoma.hospitalapp.models.Localizacion;
import autonoma.hospitalapp.models.Nomina;
import autonoma.hospitalapp.models.Paciente;
import autonoma.hospitalapp.models.SistemaCentral;
import autonoma.hospitalapp.views.VentanaPrincipal;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */
public class HospitalApp {

    public static void main(String[] args) {
        Localizacion localizacion = new Localizacion(5.0703, -75.5138 );

    Documento documento = new Documento("123456789");

    Gerente gerente = new Gerente(
        "Laura Pérez",
        documento,
        40,
        "Administración Hospitalaria"
    );
        Inventario inventario = new Inventario("INV-001", 2024);

       
        Hospital hospital = new Hospital(
                "Hospital San José St. Bonaventure",
                "Calle 123",
                "3001234567",
                "logo.png",
                1000000,
                500.000,
                LocalDate.of(2020, 1, 1),
                true,
                localizacion,
                gerente,
                new ArrayList<>(),
                new ArrayList<>(),
                null,  
                new ArrayList<>()
        );

       
          
        Farmacia farmacia = new Farmacia(inventario, hospital);

      
        hospital.setFarmacia(farmacia);

        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Nomina> nominas = new ArrayList<>();

       
        hospital.setFarmacia(farmacia);

        SistemaCentral sistema = new SistemaCentral(hospital); 

        VentanaPrincipal ventana = new VentanaPrincipal(sistema); 
        ventana.setVisible(true);
        
        }
    
}
