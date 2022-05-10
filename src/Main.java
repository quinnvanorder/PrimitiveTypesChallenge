public class Main {
    public static void main(String[] args) {
        byte challengeByte = 42;
        short challengeShort = 12345;
        int challengeInt = 12345678;
        long challengeLong = 50000L + 10L * (challengeInt + challengeShort + challengeByte);
        System.out.println(challengeLong);
    }
}