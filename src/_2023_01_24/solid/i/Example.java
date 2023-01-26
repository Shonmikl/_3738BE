package _2023_01_24.solid.i;

public class Example {
	public int size () {/*.
	...
	*/
	return 0;}

	public int length () {/*.
	...
	*/
	return 0;}

	public void sort () {/*.
	...
	*/}

	public String print () {/*.
	...
	*/
	return null;}

	public String state () {/*.
	...
	*/
	return null;}

	public int Seconds () {/*.
	...
	*/
	return 0;}
}

/*
public interface wrongInterface implements Example{
	public int size ();
	public int length ();
	public void sort ();
	public String print ();
	public String state ();
	public int Seconds ();
}

public interface userInterface extends Example{
	public int size ();
	public int length ();
	public void sort ();
}

public interface adminInterface extends Example{
	public int size ();
	public int length ();
	public void sort ();
	public String print ();
	public String state ();
	public int Seconds ();
}

interface guestInterface{
	public String print ();
	public String state ();
	public int Seconds ();
}
*/

interface A {}
interface B {}
interface C extends A, B {}