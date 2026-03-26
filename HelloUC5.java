public class HelloUC5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder result = new StringBuilder();

        boolean first = true;
        for (String name : args) {
            if (!first) {
                result.append(", ");
            }
            result.append(name);
            first = false;
        }

        System.out.println("Hello, " + result + "!");
    }
}