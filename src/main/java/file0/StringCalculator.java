package file0;

public class StringCalculator {
    public static void main(String[] args){
        String text = "Today I do project on Java";
        System.out.println("Given a string, find the number of words in it.");
        System.out.println(text.split(" ").length);
        System.out.println("Given a string, show number of chars in each word");
        String[] strings = text.split(" ");

        for (int i = 0; i < strings.length; i++) {

            System.out.println(strings[i].length());

        }
        System.out.println("Create function which takes 2 parameters");
        System.out.println(stringCalculator(text, 2));
    }

    static int stringCalculator(String text, int i){
        return text.split(" ")[i].length();
    }
}
