      
package Exercice2;
import java.util.*;

public class Exercice2 {

	private int age = 40;
	private Double prix = 333.44 ;
	private char sexe = 'M';
	private boolean isPresent = false;
	
	public Exercice2() {
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public static void main(String[] args) {
		Exercice2 exercice2  = new Exercice2();
		System.out.println("Age : " + exercice2.age + " Ans" + "\n" + "Prix : " + exercice2.prix + " FCFA" + "\n");	
		System.out.print("Sexe : " + exercice2.sexe + "\n" + "Presence : " + exercice2.isPresent + "\n");
		System.out.print("-------------------------------------------------------------------" + '\n');	 
		
		exercice2.setAge(23);
		exercice2.setPrix(222.99);
		exercice2.setSexe('F');
		exercice2.setPresent(true);
		
		System.out.println("Age : " + exercice2.age + " Ans" + "\n" + "Prix : " + exercice2.prix + " FCFA" + "\n");	
		System.out.print("Sexe : " + exercice2.sexe + "\n" + "Presence : " + exercice2.isPresent + "\n");
	
		System.out.print("-------------------------------------------------------------------" + '\n');	 

		int i = exercice2.prix.intValue(); 
		System.out.println(i);  
		System.out.print("-------------------------------------------------------------------" + '\n');	 

		System.out.println(exercice2.prix * exercice2.age);  
		System.out.print("-------------------------------------------------------------------" + '\n');	 

		// ce bout de code faire une verrification pour prendre une décision basée sur les valeurs des variables
		if (exercice2.prix > exercice2.age) {
			System.out.println("Vous devez contribué plus");  
		}
		System.out.print("-------------------------------------------------------------------" + '\n');	 

		
		// ce bout de code faire des verrifications pour prendre une décision basée sur les valeurs des variables
		if (exercice2.prix > exercice2.age) {
			System.out.println("Vous devez contribué plus");  
		} else {
			System.out.println("Votre contribution est suffisante");  

		}
		System.out.print("-------------------------------------------------------------------" + '\n');	 



	}

}