/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dashboard2;


/**
 *
 * @author ARCar
 */
public class SensorProxy {
    private int temperatura;
    private String tipo;
    private int luz;
    private int sel;

    public SensorProxy() {
        tipo = " ";
        luz = 0;
        temperatura = 0;
        sel = 0;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getLuz() {
        return luz;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setLuz(int luz) {
        this.luz = luz;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSel() {
        return sel;
    }

    public void setSel(int sel) {
        this.sel = sel;
        if (sel == 0) {
            tipo = "Temperatura";
        } else {
            tipo = "Luz";
        }
    }

    @Override
    public String toString() {
        if (sel == 0) {
            return "SensorProxy{" + "Sensor=" + tipo + ", temperatura=" + temperatura + '}';
        } else {
            return "SensorProxy{" + "Sensor=" + tipo + ", luz=" + luz + '}';
        }
    }
}
