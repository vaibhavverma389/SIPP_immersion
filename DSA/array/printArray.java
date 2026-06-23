package array;

public class printArray {
    public static void main(String[] args) {
        int ans=0;
        int[][] ar={{1,2,3,4,5},{3,2,1,5,6},{1,2,4,6,7},{5,6,7,8,2},{3,4,5,6,7}};
        for(int[] i:ar)
        {
            int sum=0;
            for(int j:i)
            {
                sum+=j;
            }
            ans=Math.max(ans, sum); 
        }
        System.out.println(ans);
    }

    
}
