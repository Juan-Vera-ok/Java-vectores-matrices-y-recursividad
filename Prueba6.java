public class Prueba6
{
   
   public static void main(String[] args) 
   {
      int dim=10,i,x,Positivos,Negativos;
      int []Vec=new int[dim] ;
         
         Positivos=0;
         Negativos=0;
         x=Console.readInt("Ingrese valor");
         
      for(i=0;i<10;i++)
      {
         if(i%2==0)
         {
            Vec[i]=i+x;
         }
         else
            Vec[i]=i-x;
       if(Vec[i]>0)
         Positivos=Positivos+1;
       if(Vec[i]<0)
         Negativos=Negativos+1;
      }
      
      for(i=0;i<10;i++)
      {
         System.out.print("|"+Vec[i]);

      }
      System.out.println();
      
         System.out.println("Positivos "+Positivos);
         System.out.println("Negativos "+Negativos);
   }
}