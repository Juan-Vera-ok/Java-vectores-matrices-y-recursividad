public class TP6P13
{
   public static void main(String[] args) 
   {
      int i,dim,a;
      double resultado;
      dim=Console.readInt("Ingrese dimension del vector");
      double vec[]=new double [dim];
      
      for(i=0;i<dim;i++)
      {
         vec[i]=Console.readDouble("Ingrese valor");
      }
      resultado=0;
      a=dim-1;
      
      for(i=0;i<dim;i++)
      {
      resultado=(vec[i]*Math.pow(10,a)+resultado);
      a=a-1;
      }
      
      System.out.println((int)resultado);
      
   }
   
}