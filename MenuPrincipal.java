import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

    Scanner sn = new Scanner(System.in);
    Funciones fn = new Funciones();
    int optMenu;

    public MenuPrincipal() {
    }

    // * Metodo escudo de entradas invalidas en el menu principal
    public void shieldITz() {
        do {
            try {
                mostrarMenuPrincipal();
            } catch (InputMismatchException e) {
                fn.limpiarPantalla();
                System.out.println("✖︎ Error: Ingresa una opcion valida. ✖︎");
                optMenu = 10;
                sn.next();
            }

            if (optMenu >= 0 && optMenu <= 6) {
                switchMenuPrincipal();
            }

        } while (!(optMenu == 0));
    }

    // * Metodo para mostrar el menu principal
    public void mostrarMenuPrincipal() {

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("                   ITzMusicAPP");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("ᴹᵉⁿᵘ                      ᴼᵖᶜᶦᵒⁿᵉˢ");
        System.out.println("1. Canciones              4. Añadir Cancion");
        System.out.println("2. Buscador               5. Buscar Creacion");
        System.out.println("3. Albunes                6. Editar Cancion");
        System.out.println("                          0. Cerrar Sesion");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.print("• Selecciona una opcion: ");
        optMenu = sn.nextInt();
    }

    // * Metodo para el switch del menu principal
    public void switchMenuPrincipal() {
        switch (optMenu) {
            case 0:

                break;

            case 1:
                fn.mostrarCanciones();

                break;

            case 2:
                fn.buscarCancion();

                break;

            case 3:
                fn.mostrarAlbunes();

                break;

            case 4:
                fn.agregarCancion();

                break;

            case 5:
                fn.buscarCreacion();

                break;

            case 6:
                fn.editarCancion();

                break;

            default:
                System.out.println("✖︎ Error: Ingresa una opcion valida. ✖︎");
                break;
        }
    }
}