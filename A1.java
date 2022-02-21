class A1
{
    
    public static void main(String args[])
    {
        
     int arr[]={5,-5,3,4,-6};
      int p[]=new int[arr.length];
      int n[]=new int[arr.length];
      int k=0,m=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>0)
          {
              p[k]=arr[i];
               k++;
          }
          else
          {
              n[m]=arr[i];
              m++;
          }
      }
    System.out.println("+ve Elements");
    for(int i=0;i<k;i++)
    {
        System.out.print(p[i]+" ");
    }
    
    System.out.println("\n -ve Elements");
    for(int i=0;i<m;i++){
        System.out.print(n[i]+" ");
    }
    }
}