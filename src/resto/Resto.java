package resto;

import Data.Conexion;
import Data.DetalleData;
import Data.MesaData;
import Data.MeseroData;
import Data.PedidoData;
import Data.ProductoData;
import Data.ReservaData;
import Modelos.DetallePedido;
import Modelos.Mesa;
import Modelos.Mesero;
import Modelos.Pedido;
import Modelos.Producto;
import Modelos.Reserva;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class Resto {

    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        ProductoData pd = new ProductoData(conexion);
        MesaData mesad= new MesaData(conexion);
        ReservaData rd= new ReservaData(conexion);
        PedidoData ped = new PedidoData(conexion);
        DetalleData dp = new DetalleData(conexion);
        /////----------------AGREGANDO PRODUCTOS----------------------------
        //creamos el objeto
      //  Producto pizza = new Producto("mondongo", 300, 400.0,true,0);

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

   //     for (Producto aux : pd.buscarXCategoria(0)) {
   //         System.out.println(aux);
   //     }


          

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
    
    
////////////////////////////----------------Reservas----------------------------
        //crear la reserva
   
        //LocalDate fecha=LocalDate.parse("2022-07-30 18:30:00");
       // LocalTime hora=LocalTime.parse("18:30");
        //Reserva reserva = new Reserva("Bob Esponja",33444555,fecha ,20, 1, true);
        
        
//        if(rd.agregarReserva(reserva)){
//            JOptionPane.showMessageDialog(null,"reserva agregada con exito");
//        }

//        if(rd.borrarReserva(10)){
//              JOptionPane.showMessageDialog(null,"reserva borrada con exito");
//        }

//        if(rd.modificarReserva(reserva = new Reserva(12,"Patricio Estrella",44555666,fecha ,21 , 1, true))){
//                JOptionPane.showMessageDialog(null,"reserva modificada con exito");
//        }
            
//          for (Reserva re : rd.obtenerReservas()) {
//                System.out.println(re);
//                System.out.println("\n");
//          }

//            System.out.println(rd.obtenerReservaxId(11));
//          Date date = Date.valueOf(fecha);
//          System.out.println(date);
//          for (Reserva re : rd.buscarReservaXFecha("2022-07-31")) {
//                System.out.println(re);
//                System.out.println("\n");
//          }

        
        /////----------------Mesas----------------------------
        //crear  mesa
   
        //Mesa mesa = new Mesa(1, 2,true, "libre");
        //Mesa mesa2 = new Mesa(2, 2,true,"libre");
//        Mesa m = new Mesa(3, 4,true, "libre");
//        Mesa mesa = new Mesa(4, 4,true, "libre");
       /* Mesa mesa = new Mesa(5, 4,true, -1);
        Mesa mesa = new Mesa(7, 6,true, -1);
        Mesa mesa = new Mesa(8, 6,true, -1);
        Mesa mesa = new Mesa(9, 6,true, -1);
        Mesa mesa = new Mesa(10, 8,true, -1);
        Mesa mesa = new Mesa(11, 8,true, -1);*/


//          mesad.agregarMesa(m);
//          mesad.agregarMesa(mesa);
//          Mesa me=mesad.obtenerMesaxId(2);

         // mesad.agregarMesa(m);
          //mesad.agregarMesa(mesa);
         // Mesa me=mesad.obtenerMesaxId(2);

//            System.out.println( mesad.obtenerMesasSinReservas());

//            System.out.println( mesad.obtenerMesasSinReservas());
//            System.out.println("******");
//              System.out.println( mesad.obtenerMesasReservadas());


         // mesad.borrarMesa(2);
         // m=mesad.obtenerMesaxId(2);
//          
//          me.setEstado("ocupada");
//          mesad.modificarMesa(m);
          /*
         ArrayList<Mesa> Mesas = mesad.obtenerMesasActivas();
         for(Mesa aux: Mesas){
         System.out.println(aux);

         A
         }
*/

//          ArrayList<Pedido> x = ped.mostrarPedidos();
//          for (Pedido pedido : x) {
//              System.out.println(pedido);
//        }
  Mesa mesa = mesad.obtenerMesaxId(7);
  ArrayList<DetallePedido> x = dp.detallePedidoPorMesa(mesa);
        System.out.println(x);
          

    }
}
