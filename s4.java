class rectangle
{
    double length;
    double width;
    double area;
    String color;

    public void set_length(double l)
    {
        length=l;
    }
    public void set_width(double w)
    {
        width=w;
    }
    public void find_area()
    {
        area= width*length;
    }
}
public class s4 {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.set_length(5);
        r1.set_width(5);
        r1.find_area();
        r1.color="red";

        rectangle r2=new rectangle();
        r2.set_length(5);
        r2.set_width(5);
        r2.find_area();
        r2.color="red";

        if(r1.area==r2.area && r1.color.equals(r2.color))
        System.out.println("Matching rectangles");
        else
        System.out.println("Non matching rectangles.");
    }
    
}
