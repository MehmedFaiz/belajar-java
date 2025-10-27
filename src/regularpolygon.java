
public class regularpolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public regularpolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    public regularpolygon(int n,double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public regularpolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getn(){
        return this.n;
    }
    public double getside(){
        return this.side;
    }
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    public void setn(int nBaru){
        this.n = nBaru;
    }
    public void setside(double sideBaru){
        this.side = sideBaru;
    }
    public void setx(double xBaru){
        this.x = xBaru;
    }
    public void sety(double yBaru){
        this.y = yBaru;
    }
    public double getPerimeter(){
        return this.n * this.side;
    }
    public double getArea(){
       return(this.n * Math.pow(this.side,2) / 4 * Math.tan(Math.PI / this.n));
    }
}
