// WIJERATHNE E.S.H
// E/18/397
// LAB 02
public class Lab02 {
  public static void main(String args[]) {

    // error handeling
    if(args.length==1 ){ // 1 argument was give
      if(Float.parseFloat(args[0])<0){  // value is negative
        System.err.println("negative number was given as parameter");
        System.err.println("usage: java Lab02 [positive integer] [mm|cm|m]");
        System.exit(1);
      
      }else{ // value is positive but no units
        System.err.println("values without units");
        System.err.println("usage: java Lab02 [positive integer] [mm|cm|m]");
        System.exit(1);
      }
    }
    if(args.length==2){ // acceptable argument count

      if(Float.parseFloat(args[0])<0){ // value is negative
        System.err.println("negative number was given as parameter");
        System.err.println("usage: java Lab02 [positive integer] [mm|cm|m]");
        System.exit(1);
      }
      //unit checking
      if(args[1].equals("m")||args[1].equals("cm")||args[1].equals("mm")){
       
      }else{// wrong units
        System.err.println(args[1]+" is an invalid units");
        System.err.println("usage: java Lab02 [positive integer] [mm|cm|m]");
        System.exit(1);
      }

    }else{ // more than 2 arguments or no arguments given
      System.err.println("Program should have 2 arguments");
      System.err.println("usage: java Lab02 [positive integer] [mm|cm|m]");
      System.exit(1);
    }

    // making objects
    Circle circle = new Circle();
    circle.setRadius(Float.parseFloat(args[0]));
    circle.setArea();

    Square square = new Square();
    square.setLength(Float.parseFloat(args[0]));
    square.setArea();

    Sphere sphere = new Sphere();
    sphere.setRadius(Float.parseFloat(args[0]));
    sphere.setSurfaceArea();
    sphere.setVolume();

    Cube cube = new Cube();
    cube.setLength(Float.parseFloat(args[0]));
    cube.setSurfaceArea();
    cube.setVolume();

    // printing output
    System.out.println(circle.toStringArea(args[1],args[0]));
    System.out.println(sphere.toStringArea(args[1],args[0]));
    System.out.println(square.toStringArea(args[1],args[0]));
    System.out.println(cube.toStringArea(args[1],args[0]));
    System.out.println(sphere.toStringVolume(args[1],args[0]));
    System.out.println(cube.toStringVolume(args[1],args[0]));
    
  }
}

class Circle {
  private double area;
  private double radius;
  

  public void setRadius(double radius){
    this.radius = radius;
  }

  public void setArea(){
    this.area =  Math.PI * radius * radius;
  }

  public String toStringArea(String unit, String value){
    return String.format("Area of a circle with %s %s radius: %d %s\u00b2 ",value,unit, Math.round(area), unit);
  }
 
}

class Square {
  private double area;
  private double length;

  public void setLength(double length){
    this.length = length;
  }

  public void setArea(){
    this.area = length*length;
  }
  public String toStringArea(String unit, String value){
    return String.format("Area of a square with %s %s side: %d %s\u00b2 ",value,unit, Math.round(area), unit);
  }
  
}

class Sphere {
  private double surfaceArea;
  private double volume;
  private double radius;

  public void setRadius(double radius) {
      this.radius = radius;
  }

  public void setSurfaceArea(){
      this.surfaceArea = 4* Math.PI* radius*radius;
  }

  public void setVolume(){
      this.volume = 4.0/3.0 * Math.PI * radius * radius* radius;
  }

  public String toStringArea(String unit, String value){
    return String.format("Surface area of a sphere with %s %s radius: %d %s\u00b2 ", value,unit, Math.round(surfaceArea), unit);
  }

  public String toStringVolume(String unit, String value){
    return String.format("Volume of a sphere with %s %s radius: %d %s\u00b3 ", value,unit, Math.round(volume),unit);
  }

  
}

class Cube {
  private double surfaceArea;
  private double volume;
  private double length;

  public void setLength(double length){
    this.length = length;
  }

  public void setVolume(){
    this.volume = length* length*length;
  }

  public void setSurfaceArea(){
    this.surfaceArea = 6 * length *length;
  }

  public String toStringArea(String unit, String value){
    return String.format("Surface area of a cube with %s %s side: %d %s\u00b2 ", value,unit, Math.round(surfaceArea), unit);
  }

  public String toStringVolume(String unit, String value){
    return String.format("Volume of a cube with %s %s side: %d %s\u00b3 ",value,unit, Math.round(volume),unit);
  }
  
}
// \u00b2 - unicode for superscript 2
// \u00b3 - unicode for superscript 3
