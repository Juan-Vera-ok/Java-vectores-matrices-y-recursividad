public class PuntoNueve 
{
   
   public static void main(String[] args) 
   {
         
         int nota,nosatis,satis,sobresaliente;
         
         nosatis=0;
         satis=0;
         sobresaliente=0;
         
         do{
             do
               {  
                  nota=Console.readInt("Ingrese nota");
                  if(nota<-1|nota>100)
                  System.out.println("Valor no valido");
               }while(nota<-1|nota>100); 
                  
                  
                  if(nota>=0&nota<=59)
                  {
                     System.out.println("La nota "+nota+" no es satisfactoria");
                     nosatis=nosatis+1;
                  }
                  else{
                           if(nota>=60&nota<=89)
                           {
                              System.out.println("La nota "+nota+" es satisfactoria");
                              satis=satis+1;
                           }
                           else{
                                 if(nota>=90&nota<=100)
                                   {
                                       System.out.println("La nota "+nota+" es sobresaliente");
                                       sobresaliente=sobresaliente+1;
                                   }
                                 else{
                                       System.out.println("Fin");
                                     }  
                               }
                           
                         }
                   
             }while(nota!=-1);
             
            System.out.println("Hay "+nosatis+" cantidad de notas no satisfactorias");
            System.out.println("Hay "+satis+" cantidad de notas satisfactorias");
            System.out.println("Hay "+sobresaliente+" cantidad de notas sobresalientes");
   }
}   
   