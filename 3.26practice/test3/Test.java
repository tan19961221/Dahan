package s3;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        PersonA a = new PersonA(bank, "San");
        PersonB b = new PersonB(bank, "Si");
        a.start();
        b.start();
    }
}
