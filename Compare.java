import java.util.Random;

public class Compare {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int a = rand.nextInt(100) + 1;  // 1 to 100
        int b = rand.nextInt(100) + 1;
        while (a == b) {                // avoid ties
            b = rand.nextInt(100) + 1;
        }
        
        int larger  = Math.max(a, b);
        int smaller = Math.min(a, b);
        
        // Output HTTP headers + blank line
        System.out.println("Content-Type: text/html");
        System.out.println();
        
        // HTML5 output
        System.out.println("<!DOCTYPE html>");
        System.out.println("<html lang=\"en\">");
        System.out.println("<head>");
        System.out.println("    <meta charset=\"UTF-8\">");
        System.out.println("    <meta http-equiv=\"Cache-Control\" content=\"no-cache, no-store, must-revalidate\">");
        System.out.println("    <meta http-equiv=\"Pragma\" content=\"no-cache\">");
        System.out.println("    <meta http-equiv=\"Expires\" content=\"0\">");
        System.out.println("    <title>Which is larger?</title>");
        System.out.println("</head>");
        System.out.println("<body>");
        System.out.println("    <h1>Click the larger number</h1>");
        System.out.println("    <p style=\"font-size: 4em; letter-spacing: 1.5em;\">");
        System.out.println("        <a href=\"/right.htm\">" + larger + "</a>");
        System.out.println("            ");
        System.out.println("        <a href=\"/wrong.htm\">" + smaller + "</a>");
        System.out.println("    </p>");
        System.out.println("    <p><small>Refresh or click Try again for new numbers</small></p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}