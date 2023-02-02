package Exercice1;

public class Exercice1 {

	private int age  = 33;
	private int poids  = 72;
	private boolean isStudent = true;
	private char gender = 'M';
	private String name = "Agnissan";
	
	public Exercice1() {
	}
	
	public void displayInfo() {
		System.out.println("Name: " + this.name + " , " + "Age: " + this.age + " , " + "Gender: " + this.gender + " , " + "Weight: " + this.weight + " , " + "IsStudent: " + this.isStudent);
	}

	public static void main(String[] args) {
		Exercice1 exercice = new Exercice1();
		exercice.displayInfo();
	}

}
