package clases;

import java.text.DecimalFormat;

public class Documento {
   private String nro; //00001
   private String fecha;
   private double importe;
   static int cuenta=1;

    public Documento() {
    }
     public Documento(String fecha, double importe) {
      
        this.fecha = fecha;
        this.importe = importe;
        
    }

    public Documento(String nro,String fecha, double importe) {
       
        this.nro = nro;
        this.fecha = fecha;
        this.importe = importe;
        
    }
    public String print(){
       String cad="Nro   :"+nro;
       cad+="\nFecha:"+fecha+"\n importe :"+importe;
       return cad;
    } 

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
   
}
