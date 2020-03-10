package s3;

public class Test {
    private String number;
    private String title;
    private String anwserA;
    private String anwserB;
    private String anwserC;
    private String anwserD;
    private String Anwser;

    public Test(){

    }

    public Test(String number, String title, String anwserA, String anwserB, String anwserC, String anwserD, String anwser) {
        this.number = number;
        this.title = title;
        this.anwserA = anwserA;
        this.anwserB = anwserB;
        this.anwserC = anwserC;
        this.anwserD = anwserD;
        Anwser = anwser;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnwserA() {
        return anwserA;
    }

    public void setAnwserA(String anwserA) {
        this.anwserA = anwserA;
    }

    public String getAnwserB() {
        return anwserB;
    }

    public void setAnwserB(String anwserB) {
        this.anwserB = anwserB;
    }

    public String getAnwserC() {
        return anwserC;
    }

    public void setAnwserC(String anwserC) {
        this.anwserC = anwserC;
    }

    public String getAnwserD() {
        return anwserD;
    }

    public void setAnwserD(String anwserD) {
        this.anwserD = anwserD;
    }

    public String getAnwser() {
        return Anwser;
    }

    public void setAnwser(String anwser) {
        Anwser = anwser;
    }

    @Override
    public String toString() {
        return "Test{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                ", anwserA='" + anwserA + '\'' +
                ", anwserB='" + anwserB + '\'' +
                ", anwserC='" + anwserC + '\'' +
                ", anwserD='" + anwserD + '\'' +
                ", Anwser='" + Anwser + '\'' +
                '}';
    }
}
