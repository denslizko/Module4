public class Temperature {
    public static void main(String[] args) {
        String text1 = " градуса по Цельсию при переводе в Фаренгейты будет ";
        String text2 = " градуса по Фаренгейту при переводе в Цельсии будет ";
        int tc1 = 24;
        int tf2 = 85;
        double tf1 = tc1*1.8+32;
        double tc2 = (tf2-32)/1.8;
        System.out.println(tc1 + text1 + tf1);
        System.out.println(tf2 + text2 + tc2);
    }
}
