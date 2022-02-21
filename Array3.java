import java.util.*;
class Array3
{
     public static void main(String args[])
{
        int r,c,i,j;
        
              Scanner sc = new Scanner(System.in);
 
           System.out.println("Enter the number of rows");
              r= sc.nextInt();
 
           System.out.println("Enter the number columns");
              c= sc.nextInt();
 
       int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int c1[][] = new int[r][c];
 
            System.out.println("Enter the elements of matrix1");
 
            for ( i= 0 ; i < r ; i++ )
          { 
 
              for ( j= 0 ; j < c ;j++ )
               a[i][j]=sc.nextInt();
 
              System.out.println();
            }
            System.out.println("Enter the elements of matrix2");
 
              for ( i= 0 ; i < r ; i++ )
             {
 
              for ( j= 0 ; j < c ;j++ )
                 b[i][j]=sc.nextInt();
 
                 System.out.println();
               }
 
         for ( i= 0 ; i < r ; i++ )
            {
           for ( j= 0 ; j < c ;j++ )

              c1[i][j] = a[i][j] + b[i][j] ; 
 
        System.out.println("Addition of matrices:-");
     }
     for ( i= 0 ; i < r ; i++ )
      { 
     for ( j= 0 ; j < c ;j++ )
            System.out.print( c1[i][j]+"\t");
 
              System.out.println();
}
 
}
}