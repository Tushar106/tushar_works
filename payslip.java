import java.util.*;
class pay
{
String name;
int amount;
public pay(String n,int x)
{
name=n;
amount=x;
}
public void display()
{
System.out.println("Dear \t"+name);
System.out.println("your netamount \t"+amount);
}
}
class bill extends pay
{
int gst;
int discount;
int netbill;
public bill(String n,int x,int g,int d)
{
super(n,x);
gst=g;
discount=d;
}
public void calculate()
{
netbill=amount+gst-discount;
}
public void display()
{
super.display();
System.out.println("GSt :"+gst);
System.out.println("Discount :"+discount);
System.out.println("your total bill :"+netbill);
}}
class payslip
{
public static void main(String []args)
{
bill obj=new bill("tushar",5000,100,65);
obj.calculate();
obj.display();
}
} 


