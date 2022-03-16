package main;

import java.sql.*;

import java.util.Scanner;

import conseiller.GetConseiller;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Entrez un Prénom");
	    String firstName = sc.nextLine(); 
	    
	    System.out.println("entrez un mot de passe");
	    String inputPassword = sc.nextLine(); 
	    
	    GetConseiller conseiller = new GetConseiller(); 
	    

	    if(inputPassword.equals(conseiller.getCons(firstName).getPassword())) {
	    	System.out.println("auth réussi");
	    	System.out.println("Bonjour" + " " + conseiller.getCons(firstName).getFirstName());
	    } else {
	    	System.out.println("auth échouée");
	    }
	    
	    
	    
	    
		}

	}



