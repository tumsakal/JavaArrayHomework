package MainPack;

import java.util.Arrays;
import java.util.Scanner;

public class HW_Random_Generated_Password {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Password Length = ");
        n = input.nextInt();
        char[] raw_password = new char[n];
        for (int i = 0; i < raw_password.length; i++) {
            int random_type = (int) (Math.random() * 3);
            switch (random_type) {
                case 0:
                    raw_password[i] = (char) (int) ((Math.random() * ('z' - 'a')) + 'a');
                    break;
                case 1:
                    raw_password[i] = (char) (int) ((Math.random() * ('Z' - 'A')) + 'A');
                    break;
                case 2:
                    raw_password[i] = (char) (int) ((Math.random() * ('9' - '0')) + '0');
                    break;
            }
        }
        String random_generated_password = new String(raw_password);
        System.out.println("Random Generated Password = " + random_generated_password);
    }
}
