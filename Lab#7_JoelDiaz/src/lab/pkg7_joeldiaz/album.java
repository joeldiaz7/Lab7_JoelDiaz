package lab.pkg7_joeldiaz;

import java.util.ArrayList;

public class album {
    private String nombre; 
    private String ano; 
    private String artista; 
    private ArrayList<cancion>canciones = new ArrayList();

    public album() {
    }

    public album(String nombre, String ano, String artista) {
        this.nombre = nombre;
        this.ano = ano;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
