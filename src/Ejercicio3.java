import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the sentence");
        String sentence = input.nextLine();
        initialVocalStart(sentence);
    }

    public static void initialVocalStart(String sentence) {
        String vocales = "AEIOUaeiou";
        int count = 0;
        int i = 0;
        do {
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(0) == vocales.charAt(j))
                    count++;
            }
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    for (int k = 0; k < sentence.length(); k++) {
                        if (sentence.charAt(j+1) == vocales.charAt(k))
                            count++;
                    }
                }
            }
            i++;
        } while (i < sentence.length());
        System.out.println("There was " + count + " vocals");
    }
}


