import java.util.ArrayList;

public class GenElectronica extends ArrayListGral {

    ArrayList<ObjetoCancion> ListElectronica = new ArrayList<>();

    public GenElectronica() {
    }

    public void funcionTotal() {
        genArrayListElectronica();
        mostrarListElectronica();
    }

    public void genArrayListElectronica() {
        ListElectronica.add(new ObjetoCancion(6, "Faded", "Alan Walker", "Electronica"));
        ListElectronica.add(new ObjetoCancion(7, "Calling", "Alesso & Sebastian Ingrosso", "Electronica"));
        ListElectronica.add(new ObjetoCancion(8, "Don’t let me down", "The Chainsmokers", "Electronica"));
        ListElectronica.add(new ObjetoCancion(9, "Something just like this", "The Chainsmokers & Coldplay", "Electronica"));
        ListElectronica.add(new ObjetoCancion(10, "A Sky Full of Stars", "ColdPlay", "Electronica"));
    }

    public void mostrarListElectronica() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("                 Albun Electronica");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        for (int i = 0; i < ListElectronica.size(); i++) {
            System.out.println("Nombre:             " + ListElectronica.get(i).getNombreCan());
            System.out.println("Artista:            " + ListElectronica.get(i).getArtistaCan());
            System.out.println("                                           ID: " + ListElectronica.get(i).getId());
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }
}