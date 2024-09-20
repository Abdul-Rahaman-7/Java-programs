public class ImmediateSmallerElement {
    public static void main(String [] args){
        int [] arr={4,2,1,5,3};
        int n = 5;
        for(int i=0;i<n-1;i++)
{
            if(arr[i+1]<arr[i])
            {
                arr[i] = arr[i+1];
            }
            else
            {
                arr[i]=-1;
            }
        }
        System.out.println(arr[n-1] = -1);
    }
    
}
