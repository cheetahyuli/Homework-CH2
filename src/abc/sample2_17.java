package abc;

public class sample2_17
{
	public static void main(String[] args)
	{
		int[] test;
		int i;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		test[10] = 75;
		
		for(i = 0;i < 5;i++)
		{
			System.out.println("��"+ (i+1) +"�ӤH�����ƬO"+ test[i] +"��");
		}
	}
}