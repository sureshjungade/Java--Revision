package com.masai.thirdProblem;



public class Journal extends Publication{

	Journal()
    {
        publisherName = "noPublisher";
        price = 0;
        noOfPages = 0;
    }
   
    Journal(String pb, int p, int n )
    {
        publisherName = pb;
        price = p;
        noOfPages = n;
    }
	
	
}
