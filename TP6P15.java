public class TP6P15
{
   public static void main(String[] args) 
   {
      int i,dim1,dim2,dim3;
      do
      {
      dim1=Console.readInt("Ingrese dimension 1");
      dim2=Console.readInt("Ingrese dimension 2");
      if(dim1==dim2)
      System.out.println("Ingrese dimensiones distintas");
      }while(dim1==dim2);
   
   if(dim1>dim2)
      dim3=dim1;
      else
         dim3=dim2;
   
   
   int vec1[]=new int[dim1];
   int vec2[]=new int[dim2];
   int vec3[]=new int[dim3];
   System.out.println("Vector 1");
   
   for(i=0;i<dim1;i++)
      vec1[i]=Console.readInt("Ingrese valores");
   
            
   System.out.println("Vector 1");
   for(i=0;i<dim1;i++)
   {
      System.out.print("|"+vec1[i]);
   }
   System.out.println();   
   System.out.println("Vector 2");
   
   for(i=0;i<dim2;i++)
      vec2[i]=Console.readInt("Ingrese valores");
         
   System.out.println("Vector 2");
   for(i=0;i<dim2;i++)
      System.out.print("|"+vec2[i]);
   
   
   if(dim1<dim2)
   {
   
      for(i=0;i<dim2;i++)
      {
         if(i<dim1)
            vec3[i]=vec1[i]+vec2[i];
         else
            vec3[i]=vec2[i]*vec2[i];
      }
   }else
      {
            for(i=0;i<dim1;i++)
         {
            if(i<dim2)
               vec3[i]=vec1[i]+vec2[i];
            else
               vec3[i]=vec1[i]*vec1[i];
         }
      }
           
      System.out.println();
      System.out.println("Vector 3");
      for(i=0;i<dim3;i++)
         System.out.print("|"+vec3[i]);
   
   }
}