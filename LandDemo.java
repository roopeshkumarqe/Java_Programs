class AreaofLand {
    double length;
    double width;

    AreaofLand (double l, double w){
        length = l;
        width = w;
        }
        
        double area (){
            return (length*width);
        }
}
class LandDemo{
    public static void main(String args[]) {
        AreaofLand myland1 = new AreaofLand (900, 1999);
        double area;

        area = myland1.area();
        System.out.println("Area of Land is " + area); 
    }
}