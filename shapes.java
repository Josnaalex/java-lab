
public class shapes {
    void area(double r)
    {
        double a;
        a=3.14*r*r;
        System.out.println("Area of the circle ="+a);
    }
    void area(int l,int b,int h)
    {
        int a;
        a=l*b*h;
        System.out.println("Area of the triangle ="+a);
    }
    void area(int a)
    {
        int ar;
        ar=a*a;
        System.out.println("Area of the square = "+ar);
    }
    public static void main(String args[])
    {
        shapes obj = new shapes();
        obj.area(5.4);
        obj.area(2,3,4);
        obj.area(4);
    }
}
