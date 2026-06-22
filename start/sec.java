package start;
public class sec {
    public static void main(String[] args) {
        student s1= new student(30);
        student s2=new student();
        System.out.println(s1.roll);
        System.out.println(s1.roll+" "+s2.roll);
        
    }
    
}
class student{
    int roll;
    String name;
    String section;

    student() {
    }
    student(int roll)
    {
        this.roll=roll;
    }

    public student(int roll, String name, String section) {
        this.roll = roll;
        this.name = name;
        this.section = section;
    }
    

    
}
