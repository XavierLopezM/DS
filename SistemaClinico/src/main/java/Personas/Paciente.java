/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Class.HistoryClinic;
import Class.Receta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VICTOR
 */
public class Paciente extends Persona{
    
    protected String email;
    protected ArrayList<HistoryClinic> historiaClinicas = new ArrayList<HistoryClinic>();
    protected ArrayList<Receta> Recetas = new ArrayList<Receta>();
    public Paciente(String email, String Usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(Usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.email = email;
    }
    
    
    
    
    
    public boolean solicitarCita(){
        //si el doctor esta libre el paciente puede registrar cita 
        return true;
    }
    
    public void addhistoriaClinica( HistoryClinic Hc){
        this.historiaClinicas.add(Hc);
    } 
    
    public void addRecetas(Receta receta){
        this.Recetas.add(receta);
    }
 
    public ArrayList<HistoryClinic> getHistoriaClinicas() {
        return historiaClinicas;
    }

    public void setHistoriaClinicas(ArrayList<HistoryClinic> historiaClinicas) {
        this.historiaClinicas = historiaClinicas;
    }

    public ArrayList<Receta> getRecetas() {
        return Recetas;
    }

    public void setRecetas(ArrayList<Receta> Recetas) {
        this.Recetas = Recetas;
    }
    
    
    
}
