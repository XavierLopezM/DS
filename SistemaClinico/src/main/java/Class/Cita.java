/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Interfaces.Pago;
import Personas.Doctor;
import Personas.Paciente;
import java.time.LocalDate;

/**
 *
 * @author VICTOR
 */
public class Cita {
    protected LocalDate fecha ;
    protected boolean pagada = false;
    protected String registradoPor;
    protected Doctor doctor;
    protected Paciente paciente;

    public Cita(LocalDate fecha, String registradoPor, Doctor doctor, Paciente paciente) {
        this.fecha = fecha;
        this.registradoPor = registradoPor;
        this.doctor = doctor;
        this.paciente = paciente;
    }
    
    public void realizar(Pago pago){
        float costo = this.doctor.getArea().costo;
        if ( pago.realizarPago(costo) ){
            this.pagada=true;
        }
    }
}
