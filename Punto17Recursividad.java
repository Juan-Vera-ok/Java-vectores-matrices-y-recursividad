public class Punto17Recursividad
{
   public static void main(String[] args)
   {
   int m,n;
   m=Console.readInt("Ingrese M");
   n=Console.readInt("Ingrese N");
   A(n,m);
   }
   public static int A(int m,int n)
   {
      if(m==0){
      return A(m,(n+1));}
      else{
         if(m>0&&n==0){
         return A(m-1,n);}
         else{
            return A(m-1,A(m,n-1));}
         
   }
}
}