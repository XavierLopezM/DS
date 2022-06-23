/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Class.AreaMedica;
import Class.Receta;
import Class.Cita;
import Class.PlanNutricional;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VICTOR
 */
public class Doctor extends Persona{
    
    
    protected int regDoctor;
    protected String especialidad;
    protected AreaMedica area;
    protected Secretaria secretaria;
    protected Cita cita;
    protected Receta receta;
    protected ArrayList<Cita> citasPendientes= new ArrayList<>();

    public Doctor(int regDoctor, String especialidad, AreaMedica area, String Usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(Usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.area = area;
    }

    public Doctor(int regDoctor, String especialidad, AreaMedica area, Secretaria secretaria, String Usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(Usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.area = area;
        this.secretaria = secretaria;
    }

    
    public void recetar(){
        receta=new Receta(this);
 
    }
    
    public void agregarPlanNutricional(){
        if(this.receta==null){
            recetar();
        }
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter planNutricional");
        String entrada = myObj.nextLine();
        PlanNutricional planN = new PlanNutricional(entrada);
        this.receta.addPlanNut(planN);
    }
    
    public void imprimirReceta(){
        System.out.println(this.receta.toString());
    }
    
    public void registrarSecretaria( Secretaria secretaria){
        secretaria.setDoctor(this);
        this.secretaria=secretaria;
        
    }

    public AreaMedica getArea() {
        return area;
    }

    public void addCita(Cita c){
        this.citasPendientes.add(c);
    }
    
    
}
