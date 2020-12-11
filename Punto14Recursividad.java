public class Punto14Recursividad
{
   public static void main(String[] args)
   {
      
   int x,y;
   x=Console.readInt("Ingrese valor de X");
   y=Console.readInt("Ingrese valor de Y");
   
   System.out.println(maximoComunDivisor(x,y));
   
   }
   public static int maximoComunDivisor(int x,int y)
   {
      if(y<=x&(x%y==0))
      return y;
      else
         if(x<y)
         return maximoComunDivisor(y,x);
         else
            return maximoComunDivisor(y,x%y);
   
   }
}