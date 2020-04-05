import java.io.*;
class print
{
	public static void  main(String args[])
	{
	Employee o=new Employee();
	System.out.print("NAME\t");
	System.out.print("YEAR OF JOINING\t");
	System.out.print("SALARY\t");
	System.out.println("ADDRESS\t");
	o.robert();
	o.sam();
	o.john();
	}
}
class Employee
{
	public void robert()
	{
	System.out.print("Robert\t");
	System.out.print("      1994\t");
	System.out.print(" -\t");
	System.out.println("64C-WallsStreet\t");
	}
	public void sam()
	{
	System.out.print("Sam\t");
	System.out.print("      2000\t");
	System.out.print(" -\t");
	System.out.println("68D-WallsStreet\t");
	}
	public void john()
	{
	System.out.print("John\t");
	System.out.print("      1999\t");
	System.out.print(" -\t");
	System.out.println("26B-WallsStreet\t");
	}
}
