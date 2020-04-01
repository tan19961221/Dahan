package s10;

public class LockTest {
   public static String obj1 = "obj1";
   public static String obj2 = "obj2";
   public static void main(String[] args) {
      LockA la = new LockA();
      new Thread(la).start();
      LockB lb = new LockB();
      new Thread(lb).start();
   }
}
class LockA implements Runnable{
   public void run() {
      try {
         System.out.println(" LockA 开始执行");
         while(true){
            synchronized (LockTest.obj1) {
               System.out.println(" LockA 锁住 obj1");
               Thread.sleep(3000); 
               synchronized (LockTest.obj2) {
                  System.out.println(" LockA 锁住 obj2");
                  Thread.sleep(60 * 1000); 
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
class LockB implements Runnable{
   public void run() {
      try {
         System.out.println(" LockB 开始执行");
         while(true){
            synchronized (LockTest.obj2) {
               System.out.println(" LockB 锁住 obj2");
               Thread.sleep(3000); 
               synchronized (LockTest.obj1) {
                  System.out.println(" LockB 锁住 obj1");
                  Thread.sleep(60 * 1000);
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}