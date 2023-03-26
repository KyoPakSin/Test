package test1;

public class star_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='*';
		int count=10;
		
		for(int i=0;i<count-1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int z=(count*2)-1;z>(i*2);z--)
			{
				System.out.print(ch);
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<count;i++)
		{
			for(int j=1;j<count-i;j++)
			{
				System.out.print(" ");
			}
			for(int z=0;z<(i*2)+1;z++)
			{
				System.out.print(ch);
			}
			System.out.println("");
		}
	}

}
