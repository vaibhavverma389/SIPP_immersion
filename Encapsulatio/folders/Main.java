
public class Main {
    public static void main(String[] args) {
        college.student cs = new college.student();
        school.student ss = new school.student();
        
        int result = cs.multiply(4, 5);
        ss.print("Result: " + result);
        ss.print(cs.pname("vaibhav"));
    }
}
