public class TP6P14
{
   public static void main(String[] args) 
   {
      int i,dim;
      dim=Console.readInt("Ingrese dimension");
      
      
      int vec1[]=new int [dim];
      int vec2[]=new int [dim];
      int vec3[]=new int [dim];
      
      
      System.out.println("Vector 1");
      for(i=0;i<dim;i++)
      {
         vec1[i]=Console.readInt("Ingrese valor");
      }
      System.out.println("Vector 2");          
      for(i=0;i<dim;i++)
      {
         vec2[i]=Console.readInt("Ingrese valor");
      }
      
      System.out.println("Vector 1");
       for(i=0;i<dim;i++)
      {
         System.out.print("|"+vec1[i]);
      }
      System.out.println();
      
      System.out.println("Vector 2");
       for(i=0;i<dim;i++)
      {
         System.out.print("|"+vec2[i]);
      }
      
      System.out.println();
      
      for(i=0;i<dim;i++)
      {
         vec3[i]=vec1[i]-vec2[i];
      }
      
      System.out.println("Vector 3");
       for(i=0;i<dim;i++)
      {
         System.out.print("|"+vec3[i]);
      }
       
      
      
      
   }
}