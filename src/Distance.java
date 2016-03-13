public class Distance {
    public static void main(String[] args) {
       DataForDistance dataForDistance = new DataForDistance("Дистанция между точками = ", 1, 3, 5, 10);
        System.out.println(dataForDistance.getDis() + dataForDistance.getFormula());
    }
}
