/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author nelson
 */
public class Pedido {
    private static double g=10, m=7, p=4;
    private int cantidad;
    private double total, precio;
public Pedido(){

}
public Pedido(int n){
cantidad=n;
}

    /**
     * @return the id
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param id the id to set
     */
    public void setCantidad(int id) {
        this.cantidad = id;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    public String getTotalImporte(String t){
         String res="";
        if(t.equals("g")){
             res+=(cantidad * g );
        }
        if(t.equals("m")){
             res+=(cantidad * m );
        }
          
        if(t.equals("p")){
             res+=(cantidad * p );
        }
        return res;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}