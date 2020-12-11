public class PuntoSiete {
   
   public static void main(String[] args) {
   
         char DIA;
         
         DIA=Console.readChar("Ingrese dia");
         switch (DIA)
         {
            case 'L':
               {
               System.out.println("Hoy NO tengo resolucion");
               break;
               }
             case 'M':
               {
               System.out.println("Hoy SI tengo resolucion");
               break;
               }
             case 'I':
               {
               System.out.println("Hoy SI tengo resolucion");
               break;
               }  
             case 'J':
               {
               System.out.println("Hoy SI tengo resolucion");
               break;
               }
             case 'V':
               {
               System.out.println("Hoy NO tengo resolucion");
               break;
               }
             default:
             {
               System.out.println("Valor no valido");
               break;
             }
         }      
      }
   
   
   }