public class TP6P7
{
   
   public static void main(String[] args) 
   {
      int i,dim,mayor,menor,Ma,Me;
      dim=Console.readInt("Ingrese dimension del vector");
      int []vec=new int [dim];
      
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
      
      mayor=vec[0];
      menor=vec[0];
      Ma=0;
      Me=0;
      for(i=0;i<dim;i++)
      {
         if(vec[i]>mayor)
         {
            mayor=vec[i];
            Ma=i;
         }
         if(vec[i]<menor)
         {
            menor=vec[i];
            Me=i;
         }
      }
      
      System.out.println("El elemento de mayor valor es "+mayor+" y ocupa la posicion "+Ma);
      System.out.println("El elemento de menor valor es "+menor+" y ocupa la posicion "+Me);
      
   }
}