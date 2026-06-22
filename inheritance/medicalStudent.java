package inheritance;

public class medicalStudent extends student {
    String subject;
    medicalStudent(String subject ,String name,int roll) {
        this.name=name;
        this.Rollno=roll;
        this.subject=subject;
    }
    void print()
    {
        System.out.println( name  + " " + Rollno + " " + subject);
    }
    public static void main(String[] args) {
        medicalStudent ms=new medicalStudent("biology","vaibhav",123);
        ms.print();

    }
}
