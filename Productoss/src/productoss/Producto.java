
package productoss;


public class Producto {
    String nombre;
    int precio;
    
    public Producto(String nombre, int precio){
        this.nombre=nombre;
        this.precio=precio;
    
    }
    public void mostrarProducto(){
        System.out.println("nombre"+ nombre + "\nprecio:"+ precio);
      
    } 
        
}
        
    

