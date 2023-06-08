package calculator;
import java.util.Scanner;
public class calculator 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int input,decimal,binary,octal,hexa;
	String Binary,Octal,Hexa;
	System.out.println(".......Please select the desider operation number.......");
	System.out.println("       1) Decimal to Binary");
	System.out.println("       2) Binary to Decimal");
	System.out.println("       3) Decimal to Octal");
	System.out.println("       4) Octal to Decimal");
	System.out.println("       5) Decimal to Hexadecimal");
	System.out.println("       6) Hexadecimal to Decimal");
	input=s.nextInt();
	switch(input)
{
	case 1:
	{
	System.out.println("Please input a Decimal number :");
	decimal=s.nextInt();
	//Decimal=String.valueOf(decimal);
	Binary=Integer.toBinaryString(decimal);
	System.out.println("The binary value of "+decimal+" is = "+Binary);
	}
	break;
	case 2:
	{
		System.out.println("Please enter a Binary number :");
		binary=s.nextInt();
		Binary=String.valueOf(binary);
		decimal=Integer.parseInt(Binary,2);
		System.out.println("The decimal value of "+binary+" is = "+decimal);
	
	}
	break;
	case 3:
	{
		System.out.println("Please enter a Decimal number :");
		decimal=s.nextInt();
		//Decimal=String.valueOf(decimal);
		Octal=Integer.toOctalString(decimal);
		System.out.println("The octal value of "+decimal+" is = "+Octal);
	}
	break;
	case 4:
	{
		System.out.println("Please enter an Octal number :");
		octal=s.nextInt();
		Octal=String.valueOf(octal);
		decimal=Integer.parseInt(Octal,8);
		System.out.println("The decimal value of "+octal+" is = "+decimal);
	}
	break;
	case 5:
	{
		System.out.println("Please enter Decimal number :");
		decimal=s.nextInt();
		//Decimal=String.valueOf(decimal);
		Hexa=Integer.toHexString(decimal);
		System.out.println("The hexadecimal value of "+decimal+" is = "+Hexa);
	}
	break;
	case 6:
	{
		System.out.println("Please enter a Hexadecimal number :");
		hexa=s.nextInt();
		Hexa=String.valueOf(hexa);
		decimal=Integer.parseInt(Hexa,16);
		System.out.println("The decimal value of "+hexa+" is = "+decimal);
	}
	break;
	default :
		System.out.println("Please Input Correct Option");
}
}
}