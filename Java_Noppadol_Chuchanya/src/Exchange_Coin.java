import  java.util.*;
import java.lang.*;
public class Exchange_Coin {
	static int coin[] = {1,5,10};
	static int cash[] = {10,20,50,100};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		boolean checkCash = false;
		
		do{
		System.out.print("Input your cash : ");
		int cashInput = scan.nextInt();
		checkCash = checkCash(cashInput);
		
		
		if(checkCash == true){
			sumCoin(cashInput);
		}else System.out.println("your cash is not true");
		}while(checkCash == false);
		
		boolean checkGetCoin = false;
		do{
			System.out.println("Which do you want coin (1,5,10) ? ");
		
		int getCoin = scan.nextInt();
		int getCoinSelect;
		for(int i =0 ; i<coin.length;i++){
			if(getCoin == coin[i]){
				checkGetCoin = true;
				getCoinSelect = coin[i];
				break;
			}
		}
		
		}while(checkGetCoin == false);
		
		boolean checkAns = false;
		if(checkGetCoin == true){
			do{
			System.out.print("Are you sure ? (Y/N)");
			char ans = scan.next().charAt(0);
			if(ans == 'Y' || ans == 'y'){
				checkAns = true;
				System.out.print("Successful Thank you");
			}else if(ans == 'N' || ans == 'n'){
				System.out.print("Thank you please come again");
			}
		}while(checkAns == false);
		}
		
	}
	
	public static boolean checkCash(int cashInput){
		for(int i = 0;i<cash.length;i++){
			if((cashInput % cash[i]) == 0){
				return true;
			}
		}
		
		return false;
	}
	
	public static void sumCoin(int cashInput){
		for(int i = 0 ; i< coin.length;i++){
			if((cashInput % coin[i]) == 0){
			int sumCoin = cashInput / coin[i];
			System.out.println( coin[i] + " bath : " + sumCoin + " coin" );
		}
		}
	
	}
	
}

