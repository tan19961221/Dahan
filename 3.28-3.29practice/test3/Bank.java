package s3;

import java.util.Objects;

public class Bank {
    static double money = 1000;
    private void San(double money) {
        Bank.money -= money;
        System.out.println("张三取钱" + money + "元，还剩" + Bank.money + "元！");
    }
    private void Si(double money) {
        Bank.money -= money;
        System.out.println("李四取钱" + money + "元，还剩" + Bank.money + "元！");
    }

    public synchronized void outMoney(double money, String mode) throws Exception{
        if(money > Bank.money){
            throw new Exception("取款金额"+money+",余额只剩"+Bank.money+"，取款失败");
        }
        if(Objects.equals(mode, "Si")){
            Si(money);
        } else {
            San(money);
        }
    }
}
