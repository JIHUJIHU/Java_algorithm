import java.util.Scanner;

public class baekjun_1002 {
    public static int turret(int x1, int y1, int d1, int x2, int y2, int d2){

        int distance = (int)(Math.pow(x2 - x1,2) + Math.pow(y2-y1,2));

        if(x1 == x2 && y1 == y2 && d1 == d2){
            return -1;
        }
        else if(distance > Math.pow(d1 + d2, 2)){
            return 0;
        }
        else if(distance < Math.pow(d1 - d2,2)){
            return 0;
        }
        else if(distance == Math.pow(d1 - d2, 2)) {
            return 1;
        }
        else if(distance == Math.pow(d1 + d2, 2)){
            return 1;
        }
        else {
            return 2;
        }
    }
    public static void main(String[] args) {
        int total;
        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();
        for(int i = 0; i < total; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int d1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int d2 = sc.nextInt();

            System.out.println(turret(x1, y1, d1, x2, y2, d2));
        }
    }
}
