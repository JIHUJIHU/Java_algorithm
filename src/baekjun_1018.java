import java.util.Scanner;

public class baekjun_1018 {
    public static boolean[][] arr;
    public static int min = 64;

    public static void find(int a, int b){
        int endA = a + 8;
        int endB = b + 8;
        int count = 0;

        boolean bw = arr[a][b];

        for(int i = a; i< endA; i++){
            for(int j = b; j< endB; j++){
                if(arr[i][j] != bw){
                    count++;
                }
                bw = !bw;
            }
            bw = !bw;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min,count);
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String chr = sc.next();

            for(int j = 0; j < m; j++){
                if (chr.charAt(j) == 'W'){
                    arr[i][j] = true;
                }
                else {
                    arr[i][j] = false;
                }
            }
        }

        int n_row = n-7;
        int m_col = m-7;

        for(int i=0; i< n_row;i++){
            for(int j = 0; j< m_col; j++){
                find(i,j);
            }
        }
        System.out.println(min);
    }
}
