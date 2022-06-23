/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Pagos;

import Interfaces.Pago;
import java.util.Date;

/**
 *
 * @author VICTOR
 */
public class PagoTarjeta implements Pago{

    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;

    public PagoTarjeta(float monto, String numero, Date expira, String propietario, String banco) {
        this.monto = monto;
        this.numero = numero;
        this.expira = expira;
        this.propietario = propietario;
        this.banco = banco;
    }
    
    
    
    @Override
    public boolean realizarPago(float monto) {
        return this.monto==monto;
    }
    
}
