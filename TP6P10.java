public class TP6P10
{
   
   public static void main(String[] args) 
   {
      int dim,i,a;
      
      dim=Console.readInt("Ingrese dimension del vector");
      
      int vec[]=new int [dim];
      int vecinverso[]=new int [dim];
      
      for(i=0;i<dim;i++)
      {
         vec[i]=Console.readInt("Ingrese valor");
      }
      
      a=dim-1;
      
      for(i=0;i<dim;i++)
      {
         vecinverso[i]=vec[a];
         a=a-1;
      }
      
       System.out.println("Vector original");
       
      for(i=0;i<dim;i++)
      {
         System.out.print(vec[i]);
      }
         System.out.println();
         System.out.println("Vector inverso");
       
      for(i=0;i<dim;i++)
      {
         System.out.print(vecinverso[i]);
      }
      
   }
}