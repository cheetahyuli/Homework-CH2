package abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sample2_21
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�п�J5�ӤH������");
		int test[] = new int[5];
		int j = 1;
		
		for(int i = 0;i < test.length;i++)
		{
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		Arrays.sort(test);
		
		for(int i = test.length - 1;i >= 0;i--)
		{
			System.out.println("��"+ j +"�W�����ƬO"+ test[i]);
			j++;
		}
	}
}
