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
		
		System.out.println("請輸入5個人的分數");
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
			System.out.println("第"+ j +"名的分數是"+ test[i]);
			j++;
		}
	}
}
