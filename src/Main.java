public class Main {
    public static void main(String[] args) {
        byte challengeByte = 42;
        short challengeShort = 12345;
        int challengeInt = 12345678;
        int challengeLong = 50000 + (10 * (challengeInt + challengeShort + challengeByte));
    }
}