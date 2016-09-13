/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] rainfall = {{14,13,11,9,5,3,1,1,4,8,9,12},
		{17,18,15,13,11,8,6,8,9,10,13,15},
		{9,8,9,6,4,1,0,2,3,7,9,10},
		{12,11,6,4,2,3,2,3,5,8}};
		int Navg = 0;
		int Savg = 0;
		int Eavg = 0;
		int Wavg = 0;
		int min = 0;
		int month = 0;
		String dry = "";

		for (int i = 0; i < rainfall.length; ++i){
			int x = 0;
			for (int y : rainfall[i]){
				x += y;
			}
			if (i==0){
				Navg = (x/12);
			}
			else if (i==1){
				Savg = (x/12);
			}
			else if (i==2){
				Eavg = (x/12);
			}
			else if (i==3){
				Wavg = (x/12);
			}
		}
		for (int i = 0; i < 12; ++i){
			int temp = rainfall[0][i] + rainfall[1][i] + rainfall[2][i] + rainfall [3][i];
			if (temp < min){
				min = temp;
				month = i;
			}
		}
		if (month == 0)
			dry = "January";
		if (month == 1)
			dry = "February";
		if (month == 2)
			dry = "March";
		if (month == 3)
			dry = "April";
		if (month == 4)
			dry = "May";
		if (month == 5)
			dry = "June";
		if (month == 6)
			dry = "July";
		if (month == 7)
			dry = "August";
		if (month == 8)
			dry = "September";
		if (month == 9)
			dry = "October";
		if (month == 10)
			dry = "November";
		if (month == 11)
			dry = "December";
		JOptionPane.showMessageDialog(null,"Average Rainfall for each region \n\n North : "
		+ Navg + "\n South : " + Savg + "\n East : " + Eavg + "\n West : "
		+ Wavg + "\n\n Driest Month : " + dry);
	}
}
