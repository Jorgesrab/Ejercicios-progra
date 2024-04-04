package Parte_1.Ejercicios.POO.ejemplos.Ejercicios2;

public class Rectangulo {
    // vértice inferior izquierdo
    double x1;
    double y1;
    // vértice superior derecho
    double x2;
    double y2;

    private String nombre = "rec";
    public Rectangulo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    @Override
    public String toString() {
        return "Rectangulo " + nombre +": {" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

     public boolean equals(Rectangulo r2) {
        if (this == r2) return true;
        if (r2 == null ) return false;
        return x1==r2.x1 && y1==r2.y1 && x2==r2.x2 && y2 == r2.y2;
    }

    public double getBase() {
        return Math.abs(x2-x1);
    }
    public double getAltura() {
        return Math.abs(y2-y1);
    }
    public double getPerimetro() {
        return 2*getBase() + 2*getAltura();
    }

    public double getArea() {
        return getBase()*getAltura();
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(getBase(),2) + Math.pow(getAltura(),2));
    }
    public boolean mover(double x, double y) {
        x1+=x;
        x2+=x;
        y1+=y;
        y2+=y;
        return true;
    }

    public Rectangulo desplazado(double x, double y) {
        Rectangulo resultado = new Rectangulo(x1+x, y1+y, x2+x, y2+y);
        return resultado;
    }
    public Rectangulo aumentaBase(double factor) {
        return new Rectangulo(x1, y1,x1+(x2-x1)*factor, y2);
    }

    public Rectangulo aumentaAltura(double factor) {
        return new Rectangulo(x1, y1, x2, y1+(y2-y1)*factor);
    }


}
