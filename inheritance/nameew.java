package inheritance;

public class nameew {
    public static void main(String[] args) {
        parrot p= new parrot(true ,false);
        p.print();
    }
}
class bird{
    boolean feather;
    bird()
    {

    }
    bird(boolean f)
    {
        this.feather=true;
        
    }
     void sound()
    {

    }
     void speak()
    {
        System.out.println("all bir has sound");
    }
    void print()
    {

    }
}
class parrot extends  bird{
    boolean fly;
    boolean swim;

    parrot() {
    }
    parrot(boolean f,boolean s)
    {
        this.fly= true;
        this.swim=false;
    }
    void sound()
    {
        super.sound();

    }    
    void print()
    {
        System.out.println("fly " + fly + "swim" + swim + " feather"+ feather);
    };
    


}
