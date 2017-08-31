package com.sqa.td;

import com.sqa.td.helpers.*;

public class BugApp
{

	public static void main(String[] args)
	{
		int bugEntries = 0;
		int[] bugId;
		String[] reporterName;
		String[] bugName;
		char[] bugCategory;
		String[] operatingSystem;
		String[] date;
		String[] bugDetails;
		double[] frequency;
		boolean[] isActive;
		bugEntries = AppBasics.requestInt("How many bugs do you want to report? ");
		bugId = new int[bugEntries];
		reporterName = new String[bugEntries];
		bugName = new String[bugEntries];
		bugCategory = new char[bugEntries];
		operatingSystem = new String[bugEntries];
		date = new String[bugEntries];
		bugDetails = new String[bugEntries];
		frequency = new double[bugEntries];
		isActive = new boolean[bugEntries];
		for (int i = 0; i < bugEntries; i++)
		{
			System.out.println("Bug #" + (i + 1));
			bugId[i] = AppBasics.requestInt("Please enter the bug ID: ");
			reporterName[i] = AppBasics.requestString("Please enter the reporter name: ");
			bugName[i] = AppBasics.requestString("Please enter the bug name: ");
			bugCategory[i] = AppBasics.requestChar("Please enter the bug category: ");
			operatingSystem[i] = AppBasics.requestString("Please enter the operating system: ");
			date[i] = AppBasics.requestString("Please enter the date: ");
			bugDetails[i] = AppBasics.requestString("Please enter the bug details: ");
			frequency[i] = AppBasics.requestDouble("Please enter the frequency: ");
			isActive[i] = AppBasics.requestBoolean("Is this bug active? ");
		}
		for (int i = 0; i < bugEntries; i++)
		{
			System.out.println("Bug # " + (i + 1));
			System.out.println("Bug ID: " + bugId[i]);
			System.out.println("Reporter name: " + reporterName[i]);
			System.out.println("Bug name: " + bugName[i]);
			System.out.println("Bug category: " + bugCategory[i]);
			System.out.println("Operating system: " + operatingSystem[i]);
			System.out.println("Date: " + date[i]);
			System.out.println("Bug details: " + bugDetails[i]);
			System.out.println("Frequency: " + frequency[i]);
			System.out.println("Is active: " + isActive[i]);
		}
		// ArrayList<String> students = new ArrayList<String>();
	}
}
