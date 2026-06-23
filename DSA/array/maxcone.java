package array;
public class maxcone {
    public static void main(String[] args) {
        int[] ar={1,1,0,1,1,1,0,1,1,1,1};
        int m=0;
        int a=0;
        for(int i:ar)
        {
            
            if(i==1)
            {
                a++;
            }
            else
            {
                a=0;
            }
            m=Math.max(a,m);
        }
        System.out.println(m);
    }
}
