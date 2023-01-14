public class forzd14{
	public static void main(String[] args) {
		int a = 4;
        int pow = 2;
        for (int j = a; a <= 28; a++) {
            double el = 2 * Math.pow(a, pow) + 5.5 * a - 2;
            System.out.println("y = " + el);
            System.out.println();
            int nur = a - 2;
            System.out.println("x = " + nur);
        }
	}
}