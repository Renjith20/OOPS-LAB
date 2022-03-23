import java.util.*;
class MatricsAdd
{
 public static void main(String [] args)
 { 
  int n,m;
   int i , j;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the row");
   n = s.nextInt();
   System.out.println("Enter the column");
   m = s.nextInt();
  int a[][] = new int[n][m];
   int b[][]= new int[n][m];
   int c[][] = new int[n][m];
   System.out.println("Enter Elements of Matrics 1");
   for(i = 0 ; i<n ; i++)
   {
     for(j=0 ; j<m ; j++)
     {
       a[i][j] = s.nextInt();
     }
    }
    System.out.println("Enter Elements of Matrics 2");
    for(i = 0 ; i<n ; i++)
    { 
      for(j=0 ; j<m ; j++)
      {
        b[i][j] = s.nextInt();
       }
     }
     for(i = 0 ; i<n ; i++)
    { 
      for(j=0 ; j<m ; j++)
     {
       c[i][j] = a[i][j] + b[i][j] ; 
     }
    }
    System.out.println("After Addition:");
     for(i = 0 ; i<n ; i++)
    { 
      for(j=0 ; j<m ; j++)
     {
       System.out.println(c[i][j]);
     }
   }
 }
}
