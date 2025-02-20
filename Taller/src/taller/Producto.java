
package taller;


class Producto{
    String nombre;
    String stock;
    double precio;

    Producto(String nombre, String stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        
        
    }
    void mostrarInfor(){
        
        System.out.println("nombre:"  +nombre + "\nStock:"  +  stock + "\nprecio: "  +precio);
        
    }
   
                
    }
    
