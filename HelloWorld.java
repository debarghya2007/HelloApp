public class HelloWorld {
    public static void main(String[] args) {
        // If no command-line arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        // If one or more names are provided, use enhanced for-loop
        else {
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}