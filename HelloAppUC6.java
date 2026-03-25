public class HelloAppUC6 {
    public static void main(String[] args) {

        String result = "";

        // Case 1: No arguments
        if (args.length == 0) {
            result = "World";
        } 
        // Case 2: One or more arguments
        else {
            // Build string with trailing ", "
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", " using substring
            result = result.substring(0, result.length() - 2);
        }

        System.out.println("Hello, " + result + "!");
    }
}
