package OOPS;

class School {
    String Stu_name;

    void StudentName(String name) {
        this.Stu_name = name;

    }
}

class Tution {
    private int tution_fee;

    void get_tutionfee() {
        System.out.println(tution_fee);
    }

    void setTutionFee(int fee) {
         this.tution_fee = fee;
    }
}

public class EncapsulationConcept {

    public static void main(String[] args) {
        School s = new School();
        s.StudentName("MVP School");
        System.out.println(s.Stu_name);
        Tution t = new Tution();
        t.setTutionFee(200);
        t.get_tutionfee();
    }
}
