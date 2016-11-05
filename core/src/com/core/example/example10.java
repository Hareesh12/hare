package com.core.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
public class example10 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner src= new Scanner(System.in);
System.out.println("Enter the string");
String str = src.nextLine();
StringTokenizer val = new StringTokenizer(str," ");
HashMap<String, Integer> hm= new HashMap<>();
while (val.hasMoreTokens()) {
String x=val.nextToken();
if(hm.containsKey(x))
{
int cnt = hm.get(x);
hm.put(x, cnt+1);
}
else{
hm.put(x, 1);
}}
System.out.println("Word\tCount");
System.out.println("-----\t------");
for(Map.Entry a: hm.entrySet()){
System.out.println(a.getKey() +"\t"+a.getValue());}}}