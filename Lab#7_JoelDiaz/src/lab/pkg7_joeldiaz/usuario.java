package lab.pkg7_joeldiaz;

import java.util.ArrayList;
import java.util.Date;

public class usuario extends persona{
    private ArrayList<cancion> canciones = new ArrayList();
    private ArrayList<playlist> playlists = new ArrayList();
    private ArrayList<artista> artistas = new ArrayList();

    public usuario() {
    }

    public usuario(String usuario, String pass) {
        super.setUsuario(usuario);
        super.setContrasena(pass);
    }
    public usuario(String nombre, String apellido, String usuario, String contrasena, Date nacimiento) {
        super(nombre, apellido, usuario, contrasena, nacimiento);
    }

    
    public ArrayList<cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    
}
