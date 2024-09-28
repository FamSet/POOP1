package poop5;

public class Circulo {
    
    final float PI = 3.14f; 
    private float radio; 
    
    public Circulo() {
        // Constructor por defecto
    }
    
    public Circulo(float radio) {
        this.radio = radio; 
    }
    
    public float getRadio() {
        return radio; 
    }
    
    public void setRadio(float radio) {
        this.radio = radio; 
    }
    
    public void calcularPerimetro() {
        System.out.println("Perímetro: " + (2 * PI * radio));
    }
    
    public void calcularArea() {
        System.out.println("Área: " + (PI * radio * radio));
    }
}
