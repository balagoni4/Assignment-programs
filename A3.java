class A3
{
    
    public static void main(String args[]){
      
      int arr[]={24,65,98,48,62,14};
      int key=62;
       
       for(int i=0;i<arr.length;i++)
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