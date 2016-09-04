/**
 * Created by Kavya on 9/4/2016.
 */
import java.util.*;
import java.io.*;

public class Diamond {

    public static void main(String[] args) {
        Diamond diamond=new Diamond();
        while(true) {
            diamond.printopn();
            int opt = Integer.parseInt(diamond.getopn());
            diamond.analyzeopn(opt);
        }
    }
    public void printopn()
    {
        System.out.print("\n1. Draw Isosceles Triangle.\n" +
                "2. Draw Diamond.\n" +
                "3. Draw Diamond with name.\n" +
                "4. Exit.\n\n" +
                "Enter your option here : ");
    }

    public String getopn() {
        String inputline = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        return inputline;
    }

    public void analyzeopn(int option) {
        if (option == 1) {
            System.out.println("Enter N : ");
            int n = Integer.parseInt(getopn());
            int space = n - 1;
            for (int k = 1; k <= n; k++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 2 * k - 1; i++) {
                    System.out.print("*");
                }
                System.out.println();
                space--;
            }
        }
        if (option == 2) {
            System.out.println("Enter N : ");
            int n = Integer.parseInt(getopn());
            int space = n - 1;
            for (int k = 1; k <= n; k++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 2 * k - 1; i++) {
                    System.out.print("*");
                }
                System.out.println();
                space--;
            }
                space = 1;
                for (int k = n - 1; k > 0; k--) {
                    for (int j = 0; j < space; j++) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < 2 * k - 1; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    space++;
                }

            }
            if (option == 3) {
                System.out.println("Enter N : ");
                int n = Integer.parseInt(getopn());
                System.out.println("Enter Name : ");
                String name = getopn();
                int space = n - 1;
                for (int k = 1; k < n; k++) {
                    for (int j = 0; j < space; j++) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < 2 * k - 1; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    space--;
                }
                System.out.println(name);
                space = 1;
                for (int k = n - 1; k > 0; k--) {
                    for (int j = 0; j < space; j++) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < 2 * k - 1; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    space++;
                }
            }
            if (option == 4) {
                System.exit(0);
            }
        }
    }

