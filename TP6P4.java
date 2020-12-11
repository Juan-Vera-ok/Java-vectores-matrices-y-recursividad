public class TP6P4
{
   public static void main(String[]args)
   {
      
      int dim=10;
      int []vec=new int [dim];
      
         for(int i=0;i<dim;i++)
         {
            System.out.println("Ingrese valor");
            int n=Console.readInt();
            vec[i]=n;
         }
         
         for(int i=0;i<dim;i++)
         {
            if(vec[i]%2==0)
               System.out.println(vec[i]+" es par y esta en la posicion "+i);
         }
      
   }
}