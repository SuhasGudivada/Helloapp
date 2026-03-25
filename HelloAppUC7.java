public class HelloAppUC7 {
     public static void main(String[] args) {

        String result;

        // Case 1: No arguments → default message
        if (args.length == 0) {
            result = "World";
        } 
        // Case 2: Join all arguments with ", "
        else {
            result = String.join(", ", args);
        }

        System.out.println("Hello, " + result + "!");
    }
}
