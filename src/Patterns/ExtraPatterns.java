import java.util.*;
class ExtraPatterns {
	public static void pattern25(int n){
		int count = n;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)	
			{
				System.out.print((char)(c+64));
				c+=(j-1);
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern24(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)	
			{
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern23(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j >= 1; j--)	
			{
				System.out.print((char)(c+64));
				c++;
			}
			System.out.println();
			count-=(i-1);
		}
	}

	public static void pattern22(int n){
		int count = n;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j >= 1; j--)	
			{
				System.out.print((char)(c+96));
				c--;
			}
			System.out.println();
			count+=(i-1);
		}
	}
	public static void pattern21(int n){
		int count = ((n*(n+1))/2);
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)	
			{
				System.out.print((char)(count+96));
				count--;
			}
			System.out.println();
		}
	}
	public static void pattern20(int n){
		int count = ((n*(n+1))/2);
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)	
			{
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern19(int n){
		int count = ((n*(n+1))/2);
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)	
			{
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern18(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)	
			{
				System.out.print((char)(c+64));
				c-=(j-1);
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern17(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j <= n; j++)	
			{
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count-=(i+1);
		}
	}
	public static void pattern16(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j <= n; j++)	
			{
				System.out.print((char)(c+96));
				c-=(j+1);
			}
			System.out.println();
			count-=i;
		}
	}

	public static void pattern15(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j <= n; j++)	
			{
				System.out.print((char)(c+96));
				c+=j;
			}
			System.out.println();
			count+=(i+1);
		}
	}
	public static void pattern14(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j <= n; j++)	
			{
				System.out.print((char)(c+96));
				c+=(j+1);
			}
			System.out.println();
			count+=i;
		}
	}
	public static void pattern13(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)	
			{
				System.out.print((char)(count+96));
				count++;
			}
			System.out.println();
		}
	}
	public static void pattern12(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j >= 1; j--)	
			{
				System.out.print((char)(c+96));
				c++;
			}
			System.out.println();
			count += i;
		}
	}
	public static void pattern11(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(c+96));
				c+=(j+1);
			}
			System.out.println();
			count-=(i-1);
		}
	}
	public static void pattern10(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c = count;	
			for(int j = i; j >= 1; j--)	
			{
				System.out.print((char)(c+96));
				c++;
			}
			System.out.println();
			count -= (i+1);
		}
	}
	public static void pattern9(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j >= 1; j--)	
			{
				System.out.print((char)(c+96));
				c--;
			}
			System.out.println();
			count+=(i+1);
		}
	}
	public static void pattern8(int n){	
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print((char)(c+96));
				c -= (j-1);
			}
			System.out.println();
			count--;
		}	
	}
	public static void pattern7(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char)(c+64));
				c--;
			}
			System.out.println();
			count-=i;
		}
	}
	public static void pattern6(int n){
		int count = n;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(c+64));	
				c -= (j+1);	
			}	
			System.out.println();
			count += (i-1);
		}
	}
	public static void pattern5(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print((char)(c+96));
				c += (j-1);
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern4(int n){
		int count = n;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print((char)(c+96));
				c+=j;
			}	
			System.out.println();
			count--;
		}
	}
	public static void pattern3(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(c+64));
				c -= j;
			}
			System.out.println();
			count+=i;
		}
	}
	public static void pattern2(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print((char)(c+96));
				c -= j;
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern1(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(c+96));	
				c+=j;
			}	
			System.out.println();
			count-=i;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();	
		pattern25(n);
	}	
}