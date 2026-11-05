package com.example.tp9;

public class Main {
    /*public static void main(String[] args) {
        try {
            int resultat = 10 / 0;
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.err.println("Erreur arithmétique capturée : " + e.getMessage());
            e.printStackTrace();
        }
    }*/
//exercice1:
/*	    public static void main(String[] args) {
	        Calculator calc = new Calculator();

	        System.out.println("--- Test Addition ---");
	        System.out.println("15+ 23 = " + calc.add(15, 23));

	        System.out.println("--- Test Division Valide ---");
	        try {
	            System.out.println("10 / 2 = " + calc.divide(10, 2));
	        } catch (IllegalArgumentException e) {
	            System.err.println(e.getMessage());
	        }

	        System.out.println("--- Test Division par Zéro ---");
	        try {
	            System.out.println("1 / 0 = " + calc.divide(1, 0));
	        } catch (IllegalArgumentException e) {
	            System.err.println("Erreur interceptée : " + e.getMessage());
	        }
	    }*/
	 public static void main(String[] args) {
	        System.out.println("=== DÉBUT DU PROGRAMME TP9 ===");

	        // Test de la création d'un utilisateur invalide
	        try {
	            User user = new User("", 150);
	        } catch (InvalidUserException e) {
	            System.err.println("Échec de création utilisateur : " + e.getMessage());
	            LoggerUtil.logError(e.getMessage());
	        }

	        // Test de lecture de fichier inexistant
	        FileReaderUtil readerUtil = new FileReaderUtil();
	        readerUtil.readFileModern("inexistant.txt");

	        System.out.println("=== FIN DU PROGRAMME TP9 ===");
	    }
}
