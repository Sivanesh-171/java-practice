public class Strings {
    public static void main(String[] args) {

        String str = "Java";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Reverse:");

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
