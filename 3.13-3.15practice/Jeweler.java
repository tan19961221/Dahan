package S8;

public class Jeweler implements Employee{
    public String name;
    public int jewelryNum;

    public Jeweler() {
    }

    public Jeweler(String name, int jewelryNum) {
        this.name = name;
        this.jewelryNum = jewelryNum;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return jewelryNum;
    }

    public void setNum(int jewelryNum) {
        this.jewelryNum = jewelryNum;
    }

    @Override
    public double salary() {
        return jewelryNum*50;
    }
}
