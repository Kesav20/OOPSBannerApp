/**
 * OOPSBannerApp UC5 - Inline Array Initialization
 * This version combines array declaration and initialization into a single 
 * statement using inline array literal syntax, making the code more concise.
 *
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {

        // Inline declaration + initialization using String.join()
        String[] banner = {
            String.join(" ", "  *****  ", "  *****  ", " ******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *     * "),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *       "),
            String.join(" ", " *     * ", " *     * ", " ******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", " *       ", "       * "),
            String.join(" ", " *     * ", " *     * ", " *       ", " *     * "),
            String.join(" ", "  *****  ", "  *****  ", " *       ", "  *****  ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}