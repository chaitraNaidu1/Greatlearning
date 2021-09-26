package assignments;

import java.util.Scanner;

public class Stock {
	public static void main(String[] args) {
		System.out.println("\n Enter the number of companies");
		int N;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		N= sc.nextInt();
		int StockPrices[]=new int[N];
		System.out.println("Enter Stock prices of the companies entered as N");
		for(int i=0;i<N;i++) {
			StockPrices[i]=sc.nextInt();
		System.out.println("The stocks in ascending");
		for(int a:StockPrices) {
			System.out.println(a);
			
		}
		}
		}
	


	public static void  stock1(int[] StockPrices, int temp) {
		for(int i=0;i<StockPrices.length;i++) {
			for(int j=i;j < StockPrices.length;j++) {
				if(StockPrices[i]>StockPrices[j]) {
				temp=StockPrices[i];
				StockPrices[i]=StockPrices[j];
				StockPrices[j]=temp;
				}
				
			}
		}
	}	


	public static void  stock2(int[] StockPrices, int temp1) {
		for(int i=0;i<StockPrices.length;i++) {
			for(int j=i;j < StockPrices.length;j++) {
				if(StockPrices[i]<StockPrices[j]) {
				temp1=StockPrices[i];
				StockPrices[i]=StockPrices[j];
				StockPrices[j]=temp1;
	}
			}
		}
	}
}
	


