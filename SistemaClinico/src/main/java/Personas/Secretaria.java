/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Class.Cita;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VICTOR
 */
public class Secretaria extends Persona{
    
    protected Doctor doctor;
    public Secretaria(String Usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(Usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
    }

    

    
    
    
   public void verificarCita(){
       
       
   }
   
   public void agendarCita(){
       System.out.println("Se va a registrar la fecha de la cita");
        Scanner s6 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("ingrese el anio");
        int anio = 2022;
        Scanner s7 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el mes");
        int mes = Integer.parseInt(s7.nextLine());
        Scanner s8 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el dia");
        int day = Integer.parseInt(s8.nextLine());
        
        
        
        Cita cita = new Cita(LocalDate.of(anio,mes,day),this.Usuario,this.doctor,this.Paciente);
       
   }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
}
