package inheritance;

public class parrot extends bird {
    String speak;
    boolean fly=true;
    boolean swim=false;

    public parrot(int wings,int pair,String speak ) {
        this.wings=wings;
        this.pair=pair;
        this.speak=speak;
    }
    void print()
    {
        System.out.println(wings + " " + pair + " "+ speak + " " + fly + " " + swim);
    }
    public static void main(String[] args) {
        parrot p=new parrot(2, 2, "yes");
        p.print();
        
    }
    
    
}



