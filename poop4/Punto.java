package poop4; 

public class Punto { 
    int x;  
    int y;  
    String nombre;  
     
    public Punto(){ 
        x=0; 
        y=0; 
        nombre=null;  
    } 
     
    public Punto(int x, int y, String nombre){ 
        this.x=x; 
        this.y=y; 
        this.nombre=nombre;  
    } 
     
    public void ImprimePunto(){ 
        System.out.println("x="+x+" ,y="+y+" ,Nombre="+nombre); 
    } 
} 
 