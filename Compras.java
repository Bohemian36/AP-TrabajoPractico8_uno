package pack1;

import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

   public abstract class Compras {
       public static void main(String[] args) throws IOException {
		
          Producto uno = new Producto("Jugo de naranja",150,001);
           Producto dos = new Producto("Harina para pizza",350,002);
          Producto tres = new Producto("Lata de tomate",245.50,003);
           Producto cuatro = new Producto("Queso cremoso",1250.60,004);
           Producto cinco = new Producto("Oregano",314.70,005);
           Producto seis = new Producto("Condimento",160.80,006);
           
          Pers c1 = new Pers("Frodo Bolsón");
          Carrito z = new Carrito(c1,70605);
           
	       System.out.println("Ticket: "+z.Num());
	       System.out.println("Cliente/a: "+c1.Nombre());
           
           List <ItemCarrito> itemListaC;
           itemListaC = new ArrayList<ItemCarrito>();

           ItemCarrito item1 = new ItemCarrito(z,uno,3);
           ItemCarrito item2 = new ItemCarrito(z,dos,1);
           ItemCarrito item3 = new ItemCarrito(z,tres,4);
           ItemCarrito item4 = new ItemCarrito(z,cuatro,1);
           ItemCarrito item5 = new ItemCarrito(z,cinco,1);
           ItemCarrito item6 = new ItemCarrito(z,seis,1);

           itemListaC.add(item1);
           itemListaC.add(item2);
           itemListaC.add(item3);
           itemListaC.add(item4);
           itemListaC.add(item5);
           itemListaC.add(item6);
           
       Iterator<ItemCarrito> itC = itemListaC.iterator();

       while (itC.hasNext()) {
       ItemCarrito item = itC.next();
       item.mostrarItem();
       }
   }
 }
   