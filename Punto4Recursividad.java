public class Punto4Recursividad
{
   public static void main(String[] args)
   {
      int N;
      N=Console.readInt("Ingrese valor");
      System.out.println("El total es "+suma(N));
   }
   
   public static int suma(int p)
   {
      if(p==1)
      return 1;
      else
         return p+suma(p-1);
   }
}