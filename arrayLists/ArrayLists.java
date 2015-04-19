package arrayLists;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class ArrayLists
{

    ArrayList<Integer> stats = new ArrayList<Integer>();

    // default constructor -overloaded method
    ArrayLists()
    {

	// size = 10;
	// stats = new int[size]; // instantiate the array called stats
    }

    public void display(Graphics g)
    {
	int x = 50; // coordinates for displaying
	int y = 40;

	// display the array with position number
	for (int i = 0; i < stats.size(); i++)
	{
	    g.drawString("Stats [" + i + "] = " + stats.get(i), x,
		    (y + 15 * i));
	}
    }

    public void fillArray()
    {
	/* fill the array with random numbers (int) in the range 0 - 100. */
	stats.clear();
	Random random = new Random();
	for (int i = 0; i < 10; i++)
	{
	    int r = random.nextInt(100);
	    stats.add(r);
	}

    }

    public int getSum()
    {
	// add up all the values in the array
	int sum = 0;
	for (int i = 0; i < stats.size(); i++)
	{
	    sum = sum + stats.get(i);
	}
	return sum;
    }

    public int getMax()
    {
	// return the maximum value in the array
	int maxValue = stats.get(0);
	for (int i = 0; i < stats.size(); i++)
	{
	    if (maxValue < stats.get(i))
	    {
		maxValue = stats.get(i);
	    }
	}

	return maxValue;
    }

    public int getMin()
    {
	// return the minimum value in the array
	int minValue = stats.get(0);
	for (int i = 0; i < stats.size(); i++)
	{
	    if (minValue > stats.get(i))
	    {
		minValue = stats.get(i);
	    }
	}

	return minValue;
    }

    public double getAverage()
    {
	// return the average
	double average;
	average = ((double) getSum() / stats.size());
	return average;
    }

    public int countValues(int lowRange, int highRange)
    {
	// count how many numbers are >= lowRange and <= highRange
	int total = 0;
	for (int i = 0; i < stats.size(); i++)
	{
	    if (stats.get(i) >= lowRange && stats.get(i) <= highRange)
	    {
		total++;
	    }
	}
	return total;
    }

    public boolean isValueFound(int someNumber)
    {
	boolean found = false;
	// check to see if someNumber is in the array
	for (int i = 0; i < stats.size(); i++)
	{
	    if (someNumber == stats.get(i))
	    {
		found = true;
	    }
	}
	return found;
    }
    
    public void addElement()
    {
	Random random = new Random();
	int r = random.nextInt(100);
	stats.add(r);
    }
    
    public void deleteElement()
    {
	stats.remove(stats.size()-1);
    }

    public void sortArray()
    {
	Collections.sort(stats);
	//stats.sort(c );;
	/* sort the array in ascending order - selection sort */
//
//	int tempValue, tempValue2;
//	int min;
//
//	for (int i = 0; i < 9; i++)
//	{
//	    min = i;
//	    for (int j = (i + 1); j < 10; j++)
//	    {
//		if (stats.get(j) < stats.get(min))
//		{
//		    min = j;
//		}
//	    }
//	    tempValue = stats.get(min);
//	    stats.set(min, i);
//	    stats.set(i, tempValue);
//
//	}

    }

    // public void sortBArray()
    // {
    // /*
    // * Here is another common sort algorithm. It sorts the array in
    // * ascending order. This is called a bubble sort. I have added it so
    // * that you can take a look at it.
    // */
    //
    // int tempValue;
    //
    // for (int i = 0; i < (stats.size() - 1); i++)
    // {
    // for (int j = (i + 1); j < (stats.size()); j++)
    // {
    // if (stats[j] < stats.get(i))
    // {
    // tempValue = stats.get(i);
    // stats.get(i) = stats[j];
    // stats[j] = tempValue;
    // }
    // }
    // }
    //
    // }

}
