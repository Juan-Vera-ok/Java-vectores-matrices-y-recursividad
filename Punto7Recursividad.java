public class Punto7Recursividad
{
   public static void main(String[] args)
   {
   int n;
   n=Console.readInt("Ingrese valor");
   System.out.println(sumaPotencias(n,1));
   }
   public static int sumaPotencias(int n,int p)

   {
      if(n==1)
      return 1;
      else
         return potencia(n,p)+sumaPotencias(n-1,p+1);
   }
   public static int potencia(int m, int n)
{
if (n == 0)
return 1;
else
return (m * potencia(m, n - 1));
}
}