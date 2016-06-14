import java.util.*;
class coll
{
public static void main(String args[])
{
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(1);
al.add(2);
al.add(3);
//al.add('c');
System.out.println(al);
List<String>l1=new ArrayList<String>();
l1.add("hareesh");
l1.add("naresh");
l1.add("ramesh");
System.out.println(l1);
List<String>l2=new ArrayList<String>();
	l2.add("surya");
	l2.add("vikki");
	l2.add("sandy");
l2.addAll(l1);
System.out.println(l1);
System.out.println("l2 is");
for(String obj:l2)
{
System.out.print(obj+" ");
}
System.out.println("l1 is");
for(String obj:l1)
{
System.out.print(obj+" ");
}
System.out.println("al is");
for(Integer i:al)
{
System.out.println(i);
}
Iterator itr=l2.iterator();
while(itr.hasNext())
{
Object obj=itr.next();
System.out.println(obj);
}
}}
