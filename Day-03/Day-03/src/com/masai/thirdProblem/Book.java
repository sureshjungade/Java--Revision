package com.masai.thirdProblem;

public class Book extends Publication{

	Book()
    {
        publisherName = "noPublisher";
        price = 0;
        noOfPages = 0;
    }
   
    Book(String pb, int p, int n )
    {
        publisherName = pb;
        price = p;
        noOfPages = n;
    }
}
