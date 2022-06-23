/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Pagos;

import Interfaces.Pago;

/**
 *
 * @author VICTOR
 */
public class PagoEfectivo implements Pago {
    
    protected float monto;

    public PagoEfectivo(float monto) {
        this.monto = monto;
    }
    
    
    
    @Override
    public boolean realizarPago(float monto) {
        return this.monto==monto;
    }
    
}
