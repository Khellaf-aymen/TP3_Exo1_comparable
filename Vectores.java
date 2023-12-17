public class Vectores implements Comparable<Vectores>{

    private double x,y;

    public Vectores(double x, double y) {
        this.x = x;
        this.y = y;
    }
public double norme (){return Math.sqrt(x*x+y*y);}






@Override
public String toString() {

    return "("+x+","+y+")";
}
@Override
public int compareTo(Vectores o) {
    double d1 = this.norme();
    double d2 = o.norme();

  
    if (d1 < d2) {
        return -1;
    } else if (d1 > d2) {
        return 1;
    } else {
        return 0;
    }
}



}


    
    

