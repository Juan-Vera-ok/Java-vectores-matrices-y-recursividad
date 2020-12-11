public class TP6P17
{
   public static void main(String[] args) 
   {
      int i,dim;
      
      dim=Console.readInt("Ingrese dimension del vector");
      
      int A[]=new int [dim];
      int B[]=new int [dim];
      int C[]=new int [dim];
      
      System.out.println("Vector A");
      
      for(i=0;i<dim;i++)
         A[i]=Console.readInt("Ingrese valores");
         
      System.out.println("Vector A");
      
      for(i=0;i<dim;i++)
         System.out.print("|"+A[i]);
         
         
      System.out.println();
      System.out.println("Vector B");
      
      for(i=0;i<dim;i++)
         B[i]=Console.readInt("Ingrese valores");
         
      System.out.println("Vector B");
      
      for(i=0;i<dim;i++)
         System.out.print("|"+B[i]);
      
      for(i=0;i<dim;i++)
         {
            if(A[i]%B[i]==0)
               C[i]=2;
               else
                  if(B[i]%A[i]==0)
                     C[i]=1;
                     else
                        C[i]=0;
         }  
         
         
      System.out.println();  
      System.out.println("Vector C");
      
      for(i=0;i<dim;i++)
         System.out.print("|"+C[i]);
      
      
   }
}