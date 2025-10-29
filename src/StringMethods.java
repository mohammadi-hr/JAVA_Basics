import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = "  Java Programming Language  ";
        String str2 = "JAVA programming language";
        String str3 = "   Hello World   ";

        // 1️⃣ length()
        System.out.println("str1 > length : " + str1.length());

        // 2️⃣ charAt()
        System.out.println("str2 > Character at index 5 : " + str2.charAt(5));

        // 3️⃣ substring()
        System.out.println("str2 > Substring(0, 5) : " + str2.substring(0, 5));

        // 4️⃣ toUpperCase() / toLowerCase()
        System.out.println("str2 > toUpperCase() : " + str2.toUpperCase());
        System.out.println("str2 > toLowerCase() : " + str2.toLowerCase());

        // 5️⃣ trim()
        System.out.println("str3 > Trimed : [" + str3.trim() + "]");

        // 6️⃣ equals() and equalsIgnoreCase()
        System.out.println("str1 equals str2 > " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 > " + str1.equalsIgnoreCase(str2));
        String str = str1.trim();
        System.out.println("trimed str1 equalsIgnoreCase str2 > " + str.equalsIgnoreCase(str2));

        // 7️⃣ contains()
        System.out.println("str3 > contains World : " + str3.contains("World"));

        // 8️⃣ startsWith() and endsWith()
        System.out.println("str2 > starts with J : " + str2.startsWith("J"));
        System.out.println("str2 > ends with language : " + str2.endsWith("language"));

        // 9️⃣ indexOf() and lastIndexOf()
        System.out.println("str3 > indexOf('o'): " + str3.indexOf('o'));
        System.out.println("str3 >  lastIndexOf('o'): " + str3.lastIndexOf('o'));

        // 🔟 replace() and replaceAll()
        System.out.println("str1 > replace(' ', '_'): " + str.replace(' ', '_'));
        System.out.println("str1 > replaceAll('Java', 'Python'): " + str.replaceAll("Java", "Python"));

        // 11️⃣ split()
        String[] words = str1.trim().split(" ");
        System.out.println("str1 split(' ') : ");
        for (String w : words) System.out.print("<" + w + ">");
        System.out.println();

        // 12️⃣ concat()
        System.out.println("str2 > concat(): " + str2.concat(" is awesome!"));

        // 13️⃣ isEmpty() and isBlank() (Java 11+)
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("isEmpty(): " + emptyStr.isEmpty());
        System.out.println("isBlank(): " + blankStr.isBlank());
        System.out.println("isBlank() is empty ? : " + blankStr.isEmpty());

        // 14️⃣ compareTo() and compareToIgnoreCase()
        System.out.println("compareTo() Apple with Banana: " + "Apple".compareTo("Banana"));
        System.out.println("compareToIgnoreCase() apple with APPLE: " + "apple".compareToIgnoreCase("APPLE"));

        String[] names = {"Ali", "sara", "Reza", "amir"};

        System.out.println("Normal compareTo {\"Ali\", \"sara\", \"Reza\", \"amir\"} :");
        Arrays.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(names)); // حساس به حروف بزرگ/کوچک

        System.out.println("\ncompareToIgnoreCase {\"Ali\", \"sara\", \"Reza\", \"amir\"} :");
        Arrays.sort(names, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println(Arrays.toString(names)); // بدون حساسیت به حروف

        // 15️⃣ format()
        String formatted = String.format("Hello %s, you are %d years old.", "Hamidreza", 37);
        System.out.println(formatted);

        // 16️⃣ join()
        String joined = String.join("-", "Java", "Spring", "Hibernate");
        System.out.println("join() \"Java\", \"Spring\", \"Hibernate\" with - : " + joined);

        // 17️⃣ repeat() (Java 11+)
        System.out.println("repeat() Hi 3 times : " + "Hi ".repeat(3));

        // 18️⃣ matches() with regex
        System.out.println("str1 > matches('.*Language.*'): " + str1.matches(".*Language.*"));

        // 19️⃣ strip() (Java 11+, like trim but Unicode-aware)
        System.out.println("19. strip(): [" + str3.strip() + "]");

        // 20️⃣ toCharArray()
        char[] chars = str1.trim().toCharArray();
        System.out.print("str1 > toCharArray(): ");
        for (char c : chars) System.out.print(c + " ");
        System.out.println();

        // 21️⃣ valueOf()
        int num = 123;
        double pi = 3.14159;
        boolean flag = true;
        char letter = 'A';
        char[] java_chars = {'J','a','v','a'};
        Object obj = new java.util.Date();

        // تبدیل به String
        String s1 = String.valueOf(num);
        String s2 = String.valueOf(pi);
        String s3 = String.valueOf(flag);
        String s4 = String.valueOf(letter);
        String s5 = String.valueOf(java_chars);
        String s6 = String.valueOf(obj);

        System.out.println(s1); // "123"
        System.out.println(s2); // "3.14159"
        System.out.println(s3); // "true"
        System.out.println(s4); // "A"
        System.out.println(s5); // "Java"
        System.out.println(s6); // "Thu Oct 29 15:30:00 IST 2025"  ← نتیجه toString() شیء

    }
}
