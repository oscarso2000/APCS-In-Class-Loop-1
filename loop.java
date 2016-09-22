import java.util.Scanner;
public class loop {
	public static void main (String [] args) {
		int[] NumArr = new int [1000];
		Scanner UserInput = new Scanner (System.in);
		for (int i=0;i<1000;i++){
			NumArr[i]=i+1;
		}
		System.out.printf("1: Odd Numbers \n2:Even Numbers \n3: Prime Numbers \n4: Multiples\n");
		System.out.printf("Please select function for 1-1000: ");
		int check = UserInput.nextInt();
		//odd number
		if (check == 1){
			System.out.printf("Odd Numbers: ");
			for (int i=0;i<1000;i++){
				if (NumArr[i]%2==1){
					System.out.printf("%d ",NumArr[i]);
				}
			}
		}
		//even number:
		else if (check ==2) {
			System.out.printf("Even Numbers: ");
			for (int i=0;i<1000;i++){
				if (NumArr[i]%2==0){
					System.out.printf("%d ",NumArr[i]);
				}
			}
		}
		//prime number:
		else if (check == 3){
			boolean prime= true;
			System.out.printf("Prime Numbers: ");
			System.out.printf("2 ");
			for (int i=2;i<1000;i++){
				if (NumArr[i]%2==1){
					for (int j=NumArr[i]-1;j>=2;j--){
						if (NumArr[i]%j==0){
							prime = false;
						}
					}
					if (prime == true){
						System.out.printf("%d ",NumArr[i]);
					}
				}
			}
		}
		else if (check ==4){
			//multiple: 
			int multiple;
			System.out.printf("Multiple of: ");
			multiple = UserInput.nextInt();
			System.out.printf("\nMultiple of %d: ", multiple);
			for (int i=0;i<1000;i++){
				if (NumArr[i]%multiple==0){
					System.out.printf("%d ",NumArr[i]);
				}
			}
		}else{
			System.out.printf("Incorrect Input. Bye \n");
		}
	}
}
