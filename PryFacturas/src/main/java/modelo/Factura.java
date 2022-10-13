
package modelo;

public class Factura {
  private String nfac;
  private String fecha;
  private double total;

    public String getNfac() {
        return nfac;
    }

    public void setNfac(String nfac) {
        this.nfac = nfac;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
  
}
