/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jaider
 */
public class Venta {
    protected String idVenta;
    protected String fechaVenta;
    protected String horaVenta;
    protected boolean estadoVenta;
    protected Producto productosComprados;
    protected float subtotal;//precio sin iva
    protected float total;//precio con iva
    protected String idCliente;
}
