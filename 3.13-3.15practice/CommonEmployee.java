package S8;

public class CommonEmployee implements Employee{
    public String name;
    public int hour;
    public double basicWage;

    public CommonEmployee() {
    }

    public CommonEmployee(String name, int hour, double basicWage) {
        this.name = name;
        this.hour = hour;
        this.basicWage = basicWage;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(double basicWage) {
        this.basicWage = basicWage;
    }

    @Override
    public double salary() {
        if(hour>196){
            return (hour-196)*200+basicWage;
        }else{
            return basicWage;
        }
    }
}
