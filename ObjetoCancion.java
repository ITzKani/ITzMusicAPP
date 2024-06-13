import java.util.ArrayList;

public class ObjetoCancion {

    private String nombreCan, artistaCan, AlbumCan;
    private int id;
    ArrayList<ObjetoCancion> ListAlbunes = new ArrayList<>();

    // * Metodo constructor del ObjetoCancion
    public ObjetoCancion(int id, String nombreCan, String artistaCan, String albumCan) {
        this.id = id;
        this.nombreCan = nombreCan;
        this.artistaCan = artistaCan;
        this.AlbumCan = albumCan;
    }

    // * Metodos getter y setters de los atributos del ObjetoCancion
    public String getNombreCan() {
        return nombreCan;
    }

    public void setNombreCan(String nombreCan) {
        this.nombreCan = nombreCan;
    }

    public String getArtistaCan() {
        return artistaCan;
    }

    public void setArtistaCan(String artistaCan) {
        this.artistaCan = artistaCan;
    }

    public String getAlbumCan() {
        return AlbumCan;
    }

    public void setAlbumCan(String albumCan) {
        AlbumCan = albumCan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}