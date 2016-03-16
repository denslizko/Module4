public class DataForTemperature {
    private String text1 = " градуса по Цельсию при переводе в Фаренгейты будет ";
    private String text2 = " градуса по Фаренгейту при переводе в Цельсии будет ";
    private int tc1;
    private int tf2;
    private double tf1;
    private double tc2;

    DataForTemperature(int cel1, int far2){
        tc1 = cel1;
        tf2 = far2;
        tf1 = tc1*1.8+32;
        tc2 = (tf2-32)/1.8;
    }

    public String getText1() {

        return text1;
    }

    public String getText2() {

        return text2;
    }

    public double getTf1() {
        return tf1;
    }

    public double getTc2() {
        return tc2;
    }

    public int getTc1() {
        return tc1;
    }

    public int getTf2() {
        return tf2;
    }
}
