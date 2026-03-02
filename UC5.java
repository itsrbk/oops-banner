public class BannerApp {
    public static void main(String[] args) {
        // UC5: Combining declaration, initialization, and String.join()
        String[] bannerLines = {
            String.join("  ", " ***** ", " ***** ", " ***** ", " **** "), // Line 0
            String.join("  ", "* *", "* * ", "* *", "* * "), // Line 1
            String.join("  ", "* *", "* * ", "* *", "* * "), // Line 2
            String.join("  ", "* *", " ***** ", "* *", "* * "), // Line 3
            String.join("  ", "* *", "* ", "* *", "* * "), // Line 4
            String.join("  ", "* *", "* ", "* *", "* * "), // Line 5
            String.join("  ", " ***** ", "* ", " ***** ", " **** ")  // Line 6
        };

        // Efficient rendering using the Enhanced For-Loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}