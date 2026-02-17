public class OopsBanner {
    public static void main(String[] args) {
        // Define the gap between the letters "O", "O", "P", "S"
        String gap = "   ";

        // Row 1: The Top Caps
        String row1 = String.join(gap, "  *** ", "  *** ", " ***** ", "  **** ");
        
        // Row 2: The Upper Sides
        String row2 = String.join(gap, " * * ", " * * ", " * *", " * ");
        
        // Row 3: The Middle (Where P and S have horizontal bars)
        String row3 = String.join(gap, " * * ", " * * ", " ***** ", "  *** ");
        
        // Row 4: The Lower Sides (P is now a single stem)
        String row4 = String.join(gap, " * * ", " * * ", " * ", "     * ");
        
        // Row 5: The Bottom Caps
        String row5 = String.join(gap, "  *** ", "  *** ", " * ", " **** ");

        // Rendering the Banner
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
    }
}