import java.util.*;
class Patterns {
	public static void pattern275(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i==4 || j==4 || 
					(j==1 && i<=4) || 
					(i==1 && j>=4) || 
					(i==7 && j<=4) ||
					(j==n && i>=4))	
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern274(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if((i-1) % 3 == 0 || (j-1) % 3 == 0)	
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern273(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= (2*n)-1; j++)
			{
				if(i==j || (2*n)-j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern272(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern271(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || (i+j) == (n+1) || i == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern270(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j == 1 || (i+j) == (n+1) || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern269(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || (i+j) == (n+1) || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern268(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || i == j || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern267(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = i; j >= 1; j--)
			{
				if(i == n || j == i || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern266(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == n || j == i || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern265(int n) {
		for(int i = 1; i <= n; i++) {
        		for(int k = 1; k <= n; k++) {
            			for(int j = 1; j <= n; j++) {
                			if((i + j) % 2 == 0) {
                    				for (int l = 1; l <= n; l++) {
                        				System.out.print("*");
                    				}
                			} else {
                    				for (int l = 1; l <= n; l++) {
                        				System.out.print(" ");
                    				}
                			}
            			}
            			System.out.println();
        		}
        		System.out.println();
    		}
	}
	public static void pattern264(int n){
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				for(int j = 1; j <= n; j++)
				{
					if(j % 2 == 0) System.out.print("*");
					else System.out.print(" ");
				}
			}
			else 
			{
				for(int j = 1; j <= n; j++)	
				{
					if(j % 2 == 0) System.out.print(" ");
					else System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void pattern263(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || j == 1 || i == n || j == n)	
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void pattern262(int n){
		for(int i = 1; i <= n; i++)
		{
			if(i == 1)
			{	
				for(int j = 1; j <= n; j++)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
				for(int j = n-1; j >= 1; j--)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
			}	
			else
			{
				for(int j = i; j <= n; j++)	
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = n; j >= i; j--)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++)
		{
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
				for(int j = n-1; j >= 1; j--)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
			}
			else
			{
				for(int j = n-i+1; j <= n; j++)	
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}	
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");
				for(int j = n; j >= n-i+1; j--)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
			}
			System.out.println();
		}

	}

	public static void pattern261(int n){
		for(int i = 1; i < n; i++)
		{
			for(int j = 1; j <= i; j++)
			{	
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));	
			}	
				
			for(int j = 1; j <= (2*(n-i))-1; j++)
				System.out.print(" ");
			for(int j = i; j >= 1; j--)
			{	
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));	
			}
			System.out.println();
		}
		for(int i = 1; i <= n; i++)
		{
			if(i == 1)
			{	
				for(int j = 1; j <= n; j++)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
				for(int j = n-1; j >= 1; j--)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
			}	
			else
			{
				for(int j = 1; j <= n-i+1; j++)	
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = n-i+1; j >= 1; j--)
				{	
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));	
				}
			}
			System.out.println();
		}	
	}
	public static void pattern260(int n){
		for(int i = 1; i < n; i++)
		{
			int c = (i % 2 == 0) ? 96 : 64;
			for(int j = i; j >= 1; j--)	
				System.out.print((char)(i+c));	
			for(int j = 1; j <= (2*(n-i))-1; j++)
				System.out.print(" ");
			for(int j = i; j >= 1; j--)
				System.out.print((char)(i+c));
			System.out.println();
		}
		for(int i = 1; i <= n; i++)
		{
			int c = (i % 2 == 0) ? 96 : 64;
			if(i == 1)
			{	
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print((char)((n-i+1)+c));
			}	
			else
			{
				for(int j = i; j <= n; j++)	
					System.out.print((char)((n-i+1)+c));	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print((char)((n-i+1)+c));
			}
			System.out.println();
		}	
	}
	public static void pattern259(int n){
		for(int i = 1; i <= n; i++)
		{
			if(i == 1)
			{	
				for(int j = 1; j <= n; j++)
					System.out.print(n-j+1);
				for(int j = n-1; j >= 1; j--)
					System.out.print(n-j+1);
			}	
			else
			{
				for(int j = n-i+1; j >= 1; j--)	
					System.out.print(j);	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = 1; j <= n-i+1; j++)
					System.out.print(j);
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++)
		{
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
					System.out.print(n-j+1);
				for(int j = n-1; j >= 1; j--)
					System.out.print(n-j+1);
			}
			else
			{
				for(int j = i; j >= 1; j--)	
					System.out.print(j);	
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");
				for(int j = 1; j <= i; j++)
					System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern258(int n){
		for(int i = 1; i < n; i++)
		{
			for(int j = i; j >= 1; j--)	
				System.out.print(j);	
			for(int j = 1; j <= (2*(n-i))-1; j++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		for(int i = 1; i <= n; i++)
		{
			if(i == 1)
			{	
				for(int j = 1; j <= n; j++)
					System.out.print(n-j+1);
				for(int j = n-1; j >= 1; j--)
					System.out.print(n-j+1);
			}	
			else
			{
				for(int j = n-i+1; j >= 1; j--)	
					System.out.print(j);	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = 1; j <= n-i+1; j++)
					System.out.print(j);
			}
			System.out.println();
		}	
	}
	public static void pattern257(int n){
		for(int i = 1; i <= n; i++)
		{
			if(i == 1)
			{	
				for(int j = 1; j <= n; j++)
					System.out.print(j);
				for(int j = n-1; j >= 1; j--)
					System.out.print(j);
			}	
			else
			{
				for(int j = 1; j <= n-i+1; j++)	
					System.out.print(j);	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = n-i+1; j >= 1; j--)
					System.out.print(j);
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++)
		{
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
					System.out.print(j);
				for(int j = n-1; j >= 1; j--)
					System.out.print(j);
			}
			else
			{
				for(int j = 1; j <= i; j++)	
					System.out.print(j);	
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");
				for(int j = i; j >= 1; j--)
					System.out.print(j);
			}
			System.out.println();
		}

	}
	public static void pattern256(int n){
		for(int i = n; i >= 2; i--)
		{
			for(int j = i; j <= n; j++)	
				System.out.print(i);	
			for(int j = 1; j <= (2*i)-3; j++)
				System.out.print(" ");
			for(int j = i; j <= n; j++)
				System.out.print(i);
			System.out.println();
		}
		for(int i = 1; i <= n; i++)
		{
			if(i == 1)
			{	
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print(1);
			}	
			else
			{
				for(int j = i; j <= n; j++)	
					System.out.print(i);	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print(i);
			}
			System.out.println();
		}

		
	}
	public static void pattern255(int n){
		for(int i = 1; i <= n; i++)
		{
			if(i == 1)
			{	
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print(1);
			}	
			else
			{
				for(int j = i; j <= n; j++)	
					System.out.print(i);	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print(i);
			}
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--)
		{
			if(i == 1)
			{	
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print(1);
			}	
			else
			{
				for(int j = i; j <= n; j++)	
					System.out.print(i);	
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern254(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = n-1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}	
			else
			{
				for(int j = n-i+1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = n; j >= n-i+1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();		
		}
	}
	public static void pattern253(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)((n-j+1)+c));
				}
				for(int j = n-1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)((n-j+1)+c));
				}
			}	
			else
			{
				for(int j = n; j >= n-i+1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = n-i+1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();		
		}
	}
	public static void pattern252(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)((n-j+1)+c));
				}
				for(int j = n-1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)((n-j+1)+c));
				}
			}	
			else
			{
				for(int j = i; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = 1; j <= i; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();		
		}
	}
	public static void pattern251(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = n-1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}	
			else
			{
				for(int j = 1; j <= i; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = i; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();		
		}
	}
	public static void pattern250(int n){
		for(int i = 1; i <= n; i++)
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i == n)
			{
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print((char)((n-i+1)+c));
			}	
			else
			{
				for(int j = 1; j <= i; j++)
					System.out.print((char)((n-i+1)+c));
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = 1; j <= i; j++)
					System.out.print((char)((n-i+1)+c));
			}
			System.out.println();		
		}
	}
	public static void pattern249(int n){
		for(int i = 1; i <= n; i++)
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i == n)
			{
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print((char)(i+c));
			}	
			else
			{
				for(int j = 1; j <= i; j++)
					System.out.print((char)(i+c));
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = 1; j <= i; j++)
					System.out.print((char)(i+c));
			}
			System.out.println();		
		}
	}
	public static void pattern248(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
					System.out.print(j);
				for(int j = n-1; j >= 1; j--)
					System.out.print(j);
			}	
			else
			{
				for(int j = n-i+1; j <= n; j++)
					System.out.print(j);
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = n; j >= n-i+1; j--)
					System.out.print(j);
			}
			System.out.println();		
		}
	}
	public static void pattern247(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
					System.out.print(n-j+1);
				for(int j = n-1; j >= 1; j--)
					System.out.print(n-j+1);
			}	
			else
			{
				for(int j = n; j >= n-i+1; j--)
					System.out.print(j);
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = n-i+1; j <= n; j++)
					System.out.print(j);
			}
			System.out.println();		
		}
	}
	public static void pattern246(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
					System.out.print(n-j+1);
				for(int j = n-1; j >= 1; j--)
					System.out.print(n-j+1);
			}	
			else
			{
				for(int j = i; j >= 1; j--)
					System.out.print(j);
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = 1; j <= i; j++)
					System.out.print(j);
			}
			System.out.println();		
		}
	}
	public static void pattern245(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= n; j++)
					System.out.print(j);
				for(int j = n-1; j >= 1; j--)
					System.out.print(j);
			}	
			else
			{
				for(int j = 1; j <= i; j++)
					System.out.print(j);
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = i; j >= 1; j--)
					System.out.print(j);
			}
			System.out.println();		
		}
	}
	public static void pattern244(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print(n-i+1);
			}	
			else	
			{
				for(int j = i; j >= 1; j--)
					System.out.print(n-i+1);
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = i; j >= 1; j--)
					System.out.print(n-i+1);
			}
			System.out.println();		
		}
	}
	public static void pattern243(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == n)
			{
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print(i);
			}	
			else	
			{
				for(int j = i; j >= 1; j--)
					System.out.print(i);
				for(int j = 1; j <= (2*(n-i))-1; j++)
					System.out.print(" ");	
				for(int j = i; j >= 1; j--)
					System.out.print(i);
			}
			System.out.println();		
		}
	}
	public static void pattern242(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = n; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 2; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}	
			else	
			{
				for(int j = n-i+1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = 1; j <= n-i+1; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();		
		}
	}
	public static void pattern241(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = n; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 2; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}	
			else	
			{
				for(int j = n; j >= i; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = i; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();		
		}
	}
	public static void pattern240(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = 1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = n-1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}	
			else	
			{
				for(int j = i; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = n; j >= i; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();		
		}
	}
	public static void pattern239(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = 1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = n-1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}	
			else	
			{
				for(int j = 1; j <= n-i+1; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = n-i+1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();		
		}
	}
	public static void pattern238(int n){
		for(int i = 1; i <= n; i++)
		{	
			int c = ((n-i+1) % 2 == 0) ? 96 : 64;
			if(i == 1)
			{
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print((char)((n-i+1)+c));
			}	
			else	
			{
				for(int j = i; j <= n; j++)
					System.out.print((char)((n-i+1)+c));
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = i; j <= n; j++)
					System.out.print((char)((n-i+1)+c));
			}
			System.out.println();		
		}
	}
	public static void pattern237(int n){
		for(int i = 1; i <= n; i++)
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i == 1)
			{
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print((char)(i+c));
			}	
			else	
			{
				for(int j = i; j <= n; j++)
					System.out.print((char)(i+c));
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = i; j <= n; j++)
					System.out.print((char)(i+c));
			}
			System.out.println();		
		}
	}
	public static void pattern236(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = n; j >= 1; j--)
					System.out.print(j);
				for(int j = 2; j <= n; j++)
					System.out.print(j);
			}	
			else	
			{
				for(int j = n-i+1; j >= 1; j--)
					System.out.print(j);
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = 1; j <= n-i+1; j++)
					System.out.print(j);
			}
			System.out.println();		
		}
	}
	public static void pattern235(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = n; j >= 1; j--)
					System.out.print(j);
				for(int j = 2; j <= n; j++)
					System.out.print(j);
			}	
			else	
			{
				for(int j = n; j >= i; j--)
					System.out.print(j);
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = i; j <= n; j++)
					System.out.print(j);
			}
			System.out.println();		
		}
	}
	public static void pattern234(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = 1; j <= n; j++)
					System.out.print(j);
				for(int j = n-1; j >= 1; j--)
					System.out.print(j);
			}	
			else	
			{
				for(int j = i; j <= n; j++)
					System.out.print(j);
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = n; j >= i; j--)
					System.out.print(j);
			}
			System.out.println();		
		}
	}
	public static void pattern233(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = 1; j <= n; j++)
					System.out.print(j);
				for(int j = n-1; j >= 1; j--)
					System.out.print(j);
			}	
			else	
			{
				for(int j = 1; j <= n-i+1; j++)
					System.out.print(j);
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = n-i+1; j >= 1; j--)
					System.out.print(j);
			}
			System.out.println();		
		}
	}
	public static void pattern232(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print(n-i+1);
			}	
			else	
			{
				for(int j = i; j <= n; j++)
					System.out.print(n-i+1);
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = i; j <= n; j++)
					System.out.print(n-i+1);
			}
			System.out.println();		
		}
	}
	public static void pattern231(int n){
		for(int i = 1; i <= n; i++)
		{	
			if(i == 1)
			{
				for(int j = 1; j <= (2*n)-1; j++)
					System.out.print(i);
			}	
			else	
			{
				for(int j = i; j <= n; j++)
					System.out.print(i);
				for(int j = 1; j <= (2*i)-3; j++)
					System.out.print(" ");	
				for(int j = i; j <= n; j++)
					System.out.print(i);
			}
			System.out.println();		
		}
	}
	public static void pattern230(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = n; j >= i; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = i+1; j <= n; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = n; j >= i; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = i+1; j <= n; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
	}
	public static void pattern229(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = i; j <= n; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = 4; j >= i; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = i; j <= n; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = 4; j >= i; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
	}
	public static void pattern228(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = i-1; j >= 1; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = 1; j <= n-i+1; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = n-i; j >= 1; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
	}
	public static void pattern227(int n){
		for(int i = n; i >= 1; i--)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print((char)((n-i+1)+c));
			System.out.println();
		}
		for(int i = 2; i <= n; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print((char)((n-i+1)+c));	
			System.out.println();
		}
	}
	public static void pattern226(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = n-i+1; j >= 1; j--)
				System.out.print(j);	
			for(int j = 2; j <= n-i+1; j++)
				System.out.print(j);
			System.out.println();
		}
		for(int i = 2; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = i; j >= 1; j--)
				System.out.print(j);	
			for(int j = 2; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern225(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = i; j <= n; j++)
				System.out.print(j);	
			for(int j = 4; j >= i; j--)
				System.out.print(j);
			System.out.println();
		}
		for(int i = 2; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = n-i+1; j <= n; j++)
				System.out.print(j);	
			for(int j = 4; j >= n-i+1; j--)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern224(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)
				System.out.print(j);	
			for(int j = i-1; j >= 1; j--)
				System.out.print(j);
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)
				System.out.print(j);	
			for(int j = i-1; j >= 1; j--)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern223_r(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print(i);	
			System.out.println();
		}
		for(int i = 2; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print(i);	
			System.out.println();
		}
	}
	public static void pattern222(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print(i);	
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
			{
				System.out.print(i);	
			}
			System.out.println();
		}
	}
	public static void pattern221(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}
	public static void pattern220(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = n; j >= i; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;	
				System.out.print((char)(j+c));	
			}
			for(int j = i+1; j <= n; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;	
				System.out.print((char)(j+c));	
			} 
			System.out.println();
		}
	}
	public static void pattern219(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;	
				System.out.print((char)(j+c));	
			}
			for(int j = i-1; j >= 1; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;	
				System.out.print((char)(j+c));	
			} 
			System.out.println();
		}
	}
	public static void pattern218(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = n-i+1; j <= n; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;	
				System.out.print((char)(j+c));	
			}
			for(int j = 4; j >= n-i+1; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;	
				System.out.print((char)(j+c));	
			} 
			System.out.println();
		}
	}
	public static void pattern217(int n){
		for(int i = n; i >= 1; i--)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print((char)(i+c));
			System.out.println();
		}
	}
	public static void pattern216(int n){
		for(int i = n; i >= 1; i--)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print((char)((n-i+1)+c));
			System.out.println();
		}
	}
	public static void pattern215(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = n-i+1; j >= 1; j--)
				System.out.print(j);
			for(int j = 2; j <= n-i+1; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern214(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = n; j >= i; j--)
				System.out.print(j);
			for(int j = i+1; j <= n; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern213(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = i; j <= n; j++)
				System.out.print(j);
			for(int j = 4; j >= i; j--)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern212(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j > 1; j--)
				System.out.print(" ");
			for(int j = 1; j <= n-i+1; j++)
				System.out.print(j);
			for(int j = n-i; j >= 1; j--)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern211(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern210(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
			{
				System.out.print(n-i+1);
			}
			System.out.println();
		}
	}
	public static void pattern209(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern208(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = n; j >= n-i+1; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = n-i+2; j <= n; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
	}
	public static void pattern207(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = i; j >= 1; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = 2; j <= i; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
	}
	public static void pattern206(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			for(int j = i-1; j >= 1; j--)
			{
				int c = (j % 2 == 0) ? 96 : 64;
				System.out.print((char)(j+c));
			}
			System.out.println();
		}
	}
	public static void pattern205(int n){
		for(int i = 1; i <= n; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = i; j <= (2*i)-1; j++)
				System.out.print((char)((n-i+1)+c));
			for(int j = i; j > 1; j--)
				System.out.print((char)((n-i+1)+c));
			System.out.println();
		}
	}
	public static void pattern204(int n){
		for(int i = 1; i <= n; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = i; j <= (2*i)-1; j++)
				System.out.print((char)(i+c));
			for(int j = i; j > 1; j--)
				System.out.print((char)(i+c));
			System.out.println();
		}
	}
	public static void pattern203(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = n-i+1; j <= n; j++)
				System.out.print(j);
			for(int j = 4; j >= n-i+1; j--)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern202(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = n; j >= n-i+1; j--)
				System.out.print(j);
			for(int j = n-i+2; j <= n; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern201(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = i; j >= 1; j--)
				System.out.print(j);
			for(int j = 2; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern200(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= i; j++)
				System.out.print(j);
			for(int j = i-1; j >= 1; j--)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void pattern199(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print(n-i+1);
			System.out.println();
		}
	}
	public static void pattern198(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print(n-i+1);
			System.out.println();
		}
	}
	public static void pattern197(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print(i);
			System.out.println();
		}
	}
	public static void pattern196(int n){
		for(int i = 1; i <= n; i++)
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
			{
				if(j % 2 == 0) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern195(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for(int j = 1; j <= (2*i)-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void pattern194(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
					
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = (2*n)-i; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}				
			}
			System.out.println();
		}
	}
	public static void pattern193(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = n; j >= i; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
					
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = n; j >= (2*n)-i; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}				
			}
			System.out.println();
		}
	}
	public static void pattern192(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = n-i+1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
					
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = i-n+1; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}				
			}
			System.out.println();
		}
	}
	public static void pattern191(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = 1; j <= n-i+1; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
					
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = 1; j <= i-n+1; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}				
			}
			System.out.println();
		}
	}
	public static void pattern190(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print((char)(i+c));
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = i; j >= n; j--)
					System.out.print((char)((2*n-i)+c));
			}
			System.out.println();
		}
	}
	public static void pattern189(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print((char)((n-i+1)+c));
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = i; j >= n; j--)
					System.out.print((char)((i-n+1)+c));
			}
			System.out.println();
		}
	}
	public static void pattern188(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = (2*n)-i; j <= n; j++)
					System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern187(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = n-i+1; j >= 1; j--)
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = i-n+1; j >= 1; j--)
					System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern186(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = n; j >= i; j--)
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = n; j >= (2*n)-i; j--)
					System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern185(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = 1; j <= n-i+1; j++)
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = 1; j <= i-n+1; j++)
					System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern184(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print(i);
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = i; j >= n; j--)
					System.out.print((2*n)-i);
			}
			System.out.println();
		}
	}
	public static void pattern183(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = i; j <= n; j++)
					System.out.print(n-i+1);
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = i; j >= n; j--)
					System.out.print(i-n+1);
			}
			System.out.println();
		}
	}
	public static void pattern182(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = n-i+1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}
					
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = i-n+1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}		
			}
			System.out.println();
		}
	}
	public static void pattern181(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = n; j >= n-i+1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}
					
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = n; j >= i-n+1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}		
			}
			System.out.println();
		}
	}
	public static void pattern180(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = i; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}
					
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = (2*n)-i; j >= 1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}		
			}
			System.out.println();
		}
	}	
	public static void pattern179(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = 1; j <= i; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}
					
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = 1; j <= (2*n)-i; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}		
			}
			System.out.println();
		}
	}
	public static void pattern178(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = i; j >= 1; j--)	
					System.out.print((char)((n-i+1)+c));
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = i; j <= (2*n)-1; j++)	
					System.out.print((char)((i-n+1)+c));			
			}
			System.out.println();
		}
	}
	public static void pattern177(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = i; j >= 1; j--)	
					System.out.print((char)(i+c));
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = i; j <= (2*n)-1; j++)	
					System.out.print((char)((2*n-i)+c));			
			}
			System.out.println();
		}
	}
	public static void pattern176(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = n-i+1; j <= n; j++)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = i-n+1; j <= n; j++)	
					System.out.print(j);			
			}
			System.out.println();
		}
	}
	public static void pattern175(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = n; j >= n-i+1; j--)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = n; j >= i-n+1; j--)	
					System.out.print(j);			
			}
			System.out.println();
		}
	}
	public static void pattern174(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = i; j >= 1; j--)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = (2*n)-i; j >= 1; j--)	
					System.out.print(j);			
			}
			System.out.println();
		}
	}
	public static void pattern173(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = 1; j <= i; j++)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = 1; j <= (2*n)-i; j++)	
					System.out.print(j);			
			}
			System.out.println();
		}
	}
	public static void pattern172(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = i; j >= 1; j--)	
					System.out.print(n-i+1);
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = i; j <= (2*n)-1; j++)	
					System.out.print(i-n+1);			
			}
			System.out.println();
		}
	}
	public static void pattern171(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = i; j >= 1; j--)	
					System.out.print(i);
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = i; j <= (2*n)-1; j++)	
					System.out.print((2*n)-i);			
			}
			System.out.println();
		}
	}
	public static void pattern170(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j > 1; j--)
					System.out.print(" ");
				for(int j = i; j <= n; j++)	
					System.out.print("*");
			} 
			else 
			{
				for(int j = i; j < (2*n)-1; j++)
					System.out.print(" ");
				for(int j = i; j >= n; j--)	
					System.out.print("*");			
			}
			System.out.println();
		}
	}
	public static void pattern169(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j < n; j++)
					System.out.print(" ");
				for(int j = i; j >= 1; j--)	
					System.out.print("*");
			} 
			else 
			{
				for(int j = i; j > n; j--)
					System.out.print(" ");
				for(int j = i; j <= (2*n)-1; j++)	
					System.out.print("*");			
			}
			System.out.println();
		}
	}
	public static void pattern168(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j <= n; j++)	
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}
			} 
			else 
			{
				for(int j = i; j >= n; j--)	
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)((2*n-j)+c));
				}			
			}
			System.out.println();
		}
	}
	public static void pattern167(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = n; j >= i; j--)	
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}
			} 
			else 
			{
				for(int j = n; j <= i; j++)	
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)((2*n-j)+c));
				}			
			}
			System.out.println();
		}
	}
	public static void pattern166(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j <= n; j++)	
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)((n-j+1)+c));
				}
			} 
			else 
			{
				for(int j = i; j >= n; j--)	
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)((j-n+1)+c));
				}			
			}
			System.out.println();
		}
	}
	public static void pattern165(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = 1; j <= n-i+1; j++)	
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)(j+c));
				}
			} 
			else 
			{
				for(int j = n; j <= i; j++)	
				{
					int c = (j % 2 == 0) ? 96 : 64;	
					System.out.print((char)((j-n+1)+c));
				}			
			}
			System.out.println();
		}
	}
	public static void pattern164(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i <= n)
			{
				for(int j = i; j <= n; j++)	
					System.out.print((char)((n-i+1)+c));
			} 
			else 
			{
				for(int j = i; j >= n; j--)
					System.out.print((char)((i-n+1)+c));
			}
			System.out.println();
		}
	}
	public static void pattern163(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j <= n; j++)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j >= n; j--)
					System.out.print((2*n)-j);
			}
			System.out.println();
		}
	}
	public static void pattern162(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = n; j >= i; j--)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = n; j <= i; j++)
					System.out.print((2*n)-j);
			}
			System.out.println();
		}
	}	
	public static void pattern161(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = 1; j <= n-i+1; j++)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = n; j <= i; j++)
					System.out.print(j-n+1);
			}
			System.out.println();
		}
	}
	public static void pattern160(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j <= n; j++)	
					System.out.print(n-j+1);
			} 
			else 
			{
				for(int j = i; j >= n; j--)
					System.out.print(j-n+1);
			}
			System.out.println();
		}
	}
	public static void pattern159(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j <= n; j++)	
					System.out.print(n-i+1);
			} 
			else 
			{
				for(int j = i; j >= n; j--)
					System.out.print(i-n+1);
			}
			System.out.println();
		}
	}
	public static void pattern158(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j <= n; j++)	
					System.out.print("*");
			} 
			else 
			{
				for(int j = n; j <= i; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern157(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = n-i+1; j <= n; j++)	
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			} 
			else 
			{
				for(int j = i-n+1; j <= n; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();
		}
	}
	public static void pattern156(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = n; j >= n-i+1; j--)	
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			} 
			else 
			{
				for(int j = n; j >= i-n+1; j--)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();
		}
	}
	public static void pattern155(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j >= 1; j--)	
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			} 
			else 
			{
				for(int j = i; j <= (2*n)-1; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)((2*n-j)+c));
				}
			}
			System.out.println();
		}
	}
	public static void pattern154(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = 1; j <= i; j++)	
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			} 
			else 
			{
				for(int j = 1; j <= (2*n)-i; j++)
				{
					int c = (j % 2 == 0) ? 96 : 64;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();
		}
	}
	public static void pattern153(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			int c = (i % 2 == 0) ? 96 : 64;
			if(i <= n)
			{
				for(int j = i; j >= 1; j--)	
					System.out.print((char)(i+c));
			} 
			else 
			{
				for(int j = i; j <= (2*n)-1; j++)
					System.out.print((char)((2*n-i)+c));
			}
			System.out.println();
		}
	}
	public static void pattern152(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = n-i+1; j <= n; j++)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = i-n+1; j <= n; j++)
					System.out.print(j);
			}
			System.out.println();
		}
	}	
	public static void pattern151(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = n; j >= n-i+1; j--)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = n; j >= i-n+1; j--)
					System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern150(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = 1; j <= i; j++)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j <= (2*n)-1; j++)
					System.out.print(j-i+1);
			}
			System.out.println();
		}
	}
	public static void pattern149(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j >= 1; j--)	
					System.out.print(j);
			} 
			else 
			{
				for(int j = i; j <= (2*n)-1; j++)
					System.out.print((2*n)-j);
			}
			System.out.println();
		}
	}
	public static void pattern148(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j >= 1; j--)	
					System.out.print(i);
			} 
			else 
			{
				for(int j = i; j <= (2*n)-1; j++)
					System.out.print((2*n)-i);
			}
			System.out.println();
		}
	}		
	public static void pattern147(int n){
		for(int i = 1; i <= (2*n)-1; i++)	
		{	
			if(i <= n)
			{
				for(int j = i; j >= 1; j--)	
					System.out.print("*");
			} 
			else 
			{
				for(int j = i; j <= (2*n)-1; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}	
	public static void pattern146(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = 1; j <= n; j++)	
			{
				if(i <= j) System.out.print(j);
				else System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern145(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = 1; j <= n; j++)	
			{
				if(j <= i) System.out.print(i);
				else System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern144(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = n; j >= 1; j--)	
			{
				if(j >= i) System.out.print(j);
				else System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern143(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = n; j >= 1; j--)	
			{
				if(j >= i) System.out.print(j);
				else System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern142(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = n; j >= 1; j--)	
			{
				if(j >= i) System.out.print(i);
				else System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern141(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = 1; j <= n; j++)	
			{
				if(j <= (n-i+1)) System.out.print(i);
				else System.out.print(n-j+1);
			}
			System.out.println();
		}
	}
	public static void pattern140(int n){
		for(int i = 1; i <= n; i++)	
		{	
			for(int j = 1; j <= n; j++)	
			{
				if(j <= i) System.out.print(j);
				else System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern139(int n){
		for(int i = n; i >= 1; i--)	
		{	
			for(int j = 1; j <= n; j++)	
			{
				if(i > j) System.out.print(j);
				else System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern138(int n){
		int count1 = n;
		int count2 = n;
		for(int i = 1; i <= n; i++)
		{
			int c1 = count1;
			int c2 = count2;
			for(int j = n; j >= i; j--)
			{
				System.out.print((char)(c1+64) + "" + 
						(char)(c2+64) + "\t");
				c1--;
				c2+=(j-1);
			}	
			System.out.println();
			count1+=(n-i);
			count2--;
		}
	}
	public static void pattern137(int n){
		int count1 = n;
		int count2 = 1;
		for(int i = n; i >= 1; i--)
		{
			int c1 = count1;
			int c2 = count2;
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char)(c1+64) + "" + 
						(char)(c2+96) + "\t");
				c1--;
				c2+=(n-j+1);
			}	
			System.out.println();
			count1+=(i-1);
			count2+=(n-i+2);
		}
	}

	public static void pattern136(int n){
		int count1 = (n*(n+1))/2;
		int count2 = 1;
		for(int i = n; i >= 1; i--)
		{
			int c1 = count1;
			int c2 = count2;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(c1+64) + "" + 
						(char)(c2+96) + "\t");
				c1+=j;
				c2--;
			}	
			System.out.println();
			count1-=i;
			count2+=(n-i+2);
		}
	}
	public static void pattern135(int n){
		int count1 = n;
		int count2 = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)
		{
			int c1 = count1;
			int c2 = count2;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(c1+64) + "" + 
						(char)(c2+64) + "\t");
				c1-=(j+1);
				c2+=j;
			}	
			System.out.println();
			count1+=(i-1);
			count2-=i;
		}
	}
	public static void pattern134(int n){
		int count1 = (n*(n+1))/2;
		int count2 = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c1 = count1;
			int c2 = count2;
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(c1+64) + "" + 
						(char)(c2+64) + "\t");
				c1-=j;
				c2-=(n-j+i);
			}	
			System.out.println();
			count1-=(i+1);
			count2--;
		}
	}
	public static void pattern133(int n){
		int count1 = 1;
		int count2 = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)
		{
			int c1 = count1;
			int c2 = count2;
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			} 
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char)(c1+64) + "" + 
						(char)(c2+64) + "\t");
				c1+=(j+(n-i));
				c2-=(n-j+2);
			}	
			System.out.println();
			count1++;
			count2-=(n-i+1);
		}
	}
	public static void pattern132(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();	
			count+=(i+1);	
		}	
	}
	public static void pattern131(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(c+64));
				c+=(j+1);
			}
			System.out.println();	
			count+=i;	
		}	
	}
	public static void pattern130(int n){
		int count = ((n*(n+1))/2);
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();	
			count-=(i+1);	
		}	
	}
	public static void pattern129(int n){
		int count = ((n*(n+1))/2);
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(c+64));
				c-=(j+1);
			}
			System.out.println();	
			count-=i;	
		}	
	}
	public static void pattern128(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print((char)(c+64));
				c-=(j-1);
			}
			System.out.println();	
			count++;	
		}	
	}

	public static void pattern127(int n){
		int count = ((n*(n+1))/2);
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();	
			count--;	
		}	
	}
	public static void pattern126(int n){
		int count = n;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print((char)(c+64));
				c+=(j-1);
			}
			System.out.println();	
			count--;	
		}	
	}
	public static void pattern125(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();	
			count++;	
		}	
	}
	public static void pattern124(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print((char)(c+64));
				c++;
			}
			System.out.println();	
			count-=(i-1);	
		}	
	}
	public static void pattern123(int n){
		int count = n;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print((char)(c+64));
				c--;
			}
			System.out.println();	
			count+=(i-1);	
		}	
	}
	public static void pattern122(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)	
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print((char)(count+64));
				count--;
			}
			System.out.println();		
		}	
	}	
	public static void pattern121(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)	
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print((char)(count+64));
				count++;
			}
			System.out.println();		
		}	
	}

	public static void pattern120(int n){
		int count = ((n*(n+1))/2);
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			count-=i;
		}
	}
	public static void pattern119(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(c+64));
				c+=(j+1);
			}
			System.out.println();
			count-=(i-1);
		}
	}	
	public static void pattern118(int n){
		int count = n;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(c+64));
				c-=(j+1);
			}
			System.out.println();
			count+=(i-1);
		}
	}
	public static void pattern117(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count+=i;
		}
	}
	public static void pattern116(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count++;
		}
	}

	public static void pattern115(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print((char)(c+64));
				c-=(j-1);
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern114(int n){
		int count = n;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern113(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print((char)(c+64));
				c+=(j-1);
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern112(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print((char)(c+64));
				c++;
			}
			System.out.println();
			count-=(i+1);
		}
	}
	public static void pattern111(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print((char)(c+64));
				c--;
			}
			System.out.println();
			count+=(i+1);
		}
	}
	public static void pattern110(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(count+64));
				count--;
			}
			System.out.println();
		}
	}
	public static void pattern109(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print((char)(count+64));
				count++;
			}
			System.out.println();
		}
	}
	public static void pattern108(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print(c + "\t");
				c-=j;
			}
			System.out.println();
			count-=(i+1);
		}
	}
	public static void pattern107(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print(c + "\t");
				c-=(j+1);
			}
			System.out.println();
			count-=i;
		}
	}
	public static void pattern106(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print(c + "\t");
				c+=(j+1);
			}
			System.out.println();
			count+=i;
		}
	}
	public static void pattern105(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print(c + "\t");
				c+=j;
			}
			System.out.println();
			count+=(i+1);
		}
	}
	public static void pattern104(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print(c + "\t");
				c-=j;
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern103(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print(c + "\t");
				c-=(j-1);
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern102(int n){
		int count = n;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print(c + "\t");
				c+=(j-1);
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern101(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print(c + "\t");
				c+=j;
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern100(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			}	
			for(int j = 1; j <= i; j++)
			{	
				System.out.print(c + "\t");
				c++;
			}
			System.out.println();
			count -= (i-1);
		}
	}

	public static void pattern99(int n){
		int count = n;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			}	
			for(int j = 1; j <= i; j++)
			{	
				System.out.print(c + "\t");
				c--;
			}
			System.out.println();
			count += (i-1);
		}
	}

	public static void pattern98(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)	
		{
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			}	
			for(int j = 1; j <= i; j++)
			{	
				System.out.print(count + "\t");
				count--;
			}
			System.out.println();
		}
	}
	public static void pattern97(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)	
		{
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			}	
			for(int j = 1; j <= i; j++)
			{	
				System.out.print(count + "\t");
				count++;
			}
			System.out.println();
		}
	}
	public static void pattern96(int n){
		int count = n;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print(c + "\t");
				c-=(j+1);
			}
			System.out.println();
			count+=(i-1);
		}
	}
	public static void pattern95(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print(c + "\t");
				c-=j;
			}
			System.out.println();
			count+=i;
		}
	}
	public static void pattern94(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print(c + "\t");
				c+=j;
			}
			System.out.println();
			count-=i;
		}
	}
	public static void pattern93(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = i; j <= n; j++)
			{	
				System.out.print(c + "\t");
				c+=(j+1);
			}
			System.out.println();
			count-=(i-1);
		}
	}
	public static void pattern92(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print(c + "\t");
				c-=(j-1);
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern91(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print(c + "\t");
				c-=j;
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern90(int n){
		int count = n;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print(c + "\t");
				c+=j;
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern89(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = i; j > 1; j--)
			{
				System.out.print("\t");
			}	
			for(int j = n; j >= i; j--)
			{	
				System.out.print(c + "\t");
				c+=(j-1);
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern88(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;	
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print(c + "\t");
				c++;
			}
			System.out.println();
			count -= (i+1);
		}
	}
	public static void pattern87(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;	
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print(c + "\t");
				c--;
			}
			System.out.println();
			count += (i+1);
		}
	}
	public static void pattern86(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;	
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print(c + "\t");
				c--;
			}
			System.out.println();
			count -= i;
		}
	}
	public static void pattern85(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;	
			for(int j = i; j < n; j++)
			{
				System.out.print("\t");
			}	
			for(int j = i; j >= 1; j--)
			{	
				System.out.print(c + "\t");
				c++;
			}
			System.out.println();
			count += i;
		}
	}
	public static void pattern84(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print(c + "\t");
				c-=j;
			}
			System.out.println();	
			count-=(i+1);
		}
	}
	public static void pattern83(int n){
		int count = 5;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j >= 1; j--)
			{
				System.out.print(c + "\t");
				c--;
			}
			System.out.println();	
			count+=(i-1);
		}
	}
	public static void pattern82(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print(c + "\t");
				c+=j;
			}
			System.out.println();	
			count+=(i+1);
		}
	}
	public static void pattern81(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j <= n; j++)
			{
				System.out.print(count++ + "\t");
			}
			System.out.println();
		}
	}
	public static void pattern80(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print(c + "\t");
				c-=(j+1);
			}
			System.out.println();	
			count-=i;
		}
	}
	public static void pattern79(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print(c + "\t");
				c+=(j+1);
			}
			System.out.println();	
			count+=i;
		}
	}
	public static void pattern78(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(c + "\t");
				c--;
			}
			System.out.println();	
			count-=i;
		}
	}
	public static void pattern77(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print(c + "\t");
				c+=j;
			}
			System.out.println();	
			count++;
		}
	}
	public static void pattern76(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print(c + "\t");
				c-=(j-1);
			}
			System.out.println();	
			count++;
		}
	}
	public static void pattern75(int n){
		int count = ((n*(n-1))/2)+1;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(c + "\t");
				c++;
			}
			System.out.println();	
			count-=(i-1);
		}
	}
	public static void pattern74(int n){
		int count = n;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print(c + "\t");
				c += (j-1);
			}
			System.out.println();	
			count--;
		}
	}

	public static void pattern73(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print(c + "\t");
				c -= j;
			}
			System.out.println();	
			count--;
		}
	}
