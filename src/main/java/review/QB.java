package review;

public class QB {
    /*

Java Variables
1) Create double variables for the prices of any 3 items. Print the sum of the prices on the
console with a label.

2) Create a float variable, a long variable, and an integer variable for any 3 items. Print the
multiplication of the values on the console with a label.

3) Type a code to find simple interest.
Note: Simple interest formula = principal * rate * numberOfYear / 100

4) Create a String and two Long variables. Print the sum and the multiplication of the long
variables with the String on the console.

5) Create two boolean variables whose values are different and print their values in the same
line with a space between two consecutive values.

6) Create 3 float variables for the price of a book, notebook, and laptop.
Print the total price of 2 books, 4 notebooks and 3 laptops on the console

7) Type a code to swap two integers.
1. Way: Use 3rd variable
2. Way: Do not use 3rd variable

Java Type Casting
1) Create a short variable and convert it to an int variable.

2) Create a long variable and convert it to an int variable.

3) Create a double variable and convert it to a float variable

4) Create a double variable and convert it to a short variable, then print the value of the short
variable on the console. Be careful about the output, it will not be a decimal value.

5) Create a byte variable and convert it to a double variable, then print the value of the double
variable on the console. Be careful about the output, it will be a decimal number.

Java Wrapper Classes
1) Type a code to find the sum of the minimum value of the byte and the maximum value of
short data types.

2) Type a code to convert “103” String to byte and to convert “2351” String to short then print
the difference on the console.

3) What are the differences between valueOf(String s) and parseByte(String s) methods?

Java String Manipulations
1) Create a String variable for city names which have just a single word.
Print the city name with the initial is in uppercase and all the other characters
are in lower cases on the console.

2) Create 3 String variables for people's names. Print the sum of the number of characters in
all the 3 names except space characters.
Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

3) Create a String variable, print the total number of alphabetical and numeric characters in
the String on the console.
Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

4) Create a String variable, print the number of non-digit characters in the String on the
console.
Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

5) Create a String variable and print just the last non-space character on the console for any
String.
Example: For ‘Ali Can’ you should print n
 For ‘Miami ’ you should print i etc.

6) Create a String variable and find the sum of the ASCII values of the first and the last
characters of the String.

 7) Create a String variable and print all characters except the first character on the console.
 Example:If the String is ‘Java’ you should print ‘ava’ on the console.

8) Create a String variable and print all characters except the last character on the console in
uppercases.
Example:If the String is ‘Java’ you should print ‘JAV’ on the console.

9) Create a String variable and print all characters except the first character and the last
character on the console in uppercases.
Example:If the String is ‘Java’ you should print ‘AV’ on the console.

10) Type code to check if a String has just a single space character any position in the middle
Example: For ‘Ali Can’ your code should print false on the console
 For ‘ Ali Can ’ your code should print false on the console
 For ‘ Ali Can ’ your code should print false on the console
 For ‘Ali Can’ your code should print true on the console

11) Type code to check if a String does not have any space character at the beginning and at
the end?
Example: For ‘ Ali ’ your code should print false on the console
 For ‘Ali’ your code should print true on the console

12) Type code to check if a String has an uppercase initial and dot at the end.
Example: For ‘Ali’ your code should print false on the console
 For ‘ali.’ your code should print false on the console
 For ‘ Ali. ’ your code should print false on the console
 For ‘Ali.’ your code should print true on the console
 For ‘ALI.’ your code should print true on the console

13) Type code to check if a password is valid or not for the following conditions;
Password must have at least 8 characters different from space character
Password must have at least 1 symbol
Example: For ‘A2b!’ your code should print false on the console
 For ‘A2b3cdef’ your code should print false on the console
 For ‘!1a23b4’ your code should print false on the console
 For ‘!1a23b4?es’ your code should print true on the console
 For ‘! a b 3 k’ your code should print false on the console

14) Type code to check if a String has a specific single character or not in three different ways.
1.Way:
2.Way:
3.Way:

15) String shirtPrice = ‘$12.99’;
String bookPrice = ‘$35.99’;
Type code to find the sum of the shirt and book prices.

16) Type code to get initials of the first name and the last name of a given name. Middle name
is out of scope.
Example: Tom Hanks ==> TH, Mary Star ==> MS
1.Way:
2.Way:

17) Type a code to find the number of punctuation marks used in a String.

Java Date Class
1) Type the code that finds out how many days Ali lived.
Date of birth of Ali is 12th of May 2002

2) Type the code that finds out how many months Ali lived.
Date of birth of Ali is 4th of June 1997

3) Date of birth of Ali is 4th of June 1997. Type code to find the exact date 2 years, 3 months,
and 12 days after Ali's birth date.

4) Ali was born 45 years, 8 months and 5 days after 29 October 1923.
Veli was born 24 years, 2 months and 11 days before 15 September 1993.
Type code to calculate the exact date of birth of Ali and Veli
Type code to check if the date of birth of Ali and Veli is the same or not.

5) Veli was born 3 years and 11 days after Ali.
Ali gave you his date of birth as 24th of November 2012
Type code to calculate Veli’s date of birth.

6) Create a Date Value for your birth date and create Date Value for your kid's birth date then
calculate the difference in days.

7) Get the last 2 digits of the year in current date

8) Type code to check if a given year is “Leap year” or not
Leap Year:
i) If a year is divisible by 100 and divisible by 400 it is called leap year. For example; 2000 is, 1900
is not
ii) If a year is not divisible by 100 and divisible by 4 it is called leap year. For example; 2004 is, 2007
is not

9) Find the sum of the month numbers of two different dates

10) Find the difference in hours for two different dates

Java Date - Time Class
1) If the hour is
i) Between 24:00 and 05:00 then print ‘Sleeping time’ on the console
ii) Between 08:00 and 16:00 then print ‘Working time’ on the console
iii) Between 19:00 and 22:00 then print ‘Family time’ on the console
iv) For the others print ‘Personal time’ on the console

2) Type code to find time difference between Japan time zone and Germany time zone

3) Ali was born in Istanbul on 5th of February 2015 at 10:00 am TRT, Mark was born in the USA
on 5th of February 2015 at 12:00 pm EST. What is the difference between Ali’s birth time
and Mark’s birth time in hours?

4) Ali was born on 5th of February 2015 at 10:15 am EST, Mark was born on 6th of March 2015
at 12:25 pm EST. Ali remained in intensive care for 23 hours and 35 minutes. Veli remained
in intensive care for 1 hour and 12 minutes. What is the difference in minutes between the
times of Ali and Veli leaving the intensive care unit?

5) Mark was born on 2/23/2018 at 3:25 PM in GMT. What is the exact birth date and time of
Mark in Japan?

Java If Statement
1) Type code to print
 a) "Winter" for December, January, February
 b) "Spring" for March, April, May
 c) "Summer" for June, July, August
 d) "Fall" for September, October, November
 e) "Invalid month name" for all the others

2) Type code to print
 a) "Valid Password" if the password has at least 8 characters different from space
 character
 b) "Do not use space character in password" if the password has any space
 character in any position
 c) "Invalid Password" if a and b conditions are not satisfied
 Note: Be careful about the orders of conditions in the solution

3) Type code to print
 a) "Round up by last digit:" and print the rounded value if the last digit is greater than
 or equal to 5
 b) "Round down by last digit" and print the rounded value if the last digit is less than 5
int i = 124;

4) Type code to print the name of the month when you entered the number of the month.
Example; For 1 output is "January", for 2 output is "February" etc.

5) Type code to print
 a) "Isosceles Triangle" if two sides of a triangle are equal in length.
 b) "Equilateral Triangle" if all sides of a triangle are equal in length.
 c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

6) Type code to create a converter which converts mile to km, second to hour, fahrenheit to
celsius. Find the formulas for conversions from Google.
 a) When user entered 10 and mileToKm String, your code should print "16 km"(The
 number will be dynamic) on the console
 b) When user entered 7200 and secondsToHours String, your code should print "2
 Hours"(The number will be dynamic) on the console
 c) When user entered 83 and fahrenheitToCelsius String, your code should print
 "28.3333 celsius"(The number will be dynamic) on the console

7) Type code to check the grammatical rules for full name
 a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
 b) Your code should print "First name or last name missed" for single words like
 "Ali" or "Can" or "ali"
 c) Your code should print "Format error" for all the format like "ALI CAN"
 d) Your code should print "Name was not entered" for one or more space
 characters like " " or " "
 e) Your code should print "Invalid Name" if the name has any character different
 from letters and space.
 Note: If the abbreviation has more than 1 error all related error messages should be
 printed. For example; for "ali3" your code should print "Error in initials", "First name
 or last name missed", and "Invalid Name"

8) Type code to check the format of state abbreviations in the USA
 a) Your code should print "State abbreviations cannot have more than 2 characters" if the
abbreviation has more than 2 characters
 b) Your code should print "State abbreviations cannot have lowercase characters" if the
abbreviation has lowercase characters
 c) Your code should print "State abbreviations cannot have characters different from
letters" if the abbreviation has characters different from letters.
 Note: If the abbreviation has more than 1 error all related error messages should be printed.
For example; for "fl3" your code should print, "State abbreviations cannot have more than
2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations cannot have characters different from letters"

9) Type code to create a simple calculator which does addition, subtraction, multiplication,
and division with any 2 number
 a) When user entered 10.2 and 5 and + sign your code should print "The result is
 15.2" on the console
 b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
 on the console
 c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
 on the console
 d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
 on the console

10) Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
 Invalid BMI value < 0
 Underweight = <18.5
 Normal weight = 18.5–24.9
 Overweight = 25–29.9
 Obesity = BMI of 30 or greater

Java Ternary Statement
1) Use ternary to print "Valid Password" if the password has at least 8 characters different
from space characters. "Invalid Password" if the password has less than 8 characters
different from space character

2) Use ternary to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

3) Use ternary to print
a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater than or equal to 5
b) "Round down by last digit" and print the rounded value if the last digit of an integer is less
than 5
 For example; 127 will be rounded up and the value will be 130
 125 will be rounded up and the value will be 130
 123 will be rounded down and the value will be 120

4) Type Apex code by using nested ternary.
 Write a program to check if a year is a leap year or not.
 If the year is divisible by 100 then it must be divisible by 400.
 If a year is not divisible by 100 then it must be divisible by 4.

5) Type code to check the password
 If it has more than 8 characters, initial should be 'i'
 If it does not have more than 8 characters initial should be 'K'
 Solve the task by using nested-ternary

6) Type code to calculate the absolute value of a number
 For positive numbers and zero absolute value is the same with the number
 For negative numbers to find absolute value multiply the number by -1

7) Write a program to print the minimum of 2 integers on the console by using ternary.

8) If the number has 3 digits, the output will be “This number has 3 digits.” Otherwise, the
output will be “This number has no 3 digits.”

9) Print 'Even' for even integers, print ‘Odd’ for odd integers by using ternary

10) If the number is positive print ‘Positive’, otherwise print ‘Not positive’ on the console by
using ternary.

Java Switch Statement
1) Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others

2) Use a switch statement to print the name of the month when you enter the number of the
month. For example; if user enters 1 your code should print "January",
if user enters 2 your code should print "February" etc. if user enters invalid month number
your code should print "Invalid number”

3) Type a code which prints the all month names starting with the given month numbers.
Example: If the month number is 9 output will be September October November December

4) Print "Boy" if the gender is "Male" (Ignore cases)
Print "Girl" if the gender is "Female" (Ignore cases)
Print "Others" if the gender is different from "Male" and "Female"

5) Type a code to display the number of days in a given month of a given year.
Example: The number of days in February of 2000 was 29.

6) Use switch statement to create a simple calculator which does addition, subtraction,
multiplication, and division with any 2 numbers
a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the
console
b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the
console
c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the
console
d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the
console
e) When user entered 10 and -5 and operation different from +, -, *, / your code should print
"That operation cannot be done"

7) Use switch statement to create a converter which converts mile to km, second to hour,
fahrenheit to celsius. Find the formulas for conversions from Google.
a) When user entered 10 and mileToKm String, your code should print "16 km" (The number
will be dynamic) on the console
b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The
number will be dynamic) on the console
c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333
celsius"(The number will be dynamic) on the console
d) When user entered operation different from mileToKm, secondsToHours, fahrenheitToCelsius your code should print "That operation was not defined for that converter"

8) Create an Enum and put the browser names in it like CHROME, SAFARI, IE, FIREFOX,
YANDEX. Use switch statement and print ‘I am using CHROME’ for CHROME, 'I am using
SAFARI’ for SAFARI, 'I am using IE for IE', 'I am using FIREFOX for FIREFOX', and 'I am using
YANDEX’ for YANDEX, 'Not valid browser' for browsers different from CHROME, SAFARI, IE,
FIREFOX, YANDEX.
Note: You should create enum on developer console
public enum Browsers{
CHROME, SAFARI, IE, FIREFOX, YANDEX
}

9) Create an Enum whose name is ‘Seasons’ and print the following by using the Enum in
switch-on statement
For winter print 'Snowboarding'
For summer and spring print 'Fishing'
For fall print 'Trekking'

10) Create a method which gives you a random alphabetical character in myClass Class then
print the following by using the method.
Print "First Character" for 'A' and 'a'
Print "Second Character" for 'B' and 'b'
Print "Third Character" for 'C' and 'c'
Print "Forth Character" for 'D' and 'd'
Print "Other Characters" for all others

Java Loops
1) Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
with a space between two consecutive integers

2) Type code to print repeated characters in a String. For example; accessories ⇒ ces

3) Type code to check whether a String is palindrome or not. If a String is the same with its
reverse then it is called palindrome. For example; “anna”, “123321” are palindromes

4) Type code to print the unique digits in an integer. Example; 223878 ⇒ 37

5) Type code to draw the following image by using a for loop.
A A A A A
A A A A A
A A A A A

6) Type code to draw the following image by using a for loop.
A
A A
A A A
A A A A

7) Type code to create multiplication table like
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

8) Type code to print odd integers from 20 to 3 in the same line with a space between two
consecutive ones.

9) Type code to print all lowercase characters in a String with an asterix.
For example; 'Ali Can?' ==> l*i*a*n*

10) Type code to print digits just in the decimal part of the given decimal number with an
asterix. For example; 75.4238 Ş *4*2*3*8

11) Type code to reverse a String. Example; Mark ==> kraM

12) Type code to draw the following image by using a for loop.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A

13) Type code to find the sum of the integers from 3 to 14

14) Type code to find the multiplication of the integers from 3 to 9

15) Type code to print characters from 'C' to 'A' on the console by using do-while loop

16) Type all characters before the first occurrence of 'm' in a String

17) Type code to find the sum of the digits in an integer

18) Type code to print unique characters in a String. For example; Hello ==> Heo

19) Find the total number of characters different from space and punctuation marks in a String

20) Type code to draw the following image by using a for loop.
* * * * * *
* * * * *
* * * *
* * *
* *
*

21) Type code to find the sum of the unique digits of an integer
Example: 12133455 Ş 2+4=6

22) Type code to print integers from 3 to 9 except 5

23) Ask the user to enter an integer to check if it is a prime number or not. Example: if user
enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
prime number”, if user enters negative integers output will be “Enter a positive integer”

24) Ask the user how many fibonacci numbers he wants to see. Then write the code that prints
these fibonacci numbers. Example: if user enters 6 output will be 1 1 2 3 5 8

25) A number is called an Armstrong number if it equals the sum of the cube of its every digit.
For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
cube of every digit. Type a code to check if the given number is the Armstrong number or
not.

26) Get a String and a character from user
Count the number of characters between the first occurrence and the last occurrence of the
given character in the String
Do not count the space characters
If the character which user selected is displayed just once in the String return -1
If the character which user selected does not exist in the String return -1
For example; "Java is easy" - 'a' ==> 5
 "Java is easy" - 'w' ==> -1
 "Java is easy" - 'e' ==> -1

27) From a given array find all pairs whose sum is a given number.
If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
4+6=10, 5+5=10, -10+20=10

28) Type a code that prints all prime numbers less than a given number. Example: if user enters
20 output will be 2, 3, 5, 7, 11, 13, 17, 19
public static void main(String[] args) {

29) Type a program to print the integers from 1 to 100 without using any loop.
public static void main(String[] args) {

30) Each line of input contains one or several words separated with single spaces. Type code to
reverse the order of words in each line of input, while preserving the words themselves. The
lines of your output should not have any trailing or leading spaces.
Example; Kemal Can Kuzu will be converted to Kuzu Can Kemal
public static void main(String[] args) {

31) Each line of input contains one or several words separated with single spaces. Type code to
reverse the order of words except the first and the last words in each line of input, while
preserving the words themselves. The lines of your output should not have any trailing or
leading spaces. Example; Kemal Can Tan Han Kuzu will be converted to Kemal Han Tan Can
Kuzu

Java Arrays
1) Find the middle element in an integer array
Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
 (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

2) Find the smallest positive element and greatest negative element in an integer array
Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

3) Find the elements whose length is the smallest in a String array
Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

4) Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM

5) Find the total number of characters used in String array elements
Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

6) Count how many words start with 'a' or 'A' in a given String
String s = "Apex is an object oriented programming language";

7) Find the number of vowels in a String
String s = "Apex is an object oriented programming language";

8) Type code to find array elements whose first and last characters are same
String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

9) Type code to find if a given element exists in a given array or not
String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};

10) Type code to find sum of the number of characters of array elements
String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

11) Type code to put all zeros to end in an integer array.
Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

12) Create an integer array by getting the elements from the user then print the difference
between the smallest and the greatest elements on the console.

13) Ask the user to enter 2 Strings. If the characters and the numbers of characters of the
Strings are the same then print "Anagram" on the console. Otherwise, print "Not Anagram"
on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.

Java Lists
1) Find the sum of all list elements in an integer list

2) Find the sum of all list elements before the first occurrence of 13 in an integer list

3) Find the multiplication of all even list elements in an integer list

4) Check if elements are in descending order in a list
Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
 (Yellow, Red, Green, Blue) ==> Output: It is in descending order

5) If the list has 15 as element, change all 15s to 51
Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)

6) If a list has 15 or 13, remove them.
Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

7) Find the closest 2 integers in an Integer List
Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13

8) Increase the value of every element except 7 and 10 by 2 in a List
Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)

9) Find the sum of all prices given in a String list
Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

10) Find the sum of the least and the greatest price given in a String list
Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

11) Check if all elements are unique in an integer List by using loops.

12) Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value,
decreasing constantly after the maximum value
Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to the maximum value,
decreasing and increasing after the maximum value
Type a code to check if any given array is Mountain Array or not.

Java Sets
1) Type the code that shows how many different elements there are in a list.
Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

2) Type code to print different characters used in a String
Example: ‘Mississippi’ Ş Misp

3) Type code to print the common elements between a Set and a List

4) Type code to print the different elements in a Set from a List

5) Type code to check if a List has repeated elements or not

Java Maps
1) There is a Map which contains product names as key and number of the products as value.
Type code to find the total number of products.

2) There is a Map which contains product names as key and number of the products as value.
Type code to check if ‘Laptop’ is among the products.

3) There is a Map which contains product names as key and number of the products as value.
Print the prices in ascending order.

4) There is a Map which contains product names as key and number of the products as value.
Print the product names in alphabetical order.

5) Type code to count the number of occurrences of the words in a String. (Case insensitive)
String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

6) How to check the number of repeated elements in a List

     */
}
