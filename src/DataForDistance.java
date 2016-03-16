public class DataForDistance {
    //Данные для рассчета расстояния
    int dot1x;
    int dot1y;
    int dot2x;
    int dot2y;
    private int formula;
    private String dis;

    DataForDistance(String dist,int x1, int y1, int x2, int y2){
        dot1x = x1;
        dot1y = y1;
        dot2x = x2;
        dot2y = y2;
        formula = Math.abs((x2-x1)+(y2-y1));
        dis = dist;
    }
    public int getFormula() {
        return formula;
    }
    public String getDis() {
        return dis;
    }
}
