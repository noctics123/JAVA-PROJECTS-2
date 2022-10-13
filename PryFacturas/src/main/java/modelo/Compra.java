
package modelo;

public class Compra extends Articulo{
    private int cantidad;
    public double total(){
        return cantidad*super.getPuni();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
