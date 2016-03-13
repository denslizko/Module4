public class Temperature {
    public static void main(String[] args) {
        DataForTemperature dataForTemperature = new DataForTemperature(40, 104);

        System.out.println(dataForTemperature.getTc1() + dataForTemperature.getText1()+dataForTemperature.getTf1());
        System.out.println(dataForTemperature.getTf2() + dataForTemperature.getText2()+dataForTemperature.getTc2());
    }
}
