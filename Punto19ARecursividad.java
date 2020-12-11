public class Punto19ARecursividad
{
   public static void main(String[] args)
   {
      int i,dim;
      dim=Console.readInt("Ingrese dimension del vector");
      int vec[]=new int [dim];
      System.out.println("Vector");
      
      for(i=0;i<dim;i++)
      vec[i]=Console.readInt("Ingrese valor");
      
      mostrarInverso(vec,dim-1,dim);
      
      
   }
   
   public static void mostrarInverso(int vec[],int indice,int dim)
   {
      if(indice==-1)
      return;
      else
         if(indice<dim)
         System.out.print(vec[indice]);
         mostrarInverso(vec,(indice-1),dim);
   
   }


}