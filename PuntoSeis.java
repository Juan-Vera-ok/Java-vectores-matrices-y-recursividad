public class PuntoSeis {
   
   public static void main(String[] args) {
         
        int A,B,C;
        
        System.out.println("Ingrese 1er numero");
        A=Console.readInt();
        
        System.out.println("Ingrese 2do numero");
        B=Console.readInt();
         
        System.out.println("Ingrese 3er numero");
        C=Console.readInt();
        
        if(A>B&A>C)
         System.out.println("El mayor numero es: "+A);
         else
               if(B>A&B>C)
                  System.out.println("El mayor numero es: "+B);
                  else
                     System.out.println("El mayor numero es: "+C);
                     
                  
        
         
      }
   
   
   
}