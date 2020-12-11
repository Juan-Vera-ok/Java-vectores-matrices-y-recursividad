public class TP6P12
{
   public static void main(String[] args) 
   {
      int dim,i,a,dimpares,contador;
      dim=Console.readInt("Ingrese dimension del vector");
      int vec[]=new int[dim];
      
      dimpares=0;
      
      for(i=0;i<dim;i++)
      {
         vec[i]=Console.readInt("Ingrese valor");
         if(vec[i]%2==0)
         {
            dimpares=dimpares+1;
         } 
      }
      
      System.out.println("Vector original");
      for(i=0;i<dim;i++)
      {
      System.out.print("|"+vec[i]);
      }
      System.out.println();
      
      int vecpares[]=new int[dimpares];
      
      a=0;
      
      for(i=0;i<dim;i++)
      {
         if(vec[i]%2==0)
         {
            vecpares[a]=vec[i];
            a=a+1;
         }
      }
      
      contador=0;
      
        for(i=0;i<dimpares;i++)
      {
         if(vec[i]==24)
            contador=contador+1;         
      }
      
         System.out.println("Vector de pares");
      for(i=0;i<dimpares;i++)
      {
      System.out.print("|"+vecpares[i]);
      }
      System.out.println();
      
      System.out.println("Aparece "+contador+" veces el numero 24");
      
      
      
   }
}