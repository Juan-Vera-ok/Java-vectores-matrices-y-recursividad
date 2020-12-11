public class Punto18Recursividad
{
   public static void main(String[] args)
   {
   int i,dim1,dim2;
   dim1=Console.readInt("Ingrese dimension1");
   dim2=Console.readInt("Ingrese dimension2");
   char sec1[]=new char [dim1];
   char sec2[]=new char [dim2];
   
   for(i=0;i<dim1;i++) 
   sec1[i]=Console.readChar("Ingrese caracter");
   
   System.out.println("-------------");
   
   for(i=0;i<dim2;i++)
   sec2[i]=Console.readChar("Ingrese caracter");
   
 //  System.out.println(contenido(sec1,0,dim1,sec2,0,dim2));
   }
 }
 //  public static boolean contenido(char []sec1,int indice1,int dim1,char []sec2,int indice2,int dim2)
 //  {
 //  if(indice2==dim2)
 //        return true;
 //  else {
 //        if(sec1[indice1]==sec2[indice2])
 //                 return  contenido(sec1,indice1+1,dim1,sec2,indice2+1,dim2);
 //        else 
 //              if(indice1<dim1)
 //              return contenido(sec1,indice1+1,dim1,sec2,indice2,dim2);
 //              else
 //              if(indice1==dim1)
 //               return false;
 //           }
 //  }
//}
