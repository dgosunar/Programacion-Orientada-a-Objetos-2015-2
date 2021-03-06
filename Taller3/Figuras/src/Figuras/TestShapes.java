package Figuras;

public class TestShapes {
    public static void main(String[] args) {
    	
    	//Rectangle
    	
    	Rectangle r1=new Rectangle(2,4);
        Rectangle r2=new Rectangle(2.3,5.6);
        Rectangle r3=new Rectangle(6.22,9.33);
        Rectangle r4=new Rectangle(16.01,5.1);
        Rectangle r5=new Rectangle(8,8);
        
        System.out.println("Rectangle:");
        System.out.println("R1= Area: "+r1.getArear()+" Perimeter: "+r1.getPerimeterr());
        System.out.println("R2= Area: "+r2.getArear()+" Perimeter: "+r2.getPerimeterr());
        System.out.println("R3= Area: "+r3.getArear()+" Perimeter: "+r3.getPerimeterr());
        System.out.println("R4= Area: "+r4.getArear()+" Perimeter: "+r4.getPerimeterr());
        System.out.println("R5= Area: "+r5.getArear()+" Perimeter: "+r5.getPerimeterr());        
        
        //Rectangle Triangle
        
        RectangleTriangle rt1=new RectangleTriangle(6,3);
        RectangleTriangle rt2=new RectangleTriangle(9.7,7.2);
        RectangleTriangle rt3=new RectangleTriangle(4.23,5.54);
        RectangleTriangle rt4=new RectangleTriangle(9.99,4.78);
        RectangleTriangle rt5=new RectangleTriangle(6.34,3.99);
        
        System.out.println("Rectangle Triangle:");
        System.out.println("RT1= Area: "+rt1.getAreart()+" Perimetro: "+rt1.getPerimeterrt());
        System.out.println("RT2= Area: "+rt2.getAreart()+" Perimetro: "+rt2.getPerimeterrt());
        System.out.println("RT3= Area: "+rt3.getAreart()+" Perimetro: "+rt3.getPerimeterrt());
        System.out.println("RT4= Area: "+rt4.getAreart()+" Perimetro: "+rt4.getPerimeterrt());
        System.out.println("RT5= Area: "+rt5.getAreart()+" Perimetro: "+rt5.getPerimeterrt());
        
        //Isoceles Triangle
        
        IsocelesTriangle it1=new IsocelesTriangle (5,3);
        IsocelesTriangle it2=new IsocelesTriangle (9.3,6.3);
        IsocelesTriangle it3=new IsocelesTriangle (4.76,5.32);
        IsocelesTriangle it4=new IsocelesTriangle (9.87,6.54);
        IsocelesTriangle it5=new IsocelesTriangle (2.34,5.678);
        
        System.out.println("Isoceles Triangle:");
        System.out.println("IS1= Area: "+it1.getAreait()+"Perimetro: "+it1.getPerimeterit());
        System.out.println("IS2= Area: "+it2.getAreait()+"Perimetro: "+it2.getPerimeterit());
        System.out.println("IS3= Area: "+it3.getAreait()+"Perimetro: "+it3.getPerimeterit());
        System.out.println("IS4= Area: "+it4.getAreait()+"Perimetro: "+it4.getPerimeterit());
        System.out.println("IS5= Area: "+it5.getAreait()+"Perimetro: "+it5.getPerimeterit());
        
        //Parallelogram
        
        Parallelogram p1=new Parallelogram (5,4);
        Parallelogram p2=new Parallelogram (9.34,8.7);
        Parallelogram p3=new Parallelogram (2.43,3.65);
        Parallelogram p4=new Parallelogram (5.6,1.9);
        Parallelogram p5=new Parallelogram (6,4.32);
        
        System.out.println("Parallelogram: ");
        System.out.println("P1= Area: "+p1.getAreap()+"Perimetro: "+p1.getPerimeterp());
        System.out.println("P2= Area: "+p2.getAreap()+"Perimetro: "+p2.getPerimeterp());
        System.out.println("P3= Area: "+p3.getAreap()+"Perimetro: "+p3.getPerimeterp());
        System.out.println("P4= Area: "+p4.getAreap()+"Perimetro: "+p4.getPerimeterp());
        System.out.println("P5= Area: "+p5.getAreap()+"Perimetro: "+p5.getPerimeterp());
        
    }
    
}
