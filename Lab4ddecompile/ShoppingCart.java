// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/9/2020 9:10:20 AM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Source File Name:   ShoppingCart.java
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cart = new ArrayList<Item>();
    private int total = 0;

    public void add(Item it) {
        boolean ok = false;
        for (Item i : this.cart) {
            if (!i.getNume().equals(it.getNume())) continue;
            i.setCantitate(it.getCantitate());
            ok = true;
            this.total += it.getPret() * it.getCantitate();
        }
        if (!ok) {
            this.cart.add(it);
            this.total += it.getPret() * it.getCantitate();
        }
    }

    public int getTotal() {
        return this.total;
    }

    public void checkOut() {
        this.cart.clear();
        this.total = 0;
        System.out.println("Comanda ta a fost plasata.");
    }

    public void delete(Item it) {
        this.cart.remove(it);
        this.total -= it.getPret() * it.getCantitate();
    }

    public void show() {
        throw new IllegalStateException("Decompilation failed");
    }
}
