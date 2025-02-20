
package ejercicio2;


 
public class Estudiante {
    
    String nombre;
    int edad;
    
    
    public Estudiante(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    
    }
    public Estudiante(){
      this("nombre", 19);
    }
    public void detallesEstudiante(){
        System.out.println("nombre"+nombre+"edad"+ edad);
       
    
    }
}
