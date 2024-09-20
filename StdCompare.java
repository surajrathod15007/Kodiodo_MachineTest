package com.quastion.first;

import java.util.Comparator;

public class StdCompare implements Comparator<StdDetails>
{
                                                                                                                                                                     
	@Override
	public int compare(StdDetails o1, StdDetails o2)
	{
		boolean b=o1.equals(o2);
		System.out.println(b);
		return 0;		
	}

}
