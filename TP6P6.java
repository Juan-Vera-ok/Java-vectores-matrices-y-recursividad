public class TP6P6
{
   
   public static void main(String[] args) 
   {
      int i,dim,dimimpar,dimpar,a,b;
      dim=Console.readInt("Ingrese dimension");
      
      int vec[]=new int[dim];
      
      for(i=0;i<dim;i++)
      {
         vec[i]=Console.readInt("Ingrese valores");
      }
      
      dimimpar=0;
      dimpar=0;
      
      for(i=0;i<dim;i++)
      {
         if(vec[i]%2==0)
            dimpar=dimpar+1;
            else 
               dimimpar=dimimpar+1;
      }
      
            
      int pares[]=new int[dimpar];
      
      int impares[]=new int [dimimpar];
      
      a=0;
      b=0;
      for(i=0;i<dim;i++)
      {
         if(vec[i]%2==0)
         {
            pares[a]=vec[i];
            a=a+1;
         }
         else
            {
            impares[b]=vec[i];
            b=b+1;
            }
      }
      
         System.out.println("Vector inicial");
       for(i=0;i<dim;i++)
      {
         System.out.print("|"+vec[i]);
      }
         System.out.println(" ");
          System.out.println("Vector pares");
       for(i=0;i<dimpar;i++)
      {
         System.out.print("|"+pares[i]);
      }
          System.out.println(" ");
          System.out.println("Vector impares");
       for(i=0;i<dimimpar;i++)
      {
         System.out.print("|"+impares[i]);
      }

   }
}