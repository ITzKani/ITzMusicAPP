import java.util.ArrayList;

public class GenPop extends ArrayListGral {

    ArrayList<ObjetoCancion> ListPop = new ArrayList<>();

    public GenPop() {
    }

    public void funcionTotal() {
        genArrayListPop();
        mostrarListPop();
    }

    public void genArrayListPop() {
        ListPop.add(new ObjetoCancion(16, "Dancing queen", "ABBA", "Pop"));
        ListPop.add(new ObjetoCancion(17, "Yesterday", "The Beatles", "Pop"));
        ListPop.add(new ObjetoCancion(18, "Bohemian Rhapsody", "Queen", "Pop"));
        ListPop.add(new ObjetoCancion(19, "Hotel California", "Eagles", "Pop"));
        ListPop.add(new ObjetoCancion(20, "Thriller", "Michael Jackson", "Pop"));
    }

    public void mostrarListPop() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("                   Albun Pop");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        for (int i = 0; i < ListPop.size(); i++) {
            System.out.println("Nombre:             " + ListPop.get(i).getNombreCan());
            System.out.println("Artista:            " + ListPop.get(i).getArtistaCan());
            System.out.println("                                           ID: " + ListPop.get(i).getId());
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }
}