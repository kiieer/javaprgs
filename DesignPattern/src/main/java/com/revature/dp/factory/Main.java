package com.revature.dp.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          AccountFactory accountFactory=new AccountFactory();
         
            /*
             * Account saving=accountFactory.getAccountType("saving"); saving.openAccount();
             * 
             * Account current=accountFactory.getAccountType("current");
             * current.openAccount();
             * 
             * Account salary=accountFactory.getAccountType("salary"); salary.openAccount();
             */
         
          Scanner sc=new Scanner(System.in);
          System.out.println("Please Enter the type of account you want to open :");
          String input=sc.nextLine();
          
          Account acc=accountFactory.getAccountType(input);
          acc.openAccount();
         
    }
    }