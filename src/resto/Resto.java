package resto;

import Data.Conexion;
import Data.ProductoData;
import Modelos.Producto;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class Resto {

    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        ProductoData pd = new ProductoData(conexion);
        /////----------------AGREGANDO PRODUCTOS----------------------------
        //creamos el objeto
        Producto pizza = new Producto("mondongo", 300, 400.0);

//        if(pd.agregarProducto(pizza)){
//            JOptionPane.showMessageDialog(null, "Prodcuto agregado con exito");
//        }
//        if(pd.borrarProducto(12)){
//            JOptionPane.showMessageDialog(null, "Prodcuto eliminado con exito");
//        }
//        
//          if(pd.modificarProducto( pizza = new Producto(1, "pizza 2", 100, 100.0))){
//              JOptionPane.showMessageDialog(null, "Prodcuto modificado con exito");
//          }

//        for (Producto aux : pd.obtenerProductos()) {
//            System.out.println(aux);
//        }

          
    }

}
