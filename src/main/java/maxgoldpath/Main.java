package maxgoldpath;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
       int [][] arr={
               {0,6,0},
               {5,8,7},
               {0,9,0}
       };
       Solution solution=new Solution();
       int maxGold=solution.solution(arr);
        System.out.println("max goldis: "+maxGold);
    }
}
