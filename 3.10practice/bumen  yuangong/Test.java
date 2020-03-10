package s1;

public class Test {
    public static void main(String[] args){
        Kaifa kaifa= new Kaifa();
        Employee employee=new Employee();
        employee.setEmpName("qq");
        employee.setEmpNumber("q1");
        employee.setEmpIDCard("123");
        employee.setJob("写");
        employee.setMoney(8000.0);
        kaifa.setEmployee(employee);
        Information information=new Information();
        information.setMembernum(4.0);
        information.setAddress("一楼");
        kaifa.setInformation(information);
        System.out.println(kaifa.toString());
        Houqing houqing=new Houqing();
        //同上赋值
        System.out.println(houqing.toString());
    }
}
