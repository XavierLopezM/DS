/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Personas.Doctor;
import java.util.ArrayList;

/**
 *
 * @author VICTOR
 */
public class AreaMedica {
    protected String especialidad;
    protected float costo;
    protected ArrayList<Doctor> doctores =  new ArrayList <Doctor>();

    public AreaMedica(String especialidad, float costo) {
        this.especialidad = especialidad;
        this.costo = costo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public float getCosto() {
        return costo;
    }

    

    
    
}
