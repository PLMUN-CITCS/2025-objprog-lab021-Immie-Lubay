import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args){
        
        System.out.println("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String getSentenceInput = input.nextLine();
        
        String[] countWords = getSentenceInput.split(" "); //divide the words base sa white space na meron
        
        System.out.println("The sentence has " + countWords.length + " words");
    }

}