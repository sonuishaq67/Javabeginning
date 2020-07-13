package com.chap1;

public class ArRaYs {

	public static void main(String args[]) {
		int month_days[]={31,28,31,30,31,30,31,30,31,30,31,30};
		String month_name[];
		month_name=new String[12];
		month_name[0]="January";
		month_name[1]="February";
		month_name[2]="March";
		month_name[3]="April";
		month_name[4]="May";
		month_name[5]="June";
		month_name[6]="July";
		month_name[7]="August";
		month_name[8]="September";
		month_name[9]="October";
		month_name[10]="November";
		month_name[11]="December";
		for(int i=0;i<12;i++)
		System.out.println("the month of "+ month_name[i]+" has "+month_days[i]+" days");
	}
}
