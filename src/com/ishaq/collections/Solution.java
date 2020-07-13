package com.ishaq.collections;

import java.io.*;
import java.util.*;


public class Solution {

	static String timeInWords(int h, int m) {
		String[] what = { "one minute", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
				"twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
				"twenty eight", "twenty nine", "half" };
		String returnval = "";
		if(m==0)
			return what[h-1]+" o' clock";
		else if(m==1)
			returnval=returnval + what[m - 1] + " minute past" + " " + what[h - 1];
		else if(m==15||m==30)
			returnval=returnval + what[m - 1] + " past" + " " + what[h - 1];
		else if (m <= 30 && m!=1)
			returnval = returnval + what[m - 1] + " minutes past" + " " + what[h];
		else if (m > 30)
			returnval = returnval + what[59-(m)] + " minutes to" + " " + what[h];
		else if (m == 45)
			returnval = returnval + what[59-(m)] + " to" + " " + what[h - 1];
		return returnval;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int h = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int m = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = timeInWords(h, m);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
