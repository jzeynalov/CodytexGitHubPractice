public class ReverseString {

    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/reverse-a-string-in-java/

        String str = "Codytex", rev = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Codytex"); //Example word

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println("Reversed word: " + rev);

        // easy way

        String word = "Codytex";
        StringBuffer my1 = new StringBuffer(word);
        my1.reverse();
        System.out.println(my1);
        System.out.println(word);

        String reverse = "";
        for (int i = word.length()-1; i>=0; i--) {
            reverse=reverse+word.charAt(i);
        }
        System.out.println(reverse);

    }




}
