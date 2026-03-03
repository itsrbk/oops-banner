import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Final Evolution of OOPS Banner App
 * Focus: Centralized Map-based storage and decoupled rendering logic.
 */
public class BannerApp {

    // Centralized Pattern Library using HashMap for O(1) lookup
    private static final Map<Character, String[]> PATTERN_LIBRARY = new HashMap<>();

    static {
        loadPatterns();
    }

    private static void loadPatterns() {
        PATTERN_LIBRARY.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });
        PATTERN_LIBRARY.put('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        });
        PATTERN_LIBRARY.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });
    }

    /**
     * Renders the banner by fetching patterns from the Map.
     * Adheres to the Single Responsibility Principle.
     */
    public static void renderBanner(String input) {
        if (input == null || input.isEmpty()) return;
        
        String word = input.toUpperCase();
        int patternHeight = 5; 
        StringBuilder output = new StringBuilder();

        for (int line = 0; line < patternHeight; line++) {
            for (char c : word.toCharArray()) {
                // Efficient lookup via Map
                String[] pattern = PATTERN_LIBRARY.getOrDefault(c, getEmptyPattern());
                output.append(pattern[line]).append("  "); 
            }
            output.append("\n");
        }
        
        System.out.println(output.toString());
    }

    private static String[] getEmptyPattern() {
        return new String[]{"      ", "      ", "      ", "      ", "      "};
    }

    public static void main(String[] args) {
        System.out.println("--- UC8: OOPS Banner App (Final Optimized Version) ---\n");
        renderBanner("OOPS");
    }
}