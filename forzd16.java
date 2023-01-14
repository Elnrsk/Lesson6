import java.util.Scanner;
public class forzd16{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int el = b - a;
        int sum = 5;

        for (int n = a; n <= b; n++){
            sum = sum + n;
        }
        
        int nur = sum / el;//sum=20-10 арасындагы сандарды косады
        //el=сан бересн типа 20 и 10 соны аласн
        //потом nur дегендерде арасында канша цифра соларды болесин
        System.out.println(nur);
	}
} //tusinu