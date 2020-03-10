package s1;

public class Kaifa {
    private Information information;
    private Employee employee;

    public Kaifa() {

    }
    public Kaifa(Information information, Employee employee) {
        this.information = information;
        this.employee = employee;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "开发部{" +
                "information=" + information +
                ", employee=" + employee +
                '}';
    }
}
