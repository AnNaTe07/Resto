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
        Producto pizza = new Producto("mondongo", 300, 400.0,true,0);

//        if(pd.agregarProducto(pizza)){
//            JOptionPane.showMessageDialog(null, "Prodcuto agregado con exito");
//        }
//        if(pd.borrarProducto(3)){
//            JOptionPane.showMessageDialog(null, "Prodcuto eliminado con exito");
//        }else{
//            JOptionPane.showMessageDialog(null, "error");
//        }
//        
//          if(pd.modificarProducto( pizza = new Producto(3, "pizza 2", 100, 100.0,true,1))){
//              JOptionPane.showMessageDialog(null, "Prodcuto modificado con exito");
//          }

//        for (Producto aux : pd.obtenerProductos()) {
//            System.out.println(aux.getNombre());
//        }

//        System.out.println(pd.obtenerProductosXnombre("pizza 2"));

//        System.out.println(pd.obtenerProductoXId(3));

//        for (Producto aux : pd.productosXStock(10)) {
//            System.out.println(aux);
//        }

        for (Producto aux : pd.buscarXCategoria(0)) {
            System.out.println(aux);
        }


          

        //Mesero
        MeseroData md = new MeseroData(conexion);
//        Mesero mesero = new Mesero("Claudio", "Duvara", 44358778, 232131, true);
//        md.agregarMesero(mesero);
        //Mesero mesero = md.buscarMesero(1);
       //md.borrarMesero(mesero);
//        md.borrarMesero(mesero);
//        ArrayList<Mesero> listaMeseros = md.obtenerMeseros();
//        for (Mesero listaMesero : listaMeseros) {
//            System.out.println(listaMesero);
//        }
 //       md.cobrarPedido(pedido);
    }

}
