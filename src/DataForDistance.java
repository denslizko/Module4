public class DataForDistance {
    //Данные для рассчета расстояния
    int dot1x;
    int dot1y;
    int dot2x;
    int dot2y;
    private int formula;
    private String dis;

    DataForDistance(String dist,int x1, int y1, int x2, int y2){
        this.dot1x = x1;
        this.dot1y = y1;
        this.dot2x = x2;
        this.dot2y = y2;
        this.formula = Math.abs((x2-x1)+(y2-y1));
        this.dis = dist;
    }
    public int getFormula() {
        return formula;
    }
    public String getDis() {
        return dis;
    }
}
