/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Personas.Paciente;
import java.util.ArrayList;

/**
 *
 * @author VICTOR
 */
public class HistoryClinic {
    protected int numero;
    protected ArrayList<String> enfermedades;
    protected Paciente paciente;

    public HistoryClinic(int numero, ArrayList<String> enfermedades, Paciente paciente) {
        this.numero = numero;
        this.paciente = paciente;
    }

    public HistoryClinic(int numero, Paciente paciente) {
        this.numero = numero;
        this.paciente = paciente;
    }
  
    
    public void addEnfermedades(String newSickness){
        if(this.enfermedades==null){
            this.enfermedades= new ArrayList<>();
        }
        this.enfermedades.add(newSickness);
        System.out.println("Se aniadio correctamente");
    }
    
}
