package day25_methods;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "Apple";
        char letter = 'p';


        int num = frequencyOfCharacters(word,letter);
        System.out.println(num);

        System.out.println(frequencyOfCharacters("LOOpcamp",'O'));

        System.out.println(frequencyOfCharacters("Wednesday",'e'));

//        frequencyOfCharacters(word, letter);
    }

    public static int frequencyOfCharacters(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }


        }
        return count;
    }
}