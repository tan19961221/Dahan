package test5;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account(int id, double balance, double annualInterestRate) {
        super();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return this.id;
    }
    public double getBalance() {
        return this.balance;
    }
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
    public void setId( int id) {
        this.id=id;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate=annualInterestRate;
    }
    public void withdraw (double amount) {
        if(amount>this.balance) {
            System.out.println("余额不足，取款失败！");
        }else {
            this.balance-=amount;
            System.out.print("成功取出："+amount+"元,");
        }
    }
    public void deposit (double amount) {
        this.balance+=amount;
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public Account getAccount() {
        return this.account;
    }
    public void setAccount(Account account) {
        this.account=account;
    }
}

public class Test {
    public static void main(String[] args) {
        Customer customer=new Customer("Jane","Smith");
        Account account=new Account(1000,2000,0.0123);
        customer.setAccount(account);
        System.out.println("（1） 创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。");
        System.out.println("（2） 对Jane Smith操作。\r\n" + "存入 100 元，再取出960元。再取出2000元。" + "打印出Jane Smith 的基本信息\r" + "");
        int a=100;
        account.deposit(a);
        System.out.print("成功存入 ："+a+"元,");
        int b=960;
        account.withdraw(b);
        int c=2000;
        account.withdraw(c);
        System.out.println("Customer ["+customer.getFirstName()+","+customer.getLastName()+"]"+" has a account: id is "+customer.getAccount().getId()+","+"annualInterestRate is "+account.getAnnualInterestRate()+","+"balance is "+account.getBalance());
    }
}