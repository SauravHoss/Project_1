
public class SHossainLib 
{
	public static void main(String [] args)
	{	//works_factorializer(10);
		//works_sumUpTo(9);
		//works?_linearSolver(3,3,35);
		//works_dateStr("01/15/2000");
		//no work_isPalindrome("rawer");
		//work_multiplicationTable(3,20);
	}

	//Stwing Stuff
	//isPalindrome checks if word same backwards and front
	public static void isPalindrome(String str)
	{
		if (str.length() % 2 == 0) 
		{
			if (str.substring(0,1) == str.substring(str.length ())); 
				{
					System.out.print("True");
				}
		}
		if (str.length() % 2 != 0) 
		{
			
		}
	}
	
	//dateStr date put in mm/dd/yyyy comes out dd-mm-yy- done
 	public static void dateStr(String str) 
	{
 		String Day = str.substring(3,5);
 		String Month = str.substring(0,2);
 		String Year = str.substring(6);
 		String formatted = Day + "-" + Month + "-" + Year;
 			{
 				System.out.println(formatted);
 			}	
	} 
	
	
	//cutOut put in 2 strings subStr and mainStr, first instance of subStr in mainStr is cut out 
	
	
	
	//vigCipher ???
	
	
	
	//Meth
	//isFibonnaci returns true if fibonnaci sequence is true
	public static void isFibonnaci(int x) 
	{ 
		
	
	 
	}
	
	
	//multiplicationTable given base and range does base*n for all n integers from 0- done
	public static void multiplicationTable( int base, int range) 
	{
		for (int i=1; i<=range; i++) 
		{
			int prod = base * i;
			String printthis =( "" + base + " * " + "" + i + " = " + prod);
			System.out.println(printthis);
		}
		
	}
	
	
	//sumUpTo adds all numbers up to given value- done
	public static void sumUpTo(int x) 
	{int y=0;
		for (int i=1; i<=x; i++) 
		{
			y=y+i;
		}
		System.out.print(y);
	}

	
	//factorializer does factorials up to given value- done
	public static void factorializer(int x) 
	{int y=1;
		for (int i=1; i<=x; i++) 
		{
			y=y*i;
		}
		System.out.print(y);
	}
	
	
	//linear Solver y=mx+b?- done?
	public static void linearSolver(int m, double x, int b) 
	{
		Double y = m*x + b;
		System.out.print(y);
	}
}