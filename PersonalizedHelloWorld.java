import java.util.Scanner;

public class PersonalizedHelloWorld{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name?");
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        while(name.isBlank()){
            System.out.print("Please enter your name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
