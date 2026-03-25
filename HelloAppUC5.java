public class HelloAppUC5 {
    public static void main(String[] args) {

        String result = "";

        // Case 1: No arguments
        if (args.length == 0) {
            result = "World";
        } 
        // Case 2: One or more arguments
        else {
            // Using enhanced for loop
            for (String name : args) {
                if (!result.isEmpty()) {
                    result += ", ";
                }
                result += name;
            }
        }

        System.out.println("Hello, " + result + "!");
    }
}
