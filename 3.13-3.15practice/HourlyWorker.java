package S8;

public class HourlyWorker implements Employee {
    public String name;
    public double workHour;
    public double hourlyRate;

    public HourlyWorker() {
    }

    public HourlyWorker(String name, double workHour, double hourlyRate) {
        this.name = name;
        this.workHour = workHour;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double salary() {
        return this.getWorkHour() * this.getHourlyRate();
    }
}
