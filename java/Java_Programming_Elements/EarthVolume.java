package java_programming_elements_level1;

public class EarthVolume {
    public static void main(String[] args) {
        final double PI = 3.14159;
        int radius = 6378;
        double volumeKm = (4.0/3) * PI * Math.pow(radius, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + 
                         " and cubic miles is " + volumeMiles);
    }
}