import java.util.Scanner;

public class FIFO_page 
{
	public static void main(String args[])
	{
			int i,j,k,n,f=0;
			int result[][]=new int[20][20];
			int input[]=new int[20];
			int frame[]=new int[20];
			Scanner scan=new Scanner(System.in);
			int search;
			int hit=0,pointer=0,fault=0;
						
			System.out.println("Enter No. of frames :-\n");
			f=scan.nextInt();
			System.out.println("Enter Total No. inputs\n");
			n=scan.nextInt();			
			System.out.println("Enter Total String input :");
			
			for(i=0;i<n;i++)
			{
				input[i]=scan.nextInt();
			}
			for(i=0;i<f;i++)
			{
				frame[i]=-1;
			}
		
			
			for(i=0;i<n;i++)
			{
				search=-1;
				for(j=0;j<f;j++)
				{
					if(frame[j]==input[i])
					{
						search=j;
						hit++;
						break;
					}
				}	
				if(search==-1)
				{	
					frame[pointer]=input[i];
					pointer++;
					fault++;
					if(f==pointer)
					{
						pointer=0;
					}
				}
				
				for(j=0;j<f;j++)
				{
						result[j][i]=frame[j];
				}
			}	
			
			for(i=0;i<f;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(result[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}
		
			System.out.println("Total Hits :"+hit);
			System.out.println("Total page fault :"+fault);
	}
}
