import java.util.Scanner;

public class MenusSecundarios {
    Scanner sn = new Scanner(System.in);
    int optMenu;

    public MenusSecundarios() {
    }

    public void mostrarMenuAlbunes() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("               ITzMusicAPP - Albunes");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("ᴬˡᵇᵘⁿᵉˢ");
        System.out.println("1. Classic                  4. Pop");
        System.out.println("2. Electronica");
        System.out.println("3. Hip-Hop");
        System.out.println("                            0. Menu principal");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.print("• Selecciona una opcion: ");
        optMenu = sn.nextInt();

    }

}