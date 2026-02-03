public class pattern8 {
	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<=4;i++){
			//space
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=n-2*i;k++){
				System.out.print("* ");
			}
			//spaces
			for(int l=0;l<=i;l++){
				System.out.print(" ");

				 
			}
	System.out.println();
		}
	}
}
