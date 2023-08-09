import java.util.Date;  
    public class Account {
    private int id;
    private double balance;
    private double annualIntrestRate;
    private Date datecreated;

    Account()
    {
        this.id= 0;
        this.balance= 500;
        this.annualIntrestRate= 0.07;
        this.datecreated = new Date();
    }

    Account(int id , double balance)
    {
        this.id=id;
        this.balance=balance;
        this.annualIntrestRate= 0.07;
        this.datecreated = new Date();   
    }
    
    int getId() {
        return id;
    }
    
    double getBalance() {
        return balance;
    }
    
    double getAnnualIntrestRate() {
        return annualIntrestRate;
    }

    Date getDatecreated() {
        return datecreated;
    }

    void setId(int id) {
        this.id = id;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setAnnualIntrestRate(double annualIntrestRate) {
        this.annualIntrestRate = annualIntrestRate;
    }

    double getMonthlyIntrestRate()
    {
        return annualIntrestRate/12;
    }
    double getMonthlyIntrest()
    {
        return balance*getMonthlyIntrestRate();
    }
    
    double withdraw()
    {
        double withdraw=0.0;
        if(withdraw>balance)
        {
             balance -= withdraw;
        }
        else
        {
            System.out.println("Sorry,Insufficient Balance...");
        }
        return withdraw;
        
    }
    double deposit(double deposit)
    {
        return balance += deposit;
    }

    void display1()
    {
        System.out.println("USER ID IS :"+ getId());
        System.out.println("BALANCE IN YOUR ACCOUNT IS :" +getBalance());
        System.out.println("ANNUAL INTREST RATE FOR YOUR ACCOUNT IS "+getAnnualIntrestRate());
        System.out.println("TODAY'S DATE IS :"+getDatecreated());

    }
    void display2()
    {
        System.out.println("USER ID IS :"+ getId());
        System.out.println("BALANCE IN YOUR ACCOUNT IS :" +getBalance());
        System.out.println("ANNUAL INTREST RATE FOR YOUR ACCOUNT IS "+getAnnualIntrestRate());
        System.out.println("TODAY'S DATE IS :"+getDatecreated());
        System.out.println("MONTHLY INTREST RATE IS :" +getMonthlyIntrestRate());
        System.out.println("MONTHLY INTREST IS : " +getMonthlyIntrest());
    }

}
