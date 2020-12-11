public class Punto19BRecursividad
{
   public static void main(String[] args)
   {
      int i,dim;
      dim=Console.readInt("Ingrese dimension del vector");
      int vec[]=new int [dim];
      System.out.println("Vector");
      
      for(i=0;i<dim;i++)
      vec[i]=Console.readInt("Ingrese valor");
      
   }
   public static int buscador(int vec[],int indice,int dim,int buscado)
   {
      if(indice==(dim-1)&vec[indice]!=buscado)
      return -1;
      
            if(vec[indice]==buscado)
            return vec[indice];
            else
               if(indice<dim)
               return buscador(vec,indice+1,dim,buscado);
      
   }
}