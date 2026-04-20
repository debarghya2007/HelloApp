public class HelloWorld {
    public static void main(String[] args) {
        if (args.length > 0) {
            String Debarghya = args[0];
            System.out.println("Hello, " + Debarghya + "!");
        } else {
            System.out.println("Hello! Please provide your name as an argument.");
        }
    }
}

