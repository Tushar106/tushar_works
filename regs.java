import java.util.*;
//program to arrange the registered number and names and then search the registered number;
class regs
{
   int no[];
   String name[];
   int n;
public regs()
{
   n=5;
   no=new int[n];
   name=new String[n];
}
public void input()
{
   Scanner sc=new Scanner(System.in);
   int i=0;
   int j=0;
   for( i=0;i<n;i++)
{ 
   System.out.println("enter number");
   no[i]=sc.nextInt();
   System.out.println("enter name");
   name[i]=sc.next();
   int v=no[i];
   String s=name[i];
   for( j=i-1;j>=0&& no[j]>v;j--)
{
   no[j+1]=no[j];
   name[j+1]=name[j];
}
   no[j+1]=v;
   name[j+1]=s;
}}
public void search()
{  Scanner sc=new Scanner(System.in);
   System.out.println("enter the reg number");
   int se=sc.nextInt();
   int f=0;
   for(int i=0;i<n;i++)
{
   if(no[i]==se)
{  f=1;
   System.out.println("reg number"+ no[i]);
   System.out.println("owner name \t"+name[i]);
   break;
}}
   if(f==0)
   System.out.println("not found");
}
public static void main(String []args)
{
   regs obj=new regs();
   obj.input();
   obj.search();
}
}