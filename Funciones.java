import java.util.ArrayList;
import java.util.Scanner;

public class Funciones extends ArrayListGral {

    Scanner sn = new Scanner(System.in);
    MenusSecundarios menusSec = new MenusSecundarios();
    GenClassic gc = new GenClassic();
    GenElectronica ge = new GenElectronica();
    GenHipHop ghh = new GenHipHop();
    GenPop gp = new GenPop();
    String opt;
    int searchID;
    String inNombreCan, inArtistaCan, inGeneroCan;
    ArrayList<ObjetoCancion> ListPer = new ArrayList<>();

    // * Metodo constructor de la clase Funciones
    public Funciones() {
    }

    // * Metodo para limpiar la pantalla
    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // * Metodo opcion salir
    public void validarSalida() {
        System.out.print("Regresar al menu principal y/n: ");
        opt = sn.nextLine();
    }

    // * Metodo para ver las canciones (Opcion 1 del menu)
    public void mostrarCanciones() {
        do {
            limpiarPantalla();
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("             ITzMusicAPP - Canciones");
            gc.funcionTotal();
            ge.funcionTotal();
            ghh.funcionTotal();
            gp.funcionTotal();

            validarSalida();

        } while (!(opt.equals("y")));
    }

    // * Metodo para buscar una cancion (Opcion 2 del menu)
    public void buscarCancion() {
        limpiarPantalla();
        addArrayListGral();
        do {
            try {
                limpiarPantalla();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("             ITzMusicAPP - Buscador");
                System.out.println("          *Ingresa la ID de la cancion*");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.print("Buscador: ");
                searchID = sn.nextInt();
                searchID = searchID - 1;

                limpiarPantalla();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("             ITzMusicAPP - Buscador");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Nombre:             " + ListGral.get(searchID).getNombreCan());
                System.out.println("Artista:            " + ListGral.get(searchID).getArtistaCan());
                System.out.println("Album:              " + ListGral.get(searchID).getAlbumCan());
                System.out.println("                                           ID: " + ListGral.get(searchID).getId());
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            } catch (Exception e) {
                System.out.println("✖︎ Error: Esa ID no existe.✖︎");
            }

            sn.nextLine();
            validarSalida();

        } while (!(opt.equals("y")));
    }

    // * Metodo para ver los albunes con su menu (Opcion 3 del menu)
    public void mostrarAlbunes() {
        do {
            try {
                limpiarPantalla();
                menusSec.mostrarMenuAlbunes();

                switch (menusSec.optMenu) {
                    case 0:
                        break;
                    case 1:
                        gc.funcionTotal();
                        break;

                    case 2:
                        ge.funcionTotal();
                        break;

                    case 3:
                        ghh.funcionTotal();
                        break;

                    case 4:
                        gp.funcionTotal();
                        break;

                    default:
                        System.out.println("✖︎ Error: Ingresa una opcion valida. ✖︎");
                        break;
                }

            } catch (Exception e) {
                System.out.println("✖︎ Error: Ingresa una opcion valida. ✖︎");
            }
            menusSec.sn.nextLine();

            validarSalida();
        } while (!(opt.equals("y")));

    }

    // * Metodo para agregar cancion (Opcion 4 del menu)
    public void agregarCancion() {
        int id = 0;
        do {
            limpiarPantalla();
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("             ITzMusicAPP - Agregar");
            System.out.println("*Ingresa los datos de la cancion que quieres agregar*");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.print("Nombre de la cancion: ");
            inNombreCan = sn.nextLine();
            System.out.print("Artista de la cancion: ");
            inArtistaCan = sn.nextLine();
            System.out.print("Genero de la cancion: ");
            inGeneroCan = sn.nextLine();

            ListPer.add(id, new ObjetoCancion(id + 1, inNombreCan, inArtistaCan, inGeneroCan));

            limpiarPantalla();
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("             ITzMusicAPP - Agregar");
            System.out.println("        *Cancion agregada correctamente*");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Nombre:             " + ListPer.get(id).getNombreCan());
            System.out.println("Artista:            " + ListPer.get(id).getArtistaCan());
            System.out.println("Genero:             " + ListPer.get(id).getAlbumCan());
            System.out.println("                                           ID: " + ListPer.get(id).getId());
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            id++;
            validarSalida();
        } while (!(opt.equals("y")));
    }

