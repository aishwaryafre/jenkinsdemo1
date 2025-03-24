public class Cmdline {
    public static void main(String[] args) {
        // Check if enough arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <add|sub|mul|div> <num1> <num2>");
            return;
        }

        String operation = args[0];
        double num1, num2;

        // Parse the numbers from the arguments
        try {
            num1 = Double.parseDouble(args[1]);
            num2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Both num1 and num2 must be valid numbers.");
            return;
        }

        // Perform the specified operation
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "sub":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "mul":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "div":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operation. Use add, sub, mul, or div.");
        }
    }
}

