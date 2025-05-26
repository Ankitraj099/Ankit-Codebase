public class jumpgame {

    public static boolean canjump(int []nums){
    int maxreach=0;
    int last= nums.length -1;

    for(int i=0;i<nums.length;i++)
    {
          if(i>maxreach) {
          return false;
          }
          if(maxreach>=last)
          return true;
          maxreach=Math.max(maxreach, nums[i]+i);


    }
    return true;

   }
   public static void main(String[] args) {
    int arr[]={3,2,1,0,4};
    System.out.println(canjump(arr));
   }
    
}
