import java.util.Scanner;
public class while18{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        while(b>=a){
            a++;
            sum = sum + a;
        }
        System.out.println(sum);
	}
}