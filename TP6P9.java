public class TP6P9
{
   
   public static void main(String[] args) 
   {
      int i,dim;
      dim=Console.readInt("Ingrese dimension del vector");
      int vec[]=new int[dim];
      
      for(i=0;i<dim;i++)
      {
         do
         {
            vec[i]=Console.readInt("Ingrese valor");
            if(vec[i]<0)
            System.out.println("Ingrese solo valores positivos");
         }while (vec[i]<0);
         
      }
      
      System.out.println("Vector");
      for(i=0;i<dim;i++)
      {
         System.out.print("|"+vec[i]);
      }
      
      for(i=0;i<dim;i++)
      {
         if(vec[i]%2==0)
         vec[i]=0;
         else
         vec[i]=1;
      }
      
      System.out.println();
      System.out.println("Vector modificado");
      for(i=0;i<dim;i++)
      {
         System.out.print("|"+vec[i]);
      }
      
      
   }
   
}