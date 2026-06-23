class ClockAngle{
      public double angleClock(int hour, int minutes) {
        double hr = ((hour%12)*30)+(minutes*0.5);
        double min = minutes*6;
        double angle= Math.abs(hr-min);  
        return Math.min(angle, 360-angle);
    }
public static void main(String[] args){
    int hour= 1;
    int min = 45;
    System.out.print(angleClock(hour,min));
}
}