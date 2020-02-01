package com.variables;

public class VariableTypes
{

private String instanceVariable;
private  static String staticVariable;

/*public void local()
{
int local = 2;
 
System.out.println("Local variable is - :" +local);

}*/
public static void main(String args [] )
{

String localVariable = "local";

VariableTypes v1 = new VariableTypes() ;

System.out.println("Local variable is - :" +localVariable);
System.out.println("Instance Variable is - :" +v1.instanceVariable);
System.out.println("Static Variable is -:" +v1.staticVariable);

//v1.local();

}
} 



