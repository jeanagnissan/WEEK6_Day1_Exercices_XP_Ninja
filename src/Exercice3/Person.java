package Exercice3;

public class Person {

	private String  name = "";
	private int age = 0;
	private char gender = 'F';
	
	public Person() {
		this.name = "Inconnu";
		this.age = 0;
		this.gender = 'U';
	}
	
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.gender = 'U';
	}
	
	private String displayInfo() {
		return "Nom : " +this.name + "\n" + "Age : " + this.age + " Ans " + "\n" + "Sexe : " + this.gender;
//		System.out.println("Nom : " +this.name + "\n" + "Age :" + this.age + "\n" + "Sexe :" + this.gender);
	}

	public static void main(String[] args) {
		Person persone1 = new Person();
		Person persone2 = new Person("Karl", 23, 'F');
		Person persone3 = new Person("Goerge", 37);
		
		System.out.println("persone1 : " + persone1.displayInfo() ) ;
		System.out.println("-------------------------------------------------------------------") ;

		System.out.println("persone2 : " + persone2.displayInfo() );
		System.out.println("-------------------------------------------------------------------") ;

		System.out.println("persone3 :" + persone3.displayInfo());

	
	}

}
