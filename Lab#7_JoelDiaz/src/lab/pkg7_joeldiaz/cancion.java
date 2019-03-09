package lab.pkg7_joeldiaz;

public class cancion {
    private String nombre;
    private String ano;
    private String artista;
    private int duracion;

    public cancion() {
    }

    public cancion(String nombre, String ano, String artista, int duracion) {
        this.nombre = nombre;
        this.ano = ano;
        this.artista = artista;
        this.duracion = duracion;
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
