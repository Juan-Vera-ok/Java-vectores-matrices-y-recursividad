public class Punto12Recursividad
{
   public static void main(String[] args)
   {
   int a,b;
   a=Console.readInt("Ingrese a");
   b=Console.readInt("Ingrese b");
   System.out.println(funcion (a,b));
   }
   public static int funcion(int a, int b)
   {
      if(b==1)
      return a*b;
      else
         return funcion(a,b-1)+a;
   }
}