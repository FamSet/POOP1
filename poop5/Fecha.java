package poop5;

public class Fecha {
    
    private int dia; 
    private int mes; 
    private int año; 

    public Fecha() {
        // Constructor por defecto
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String imprimirFecha() {
        String fecha = dia + "/" + mes + "/" + año;
        System.out.println(fecha);
        return fecha; 
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", año=" + año + '}';
    }
}
