import javax.swing.plaf.basic.BasicComboBoxUI;

public class Main {
    public static void main(String[] argv) {
        Item i1 = new Item("Apa", 2, 2);
        Item i2 = new Item("Paine", 1, 3);
        Item i3 = new Item("Bomboane", 10, 1);
        Item i5 = new Item("Paine", 2, 3);


        Persoana c = new Persoana("Ioan");

        c.show();
        c.add(i1);
        c.add(i2);
        c.add(i3);

        c.show();

        c.add(i5);

        c.show();

        Item i4 = new Item("Creioane", 3, 7);

        c.delete(i3);

        c.show();

        c.add(i4);

        c.show();
        c.checkOut();
        c.show();
    }
}
