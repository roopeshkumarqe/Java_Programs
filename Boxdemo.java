class Box {
    double width;
    double height;
    double depth;
  }
  class Boxdemo {
    public static void main(String args[]) {
      Box mybox1 = new Box();
      Box mybox2 = new Box();
      double vol1, vol2;
  
      mybox1.width = 10;
      mybox1.height = 5;
      mybox1.depth = 2;

      mybox2.width = 1;
      mybox2.height = 10;
      mybox2.depth = 11;

      /*Calculates the volume of first box */
      vol1 = mybox1.width * mybox1.height * mybox1.depth;
      System.out.println("Volume of Box is " + vol1);

      /*Calculates the volume of second box */
      vol2 = mybox2.width * mybox2.height * mybox2.depth;
      System.out.println("Volume of Box is " + vol2);
    }
  
  }