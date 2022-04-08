package com.revature.dp.factory;

public class CurrentAccount implements Account{

    @Override
    public void openAccount() {
          System.out.println("Opening Current Account"); 
    }
}