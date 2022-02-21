class A2
{
    
    public static void main(String args[]){
      
      int arr[]={78,65,24,63,15};
      int key=63;
      
         int a=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==key){
               
               a=1;
           }
       }  
       if(a==1){
           System.out.print("The element is present");
       }
       else{
           System.out.println("The element is not found");
       }
       
    }
}