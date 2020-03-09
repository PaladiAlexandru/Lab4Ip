// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/9/2020 9:05:59 AM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Item.java


public class Item
{

    Item(String n, int c, int p)
    {
        cantitate = c;
        nume = n;
        pret = p;					
    }

    public int getPret()
    {
        return pret;
    }

    public void addCantitate(int nr)
    {
        cantitate += nr;
    }

    public int getCantitate()
    {
        return cantitate;
    }

    public String getNume()
    {
        return nume;
    }

    public void setCantitate(int nr)
    {
        cantitate += nr;
    }

    private int cantitate;
    private String nume;
    private int pret;
}
