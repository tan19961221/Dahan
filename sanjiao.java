
public class Hello 
{
  public static void main(String[] args) 
  {
    int[][] arr=new int[10][10];
    for(int i=0;i<arr.length; i++)
     {
      for(int j=0;j<=i;j++) 
      {
        if(j==0||j==i) 
        {
          arr[i][j]=1;
        }
        else 
        {
          arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
        }
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }
}

