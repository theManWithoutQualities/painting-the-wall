import java.util.Scanner;

/**
 * Created by nick on 02.04.17.
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        for(int index=0; index<t; index++) {

            int n = reader.nextInt();
            int m = reader.nextInt();
            int k = reader.nextInt();
            int[][] arr = new int[n][m];
            boolean answer = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = reader.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) {
                        int countColors = paint(i, j, arr, 1);
                        if (countColors - 1 > k) {
                            answer = false;
                        }
                    }
                }
            }

            if(answer){
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if(arr[i][j]!=0){System.out.print(arr[i][j]-1);}
                        else{System.out.print(0);}
                        if(j+1<m){System.out.print(" ");}
                    }
                    System.out.println();
                }
            }else{
                System.out.println("NO");
            }

        }

    }
    public static int paint(int x, int y, int[][] arr, int countColors) {
        arr[x][y]=countColors+1;
        int result=countColors+1;
        if((x+1<arr.length)&&(arr[x+1][y]==1)){
            result=Math.max(paint(x+1, y, arr, result), result);
        }
        if((y+1<arr[x].length)&&(arr[x][y+1]==1)){
            result=Math.max(paint(x, y+1, arr, result), result);
        }
        if((x>0)&&(arr[x-1][y]==1)){
            result=Math.max(paint(x-1, y, arr, result), result);
        }
        if((y>0)&&(arr[x][y-1]==1)){
            result=Math.max(paint(x, y-1, arr, result), result);
        }
        return result;
    }

}
