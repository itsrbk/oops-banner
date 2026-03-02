/**
 * OOPS Banner App - UC6: Static Functions
 * Focus: Modularity, DRY Principle, and Encapsulation
 */
public class BannerApp {

    public static void main(String[] args) {
        // Fetch patterns from static helper methods
        String[] charO = getLetterO();
        String[] charP = getLetterP();
        String[] charS = getLetterS();

        // Populate the final banner array by joining characters row by row
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            // Constructing "OOPS"
            banner[i] = String.join("  ", charO[i], charO[i], charP[i], charS[i]);
        }

        // Render the final banner using an enhanced for-loop
        for (String row : banner) {
            System.out.println(row);
        }
    }

    // --- Static Helper Methods ---

    public static String[] getLetterO() {
        return new String[] {
            " ***** ",
            "* *",
            "* *",
            "* *",
            "* *",
            "* *",
            " ***** "
        };
    }

    public static String[] getLetterP() {
        return new String[] {
            " ***** ",
            "* *",
            "* *",
            " ***** ",
            "* ",
            "* ",
            "* "
        };
    }

    public static String[] getLetterS() {
        return new String[] {
            "  **** ",
            " * ",
            " * ",
            "  **** ",
            "      *",
            "      *",
            "  **** "
        };
    }
}