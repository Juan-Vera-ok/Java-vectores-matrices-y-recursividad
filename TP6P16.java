public class TP6P16
{
   public static void main(String[] args) 
   {
      int i,dim,cont,pos;
      char buscado;
      dim=Console.readInt("Ingrese dimension del vector");
      char vec[]=new char [dim];
      boolean enc;
      
      
      for(i=0;i<dim;i++)
         vec[i]=Console.readChar("Ingrese valores");
       
      buscado=Console.readChar("Ingrese valor a buscar");
      
      i=0;
      enc=false;
      pos=0;
      
      while(i!=dim-1&enc==false)
      {
         if(vec[i]==buscado)
         {
            enc=true;
            pos=i;
         }
      i=i+1;
      }
      
      if(enc==true)
      System.out.println("El valor buscado '"+buscado+"' se encuentra en la posicion "+pos);
      else
         System.out.println("El valor buscado '"+buscado+"' no se encuentra");
            
   }
}