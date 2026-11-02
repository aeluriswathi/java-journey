import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        StringBuilder name1=new StringBuilder(sc.nextLine());
        StringBuilder name2=new StringBuilder(sc.nextLine());
       /* // using loops
       int counter=0;
        boolean result=false;
        if(name1.length()!=name2.length())
            System.out.println("not anagram");
        else {
            for (int i = 0; i < name1.length(); i++) {
                result = false;
                for (int j = 0; j < name2.length(); j++) {
                    if (name1.charAt(i) == name2.charAt(j)) {
                        name2.deleteCharAt(j);
                        //  counter++;
                        result = true;
                        //System.out.println(name1.charAt(i)+" : result : "+result );
                        break;
                    }
                }
                //   System.out.println(name1 +" :  "+result+ " : "+name2);
                if (!result)
                    break;
            }

            if (result)
                System.out.println("anagram");
            else
                System.out.println("not anagram");
        }*/
        // using arrays
        char[] arr1= name1.toString().toCharArray();
        char[] arr2= name2. toString().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
            System.out.println("anagram");
        else
            System.out.println("not anagram");

    }
}
