public class while4{
	public static void main(String[] args) {
		int j =0;
        while (j <8){
            j++;
            if(j == 5){
                continue;
            }
            System.out.println(j+" ");
        }
	}
}