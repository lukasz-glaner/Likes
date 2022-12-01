public class Main {
    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {
        String result = "";
        int length = names.length;

        switch (length) {
            case 1 -> result += names[0] + " likes this";
            case 2 -> result += names[0] + " and " + names[1] + " like this";
            case 3 -> result += names[0] + ", " + names[1] + " and " + names[2] + " like this";
            case 4 -> {
                int numberOfLikes = names.length - 2;
                result += names[0] + ", " + names[1] + " and " + numberOfLikes + " others like this";
            }
            default -> result += "no one likes this";
        }

        return result;
    }
}
