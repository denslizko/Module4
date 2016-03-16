public class Distance {
    public static void main(String[] args) {
       DataForDistance dataForDistance = new DataForDistance("Дистанция между точками = ", 10, 15, 20, 25);
        System.out.println(dataForDistance.getDis() + dataForDistance.getFormula());
    }
}
