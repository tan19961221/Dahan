package test1;

public class ChangFangTi extends Juxing{
    public double high;

    public ChangFangTi(){

    }

    public ChangFangTi(double length,double wide,double high) {
        super(length,wide);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "ChangFangTi{" +
                "high=" + high +
                '}';
    }
    public double volume(){
        return length*wide*high;
    }
}