//-----------------------------------------------------------
	public static void pattern72(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print(c + "\t");
				c += j;
			}
			System.out.println();	
			count -= i;
		}
	}
	public static void pattern71(int n){
		int count = ((n*(n+1))/2) - (n-1);
		for(int i = n; i >= 1; i--)
		{	
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print(c +"\t");
				c += (j+1);
			}	
			System.out.println();
			count -= (i-1);
		}
	}
	public static void pattern70(int n){
		int count = n;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print(c + "\t");
				c -= (j+1);
			}
			System.out.println();	
			count += (i-1);
		}
	}
	public static void pattern69(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = i; j <= n; j++)
			{
				System.out.print(c + "\t");
				c -= j;	
			}
			System.out.println();	
			count += i;
		}
	}
	public static void pattern68(int n){
		int count = ((n*(n+1))/2) - (n-1);
		for(int i = n; i >= 1; i--)	
		{
			int c = count;	
			for(int j = n; j >= i; j--)
			{
				System.out.print(c + "\t");
				c -= j;
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern67(int n){
		int count = (n*(n+1))/2;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = n; j>= i; j--)
			{
				System.out.print(c + "\t");
				c -= (j-1);
			}
			System.out.println();
			count--;
		}
	}
	public static void pattern66(int n){
		int count = n;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print(c + "\t");	
				c += j;
			}	
			System.out.println();	
			count--;
		}	
	}
	public static void pattern65(int n){
		int count = 1;
		for(int i = n; i >= 1; i--)
		{
			int c = count;
			for(int j = n; j >= i; j--)
			{
				System.out.print(c + "\t");	
				c += (j-1);
			}
			System.out.println();
			count++;
		}
	}
	public static void pattern64(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			int c = count;	
			for(int j = 1; j <= i; j++)
			{
				System.out.print(c + "\t");
				c++;
			}
			System.out.println();
			count -= (i+1);
		}
	}
	public static void pattern63(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)	
		{
			int c = count;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(c + "\t");
				c--;
			}
			System.out.println();	
			count += (i+1);
		}
	}
	public static void pattern62(int n){
		int count = (n*(n+1))/2;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(count + "\t");
				count--;
			}
			System.out.println();
		}
	}
	public static void pattern61(int n){
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)	
			{	
				System.out.print(count + "\t");
				count++;
			}
			System.out.println();
		}
	}

	public static void pattern60(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
	public static void pattern59(int n){
		for(int i = 1; i <= n; i++)
		{	
			for(int j = i; j > 1; j--)
			{	
				System.out.print(" ");
			}
			for(int j = n; j >= i; j--)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
	public static void pattern58(int n){
		for(int i = 1; i <= n; i++)
		{	
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print((char) (j+96));
			}
			System.out.println();
		}
	}
	public static void pattern57(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}	
	}
	public static void pattern56(int n){
		for(int i = n; i >= 1; i--)	
		{
			for(int j = i; j < n; j++)
			{	
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char) (i+96));
			}
			System.out.println();
		}	
	}
	public static void pattern55(int n){
		for(int i = 1; i <= n; i++)
		{	
			for(int j = 1; j < i; j++)	
			{
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
	public static void pattern54(int n){
		for(int i = 1;i <= n; i++)
		{
			for(int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern53(int n){
		for(int i = 1; i <= n; i++)
		{	
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int j = n; j >= i; j--)
			{
				System.out.print(j);
			}
			System.out.println();	
		}	
	}
	public static void pattern52(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");	
			}
			for(int j = i; j >= 1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern51(int n){
		for(int i = n; i >= 1; i--)
		{	
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}	
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern50(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)	
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void pattern49(int n){
		for(int i = 1; i <= n; i++)
		{	
			for(int j = i; j > 1; j--)
			{	
				System.out.print(" ");	
			}	
			for(int j = i; j <= n; j++)
			{
				System.out.print(i);	
			}
			System.out.println();
		}
	}
	public static void pattern48(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j > 1; j--)
			{	
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++)
			{	
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern47(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j < i; j++)
			{	
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print((char) (j+96));
			}
			System.out.println();
		}
	}
	public static void pattern46(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");	
			}
			for(int j = n; j >= i; j--)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}

	public static void pattern45(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char) (j+96));
			}
			System.out.println();
		}	
	}
	public static void pattern44(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");	
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print((char) (j+64));
			}
			System.out.println();
		}
	}
	public static void pattern43(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j > 1; j--)
			{	
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print((char)(i+96));	
			}
			System.out.println();
		}
	}
	public static void pattern42(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print((char) (i+64));
			}
			System.out.println();
		}
	}
	public static void pattern41(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern40(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int j = n; j >= i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern39(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--)	
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern38(int n){
		for(int i = 1; i <= n; i++)	
		{
			for(int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern37(int n){
		for(int i = n; i >= 1; i--)	
		{
			for(int j = 1; j < i; j++)
			{	
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern36(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern35(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{	
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void pattern34(int n){
		for(int i = n; i >= 1;i--)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char) (j+96));
			}
			System.out.println();
		}
	}


	public static void pattern33(int n){
		for(int i = 1; i <= n; i++)
		{	
			for(int j = n; j >= i; j--)
			{
				System.out.print((char) (j+64));
			}
			System.out.println();
		}
	}
	
	public static void pattern32(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j <= n; j++)
			{
				System.out.print((char) (j+96));
			}
			System.out.println();
		}
	}
	
	public static void pattern31(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print((char) (j+64));
			}	
			System.out.println();
		}
	}
	
	public static void pattern30(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print((char) (i+96));
			}
			System.out.println();
		}
	}
	public static void pattern29(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print((char) (i+64));
			}
			System.out.println();
		}	
	}
	
	public static void pattern28(int n){
		for(int i = 1; i <= n; i++)
		{	
			for(int j = n; j >= i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern27(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}	
	}
	
	public static void pattern26(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j <= n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern25(int n){
		for(int i = n; i >= 1; i--)
		{	
			for(int j = 1; j <= i; j++)	
			{	
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern24(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}	
			System.out.println();
		}
	}
	public static void pattern23(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void pattern22(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern21(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j <= n; j++)
			{
				System.out.print((char) (j+96));
			}
			System.out.println();
		}

	}
	public static void pattern20(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print((char) (j+64));
			}
			System.out.println();
		}
	}
	
	public static void pattern19(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char) (j+96));
			}
			System.out.println();
		}	
	}

	public static void pattern18(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print((char) (j+64));
			}
			System.out.println();
		}
	}
	public static void pattern17(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j <= n; j++)
			{
				System.out.print((char) (i+96));
			}
			System.out.println();
		}
	}

	public static void pattern16(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print((char) (i+64));
			}
			System.out.println();
		}
	}
	
	public static void pattern15(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j <= n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern14(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern13(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}	
	}
	
	public static void pattern12(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern11(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j <= n; j++)
			{
				System.out.print(i);
			} 
			System.out.println();
		}
	}
	
	public static void pattern10(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void pattern9(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print("*");
			} 
			System.out.println();
		}
	}

	public static void pattern8(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= 1; j--)
			{
				System.out.print((char) (j+96));			
			}
			System.out.println();
		}
	}

	public static void pattern7(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print((char) (j+96));			
			}	
			System.out.println();
		}
	}
	
	public static void pattern6(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print((char) (i+64));
			}
			System.out.println();
		}
	}

	
	public static void pattern5(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print((char) (i+64));
			}
			System.out.println();
		}
	}

	public static void pattern4(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= 1; j--)
			{
				System.out.print(j);
			}	
			System.out.println();
		}
	}
	
	public static void pattern3(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(j);			
			}
			System.out.println();
		}
	}

	public static void pattern2(int n){
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern1(int n){
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		pattern275(n);
		
	}
}

