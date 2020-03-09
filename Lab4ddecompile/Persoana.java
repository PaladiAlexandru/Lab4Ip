// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/9/2020 9:09:55 AM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Source File Name:   Persoana.java
public class Persoana {
    private ShoppingCart sh = new ShoppingCart();
    private String name;

    Persoana(String n) {
        this.name = n;
    }

    public void add(Item it) {
        this.sh.add(it);
    }

    public void delete(Item it) {
        this.sh.delete(it);
    }

    public int getTotal() {
        return this.sh.getTotal();
    }

    public void checkOut() {
        this.sh.checkOut();
    }

    public void show() {
        throw new IllegalStateException("Decompilation failed");
    }
}
