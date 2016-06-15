import java.util.Scanner;

public class Switch {

	private static Scanner sc;

	public static void main(String[] args)
	{
		//

		String monthName;
		int days=0;
		
		while(1>0)
		{
			System.out.println("Please enter the days of the month: ");
			sc = new Scanner(System.in);
			days=sc.nextInt();
			switch (days) {
			case 28:  monthName = "Febuary";                    
			break;
			case 29:  monthName = "February";
			break;
			case 30:  monthName = "January, March, May, July, August, October, December";
			days=31;
			break;
			case 31:  monthName = "April, June, September, November";
			days=30;
			break;           
			default: monthName = "There is no months with "+days+" days.";
			break;
			}


			System.out.println(monthName);
		}
	}

}
