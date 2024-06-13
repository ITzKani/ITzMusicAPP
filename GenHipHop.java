import java.util.ArrayList;

public class GenHipHop extends ArrayListGral {

    ArrayList<ObjetoCancion> ListHipHop = new ArrayList<>();

    public GenHipHop() {
    }

    public void funcionTotal() {
        genArrayListHipHop();
        mostrarListHipHop();
    }

    public void genArrayListHipHop() {
        ListHipHop.add(new ObjetoCancion(11, "Chico invisible", "Zarcort", "Hip-Hop"));
        ListHipHop.add(new ObjetoCancion(12, "Vivo por ti", "Zarcort", "Hip-Hop"));
        ListHipHop.add(new ObjetoCancion(13, "No hay cancion que te defina", "Rafa Espino", "Hip-Hop"));
        ListHipHop.add(new ObjetoCancion(14, "Amor, tiempo y muerte", "Ambkor", "Hip-Hop"));
        ListHipHop.add(new ObjetoCancion(15, "Tiempo", "Droow", "Hip-Hop"));
    }

    public void mostrarListHipHop() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("                  Albun Hip-Hop");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        for (int i = 0; i < ListHipHop.size(); i++) {
            System.out.println("Nombre:             " + ListHipHop.get(i).getNombreCan());
            System.out.println("Artista:            " + ListHipHop.get(i).getArtistaCan());
            System.out.println("                                           ID: " + ListHipHop.get(i).getId());
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }
}