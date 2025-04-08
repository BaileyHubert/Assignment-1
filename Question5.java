package question5;
/*
 * Prints "Hello World!" when run using an instance variable called by an accessor and printed from an object
 * 
 * PSUEDOCODE:
 * Start program
 * Creates string variable "helloWorld"
 * Creates new object "MyString"
 * Calls variable "helloWorld" as "Hello World!"
 * Object "MyString" prints variable "helloWorld"
 * "Hello World!" is printed to the console
 * Program ends.
 */

public class Main {

String helloWorld;

	public static void main(String[] args) {
		Main myObject = new Main();
		myObject.MyString();

	}
Main (){
	helloWorld="Hello World!";
}
	public void MyString() {
	
		System.out.print(helloWorld);
	}

}
