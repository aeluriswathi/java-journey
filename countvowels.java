import java.util.Scanner;
public class countvowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder name=new StringBuilder(sc.nextLine());
        int counter=0;
        StringBuilder vowels=new StringBuilder();
        StringBuilder consonents=new StringBuilder();
        for(int i=0; i<name.length();i++){
            if (name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='o'||name.charAt(i)=='i'||name.charAt(i)=='u'){
                counter++;
                vowels.append(name.charAt(i));
            }
            else {
                consonents.append(name.charAt(i));
            }
        }
        System.out.println("vowels : "+counter+" the vowels are : "+vowels);
        System.out.println("vowels : "+(name.length()-counter)+" the consonents are : "+consonents);
    }
}
