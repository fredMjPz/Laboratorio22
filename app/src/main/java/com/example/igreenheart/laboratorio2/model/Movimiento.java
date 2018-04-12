package com.example.igreenheart.laboratorio2.model;

import java.util.Date;

/**
 * Created by Black1820 on 07/04/2018.
 */

public class Movimiento {
    private long idMovimiento;
    private Categoria categoria;
    private String Descripcion;
    private Date fecha;


    public Movimiento(long idMovimiento, Categoria categoria, String descripcion, Date fecha) {
        this.idMovimiento = idMovimiento;
        this.categoria = categoria;
        Descripcion = descripcion;
        this.fecha = fecha;
    }

    public long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
