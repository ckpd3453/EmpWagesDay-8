class Multi
{
	
	void wages()
	{
		//Variables
		int empRatePerHr = 20;
		double totalsalary = 0;
		int maxRateInMonth = 100;
		int numOfWorkingDays = 20;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;
		
		//loop for condition check for total hours and total working days 
		while (totalEmpHr <= maxRateInMonth && totalWorkingDays <= numOfWorkingDays) 
		{
			totalWorkingDays++;
			double randomCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) randomCheck;
			switch (i) 
			{
					case 2:
							//System.out.println("Employee is FullTime");
							empHrs = 8;
							break;
					case 1:
							//System.out.println("Employee is PartTime");
							empHrs = 4;
							break;
					case 0:
							//System.out.println("Employee is Absent");
							empHrs = 0;
							break;
			}

			//Total Hour calculation
			totalEmpHr = totalEmpHr + empHrs;
			//System.out.println(totalEmpHr);
		}
		//calculating Total Salary
		totalsalary = totalEmpHr * empRatePerHr;

		System.out.println("Employee total Salary" + totalsalary);
		System.out.println();
	}
}
public class UC8 {

	public static void main(String[] args) {
		//creating an object
		 Multi Google = new Multi();
				
		 System.out.println("Employee wages of Google :");
		//calling method
		 Google.wages();
		 
		Multi HCL = new Multi();
		System.out.println("Employee wages of HCL :");
			//calling method
			 HCL.wages();
			 
		Multi BridgeLabz = new Multi();	 
		System.out.println("Employee wages of BridgeLabz :");
			//calling method
			 BridgeLabz.wages();
		 


	}

}
