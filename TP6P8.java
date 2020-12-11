public class TP6P8
{
   
   public static void main(String[] args) 
   {
      int dim,i,Pos1,Pos2;
      dim=Console.readInt("Ingrese dimension del vector");
      int vec[]=new int[dim];
      
      for(i=0;i<dim;i++)
      {
         vec[i]=Console.readInt("Ingrese valor");
      }
      
      System.out.println("Vector");
      for(i=0;i<dim;i++)
      {
         System.out.print("|"+vec[i]);
      }
      System.out.println();
      
      Pos1=Console.readInt("Ingrese pos1");
      Pos2=Console.readInt("Ingrese pos2");
      
      for(i=Pos1;i<=Pos2;i++)
      {
         System.out.print("|"+vec[i]);
      }
      
      
   }
   
}