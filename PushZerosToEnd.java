public class PushZerosToEnd 
{
    static void pushZerosTOEnd(int arr[], int n)
    {
        int count=0;

        for(int i=0; i<n; i++)
        
            if(arr[i]!=0)
            
                arr[count++] = arr[i];
            
            while(count<n)
            
                arr[count++]=0;
            
        
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n=arr.length;
        pushZerosTOEnd(arr, n);
        System.out.println("Array after pushing zeros to the back : ");

        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
