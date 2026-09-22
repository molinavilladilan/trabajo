public class Producto implements Comparable<Producto> { 
     int codigo;
      String nombre; 
      float precio; 
      int año;

      public Producto(int codigo, String nombre, float precio, int año) { 
        this.codigo = codigo; this.nombre = nombre; this.precio = precio; this.año = año; 
        } 

        public float getPrecio() { 
            return precio; } 
        
        public String getNombre() {
             return nombre; } 
             
             @Override public int compareTo(Producto otro) {
                 return Integer.compare(this.año, otro.año);
                  } 
                  
                  @Override public String toString() { 
                    return codigo + " - " + nombre + " - $" + precio + " - " + año;
                     } 
                     }