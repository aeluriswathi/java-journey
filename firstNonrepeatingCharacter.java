import java.util.Scanner;
public class firstNonrepeatingCharacter {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        StringBuilder name= new StringBuilder(sc.nextLine());
// methos 1 using loops
     /*   for (int i=0;i<name.length();i++){
            int counter=0;
            for(int j=0;j< name.length();j++) {
                 if (name.charAt(j) == name.charAt(i)) {
                    counter++;
                }
            }
            if (counter == 1 )
            {
                System.out.println(" non repeating character is: "+ name.charAt(i));
                break;
            }

        }*/
        // method 2 using indexof
        String names=name.toString();
        for(int i=0;i<names.length();i++){
        if(names.indexOf(names.charAt(i)) ==names.lastIndexOf(names.charAt(i))){
            System.out.println(names.charAt(i));
            break;
        }

        }

    }
}
