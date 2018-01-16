import java.util.Random;

class BankAccount { 
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    private static int countAccount;
    private static double countMoney;

    //constructor
    public BankAccount(){
        accountNumberGenerator("1234567890", 10);
        countAccount++;
    }

    //generate account number
    private String accountNumberGenerator(String numbers, int length){
        Random random = new Random();
        StringBuilder randString = new StringBuilder();
        for(int i = 0; i < length; i++){
            int index = random.nextInt(numbers.length());
            randString.append(numbers.charAt(index));
        }
        accountNumber = randString.toString();
        System.out.println(accountNumber);
        return accountNumber;
    }
    //running total of Bank Accounts
    public static int runningTotal(){
        System.out.println(countAccount);
        return countAccount;
    }

    //get checking balance
    public double getChecking(){
        System.out.println(checkingBalance);
        return checkingBalance;
    }

    //set checking balance
    public void setChecking(double amount){
        this.checkingBalance = amount;
    }

    //deposit to checking and update balance
    public double depositChecking(double checkingDeposit){
        double checkingUpdate = this.checkingBalance + checkingDeposit;
        setChecking(checkingUpdate);
        return checkingBalance;
    }

    //get savings
    public double getSavings(){
        return savingsBalance;
    }

    //set savings
    public void setSavings(double amount){
        this.savingsBalance = amount;
    }

    //deposit to savings
    public double depositSavings(double savingsDeposit){
        double savingsUpdate = this.savingsBalance + savingsDeposit;
        setSavings(savingsUpdate);
        return savingsBalance;
    }

    //get total account balance of checking and savings
    public double totalAccountBalance(){
        countMoney = getSavings() + getChecking();
        System.out.println(countMoney);
        return countMoney;
    }

    public double withdrawMoney(double withdrawalAmount){
        double afterWithdrawal = countMoney - withdrawalAmount;
        if(afterWithdrawal < 0){
            System.out.println("You do not have enough in your account to withdraw. Be better");
        }else{
            System.out.println("Success. You now have less money in your account");
        }
        System.out.println(afterWithdrawal);
        return afterWithdrawal;
    }
}

