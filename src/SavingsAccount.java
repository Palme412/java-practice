public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
  
    public void checkBalance(){
      System.out.println("Hello!");
      System.out.println("Your balance is " + balance);
    }
  
    public void deposit(int amountToDeposit){
      int deposit = amountToDeposit;
      balance = balance + deposit;
      System.out.println("You just deposited " + amountToDeposit);
    }
  
    public int withdraw(int amountToWithdraw){
      int withdraw = amountToWithdraw;
      balance = balance - amountToWithdraw;
      System.out.println("You just withdrew" + amountToWithdraw);
      return amountToWithdraw;
    }
    
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Withdrawing:
      int afterWithdraw = savings.balance - 300;
      savings.balance = afterWithdraw;
      System.out.println("You just withdrew "+300);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      int afterDeposit = savings.balance + 600;
      savings.balance = afterDeposit;
      System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      int afterDeposit2 = savings.balance + 600;
      savings.balance = afterDeposit2;
      System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
  
      int afterDeposit3 = savings.balance + 250;
      savings.balance = afterDeposit3;
      System.out.println("You just deposited a total of " + 250);
      System.out.println("Your new balance is " + savings.balance);
  
      int afterWithdraw2 = savings.balance - 100;
      savings.balance = afterWithdraw2;
      System.out.println("You just withdrew a total of " + 100);
  
      System.out.println("Your new balance is " + savings.balance);
  
      savings.checkBalance();
      savings.withdraw(500);
      savings.checkBalance();
      savings.deposit(1500);
      savings.checkBalance();
  
      
    }       
  }