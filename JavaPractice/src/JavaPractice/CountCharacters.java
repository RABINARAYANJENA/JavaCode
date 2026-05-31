package JavaPractice;

public class CountCharacters {

    public static void main(String[] args) {

        String str = "aaabbbcaaddeff";

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {

                count++;

            } else {

                System.out.print(str.charAt(i) + "" + count);

                count = 1;
            }
        }

        // Print last character count
        System.out.print(str.charAt(str.length() - 1) + "" + count);
    }
}
