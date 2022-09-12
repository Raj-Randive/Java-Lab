// 8. Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word “quit”. Display the total count of each vowel for all sentences.

import java.util.Scanner;
class P08CountEachVowelForAllSentences {
    public static int a, e, i, o, u;

    public static void main(String m[]) {

        Scanner sc = new Scanner(System.in);
        String s = new String();

        while (true) {
            int ta = 0, te = 0, ti = 0, to = 0, tu = 0;

            System.out.println("\nEnter A line (Type \"quit\" to exit the code)");
            s = sc.nextLine();

            if (s.equals("quit")) {
                break;
            } 
            else {

                for (int j = 0; j <= s.length() - 1; j++) {
                    switch (Character.toLowerCase(s.charAt(j))) {
                        case 'a':
                            a++;
                            ta++;
                            break;
                        case 'e':
                            e++;
                            te++;
                            break;
                        case 'i':
                            i++;
                            ti++;
                            break;
                        case 'o':
                            o++;
                            to++;
                            break;
                        case 'u':
                            u++;
                            tu++;
                            break;
                    }

                }
                System.out.println("\nIn this statement:");
                System.out.println("a comes: " + ta + " times");
                System.out.println("e comes :" + te + " times");
                System.out.println("i comes :" + ti + " times");
                System.out.println("o comes: " + to + " times");
                System.out.println("u comes :" + tu + " times");
            }
        }
        sc.close();
        System.out.println("\nTotal numbers of the vowels:");
        System.out.println("a comes " + a + " times");
        System.out.println("e comes " + e + " times");
        System.out.println("i comes " + i + " times");
        System.out.println("o comes " + o + " times");
        System.out.println("u comes " + u + " times");
    }
}
