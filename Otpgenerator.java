package paswword_generator;

import java.util.Random;

public class Otpgenerator {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		String num="1234567890";
		Random ot=new Random();
		String req= "2134";
		//char m=num.charAt(ot.nextInt(num.length()));
		char[] otp=new char[4];
		int n=1;
		String string="null";
		while(!(string.equals(req)))
		{
		
		for (int i=0;i<otp.length;i++)
		{
			otp[i]=num.charAt(ot.nextInt(num.length()));
		}//for loop end
		String str=new String();
		 string=str.valueOf(otp);
		System.out.println(n++ +"    "+string);
	
		
		}//while loop end
		System.out.println(("req otp"+string));
		
	}


	
	

}
