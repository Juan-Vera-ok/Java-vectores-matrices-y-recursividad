public class Prueba4 {
   
   public static void main(String[] args) {
      
      int cont,suma,num;
      cont=1;
      suma=0;
      do{
         System.out.println("Ingrese valor");
         num=Console.readInt();
         suma=suma+num;
         cont=cont+1;  
      
      
      }while(cont<=5);      
      System.out.println("La suma es: "+suma);
      
  }
}