/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_joeldiaz;


import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author usuario
 */
public class adminReproductor extends Thread {

    private JProgressBar progBar_rep;
    private int duracion;
    private boolean avanzar;
    private boolean vive;

    public adminReproductor(JProgressBar progBar_rep) {
        this.progBar_rep = progBar_rep;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getProgBar_t() {
        return progBar_rep;
    }

    public JProgressBar getProgBar_rep() {
        return progBar_rep;
    }

    public void setProgBar_rep(JProgressBar progBar_rep) {
        this.progBar_rep = progBar_rep;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setProgBar_t(JProgressBar progBar_rep) {
        this.progBar_rep = progBar_rep;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }



    @Override
    public void run() {
                    int cont=1;
        while (vive) {
            if (avanzar && cont<duracion) {
                progBar_rep.setValue(cont);
                progBar_rep.setString(Integer.toString(progBar_rep.getValue()));
                cont++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            cont++;
        }
    }
}
