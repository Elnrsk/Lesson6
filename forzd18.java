import java.util.Scanner;
public class forzd18{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        int b = in.nextInt();
        int a = 1;
        int n = 0;
        for ( int j = a; j <= b; j++){
            n = n + 1 / j;
        }
        System.out.println(n);
	}
}