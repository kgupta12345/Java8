interface Calculator{
	int multiplication(int i, int j);
}

class Compute  implements Calculator {
	@Override
	public int multiplication(int i, int j) {
	  return i*j;
	}
}

public class Java7  {
	public static void main(String[] args) {
		Compute compute = new Compute();
		System.out.println(compute.multiplication(2, 4));
	}

}
