package s3;
//3.模范 一个账户 1000块钱 :两个人 A B 分别在柜台和ATM机 取钱
//A每次取钱100 B每次取200 最终在控制台输出每个人取钱数
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        PersonA a = new PersonA(bank, "San");
        PersonB b = new PersonB(bank, "Si");
        a.start();
        b.start();
    }
}
