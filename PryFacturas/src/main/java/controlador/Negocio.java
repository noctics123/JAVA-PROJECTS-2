
package controlador;
import java.util.*;
import java.sql.*;
import modelo.*;
import util.MySQLConexion;
public class Negocio {
 public List<Articulo> lisArt() {
    List<Articulo> lis=new ArrayList();    
    Connection cn=MySQLConexion.getConexion();
  try{
      String sql="select Art_cod,Art_nom,Art_pre, art_stk from articulos";
      PreparedStatement st=cn.prepareStatement(sql);
      ResultSet rs=st.executeQuery();
      while(rs.next()){
          Articulo p=new Articulo();
          p.setCoda(rs.getString(1));
          p.setDesp(rs.getString(2));
          p.setPuni(rs.getDouble(3));
          p.setStock(rs.getInt(4));
          lis.add(p);
      }
  }catch(Exception ex){
      ex.printStackTrace();
  }finally{
    try{ cn.close();}catch(Exception ex2){}
  }
  return lis;   
    } 
 //lista de facturas x anio
 public List<Factura> lisFac(int an) {
    List<Factura> lis=new ArrayList();    
    Connection cn=MySQLConexion.getConexion();
  try{
      String sql="SELECT D.FAC_NUM,FAC_FEC ,SUM(ART_PRE*ART_CAN) TOTAL\n" +
"FROM fac_deta D, ARTICULOS A, fac_cabe F\n" +
"WHERE D.art_cod=A.art_cod AND F.fac_num=D.fac_num\n" +
"AND YEAR(FAC_FEC)=? GROUP BY D.FAC_NUM,FAC_FEC;";
      PreparedStatement st=cn.prepareStatement(sql);
      st.setInt(1, an);
      ResultSet rs=st.executeQuery();
      while(rs.next()){
          Factura p=new Factura();
          p.setNfac(rs.getString(1));
          p.setFecha(rs.getString(2));
          p.setTotal(rs.getDouble(3));
          lis.add(p);
      }
  }catch(Exception ex){
      ex.printStackTrace();
  }finally{
    try{ cn.close();}catch(Exception ex2){}
  }
  return lis;   
    } 
 
 
 
 
 
 public String grabaFac(String codc,String tipo,int codv,List<Compra> lista){
     String fac="";
      Connection cn=MySQLConexion.getConexion();
  try{
      String sql="{call spAdicion(?,?,?)}";
     CallableStatement st=cn.prepareCall(sql);
     st.setString(1, codc);
     st.setString(2, tipo);
     st.setInt(3, codv);
     ResultSet rs=st.executeQuery();
     rs.next();
     fac=rs.getString(1);
     sql="{call spdeta(?,?,?)}";
     CallableStatement st2=cn.prepareCall(sql);
      for(Compra  x:lista){
         st2.setString(1, fac);
         st2.setString(2, x.getCoda());
         st2.setInt(3, x.getCantidad());
         st2.executeUpdate();
      }
   }catch(Exception ex){
      ex.printStackTrace();
  }finally{
    try{ cn.close();}catch(Exception ex2){}
  }
    return fac;
 }
 
}
