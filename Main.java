import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Person[] ar = new Person[5];
		for(int i=0; i<ar.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			ar[i] = new Person(name, height, weight);
		}
		sc.close();
		
		for(int i=0; i<ar.length; i++) {
			ar[i].print();
		}
	}
}

class Person {
	private String name;
	private int height;
	private double weight;
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}
}