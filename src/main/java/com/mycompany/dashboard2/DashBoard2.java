/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dashboard2;

import java.util.Random;


/**
 *
 * @author ARCar
 */
public class DashBoard2 {
    private SensorProxy[] sp;

    public DashBoard2() {
        sp = new SensorProxy[2];
    }

    public static void main(String[] args) {
        DashBoard2 db = new DashBoard2();
        System.out.println("Sensores: ");
        db.rellenarSensores();
        System.out.println("Datos de los sensores ingresados");
        db.mostrarSensores();
    }

    public void rellenarSensores() {
        Random rmd = new Random();
        for (int i = 0; i < 2; i++) {
            SensorProxy spr = new SensorProxy(); // Crear un nuevo objeto en cada iteración
            int numeroA = rmd.nextInt(100 - 1 + 1) + 1;
            spr.setSel(i);
            if (i == 0) {
                spr.setTemperatura(numeroA);
            } else {
                spr.setLuz(numeroA);
            }
            sp[i] = spr;
        }
    }

    public void mostrarSensores() {
        for (int i = 0; i < 2; i++) {
            System.out.println(sp[i].toString()); // Imprimir el resultado de toString()
        }
    }
}