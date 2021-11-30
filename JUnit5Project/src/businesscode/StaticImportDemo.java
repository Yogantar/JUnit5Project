package businesscode;
/*
 * In Java, static import concept is introduced in 1.5 version.
 * With the help of static import, we can access the static members
 * of a class directly without class name or any object.
 */
import static java.lang.Math.*;
import static java.lang.System.*;
public class StaticImportDemo {

	public static void main(String[] args) {
//		Without Static Import
		System.out.println(Math.sqrt(49));
		System.out.println(Math.pow(10,2));
		System.out.println(Math.abs(49));
		
//		with Static import of System & Math class
		out.println(sqrt(49));
		out.println(pow(10,2));
		out.println(abs(49));
	}

}
