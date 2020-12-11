public class Punto5Recursividad
{
   public static void main(String[] args)
   {
      int N;
      N=Console.readInt("Ingrese valor");
      System.out.println("El total es "+sumapares(N));
   }
   public static int sumapares(int p)
   {
      if(p==0)
      return 0;
      else
         if(p%2!=0)
         return sumapares(p-1);
         else
            return p+sumapares(p-2);
      
   
   
   }
   
   
}