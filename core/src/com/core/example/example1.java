package com.core.example;

import java.util.Scanner;
public class example1 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner src= new Scanner(System.in);
System.out.println("Enter a string");
String str= src.nextLine();
String lower =str.toLowerCase();
int count=0;
for(int i=0;i<lower.length();i++){
char x= lower.charAt(i);
if(x == 'a' || x== 'e' || x=='i' || x=='o' || x=='u'){
System.out.print(str.charAt(i) + " ");
count++;
}
}
System.out.println("The total number of vowels are " +count);
}
}