package chapter5;

import java.util.Scanner;

//takes the present and birthdate and find the age.
public class date_of_birth {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter current date: ");
		String present_date=sc.nextLine();
		System.out.println("enter the date of birth: ");
		String dob=sc.nextLine();
		String a[]=dob.split("/"); //date of birth
		String b[]=present_date.split("/"); //current date
		int days,month,year = 0;
		int d1=Integer.parseInt(a[0]);
		int d2=Integer.parseInt(b[0]);
		int m1=Integer.parseInt(a[1]);
		int m2=Integer.parseInt(b[1]);
		int y1=Integer.parseInt(a[2]);
		int y2=Integer.parseInt(b[2]);
		if(d1>d2)
		{
			int ans=month(m1,y1);
			m2-=1;
			d2+=ans;
			days=d2-d1;
		}
		else 
		{
			days=d2-d1;
		}
		if(m1>m2)
		{
			m2+=12;
			y2=y2-1;
			month=m2-m1;
		}
		else
		{
			month=m2-m1;
		}
		year=y2-y1;
	System.out.println("you are"+year+" years"+month+" months "+days+" days old \n");
	}
	public static int month(int m1,int y1)
	{
		int ans=30;
		if(m1==1||m1==3||m1==5||m1==7||m1==8||m1==10||m1==12)
			ans+=1;
		else if(m1==2)
		{
			ans=-2;
			if((y1%4==0&&y1%100!=0)||y1%400==0)
				ans+=1;
		}
		return ans;
	}

}
