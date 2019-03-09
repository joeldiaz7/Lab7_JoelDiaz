package lab.pkg7_joeldiaz;

import java.util.ArrayList;
import java.util.Date;


public class artista extends persona{
    private ArrayList<cancion> cancionesPropias = new ArrayList();
    private ArrayList<usuario> seguidores = new ArrayList();
    private ArrayList<album> albumes = new ArrayList();

    public artista() {
    }

    public artista(String nombre, String apellido, String usuario, String contrasena, Date nacimiento) {
        super(nombre, apellido, usuario, contrasena, nacimiento);
    }

    public ArrayList<cancion> getCancionesPropias() {
        return cancionesPropias;
    }

    public void setCancionesPropias(ArrayList<cancion> cancionesPropias) {
        this.cancionesPropias = cancionesPropias;
    }

    public ArrayList<lab.pkg7_joeldiaz.usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<lab.pkg7_joeldiaz.usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
}
