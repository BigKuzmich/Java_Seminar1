import java.io.*;

class GFG {

	static boolean isTriangular(int num)
	{
		if (num < 0)
			return false;
		int c = (-2 * num);
		int b = 1, a = 1;
		int d = (b * b) - (4 * a * c);
		if (d < 0)
			return false;
		// Find roots of equation
		float root1 = ( -b +
		(float)Math.sqrt(d)) / (2 * a);
		float root2 = ( -b -
		(float)Math.sqrt(d)) / (2 * a);
		// checking if root1 is natural
		if (root1 > 0 && Math.floor(root1)
								== root1)
			return true;
		// checking if root2 is natural
		if (root2 > 0 && Math.floor(root2)
								== root2)
			return true;
		return false;
	}
	public static void main (String[] args) {
		int num = 55;
		if (isTriangular(num))
			System.out.println("The number is"
					+ " a triangular number");
		else
			System.out.println ("The number "
			+ "is NOT a triangular number");
	}
}
