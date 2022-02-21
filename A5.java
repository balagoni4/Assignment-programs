class A5
{
    
    public static void main(String args[])
    {
      
      int arr[]={25,60,31,20,87,69};
      int key=20;
      int count=0;
       
       for(int i=0;i<arr.length;i++)
       {
           if(key==arr[i])
           {
               count++;
                for(int j=i;j<arr.length-1;j++)
                {
                       arr[j]=arr[j+1];
                }
               
           }
       }
       for(int i=0;i<arr.length-count;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}