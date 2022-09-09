import  java.util.Scanner;
public class SuperGreeter {

    public static void main(String[] args) {
        String name;
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
        sg.askAboutAge();
    }
    public void start() {
        System.out.println("Det virker!");
    }

    public void greet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skiv dit navn!");
        String name = sc.nextLine();
        System.out.println("Hej " + name);
    }

    public int askAboutAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skiv din alder");
        int age = sc.nextInt();

        return age;


    }

}
