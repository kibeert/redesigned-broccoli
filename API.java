import java.util.Scanner;

class API {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = obj.nextLine();
        System.out.println("Username is :  " + userName);
    }
}