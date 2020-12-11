public class TP6P11
{
   
   public static void main(String[] args) 
   {
      int i,dim,a;
      dim=Console.readInt("Ingrese dimension del vector");
      int vec[]=new int [dim];
      int vecsuma[]=new int[dim];
      
      for(i=0;i<dim;i++)
      {
         vec[i]=Console.readInt("Ingrese valor");
      }
      
      a=dim-1;

         for(i=0;i<dim;i++)
         {
            vecsuma[i]=vec[i]+vec[a];
            a=a-1;
         }
      System.out.println("Vector original");
      
      for(i=0;i<dim;i++)
      {
         System.out.print("|"+vec[i]);  
      }   
      
      System.out.println();
      System.out.println("Vector original");
      
      for(i=0;i<dim;i++)
      {
         System.out.print("|"+vecsuma[i]); 
      }   
           
   }
}