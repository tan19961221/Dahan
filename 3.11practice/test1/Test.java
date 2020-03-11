package test1;

public class Test {
    public static void main(String[] args) {
        ChangFangTi changFangTi=new ChangFangTi();
        changFangTi.setHigh(5.0);
        changFangTi.setLength(10.0);
        changFangTi.setWide(5.0);

        double volume=changFangTi.volume();
        double area=changFangTi.area();
        System.out.println(volume);
        System.out.println(area);
    }
}
