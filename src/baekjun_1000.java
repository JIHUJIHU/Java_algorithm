import java.util.Scanner;

public class baekjun_1000 {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(add(a,b));
    }
}
