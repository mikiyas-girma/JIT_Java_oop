   the codes contains answer for java class exercise questions 

1. Create a Java class named Student with 

a. With field /class variables 

b. Create constructor 

c. create setters and getter method (use this keyword)
d. create a method to calculate total salary given any number of incomes 
e. method overloading 
f. static variable, method , final keyword 
g. example for ‘this’, (parameter name same as filed variable), method, constructor call, 
(must be first statement in con) 
h. Object referencing, calling inside constructors 


2. Write a method named isSquare that returns 1 if its integer argument is a square of some 
integer, otherwise it returns 0. Your method must not use any method (e.g. sqrt) that 
comes with a runtime class library!



3. The number 198 has the property that 198 = 11 + 99 + 88, i.e., if each of its digits is concatenated 
twice and then summed, the result will be the original number. It turns out that 198 is the only 
number with this property. However, the property can be generalized so that each digit is 
concatenated n times and then summed. For example, 2997 = 222+999+999+777 and here each 
digit is concatenated three times. Write a method named checkContenatedSum that tests if a 
number has this generalized property. The signature of the method is int 
checkConcatenatedSum(int n, int catlen) where n is the number and catlen is the number of 
times to concatenate each digit before summing. 
The method returns 1 if n is equal to the sum of each of its digits contenated catlen times. 
Otherwise, it returns 0. You may assume that n and catlen are greater than zero
Hint: Use integer and modulo 10 arithmetic to sequence through the digits of the argument.


4. Write a method named isLegalNumber that takes two arguments. The first argument is an array 
whose elements are the digits of the number to test. The second argument is the base of the 
number represented by the first argument. The method returns 1 if the number represented by the 
array is a legal number in the given base, otherwise it returns 0.
For example the number 3214 can be passed to the method as follows:
 isLegalNumber(new int[] {3, 2, 1}, 4)
This call will return 1 because 3214 is a legal base 4 number. 
However, since all digits of a base n number must be less than n, the following call will return 0 because 
3716 is not a legal base 6 number (the digit 7 is not allowed) isLegalNumber(new int[] {3, 7, 1}, 6)


5. Create the class Movie with an instance of class Movie represents a film. This class
has the following three class variables:
● title, which is a String representing the title of the movie
● studio, which is a String representing the studio that made the movie
● rating, which is a String representing the rating of the movie (i.e. PG-13, R, etc)


a) Write a constructor for the class Movie, which takes a String representing the title of the
movie, a String representing the studio, and a String representing the rating as its
arguments, and sets the respective class variables to these values.

b) Write a second constructor for the class Movie, which takes a String representing the title
 of the movie and a String representing the studio as its arguments, and sets the respective
class variables to these values, while the class variable ratingis set to "PG".

c) Write a method getPG, which takes an array of base type Movies its argument, and
 returns a new array of only those movies in the input array with a rating of "PG". You may
Assume the input array is full of Movie instances. The returned array need not be full.


d) Write a piece of code that creates an instance of the class Movie with the title 

                        Exercise 2

1. Create a nested class and instantiate the objects, call the methods and fields 

2. Write a Java program to find the second largest element in an array.

3. Write a Java program to add two matrices of same size

4. Write a Java program to find the common elements between two arrays of integers.

