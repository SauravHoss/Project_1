
public class DSunLib 
{
	//sumUpTo adds all numbers up to given value- done
		public static void sumUpTo(int x) 
		{int y=0;
			for (int i=1; i<=x; i++) 
			{
				y=y+i;
			}
			System.out.print(y);
		}

	//isPalindrome checks if string same backwards and forwards
		public static void isPalindrome(String str)
		{
			String g = "";
			for (int i = str.length()-1; i >= 0; i--) 
			{
				g += str.charAt(i);
			}
			System.out.print(str.equals(g));
		}
}