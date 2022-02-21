class A4
{
    
    public static void main(String args[])
    {
      
      int arr[]={2,3,4,5,6,8};
      int key=3;
       
       for(int i=arr.length-1;i>=0;i--)
       {
           if(key==arr[i])
           {
                for(int j=i;j<arr.length-1;j++)
                {
                       arr[j]=arr[j+1];
                }
                break;
           }
       }
       for(int i=0;i<arr.length-1;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}