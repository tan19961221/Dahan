package s15;

public class Question {
    private int qNo;
    private String qName;
    private String anwserA;
    private String anwserB;
    private String anwserC;
    private String anwserD;
    private String answer;

    public Question() {
    }

    public Question(int qNo, String qName, String anwserA, String anwserB, String anwserC, String anwserD, String answer) {
        this.qNo = qNo;
        this.qName = qName;
        this.anwserA = anwserA;
        this.anwserB = anwserB;
        this.anwserC = anwserC;
        this.anwserD = anwserD;
        this.answer = answer;
    }


    public int getqNo() {
        return qNo;
    }

    public void setqNo(int qNo) {
        this.qNo = qNo;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    @Override
    public String toString() {
        return "Question{" +
                "qNo=" + qNo +
                ", qName='" + qName + '\'' +
                ", anwserA='" + anwserA + '\'' +
                ", anwserB='" + anwserB + '\'' +
                ", anwserC='" + anwserC + '\'' +
                ", anwserD='" + anwserD + '\'' +
                '}';
    }
}
