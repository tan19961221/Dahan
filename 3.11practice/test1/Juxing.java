package test1;

public class Juxing {
    public double length;
    public double wide;

    public Juxing() {
    }

    public Juxing(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public String toString() {
        return "Juxing{" +
                "length=" + length +
                ", wide=" + wide +
                '}';
    }

    public double area(){
        return length*wide;
    }
}
