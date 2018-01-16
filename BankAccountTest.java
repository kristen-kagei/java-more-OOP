class BankAccountTest{
    public static void main (String[] args){
        BankAccount newUser1 = new BankAccount(); 
        BankAccount newUser2 = new BankAccount();
        BankAccount newUser3 = new BankAccount();
        
        BankAccount.runningTotal();  
        newUser1.depositChecking(1000.91);
        newUser1.getChecking();
        newUser1.depositSavings(63.45);
        newUser1.totalAccountBalance();
        newUser1.withdrawMoney(20000);   
        newUser1.withdrawMoney(30);
    }
    
}