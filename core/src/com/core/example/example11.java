package com.core.example;

public class example11 {
public static void main(String[] args) {
// TODO Auto-generated method stub
String str = "{\"Name\":\" Rahul \", \"Age\":\"21 \", \"Gender\":\" Male \", \"Branch\":\" Mechanical \"}";
System.out.println(str);
String[] each = str.split(",");
for(String x: each){
String[] eachVal= x.split(":");
System.out.print(eachVal[1].subSequence(1, eachVal[1].length()-2) +" ");
}
}
}
