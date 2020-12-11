public class TP7P3
{
   
   public static void main(String[] args) 
   {
      int i,j,a,b,suma;
      a=3;
      b=2;
      suma=0;
      int mat[][]=new int [a][b];
      
      
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
            mat[i][j]=Console.readInt("Ingrese valor");
         }
      }
      
      System.out.println("Matriz");
      
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
            System.out.print(mat[i][j]);
         }
         System.out.println();
      }
      
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
            suma=mat[i][j]+suma;
         }
      }
      System.out.println();
      System.out.println(suma);
   }
}