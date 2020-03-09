public class Persoana {
    private ShoppingCart sh;
    private String name;

    Persoana(String n) {
        sh = new ShoppingCart();
        name = n;
    }

    public void add(Item it){
        sh.add(it);
    }

    public void delete(Item it) {
        sh.delete(it);
    }

    public int getTotal() {
        return sh.getTotal();
    }

    public void checkOut() {
        sh.checkOut();
    }

    public void show() {
        System.out.print("Buna ziua, " + name + "! ");
        sh.show();
    }
}
