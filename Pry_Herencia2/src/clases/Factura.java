
package clases;

public class Factura extends Documento{
    private String ruc;

    public Factura(String fecha, double importe,String ruc) {
        super(fecha, importe);
        this.ruc=ruc;
    }
    public double igv(){
        return super.getImporte()*0.18;
    }
    public double total(){
        return super.getImporte()+igv();
    }
    public String print(){
        String cad=super.print()+"\n Ruc "+ruc+"\t Igv="+igv()+"\t Total="+total();
        return cad;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
}
