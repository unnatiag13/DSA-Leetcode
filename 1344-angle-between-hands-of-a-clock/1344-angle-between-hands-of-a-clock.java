class Solution {
    public double angleClock(int hour, int minutes) {
        double hourhand = hour + (double)minutes/60;
        double angle_of_hourhand = hourhand * 360/12;
        double angle_of_minutehand = minutes * 360/60;
        double diff = Math.abs(angle_of_hourhand - angle_of_minutehand);
        diff = (360 -diff)<diff? 360-diff:diff;
        return diff;
    }
}