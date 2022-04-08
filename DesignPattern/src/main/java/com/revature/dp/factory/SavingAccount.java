package com.revature.dp.factory;

public class SavingAccount implements Account{

    @Override
    public void openAccount() {
          System.out.println("Opening Savings Account");
    }
}