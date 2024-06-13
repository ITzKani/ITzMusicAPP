public class MainAPP {
    public static void main(String[] args) {

        // * Objetos y atributos de la clase Main
        Login login = new Login();
        MenuPrincipal menuP = new MenuPrincipal();

        // * Llamada al metodo de inicio de sesion
        login.MenuLogin();

        // * Llamada al metodo del menu principal y su switch protegido
        menuP.shieldITz();
    }
}