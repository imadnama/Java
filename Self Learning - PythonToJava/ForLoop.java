public class ForLoop {
    public static void main(String[] args) {
        for (int i=1; i<5; i++) {
            System.out.println(i);
        }
        for (int x=5; x<11; x++) {
            System.out.println(x);
        }
        String str = "Hello";
        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }
    }
}
