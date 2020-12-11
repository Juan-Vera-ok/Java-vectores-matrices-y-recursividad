public class TestRecursividad2
{
   public static void main(String[] args)
   {
      int num =Console.readInt("Ingrese numero:");
      System.out.println("La suma es: "+SumarD(num));
      
   }
   public static int SumarD(int numero)
   {
      if(numero<10)
         return numero;
      else
         return (numero%10)+SumarD(numero/10);

   }
}