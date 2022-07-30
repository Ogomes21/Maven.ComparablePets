package io.zipcoder;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int numPets;

        //Asks user how many pets they have
        System.out.println("How many pets do you have?");
        Scanner userInput = new Scanner(System.in);
        numPets = userInput.nextInt();
        Pet[] userPets = new Pet[numPets];
        //User picks type and set a name
        for (int i =0; i < numPets; i++) {
            System.out.println("What is pet #" + (i+1) + "'s type? (Dog, Cat, or Pig?)");
            String petType = userInput.next().toLowerCase();
            String petName;
            switch (petType) {
                case "dog":
                    System.out.println("What is your dog's name?");
                    petName = userInput.next();
                    userPets[i] = new Dog(petName);
                    break;
                case "cat":
                    System.out.println("What is your cat's name?");
                    petName = userInput.next();
                    userPets[i] = new Cat(petName);
                    break;
                case "pig":
                    System.out.println("What is your pig's name?");
                    petName = userInput.next();
                    userPets[i] = new Pig(petName);
                    break;
                default:
                    i--;
                    break;
            }

        }
        //Will print all pets
        for (Pet pet : userPets) System.out.print(pet);
    }
}
