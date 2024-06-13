import java.util.ArrayList;

public class ArrayListGral {
    ArrayList<ObjetoCancion> ListGral = new ArrayList<>();

    public ArrayListGral() {
    }

    public void addArrayListGral() {
        ListGral.add(0, new ObjetoCancion(1, "Claro de Luna", "Beethoven", "Classic"));
        ListGral.add(1, new ObjetoCancion(2, "El Mesías", "Handel", "Classic"));
        ListGral.add(2, new ObjetoCancion(3, "Pequeña Serenata Nocturna", "Mozart", "Classic"));
        ListGral.add(3, new ObjetoCancion(4, "Para Elisa", "Beethoven", "Classic"));
        ListGral.add(4, new ObjetoCancion(5, "Sinfonía nº 5", "Beethoven", "Classic"));
        ListGral.add(5, new ObjetoCancion(6, "Faded", "Alan Walker", "Electronica"));
        ListGral.add(6, new ObjetoCancion(7, "Calling", "Alesso & Sebastian Ingrosso", "Electronica"));
        ListGral.add(7, new ObjetoCancion(8, "Don’t let me down", "The Chainsmokers", "Electronica"));
        ListGral.add(8, new ObjetoCancion(9, "Something just like this", "The Chainsmokers & Coldplay", "Electronica"));
        ListGral.add(9, new ObjetoCancion(10, "A Sky Full of Stars", "ColdPlay", "Electronica"));
        ListGral.add(10, new ObjetoCancion(11, "Chico invisible", "Zarcort", "Hip-Hop"));
        ListGral.add(11, new ObjetoCancion(12, "Vivo por ti", "Zarcort", "Hip-Hop"));
        ListGral.add(12, new ObjetoCancion(13, "No hay cancion que te defina", "Rafa Espino", "Hip-Hop"));
        ListGral.add(13, new ObjetoCancion(14, "Amor, tiempo y muerte", "Ambkor", "Hip-Hop"));
        ListGral.add(14, new ObjetoCancion(15, "Tiempo", "Droow", "Hip-Hop"));
        ListGral.add(15, new ObjetoCancion(16, "Dancing queen", "ABBA", "Pop"));
        ListGral.add(16, new ObjetoCancion(17, "Yesterday", "The Beatles", "Pop"));
        ListGral.add(17, new ObjetoCancion(18, "Bohemian Rhapsody", "Queen", "Pop"));
        ListGral.add(18, new ObjetoCancion(19, "Hotel California", "Eagles", "Pop"));
        ListGral.add(19, new ObjetoCancion(20, "Thriller", "Michael Jackson", "Pop"));
    }
}
