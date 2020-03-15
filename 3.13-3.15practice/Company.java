package S8;

public class Company {
    public Employee[] employees;

    public Company() {
    }

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    // 添加员工方法
    public void AddEmployee(Employee employee){
        for (int i=0;i<employees.length;i++){
            this.employees[i]=employee;
        }
    }

    // 删除员工方法
    public void DeleteEmployee(String name){
        for(int i=0;i<employees.length;i++){
            if(this.employees[i].getName()==name){
                this.employees[i]=null;
            }
        }
    }

    // 显示员工工资
    public void ShowSalary(String name){
        for(int i=0;i<employees.length;i++){
            if (this.employees[i].getName()==name){
                System.out.println(this.employees[i].salary());
            }
        }
    }

    //工资和
    public void WageSum(Employee[] employees){
        double sum=0;
        for(int i=0;i<employees.length;i++){
            sum +=employees[i].salary();
        }
        System.out.println("工资和为" + sum );

    }




}
