/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Personas.Doctor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author VICTOR
 */
public class Receta {
    
    protected LocalDate fecha = LocalDate.now();
    protected ArrayList<Medicamento> medicamentos ;
    protected Doctor doctor;
    protected ArrayList<PlanNutricional> planNut ;

    public Receta(Doctor doctor) {
        this.doctor = doctor;
    }
    public void addPlanNut(PlanNutricional planNut){
        if(this.planNut==null){
            this.planNut= new ArrayList<>();
            this.planNut.add(planNut);
        }else{
           this.planNut.add(planNut); 
        }
    }
    
    public void addMedicamento(Medicamento medicamento){
        if (this.medicamentos==null){
            this.medicamentos= new ArrayList<>();
        }
        this.medicamentos.add(medicamento);
    }

    @Override
    public String toString() {
        if (this.planNut==null){
            return "La Receta{" + "fecha=" + fecha + ", medicamentos=" + medicamentos + ", doctor=" + doctor + '}';
        }
        return "La Receta{" + "fecha=" + fecha + ", medicamentos=" + medicamentos + ", doctor=" + doctor + ", planNut=" + planNut + '}';
    }
    
    
}
