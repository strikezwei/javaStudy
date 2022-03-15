package algorism;

public class Diamond {

	public static void main(String[] args) {
		int x,y;
		
		for(x=0;x<5;x++) {
			for(y=0;y<5;y++) {
				if(x==0 || x==4) {
					if(y==5/2) {
					System.out.print("*");
					
					}else {
						System.out.print(" ");
					}
					
			}else if(x==1 || x ==3) {
					if(y<1 || 3<y) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
			}else if(x==2) {
						System.out.print("*");
			}
				
		}
		
			System.out.println();

	}
}
}

