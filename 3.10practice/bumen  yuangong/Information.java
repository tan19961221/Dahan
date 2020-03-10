package s1;

public class Information {
    private double  membernum;
    private String  address;

    public Information(){

    }

    public Information(double membernum, String address) {
        this.membernum = membernum;
        this.address = address;
    }

    public double getMembernum() {
        return membernum;
    }

    public void setMembernum(double membernum) {
        this.membernum = membernum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Information{" +
                "membernum=" + membernum +
                ", address='" + address + '\'' +
                '}';
    }
}
