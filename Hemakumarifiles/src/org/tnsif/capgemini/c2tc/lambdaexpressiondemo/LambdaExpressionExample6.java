package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample6 
{
	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();  
        list.add("anasuya");  
        list.add("madhu");  
        list.add("janaki");  
        list.add("sri");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
	}

}
