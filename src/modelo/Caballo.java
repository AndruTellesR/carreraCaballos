/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ANDRU
 */
public class Caballo {

    private int cod, posX, posY, sprint, avance;
    private long tiempo;
    private String nombre;

    public Caballo(int codigo, int corX, int corY, int velocidad, int avanzar, long tiempo, String nombre) {
        this.cod = codigo;
        this.posX = corX;
        this.posY = corY;
        this.sprint = velocidad;
        this.avance = avanzar;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return cod;
    }

    public void setCodigo(int codigo) {
        this.cod = codigo;
    }

    public int getCorX() {
        return posX;
    }

    public void setCorX(int corX) {
        this.posX = corX;
    }

    public int getCorY() {
        return posY;
    }

    public void setCorY(int corY) {
        this.posY = corY;
    }

    public int getVelocidad() {
        return sprint;
    }

    public void setVelocidad(int velocidad) {
        this.sprint = velocidad;
    }

    public int getAvanzar() {
        return avance;
    }

    public void setAvanzar(int avanzar) {
        this.avance = avanzar;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
