import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // The CharacterPattern Class (or inner static class)
    public static class CharacterPatternMap {
        private static final Map<Character, String[]> patternMap = new HashMap<>();

        // Static block to initialize patterns once
        static {
            patternMap.put('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                "  OOO  "
            });
            patternMap.put('P', new String[]{
                " PPPP  ",
                " P   P ",
                " PPPP  ",
                " P     "
            });
            patternMap.put('S', new String[]{
                "  SSS  ",
                " S     ",
                "  SSS  ",
                "     S ",
                "  SSS  "
            });
        }

        public static String[] getPattern(char c) {
            return patternMap.getOrDefault(c, new String[]{" ? "}); // Default for missing chars
        }
    }

    public static void printBanner(String input) {
        int height = 5; // Assuming a uniform height for simplicity
        
        for (int i = 0; i < height; i++) {
            StringBuilder row = new StringBuilder();
            for (char c : input.toUpperCase().toCharArray()) {
                String[] pattern = CharacterPatternMap.getPattern(c);
                if (i < pattern.length) {
                    row.append(pattern[i]).append("  ");
                } else {
                    row.append("       "); // Padding for shorter characters
                }
            }
            System.out.println(row.toString());
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}