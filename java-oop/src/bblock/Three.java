package bblock;
import ablock.One;
public class Three {
	public void oneTest() {
		One one = new One();
		one.a = 1; // public
		// b = 2; // protect
		// one.c = 3; // default
		// one.d = 4; // private
	}
}
