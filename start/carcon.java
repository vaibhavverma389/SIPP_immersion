package start;
public class carcon{
    public static void main(String[] args) {
       
        car c1= new car();
        System.out.println("Car year "+c1.year); 
        System.out.println("Car milage "+c1.milage);
        System.out.println("car model " +c1.model);  
    }
}
class car{
    float milage;
    int year;
    String model;
    car(){
        this(0);
    }
    car(int x ){
        this(x,0.0f);
    }
    car(int x,float y){
        this(x,y,"none");
    }
    car(int x,float y,String z){
        this.year=x;
        this.milage=y;
        this.model=z;
    }
}
