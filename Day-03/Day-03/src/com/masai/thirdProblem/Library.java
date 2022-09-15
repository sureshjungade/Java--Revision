package com.masai.thirdProblem;

import java.util.ArrayList;
import java.util.List;

public class Library {

	
	 Publication p[] = new Publication[1];

	    Library(Publication x)
	    {
	        p[0] = x;
	    }
	     
	    void add(Publication x) 
	    {
	        int i, n = p.length;

	        Publication np[] = new Publication[n + 1];

	        for (i = 0; i < n; i++)
	            np[i] = p[i];

	        np[n] = x;

	        p = np;
	    }
	    
	    void printDetails()
	    {
	        for(int i=0; i<p.length; i++)
	        {
	            p[i].print();   
	        }
	    }
}
