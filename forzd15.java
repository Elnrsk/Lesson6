import java.util.Scanner;

public class forzd15{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int sum = 0;
       for (int f = a; f <= b; f++){
           sum = sum + f;
       }
        System.out.println(sum);
    }
}

