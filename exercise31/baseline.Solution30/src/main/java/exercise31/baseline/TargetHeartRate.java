package exercise31.baseline;

public class TargetHeartRate {
    int restingHR;
    int age;


    public TargetHeartRate(int restingHR, int age) {
        this.restingHR = restingHR;
        this.age = age;

    }

    public int[] targetHeartRate(){
        //declare targetHR array for 9 intensities ranging from 55% to 95% incrementing by 5%
        //for
        //TargetHeartRate[] = (((220 - age) - restingHR) * percentage) + restingHR
        //return targetHR

        int[] arrHR = new int[9];
        int j = 0;
        for (double i = .55; i < 1; i += .05) {
            arrHR[j] = (int) Math.round(((((220 - age) - restingHR) * i) + restingHR));
            j++;
        }
        return arrHR;
    }

    public void printTable(){
        //print resting pulse and age
        //print header
        //for 55% through 95%
        //print percentage and bpm

        System.out.printf("%nResting pulse: %d%10sAge: %d%n%nIntensity%4s| Rate%n-------------|--------%n",
                restingHR, "", age, "");

        int j = 0;
        int[] arrHR = targetHeartRate();
        for (int i = 55; i < 100; i += 5){
            System.out.printf("%d%%%10s| %d bpm%n", i, "", arrHR[j]);
            j++;
        }
    }
}
