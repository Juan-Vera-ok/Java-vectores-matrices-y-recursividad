public class Punto15Recursividad
{
   public static void main(String[] args)
   {
   int dim,i;
   dim=4;
   
   char vec[]=new char [dim];
   
   for(i=0;i<dim;i++)
   vec[i]=Console.readChar("Ingrese caracter");
   
   subConjuntos(vec,dim,1,0);
   
   
   }
   
   public static void subConjuntos(char []vec,int dim,int indice,int inicio)
   {
      if(inicio==indice){
      subConjuntos(vec,dim,indice+1,inicio);
      }
      else
         if(dim>indice){
         System.out.println(vec[inicio]+"-"+vec[indice]);
         subConjuntos(vec,dim,indice+1,inicio);}
         else
            if(dim==indice){
            subConjuntos(vec,dim, inicio+1, inicio+1);}
            else
               if(inicio==dim)
               System.out.println("Fin");
      
   }
}