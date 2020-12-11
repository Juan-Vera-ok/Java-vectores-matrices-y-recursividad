public class TP7P4
{
   
   public static void main(String[] args) 
   {
      int i,j,a,b,may,FiB,CoB,Promediomayor,Promedio,Suma;
         do
         {
            a=Console.readInt("Ingrese filas");
            b=Console.readInt("Ingrese columnas");
            if(a==b)
            System.out.println("La cantidad de filas y columnas deben ser distintas");
            }while(a==b);
      int mat[][]=new int[a][b];
      
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
      
      may=mat[0][0];
      
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
            if(may<mat[i][j])
            may=mat[i][j];
         }
      }
      
      System.out.println("Mayor "+may);
      
      do
      {
      FiB=Console.readInt("Ingrese fila");
      CoB=Console.readInt("Ingrese columna");
      }while(FiB>=a|FiB<0|CoB>=b|CoB<0);
     
      System.out.println(mat[FiB][CoB]);
      
      Promediomayor=0;
      Suma=0;
      
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
            Suma=mat[i][j]+Suma;
         }
         Promedio=Suma/b;
            if(Promediomayor<Promedio)
            {
            Promediomayor=Promedio;
            }
         System.out.println("Promedio de fila "+i+" es "+(Promedio=Suma/b));
         Suma=0;
      }
      System.out.println("El promedio mayor es "+Promediomayor);
      
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
            if(mat[i][j]<0)
            mat[i][j]=-1;
            else
               mat[i][j]=0;
         }
      }   
      
      
       System.out.println("Matriz modificada");
      
      
      for(i=0;i<a;i++)
      {
         for(j=0;j<b;j++)
         {
            System.out.print(mat[i][j]);
         }
         System.out.println();
      }
      
   }
}