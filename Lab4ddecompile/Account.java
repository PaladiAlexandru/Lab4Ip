// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/9/2020 9:08:00 AM
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Account.java

import java.io.PrintStream;

public class Account
{

    public Account()
    {
    }

    void Login(String username, String password)
    {
        System.out.printf("Logged in as : %s .", new Object[] {
            username
        });
    }

    public String username;
    public String password;
}
