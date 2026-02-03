public class patttern9 {
	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<=4;i++){
			//spaces 
			for(int j=1;j<n-1-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i+1;k++){
				System.out.print("* ");
			}
			for(int l=1;l<n-1-i;l++){
				System.out.print(" ");
			}
	System.out.println();
		}


		//lower half
		for(int i=0;i<=4;i++){
			//spaces
			for(int j=0;j<=i;j++){
				System.out.print("  ");
			}
			for(int k=1;k<=n-2*i;k++){
				System.out.print("* ");
			}
			for(int l=0;l<=i;l++){
				System.out.print("  ");
			}
	System.out.println();	
		}
	}

	
}
