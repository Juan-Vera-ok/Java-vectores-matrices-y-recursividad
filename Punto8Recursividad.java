public class Punto8Recursividad
{
   public static void main(String[] args)
   {
      int x,y;
      x=Console.readInt("Ingrese x");
      y=Console.readInt("Ingrese y");
      System.out.println(g(x,y));
   }
   
   public static int g(int x,int y)
   {
    if(x<=y)
    return 1; 
    else
      return g(x,y+1)+1;
   }
}