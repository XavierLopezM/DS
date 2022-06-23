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
public class PagoPayPal implements Pago{
    protected float monto;
    protected String email;

    public PagoPayPal(float monto, String email) {
        this.monto = monto;
        this.email = email;
    }
    
    
    
    
    
    
    @Override
    public boolean realizarPago(float monto) {
        return this.monto==monto;
    }
    
}
