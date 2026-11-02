import java.util.Scanner;
public class countWords {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String names=sc.nextLine();
        names=names.trim();
        if (names.isEmpty()){
            System.out.println("word count: 0");
        }
        else {
            String[] words = names.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
    }
}
