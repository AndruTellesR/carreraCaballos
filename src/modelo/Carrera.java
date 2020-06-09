/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Vista.Vista;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRU
 */
public class Carrera extends Thread {

    private JLabel stim;
    private Vista vista;
    private int posic;

    public Carrera() {
    }

    public Carrera(JLabel esti, Vista vista) {
        this.stim = esti;
        this.vista = vista;
    }

    @Override
    public void run() {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        while (true) {
            try {
                sleep((int) (Math.random() * 1000));
                c1 = vista.getcaballo1().getLocation().x;
                c2 = vista.getcaballo2().getLocation().x;
                c3 = vista.getcaballo3().getLocation().x;
                c4 = vista.getcaballo4().getLocation().x;

                if (c1 < vista.getMeta().getLocation().x - 10 && c2 < vista.getMeta().getLocation().x - 10 && c3 < vista.getMeta().getLocation().x - 10 && c4 < vista.getMeta().getLocation().x - 10) {
                    stim.setLocation(stim.getLocation().x + 10, stim.getLocation().y);
                    vista.repaint();

                } else {
                    break;
                }
            } catch (InterruptedException e) {
            }
            if (stim.getLocation().x >= vista.getMeta().getLocation().x - 10) {
                if (c1 > c2 && c1 > c3 && c1 > c4) {
                   vista.txtmostrar.setText("El caballo ganador es: " + "Tormenta");
                   
                } else if (c2 > c1 && c2 > c3 && c2 > c4) {
                   vista.txtmostrar.setText("El caballo ganador es: " + "Rocinante");

                } else if (c3 > c1 && c3 > c3 && c3 > c4) {
                   vista.txtmostrar.setText("El caballo ganador es: " + "Palomo");

                } else if (c4 > c1 && c4 > c2 && c4 > c3) {
                   vista.txtmostrar.setText("El caballo ganador es: " + "Tornado");
                } else {
                    vista.txtmostrar.setText("Hay Empate");
                }
            }
        }

    }

    public void reiniciar() {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        c1 = vista.getcaballo1().getLocation().x;
        c2 = vista.getcaballo2().getLocation().x;
        c3 = vista.getcaballo3().getLocation().x;
        c4 = vista.getcaballo4().getLocation().x;
    }

}
