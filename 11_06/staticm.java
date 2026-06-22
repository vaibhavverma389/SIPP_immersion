
public class staticm {
    public static void main(String[] args) {
        Collage c1= new Collage(0,"saurabh");
        
        System.out.println(c1.count*32);
        System.out.println(c1.name);
        
    }
}
class Collage {
    int roll;
    String name;
    String Clas;
    static String colname="gla";

    static int count = 0;

    Collage() {
        this(0);
    }

    Collage(int x) {
        this(x, "none");
    }

    Collage(int x, String y) {
        this(x, y, "none");
    }

    Collage(int x, String y, String z) {
        this.roll = x;
        this.name = y;
        this.Clas = z;
        count++;   
    }
}