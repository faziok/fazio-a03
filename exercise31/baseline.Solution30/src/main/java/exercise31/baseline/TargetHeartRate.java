package exercise31.baseline;

public class TargetHeartRate {
    //declare age and resting HR
    int age;
    int restingHR;

    //create constructor
    public TargetHeartRate(int age, int restingHR) {
        this.age = age;
        this.restingHR = restingHR;
    }

    public int[] targetHeartRate(){
        //declare targetHR array for 9 intensities ranging from 55% to 95% incrementing by 5%
        //for
            //TargetHeartRate[] = (((220 - age) - restingHR) * percentage) + restingHR
        //return targetHR
    }

    public void printTable(){
        //print resting pulse and age
        //print header
        //for 55% through 95%
            //print percentage and bpm
    }
}
