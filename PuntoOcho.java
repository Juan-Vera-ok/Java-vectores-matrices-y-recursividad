public class PuntoOcho {
   
   public static void main(String[] args) {
   
      int NUM,PRODUCTO,SUMA,CONT;
      
         SUMA=0;
         PRODUCTO=1;
         CONT=0;        
         while(CONT<3){ 
        System.out.println("Ingrese un numero");
        NUM=Console.readInt();
        
        SUMA=SUMA+NUM;
        PRODUCTO=PRODUCTO*NUM;
        
        CONT=CONT+1;
        
        
       }
      System.out.println("La suma es: "+SUMA);
      System.out.println("El producto es: "+PRODUCTO);
   }   
}