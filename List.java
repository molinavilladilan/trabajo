import java.util.Comparator; public class List { 
    Node cabeza;
     public List() { 
        cabeza = null;
         } 
         public void agregar(Producto producto) { 
            Node nuevo = new Node(producto);
             if (cabeza == null) { cabeza = nuevo; 
             } else {
                Node actual = cabeza; 
              while (actual.siguiente != null) 
              { actual = actual.siguiente; 
              } 
              actual.siguiente = nuevo; } 
              } 
              public void mostrar() { 
               Node actual = cabeza; 
               while (actual != null) 
               { 
                  System.out.println(actual.producto);
                   actual = actual.siguiente; } 
                   } 
                   public Producto mayor(Comparator<Producto> comparador) { 
                     Node actual = cabeza; 
                     Producto mayor = cabeza.producto;
                      while (actual != null) { 
                        if (comparador.compare( actual.producto, mayor) > 0) { 
                           mayor = actual.producto; 
                           } actual = actual.siguiente; 
                           } return mayor; 
                           } 
                           }