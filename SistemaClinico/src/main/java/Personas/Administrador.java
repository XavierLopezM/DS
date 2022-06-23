/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Class.AreaMedica;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VICTOR
 */
public class Administrador {
    protected ArrayList<Persona> personas = new ArrayList<>();
    
    
    public void  registrarUsuario(){
        Scanner s1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el ussername");
        String user = s1.nextLine();
        Scanner s2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("ingrese la contrasenia");
        String psw = s2.nextLine();
        Scanner s3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("ingrese el nombre de la persona");
        String name = s3.nextLine();
        Scanner s4 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el apellido de la persona");
        String lastname = s4.nextLine();
        Scanner s5 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el numero de cedula");
        String cedula = s5.nextLine();
        Scanner s9 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("ingrese la direccion");
        String direccion = s9.nextLine();
        System.out.println("Se va a registrar su fecha de naciomiento, escribir en numeros");
        Scanner s6 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("ingrese el anio");
        int anio = Integer.parseInt(s6.nextLine())-1900;
        Scanner s7 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el mesa");
        int mes = Integer.parseInt(s7.nextLine());
        Scanner s8 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el dia");
        int day = Integer.parseInt(s8.nextLine());
        Date fechaNac = new Date(anio,mes,day);
        Persona people = new Persona(user,psw,name, lastname,cedula,direccion, fechaNac );
        
        
    }
    
    public void asignarRol(Persona empleado){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("La persona va a ser doctor o secretaria o Pciente");
        String rol = myObj.nextLine();
        if(rol=="doctor"){
            Scanner s1 = new Scanner(System.in);
            System.out.println("Escriba el regDoctor");
            String regstr = s1.nextLine();
            int reg = Integer.parseInt(regstr);
            ///validacion, en caso de existir esa area solo asignarla
            System.out.println("Se va a crear una Area medica");////
            Scanner s2 = new Scanner(System.in);
            System.out.println("El area de que especialidad es:");
            String especialidad = s2.nextLine();
            Scanner s3 = new Scanner(System.in);
            System.out.println("El costo de area de medicina");////
            String costostr = s3.nextLine();
            float costo = Float.parseFloat(costostr);
            AreaMedica area= new AreaMedica(especialidad,costo);
            empleado =new Doctor(reg,area.getEspecialidad(),area,empleado.Usuario,empleado.clave,empleado.nombre,empleado.apellido,empleado.cedula,empleado.direccion,empleado.fechaNac);
        }else if(rol=="secretaria"){
            empleado= new Secretaria(empleado.Usuario,empleado.clave,empleado.nombre,empleado.apellido,empleado.cedula,empleado.direccion,empleado.fechaNac);
        }else if(rol=="Paciente"){
            Scanner s1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Ingrese el email del paciente");
            String email = s1.nextLine();
            empleado= new Paciente(email,empleado.Usuario,empleado.clave,empleado.nombre,empleado.apellido,empleado.cedula,empleado.direccion,empleado.fechaNac);
        }
    }

    
    
    
}
