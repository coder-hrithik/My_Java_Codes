tocharArray() rt is char[]
this method is  used to convert the string into char Arrays

toUpperCase() rt is  string
this method is  used to convert lowercase string into upper case string

split(String str) rt is  string[]
split the string based on specified string

replace(char old, char new)
replace all the occurance old into new

replace(String old, String new) rt is  string
replace all the old string into new string

indexof(char ch,int index) rt is  int
return the index of the specifies cahr after the specified index

lastIndexof(char ch) rt is  int
return the index of the specified char from end of the string

lastIndexof(int index, char ch) rt is  int
return the index of  the specified char from the end after the specified index of string

toString() rt is  string 
return the string value present in the string object

hashcode() rt is  int
return the unique integer value based onthe data present in string object

toLowerCase() rt is  string
makes string in loewercase

startswith(String str) rt is boolean
checks if the string starts with specified char

endsWith(String str) rt is boolean
checks if the strinf is ending with the specified char

contains(String str) rt is boolean
checks if the stirng is in specified string

compareTo(string str) rt is int
compare the string lexographicallly

concat(string str) rt is String
concat to strings

substring(int beginIndex) rt is String
this method is used to return a part of the string starting from the given index

substring(int beginIndex, int endIndex) rt is String
this method is used to return a part of the sting with starts fro the given begin index and 
ends at given end index the behin index in included but the end index is excluded.

# Why strin class is immutable?
-> immutable means the data in the object cannot be changed or modifiesd
string class is immutablebecause it used the concept of string constant pool where all the string references 
with the same string content will have address of the same object if any of the reference changes the data of
the object it will be affectefd to all the other references since all the references are pointing towards same
object.

# How to make your class as immutable?
-> To make a class as immutable 
1) the class should be make final
2) all the data members should be private and final
3) all the private members should have getter method
public final class Student{
	private final int rollno;
	private final String name;
	private final double marks;
	public Student(int rollno,String name,double marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno(){
		return rollno;
	}
	public string getName(){
		return name;
	}
	public double getMarks(){
		return marks;
	}
}
