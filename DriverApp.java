package transactionTarget;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		int days;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter Number of days shop was open");
		days=sc.nextInt();
		
		int trans[]=new int[days];
		int i;
		for (i = 0; i < trans.length; i++) {
			System.out.println("Please enter income of Day "+ (i+1));
			trans[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(trans));
		
		System.out.println("Please enter number of targets");
		int targets=sc.nextInt();
		
		int sum;
		int flag;
       for(int j=1;j<=targets;j++)
		{
			System.out.println("Please enter Value for target "+j);
			int singleTarget=sc.nextInt(); 
			sum=0;
			flag=0;
			for(int n=0;n<trans.length;n++)
			{
				sum=sum+trans[n];
				if(sum>=singleTarget)
				{
					flag=1;//target achieved
					System.out.println("Target achieved on day "+ (n+1));
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Target not achieved");	
			}
			

		}
		

	}

	}


