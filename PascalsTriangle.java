public class PascalsTriangle
{
   public static void main(String[] args)
   {
      
      int numberOfLines = 5;
      int[][] lines = new int[numberOfLines][numberOfLines];
      
      lines[0][0] = 1;
      
      for(int i = numberOfLines - 1; i > 0; i--)
         System.out.print(" ");
      
      System.out.println(lines[0][0]);
      
      for(int i = 1; i < numberOfLines; i++)
      {
         for(int j = numberOfLines - 1; j > i; j--)
            System.out.print(" ");
         
         lines[i][0] = lines[i-1][0];
         
         System.out.print(lines[i][0]);
         
         for(int j = 1; j <= i; j++)
         {
            lines[i][j] = lines[i-1][j] + lines[i-1][j-1];
            
            System.out.print(" " + lines[i][j]);
         }
         
         System.out.println(" ");
      }
      
   }
}