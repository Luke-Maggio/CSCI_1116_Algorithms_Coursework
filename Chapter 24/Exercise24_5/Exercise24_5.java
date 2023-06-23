package exercise24_5;

public class Exercise24_5 {
	public static void main(String[] args) {
		
		GenericQueue<String> cars = new GenericQueue<>();
		
		cars.enqueue("Rolls Royce Phantom");
		//System.out.println("(1) " + cars);
		cars.enqueue("Mercedes AMG");
		//System.out.println("(2) " + cars);
		cars.enqueue("BMW 7 Series");
		//System.out.println("(3) " + cars);
		cars.enqueue("Audi R8");
		cars.enqueue("Audi RS7");
		//System.out.println("(4) " + cars);
		
		 cars.dequeue();
		 cars.dequeue();
		// System.out.println(cars.toString());
		
	}
}
