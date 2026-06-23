package array;
public class presum{
    public static void main(String[] args) {
        int[] ar = {4, 1, 8, 3, 9, 2, 7, 5, 6};
        for(int i=1;i<ar.length;i++)
        {
            ar[i]=ar[i]+ar[i-1];
        }
        for(int i:ar)
        {
            System.out.print(i + " ");
        }
    }
}