package S8;

public class Test {
    public static void main(String[] args) {
        Company company=new Company();
        Employee hourlyWorker1=new HourlyWorker("1", 200, 10);
        Employee hourlyWorker2=new HourlyWorker("2", 230, 10);
        Employee salesEmployee1=new SalesEmployee("11",5000,1500);
        Employee salesEmployee2=new SalesEmployee("12",200000,1500);
        Employee commonEmployee=new CommonEmployee("123",205,1500);
        Employee[] employees={hourlyWorker1,hourlyWorker2,salesEmployee1,salesEmployee2,commonEmployee};
        company.WageSum(employees);
        Employee jeweler=new Jeweler("1234",30);
        Employee[] employees1={hourlyWorker1,hourlyWorker2,salesEmployee1,salesEmployee2,commonEmployee,jeweler};
        company.WageSum(employees1);

    }
    }
