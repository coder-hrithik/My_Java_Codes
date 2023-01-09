package Leetcode;

public class AngleClock {
    public static void main(String[] args) {
        System.out.println(calcAngle(9, 60)+" degree");
        System.out.println(calcAngle(3, 15)+" degree");
    }

    static float calcAngle(int hour , int minute){
        float hour_angle = (float)(0.5 * (hour*60 + minute));
        float minute_angle = (float)(6*minute);
 
        // Find the difference between two angles
        float angle = Math.abs(hour_angle - minute_angle);
 
        // smaller angle of two possible angles
        angle = Math.min(360-angle, angle);
 
        return angle;
    }
}
