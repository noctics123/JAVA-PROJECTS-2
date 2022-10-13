package clases;

import java.text.DecimalFormat;

public class Boleta extends Documento{
    private String cliente;
    static int cuenta=1;

    public Boleta() {
        DecimalFormat sd=new DecimalFormat("00000");
        this.setNro("B"+sd.format(cuenta));
        cuenta++;
    }
     

    public Boleta(String fecha, double importe,String cliente) {
       super(fecha, importe);
        super.setNro(genera());
        this.cliente=cliente;
    }
    String genera(){
        DecimalFormat sd=new DecimalFormat("00000");
        String cad= "B"+sd.format(cuenta);
        cuenta++;
        return cad;
    }
    /*
    public Boleta(String nro,String fecha, double importe,String cliente) {
         DecimalFormat sd=new DecimalFormat("00000");
         super(nro,fecha, importe);
        this.cliente=cliente;
    }

*/
    public String print(){
        String cad=super.print()+"\n Cliente :"+cliente;
        return cad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    
}
