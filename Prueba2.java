public class Prueba2 {
   
   public static void main(String[] args) {
      int num;
      System.out.println("Ingrese numero");
      num=Console.readInt();
      
      if(num>0){
         if(num%2==0){
            System.out.println("El numero ingresado es positivo y par");
            }
         else
            System.out.println("El numero ingresado es positivo e impar");
         }
       else
         System.out.println("El numero ingresado es negativo");  
      }
      
   
   }