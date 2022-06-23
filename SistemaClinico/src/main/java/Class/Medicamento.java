/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author VICTOR
 */
public class Medicamento {
    protected String medicina;
    protected String dosis;
    protected String observaciones;
    protected int cantdTotal;
    protected String unidad;

    public Medicamento(String medicina, String dosis, String observaciones, int cantdTotal, String unidad) {
        this.medicina = medicina;
        this.dosis = dosis;
        this.observaciones = observaciones;
        this.cantdTotal = cantdTotal;
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "medicina=" + medicina + ", dosis=" + dosis + ", observaciones=" + observaciones + ", cantdTotal=" + cantdTotal + ", unidad=" + unidad + '}';
    }
    
    
}
