public class TablaMultiplicar
{
   public static void main (String []args)
   {
      int num,i,dim;
      dim=11;
      int []tabla=new int[dim];
      
      num=Console.readInt("Ingrese valor");
      
      for(i=0;i<=dim-1;i++)
      {
         tabla[i]=i*num;
      }
      
      
      for(i=0;i<=dim-1;i++)
      {
         System.out.print(tabla[i]);
      }
      
      System.out.println();
      System.out.println("Ingrese valor");
      int num2=Console.readInt();
      
         if(num2>=0&num2<=10)
            System.out.println(tabla[num2]);
   
         else
            System.out.println("El dato no se valido");
      
      
   }
}