    // * Metodo para buscar creacion (Opcion 5 del menu)
    public void buscarCreacion() {
        do {
            if (ListPer.size() > 0) {
                try {
                    limpiarPantalla();
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                    System.out.println("            ITzMusicAPP - Buscador C");
                    System.out.println("         *Ingresa la ID de tu creacion");
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                    System.out.print("Buscador: ");
                    searchID = sn.nextInt();
                    searchID = searchID - 1;

                    limpiarPantalla();
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                    System.out.println("            ITzMusicAPP - Buscador C");
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                    System.out.println("Nombre:             " + ListPer.get(searchID).getNombreCan());
                    System.out.println("Artista:            " + ListPer.get(searchID).getArtistaCan());
                    System.out.println("Genero:             " + ListPer.get(searchID).getAlbumCan());
                    System.out
                            .println("                                           ID: " + ListPer.get(searchID).getId());
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                } catch (Exception e) {
                    System.out.println("✖︎ Error: Esa ID no existe. ✖︎");
                }

                sn.nextLine();
            } else {
                limpiarPantalla();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("            ITzMusicAPP - Buscador C");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("✖︎ Error: No tienes canciones creadas. ✖︎");
            }
            validarSalida();

        } while (!(opt.equals("y")));
    }

    // * Metodo para editar una cancion creada (Opcion 6 del menu)
    public void editarCancion() {
        do {
            try {
                limpiarPantalla();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("            ITzMusicAPP - Editor");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                if (ListPer.size() > 0) {
                    for (int i = 0; i < ListPer.size(); i++) {
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        System.out.println("Nombre:             " + ListPer.get(i).getNombreCan());
                        System.out.println("Artista:            " + ListPer.get(i).getArtistaCan());
                        System.out.println("Genero:             " + ListPer.get(i).getAlbumCan());
                        System.out.println("                                           ID: " + ListPer.get(i).getId());
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        System.out.print("Ingresa la ID de la cancion a modificar: ");
                        searchID = sn.nextInt();
                        if (searchID > 0 && searchID <= ListPer.size()) {
                            searchID = searchID - 1;
                            limpiarPantalla();
                            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                            System.out.println("            ITzMusicAPP - Editor");
                            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                            System.out.print("Nuevo nombre de la cancion: ");
                            sn.nextLine();
                            inNombreCan = sn.nextLine();
                            System.out.print("Nuevo artista de la cancion: ");
                            inArtistaCan = sn.nextLine();
                            System.out.print("Nuevo genero de la cancion: ");
                            inGeneroCan = sn.nextLine();
                            ListPer.set(searchID,
                                    new ObjetoCancion(searchID + 1, inNombreCan, inArtistaCan, inArtistaCan));
                            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                            System.out.println("            ITzMusicAPP - Editor");
                            System.out.println("      *Cancion modificada correctamente*");
                            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                            System.out.println("Nombre:             " + ListPer.get(searchID).getNombreCan());
                            System.out.println("Artista:            " + ListPer.get(searchID).getArtistaCan());
                            System.out.println("Genero:             " + ListPer.get(searchID).getAlbumCan());
                            System.out.println(
                                    "                                           ID: " + ListPer.get(searchID).getId());
                            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                        } else {
                            System.out.println("✖︎ Error: Esa ID no existe ✖︎");
                        }
                    }
                } else {
                    System.out.println("✖︎ Error: No tienes canciones creadas. ✖︎");
                }

            } catch (Exception e) {
                System.out.println("✖︎ Error: Esa ID no existe ✖︎");

            }
            validarSalida();
        } while (!(opt.equals("y")));
    }

}