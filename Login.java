import java.util.Scanner;

public class Login {

    final private String user = "root";
    final private String password = "12345a";
    String imputUser, imputPassword;
    Scanner sn = new Scanner(System.in);
    Funciones fn = new Funciones();

    // * Metodo constructor del objeto Login
    public Login() {
    }

    // * Menu de inicio de sesion
    public void MenuLogin() {

        fn.limpiarPantalla();
        do {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("          ITzMusicAPP");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.print("Nombre de usuario: ");
            imputUser = sn.nextLine();
            System.out.print("Contraseña: ");
            imputPassword = sn.nextLine();

            // * Validacion fallida en el inicio de sesion
            if (!(imputUser.equals(getUser()) && imputPassword.equals(getPassword()))) {
                fn.limpiarPantalla();
                System.out.println("✖︎ Error: Nombre de usuario o contraseña incorrecta. ✖︎");
            }
        } while (!(imputUser.equals(getUser()) && imputPassword.equals(getPassword())));
    }

    // * Metodos getters y setters
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}