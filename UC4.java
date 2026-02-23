public class BannerApp {
    public static void main(String[] args) {
        // UC4: Storing banner lines in a String array
        String[] bannerLines = {
            "===========================",
            "|                         |",
            "|   WELCOME TO SRMIST     |",
            "|    OOPS BANNER APP      |",
            "|                         |",
            "==========================="
        };

        // UC4: Using an enhanced for-loop for clean output traversal
        // This avoids multiple System.out.println() statements
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}