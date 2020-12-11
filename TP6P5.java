public class TP6P5 
{
   
   public static void main(String[] args) 
   {
      int i,dim;
      dim=5;
      char []vec=new char[dim];
      
      for(i=0;i<dim;i++)
      {
         System.out.println("Ingrese caracter");
         vec[i]=Console.readChar();
      }
      
       for(i=0;i<dim;i++)
      {
         if(i%2==0)
            System.out.println(vec[i]);
      }
      
   }
}   