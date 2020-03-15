package S8;

public class SalesEmployee implements Employee{
    public String name;
    private double saleMoney;
    private double basicWage;

    public SalesEmployee() {
    }

    public SalesEmployee(String name, double saleMoney, double basicWage) {
        this.name = name;
        this.saleMoney = saleMoney;
        this.basicWage = basicWage;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(double saleMoney) {
        this.saleMoney = saleMoney;
    }

    public double getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(double basicWage) {
        this.basicWage = basicWage;
    }

    @Override
    public double salary() {
        if(saleMoney<10000){
            return basicWage+saleMoney*0.1;
        }
        else if(saleMoney>=10000&&saleMoney<=100000){
            return basicWage+saleMoney*0.15;
        }
        else{
            return basicWage+saleMoney*0.18;
        }
    }
}
