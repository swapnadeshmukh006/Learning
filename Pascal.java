package com.loop;

public class Pascal{

public static void main(String args[]){
int n=3;
for(int i=0;i<n;i++)
{
for(int j=0;j<n-1;j++)
{
System.out.print("");
}
boolean b=true;
for(int k=0;k<i*2+1;k++){
if(b)
{

System.out.print("*");
b=false;
}
else{
System.out.print("");
b=true;
}
}
} 
System.out.println("");
}
}


