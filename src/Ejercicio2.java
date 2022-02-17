import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the filename");
        String file = input.nextLine();
        fileExt(file);

    }

    public static void fileExt(String file) {
        String name = "";
        String extension = "";

        for (int i = 0; i < file.length(); i++){
            if (file.charAt(i) == '.'){
               break;
            }
            name += file.charAt(i);
        }
        for (int i = name.length() + 1; i < file.length();i++){
            extension += file.charAt(i);
        }
        System.out.println("File Name:" + name);
        System.out.println("Extension:" + extension);

    }
}