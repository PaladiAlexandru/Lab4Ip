public class Item {
    private int cantitate;
    private String nume;
    private int pret;
    Item(String n, int c, int p) {
        cantitate = c;
        nume = n;
        pret = p;
    }

    public int getPret() {
        return pret;
    }

    public void addCantitate(int nr){
        cantitate+=nr;
    }

    public int getCantitate() {
        return cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setCantitate(int nr) {
        cantitate += nr;
    }
}
