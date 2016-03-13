public class Area {
    public static void main(String[] args) {
    //Считаем примитивно площадь круга
    String ctext = "Площадь круга = ";
    int circleRadius = 5;
    System.out.println(ctext + Math.PI*circleRadius*circleRadius);

    //Считаем примитивно площадь треугольника
    String ttext = "Площадь треугольника = ";
    int tside1 = 4;
    int tside2 = 10;
    int tside3 = 8;
    int number = (tside1+tside2+tside3)/2;
    int number2 = number*(number-tside1)*(number-tside2)*(number-tside3);
    System.out.println(ttext + Math.sqrt(number2));

    //Считаем примитивно площадь прямоугольника
    String rtext = "Площадь прямоугольника = ";
    int rside1 = 20;
    int rside2 = 40;
    System.out.println(rtext + rside1*rside2);
}
}
