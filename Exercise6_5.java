class Student1 {
    String name; int ban, no, kor, eng, math;
    Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name; this.ban = ban; this.no = no;
        this.kor = kor; this.eng = eng; this.math = math;
    }
    int getTotal() {
        return kor + eng + math;
    }
    float getAverage() {
        return Math.round(getTotal() / 3f * 10) / 10f;
    }
    String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ","
                + getTotal() + "," + getAverage();
    }
}

public class Exercise6_5 {
    public static void main(String[] args) {
        Student1 s = new Student1("홍길동",1,1,100,60,76);
        System.out.println(s.info());

    }
}
