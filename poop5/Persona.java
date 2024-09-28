package poop5;

public class Persona {
    
    private int edad; 
    private float altura; 
    private String nombre; 
    private Fecha nacimiento; 
    private String ocupacion; 
    
    public Persona() {
        // Constructor por defecto
    }
    
    public Persona(int edad, float altura, String nombre, Fecha nacimiento, String ocupacion) {
        this.edad = edad; 
        this.altura = altura; 
        this.nombre = nombre; 
        this.nacimiento = nacimiento; 
        this.ocupacion = ocupacion; 
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad; 
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura; 
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    
    public Fecha getNacimiento() {
        return nacimiento;
    }
    
    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento; 
    }
    
    public String getOcupacion() {
        return ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion; 
    }
    
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", nacimiento=" + nacimiento + ", ocupacion=" + ocupacion + '}';
    }
}
