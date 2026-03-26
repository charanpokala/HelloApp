public class HelloUC4 {
    public static void main(String[] args) {
        String result;

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);
                if (i < args.length - 1) {
                    sb.append(", ");
                }
            }

            result = sb.toString();
        } else {
            result = "World";
        }

        System.out.println("Hello, " + result + "!");
    }
}