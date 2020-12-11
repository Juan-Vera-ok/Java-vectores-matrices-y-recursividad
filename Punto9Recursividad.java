public class Punto9Recursividad
{
   public static void main(String[] args)
   {
      int x;
      x=Console.readInt("Ingrese x");
      System.out.println(h(x));
   }
   public static int h(int x)
   {
      if(x==1)
      return 1;
      else
         return h(x/2)+1;
   }
}