package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

interface Sayable
{  
    public String say();  
}  
public class LambdaExpressionExample2
{  
public static void main(String[] args) 
{  
    Sayable s=()->{  
        return "I have a sister.";  
    };  
    System.out.println(s.say());  
}
}
