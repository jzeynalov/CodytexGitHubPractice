public class ReverseString {

    public static void main(String[] args) {
        
        // conventional way through for loop  
        // https://www.geeksforgeeks.org/reverse-a-string-in-java/

        String str = "Codytex", reversed = "";
        char string;

        System.out.print("Original word: ");
        System.out.println("Codytex"); //Example word

        for (int i = 0; i < str.length(); i++) {
            string = str.charAt(i);
            reversed = string + reversed;
        }
        System.out.println("Reversed word: " + reversed);

        // easy way but not acceptable during the interview

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
