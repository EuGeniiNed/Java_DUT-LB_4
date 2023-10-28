public class Main {

    public static boolean isPalindrome(String word) {
        // Видаляємо пробіли і переводимо все в нижній регістр для порівняння
        String cleanWord = word.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = cleanWord.length() - 1;

        while (left < right) {
            if (cleanWord.charAt(left) != cleanWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Приклади тестування
        String testWord1 = "level";
        String testWord2 = "Java";
        String testWord3 = "A man a plan a canal Panama";

        System.out.println(testWord1 + " is a palindrome: " + isPalindrome(testWord1));
        System.out.println(testWord2 + " is a palindrome: " + isPalindrome(testWord2));
        System.out.println(testWord3 + " is a palindrome: " + isPalindrome(testWord3));
    }
}