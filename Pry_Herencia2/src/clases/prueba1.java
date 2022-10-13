
package clases;
import java.util.*;
public class prueba1 {
  public static void main(String[] args) {
        List<Documento> doc=new ArrayList();
        doc.add(new Boleta("12-01-22", 300, "Juan"));
        doc.add(new Factura("14-01-22", 140, "1111"));
        doc.add(new Boleta("17-01-22", 300, "Juan"));
        doc.add(new Factura("22-01-22", 200, "2222"));
        doc.add(new Factura("18-01-22", 400, "3333"));
        String msg;
        for(Documento x:doc){
            msg=x instanceof Boleta?"Boleta":"Factura";
            System.out.println(msg+"\n"+x.print()+"\n========");
        }
       //solo boletas
       
       //solo facturas y totalizar impuestos
    }
    
}
