package test;

public class Paycalculate {

	public static void main(String[] args) {
		dailyworker d=new dailyworker(250,"Ayush",65); 
		 salariedworker s=new salariedworker(660,"Neel",200);
		 d.compay(50);
		 s.compay(); 
		 }
}
class worker
{
	int empno;
	String name;  
	worker(int no,String n)
	{ 
	empno=no; 
	name=n;
	 }
	 void show()
	 {
	 System.out.println("Employee number is: "+empno);
	 System.out.println("Employee name is: "+name); 
	 } 
	 }
	 class dailyworker extends worker 
	{
	 int rate; 
	dailyworker(int no,String n,int r) 
	{ 
	super(no,n);
	rate=r; 
	} 
	void compay(int t)
	 { 
	show();
	 System.out.println("Salary of Employee : "+rate*t);
	 }
	 }
	 class salariedworker extends worker 
	{
	 int rate; 
	salariedworker(int no,String n,int r)
	 { 
	super(no,n);
	 rate=r;
	 }
	 int hour=40;
	 void compay() 
	{
	show();
	System.out.println("Salary : "+rate*hour);
	}
	 } 
