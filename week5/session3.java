public class StringHandlingBasics {
    public static void main(String[] args) {
        // 1. String Creation
        String s1 = "Hello"; // String literal (stored in String Pool)
        String s2 = new String("World"); // Using 'new' keyword

        // 2. Concatenation
        String message = s1 + " " + s2 + "!";
        System.out.println("Concatenation: " + message);

        // 3. Length
        System.out.println("Length of message: " + message.length());

        // 4. Character Extraction
        System.out.println("Character at index 1: " + s1.charAt(1));

        // 5. Substring
        System.out.println("Substring (0 to 5) of message: " + message.substring(0, 5));

        // 6. Case Conversion
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s2.toLowerCase());

        // 7. Searching
        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 8. Replacement
        String replaced = text.replace("Programming", "Language");
        System.out.println("Replaced string: " + replaced);

        // 9. String Comparison
        String strA = "Java";
        String strB = "java";
        System.out.println("Equals (case-sensitive): " + strA.equals(strB));
        System.out.println("Equals (ignore case): " + strA.equalsIgnoreCase(strB));
    }
}
output
  Concatenation: Hello World!
Length of message: 12
Character at index 1: e
Substring (0 to 5) of message: Hello
Uppercase: HELLO
Lowercase: world
Index of 'Pro': 5
Contains 'Java': true
Replaced string: Java Language
Equals (case-sensitive): false
Equals (ignore case): true
