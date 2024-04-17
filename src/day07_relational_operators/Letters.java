package day07_relational_operators;

public class Letters {
    public static void main(String[] args) {
        // Task: Define a character. Print next 4 characters
        char letter = 'G';

        System.out.println("Original character "+ letter++);//still G
        System.out.println("Next 4 characters: ");
        System.out.println(letter++); //letter + 1 this is not what we do ...we do letter = letter + 1;
        System.out.println(letter++); //letter + 1 this is not what we do ...we do letter = letter + 1;
        System.out.println(letter++); //letter + 1 this is not what we do ...we do letter = letter + 1;
        System.out.println(++letter); //letter + 1 this is not what we do ...we do letter = letter + 1;

    }
}
