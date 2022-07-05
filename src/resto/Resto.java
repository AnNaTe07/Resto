package resto;

import Data.Conexion;
import Data.MeseroData;
import Data.ProductoData;
import Modelos.Mesero;
import Modelos.Pedido;
import Modelos.Producto;
import java.util.ArrayList;
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

          

        //Mesero
//        MeseroData md = new MeseroData(conexion);
//        Mesero mesero = new Mesero("Luciano", "Cejas", 321331);
//        md.agregarMesero(mesero);
//        Mesero mesero = md.buscarMesero(6);
//        md.borrarMesero(mesero);
//        ArrayList<Mesero> listaMeseros = md.obtenerMeseros();
//        for (Mesero listaMesero : listaMeseros) {
//            System.out.println(listaMesero);
//        }
        
    }

}
