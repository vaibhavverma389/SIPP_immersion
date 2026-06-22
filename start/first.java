package start;
public class first{
    
    public static void main(String[] args)
    {
        pen p1=new pen();
        p1.y=12;
        p1.z=13;
        System.out.println(p1.y);
        System.out.println(p1.z);

    }
}
class pen{
    int y;
    int z;
}