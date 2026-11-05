# TP 9 : Gestion des exceptions en Java

##  Description
Ce TP a pour objectif de comprendre et de maîtriser la gestion des exceptions en Java afin de développer des applications plus fiables et sécurisées.

Il présente les différentes techniques de gestion des erreurs à travers plusieurs exercices pratiques.

##  Objectifs pédagogiques
- Comprendre les exceptions Checked et Unchecked.
- Utiliser `try`, `catch` et `finally`.
- Comprendre la propagation des exceptions avec `throws`.
- Utiliser Try-With-Resources pour gérer les fichiers.
- Créer et utiliser des exceptions personnalisées.
- Enregistrer les erreurs dans un fichier journal (`error.log`).

##  Technologies utilisées
- Java
- Eclipse IDE
- Java I/O (FileReader, BufferedReader)
- Gestion des exceptions

## Structure du projet

```text
exception_java/
└── src/
    ├── module-info.java
    └── com.example.tp9/
        ├── Main.java
        ├── Calculator.java
        ├── FileReaderUtil.java
        ├── User.java
        ├── InvalidUserException.java
        └── LoggerUtil.java
```

## Exercices réalisés

### Exercice 1 : Calculatrice sécurisée
- Gestion des erreurs arithmétiques.
- Détection de la division par zéro.
- Utilisation de `try/catch`.
<img width="1366" height="768" alt="1" src="https://github.com/user-attachments/assets/1c94c021-9480-4917-a2c6-253c2a1f3948" />

### Exercice 2 : Lecture de fichiers
- Lecture d'un fichier texte avec `FileReader`.
- Utilisation de `BufferedReader`.
- Propagation des exceptions avec `throws`.
- Gestion des ressources avec `finally`.
- Modernisation avec Try-With-Resources.
<img width="1366" height="768" alt="ex1" src="https://github.com/user-attachments/assets/bffd4c53-0977-4d6b-931b-961ae0e69a73" />

### Exercice 3 : Exceptions personnalisées
- Création de la classe `InvalidUserException`.
- Validation des informations d'un utilisateur.
- Vérification du nom et de l'âge.

### Exercice 4 : Journalisation des erreurs
- Création de la classe `LoggerUtil`.
- Enregistrement des erreurs dans un fichier `error.log`.
- Intégration des différents composants dans `Main.java`.
<img width="1366" height="768" alt="ex3" src="https://github.com/user-attachments/assets/aaec2f06-c7a6-4ad6-b391-c8ce3194759f" />

## Captures d'écran des exécutions

### 1. Test de la calculatrice sécurisée

<img width="1366" height="768" alt="1" src="https://github.com/user-attachments/assets/f16000e3-f7b9-4caf-8c64-2aa722ef6650" />


### 2. Test de lecture de fichiers et gestion des exceptions

<img width="1366" height="768" alt="ex1" src="https://github.com/user-attachments/assets/9bd8c033-be00-42f1-8653-14408465cf2c" />


### 3. Test final : intégration et journalisation des erreurs

<img width="1366" height="768" alt="ex3" src="https://github.com/user-attachments/assets/eaf6c13d-af04-4ca0-923d-cf3ea7f7bc34" />


##  Résultat final

Les différents exercices permettent de maîtriser la gestion des exceptions en Java, la lecture des fichiers, les exceptions personnalisées et la journalisation des erreurs.

**TP réalisé dans le cadre du cours : Fondamentaux et Concepts Avancés de la Programmation Java .**
