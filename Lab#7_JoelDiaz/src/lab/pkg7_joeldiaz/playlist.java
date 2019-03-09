package lab.pkg7_joeldiaz;

import java.util.ArrayList;
import java.util.Date;

public class playlist {
    private String nombre;
    private String genero;
    private String creacion;
    private ArrayList<cancion> canciones = new ArrayList();
    private int duracion = 0;

    public playlist(String nombre, String genero, String creacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.creacion = creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    public ArrayList<cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
