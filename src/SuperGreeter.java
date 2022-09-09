import  java.util.Scanner;
public class SuperGreeter {

    public static void main(String[] args) {
        String name;
        SuperGreeter sg = new SuperGreeter();
        sg.start();
    }
    public void start() {
        System.out.println("Det virker!");
    }

    public void greet(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
    }

}
