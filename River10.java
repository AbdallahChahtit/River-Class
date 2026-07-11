import java.util.Scanner;
public class River10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String riverName1 = input.nextLine();
        String riverName2 = input.nextLine();
        River river1 = new River(riverName1);
        river1.setWaterQuality(River.CLEAN);
        river1.setLength(10);
        river1.setDrainageBasinArea(100);

        System.out.println("\nname: " + river1.getRiverName());
        System.out.println("water quality: " + river1.getWaterQuality());
        System.out.println("length: " + river1.getLength());
        System.out.println("drainage basin area: " + river1.getDrainageBasinArea());        
        System.out.println("number of rivers: " + River.getNumberOfRiver());
        System.out.println(river1.toString());
        System.out.println();

        River river2 = new River();
        river2.setRiverName(riverName2);
        System.out.println(river2.toString());
        river2.setWaterQuality(River.POLLUTED);
        river2.setLength(15);
        river2.setDrainageBasinArea(150);
        System.out.println("number of rivers: " + River.getNumberOfRiver());
        System.out.println(river2.toString());
    }
}

class River {
     public static final int CLEAN = 2;
       public static final int POLLUTED = 1;
   
      
       private static int numberOfRiver = 0;
   
       
       private String riverName;
       private int waterQuality;
       private double length;
       private double drainageBasinArea;
   
   
       public River() {
           numberOfRiver++; 
           this.waterQuality = CLEAN; 
           this.length = 0.0;
           this.drainageBasinArea = 0.0;
       }
   
       
       public River(String riverName) {
           this();
           this.riverName = riverName;
       }
   
       public String getRiverName() {
           return riverName;
       }
   
       public void setRiverName(String riverName) {
           this.riverName = riverName;
       }
   
       public int getWaterQuality() {
           return waterQuality;
       }
   
       public void setWaterQuality(int waterQuality) {
           this.waterQuality = waterQuality;
       }
   
       public double getLength() {
           return length;
       }
   
       public void setLength(double length) {
           this.length = length;
       }
   
       public double getDrainageBasinArea() {
           return drainageBasinArea;
       }
   
       public void setDrainageBasinArea(double drainageBasinArea) {
           this.drainageBasinArea = drainageBasinArea;
       }
   
       public static int getNumberOfRiver() {
           return numberOfRiver;
       }

    @Override
    public String toString() {
        return "River{" +
                "riverName='" + riverName + '\'' +
                ", waterQuality=" + waterQuality +
                ", length=" + length +
                ", drainageBasinArea=" + drainageBasinArea +
                '}';
    }
}


