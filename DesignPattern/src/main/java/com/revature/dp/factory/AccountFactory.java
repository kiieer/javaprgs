package com.revature.dp.factory;

public class AccountFactory {
public Account getAccountType(String accountType){
      if(accountType==null){
            return null;
      }
            if(accountType.equalsIgnoreCase("saving")){
                  return new SavingAccount();
            }
            else if(accountType.equalsIgnoreCase("current")){
                  return new CurrentAccount();
            }
            else if(accountType.equalsIgnoreCase("salary")){
                  return new SalaryAccount();
            }
           
      return null;     
}
}