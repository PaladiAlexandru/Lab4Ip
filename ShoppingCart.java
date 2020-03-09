import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
      private List<Item> cart;
      private int total;
      public ShoppingCart() {
          cart = new ArrayList<Item>();
          total = 0;
      }
      public void add(Item it) {
          boolean ok = false;
          for(Item i : cart) {
              if(i.getNume().equals(it.getNume())) {
                  i.setCantitate(it.getCantitate());
                    ok = true;
                    total = total + it.getPret() * it.getCantitate();
              }

          }
          if(ok == false) {
              cart.add(it);
              total = total + it.getPret() * it.getCantitate();
          }

      }

      public int getTotal() {
          return total;
      }

      public void checkOut() {
          cart.clear();
          total = 0;
          System.out.println("Comanda ta a fost plasata.");
      }

      public void delete(Item it) {
          cart.remove(it);
          total = total - it.getPret() * it.getCantitate();
      }


      public void show() {
          if(total != 0) {
              int i = 1;
              System.out.println("Cart-ul dumneavoastra contine: ");
              for (Item it : cart) {
                  System.out.println(i + ". " + it.getNume() + " in cantitatea " + it.getCantitate() + " cu pretul " + it.getPret() * it.getCantitate());
                  i++;
              }
              System.out.println("Totalul comenzii este: " + total);
          }
          else System.out.println("Cart-ul dumneavoastra este gol.");
      }
}
