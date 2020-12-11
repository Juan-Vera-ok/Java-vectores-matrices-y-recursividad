public class TestRecursividad
{
   public static void main(String[] args)
   {
      int i;
      int dim=5;
      int notas[]= new int[dim];
      
      for(i=0;i<dim;i++)
      {
      notas[i]=Console.readInt("Ingrese valor");
      }
     
      System.out.println("La suma es: "+sumaV(notas,0));
      
   }
   
   public static int sumaV(int[]n, int p)
   {
      if(p==n.length-1)
         return n[0];
      else
         return n[p]+sumaV(n,p+1);   
   }
   
   
}