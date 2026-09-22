import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Producto gta = new Producto(1, "GTA V", 70000, 2013);
        Producto minecraft = new Producto(2, "Minecraft", 90000, 2011);
        Producto fc = new Producto(3, "EA FC 26", 250000, 2025);

        List tienda = new List();

        tienda.agregar(gta);
        tienda.agregar(minecraft);
        tienda.agregar(fc);

        System.out.println("JUEGOS DE LA TIENDA:");
        tienda.mostrar();

        List biblioteca = new List();

        biblioteca.agregar(gta);

        System.out.println("\nMI BIBLIOTECA:");
        biblioteca.mostrar();

        if (gta.compareTo(fc) < 0) {
            System.out.println("\nFC 26 es más reciente.");
        }

        Comparator<Producto> precio =
                Comparator.comparing(Producto::getPrecio);

        Producto masCaro = tienda.mayor(precio);

        System.out.println("\nJuego más caro:");
        System.out.println(masCaro);
    }
}