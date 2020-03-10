package s1;

public class Employee {
    private String empNumber;
    private String empName;
    private String empIDCard;
    private String job;
    private double money;

    public Employee(){

    }

    public Employee(String empNumber, String empName, String empIDCard, String job, double money) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.empIDCard = empIDCard;
        this.job = job;
        this.money = money;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpIDCard() {
        return empIDCard;
    }

    public void setEmpIDCard(String empIDCard) {
        this.empIDCard = empIDCard;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber='" + empNumber + '\'' +
                ", empName='" + empName + '\'' +
                ", empIDCard='" + empIDCard + '\'' +
                ", job='" + job + '\'' +
                ", money=" + money +
                '}';
    }
}
