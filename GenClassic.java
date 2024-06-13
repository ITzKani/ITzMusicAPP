import java.util.ArrayList;

public class GenClassic extends ArrayListGral {

    ArrayList<ObjetoCancion> ListClassic = new ArrayList<>();

    public GenClassic() {
    }

    public void funcionTotal() {
        genArrayListClassic();
        mostrarListClassic();
    }

    public void genArrayListClassic() {
        ListClassic.add(new ObjetoCancion(1, "Claro de Luna", "Beethoven", "Classic"));
        ListClassic.add(new ObjetoCancion(2, "El Mesías", "Handel", "Classic"));
        ListClassic.add(new ObjetoCancion(3, "Pequeña Serenata Nocturna", "Mozart", "Classic"));
        ListClassic.add(new ObjetoCancion(4, "Para Elisa", "Beethoven", "Classic"));
        ListClassic.add(new ObjetoCancion(5, "Sinfonía nº 5", "Beethoven", "Classic"));
    }

    public void mostrarListClassic() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("                  Albun Classic");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        for (int i = 0; i < ListClassic.size(); i++) {
            System.out.println("Nombre:             " + ListClassic.get(i).getNombreCan());
            System.out.println("Artista:            " + ListClassic.get(i).getArtistaCan());
            System.out.println("                                           ID: " + ListClassic.get(i).getId());
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }
}