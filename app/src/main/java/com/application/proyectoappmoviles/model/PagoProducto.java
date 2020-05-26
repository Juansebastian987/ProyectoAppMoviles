package com.application.proyectoappmoviles.model;

public class PagoProducto {

    private String IdUser;
    private String IdColaborador;
    private String email;
    private String cel;
    private String productoSeleccionado;
    private String costo;
    private String costoTotal;
    private String codeProducto;

    public PagoProducto(String idUser, String idColaborador, String email, String cel, String productoSeleccionado, String costo, String costoTotal, String codeProducto) {
        IdUser = idUser;
        IdColaborador = idColaborador;
        this.email = email;
        this.cel = cel;
        this.productoSeleccionado = productoSeleccionado;
        this.costo = costo;
        this.costoTotal = costoTotal;
        this.codeProducto = codeProducto;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String idUser) {
        IdUser = idUser;
    }

    public String getIdColaborador() {
        return IdColaborador;
    }

    public void setIdColaborador(String idColaborador) {
        IdColaborador = idColaborador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(String productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(String costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getCodeProducto() {
        return codeProducto;
    }

    public void setCodeProducto(String codeProducto) {
        this.codeProducto = codeProducto;
    }
}
