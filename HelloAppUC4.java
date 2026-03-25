public class HelloAppUC4 {
     public static void main(String[] args) {

        String result;

        // Case 1: No arguments
        if (args.length == 0) {
            result = "World";
        } 
        // Case 2: One or more arguments
        else {
            // Join names with comma and space
            result = String.join(", ", args);
        }

        System.out.println("Hello, " + result + "!");
    }
    
}
