public class Prueba7
{
   public static void main(String[] args) 
   {
      int []nros= new int [6];
      int i;
      
      for (i=0; i<6;i++)
      {
         do
         {
         System.out.println("Ingrese un entero");
         nros[i]=Console.readInt();
         if(nros[i]<0)
         System.out.println("Solo positivos");
         }while(nros[i]<0);
      }
      
      System.out.println("Vector original");
      
      for(i=0;i<6;i++)
      {
         System.out.print("|"+nros[i]);
      }
      
      
      for(i=0;i<6;i++)
      {
         if(nros[i]%2==0)
            nros[i]=0;
            else
               nros[i]=1;
      }
      
      System.out.println("Vector modificado");
      
      for(i=0;i<6;i++)
      {
         System.out.print("|"+nros[i]);
      }
      
      
   }
}