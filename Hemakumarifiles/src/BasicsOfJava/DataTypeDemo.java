package BasicsOfJava;

public class DataTypeDemo
  {
	public static void main(String[] args)
	       {
			    //byte -1byte
				        byte byteMax =127;
				        byte byteMin =-128;
				        System.out.println(" Min range of byte is"+byteMin+"\n "+"Max range of byte is "+byteMax);
				
				//short - 2bytes
						short shortMax =32767;
						short shortMin =-32768;
						System.out.println(" Min range of short is"+shortMin+"\n "+"Max range of short is "+shortMax);
						
				//Dint - 4bytes
						int intMax =2147483647;
						int intMin =-2147483648;
						System.out.println(" Min range of int is"+intMin+"\n "+"Max range of int is "+intMax);
						
				//long -8bytes
						long longMax=9223372036854775807L;
						long longMin=-9223372036854775808L;
						System.out.println(" Min range of long is"+longMin+"\n "+"Max range of long is "+longMax);
						
				//float -4bytes
						float f=2204.851f;
						System.out.println(" float value is " +f);
						
				//boolean - 1byte(true or false)
						boolean b=true;
						System.out.println(" boolean value is " +b);
			
				//char - 2byte
						char c='H';
						System.out.println(" char value is " +c);
			}

		}
