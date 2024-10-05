package DataStructures.Arrays.Deletion.BinaryDeletion;

public class DadProj {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a: ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter b: ");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
