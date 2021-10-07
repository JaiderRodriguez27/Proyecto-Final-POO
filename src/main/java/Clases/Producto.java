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
public class Producto {
    protected String id;
    protected String nombreProducto;
    protected int precioVenta;
    protected int cantidadActual;
    protected int cantidadMinimaPermitida;
    protected boolean bajoPedido;
    protected String descripcion;
    protected String paisProcedencia;
    protected String fabricante;
    protected int pesoGramos;
    protected int garantiaDias;
    protected String idProveedor;
    protected String tipoProducto;
    protected String rutaImg;
    
    
    public Producto(){};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadMinimaPermitida() {
        return cantidadMinimaPermitida;
    }

    public void setCantidadMinimaPermitida(int cantidadMinimaPermitida) {
        this.cantidadMinimaPermitida = cantidadMinimaPermitida;
    }

    public boolean isBajoPedido() {
        return bajoPedido;
    }

    public void setBajoPedido(boolean bajoPedido) {
        this.bajoPedido = bajoPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(int pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    public int getGarantiaDias() {
        return garantiaDias;
    }

    public void setGarantiaDias(int garantiaDias) {
        this.garantiaDias = garantiaDias;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }
    
    
    
}
