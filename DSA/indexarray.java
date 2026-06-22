package DSA;

public class indexarray {
    public static void main(String[] args) {
        int[] ar= { 4,0,2,1,3};
int[] arr= new int[ar.length];
for(int i=0;i<ar.length;i++)
{
    int a=ar[i];
    int b=ar[a];
    arr[i]=b;
}
for(int i:arr)
{
    System.out.print(i + " ");
}

    }
}
