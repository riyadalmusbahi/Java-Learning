package decJavaProgramming.week6.balloons;

public class HotAirBalloonApplication {
    public static void main(String[] args) {

        SmallHotAirBalloon smallBallon = new SmallHotAirBalloon();
        System.out.println("--Small Balloon--");

        smallBallon.liftUp();
        smallBallon.land();

        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        System.out.println("--Big Balloon--");
        bigBalloon.liftUp();
        bigBalloon.land();

        HotAirBalloon big = new BigHotAirBalloon();
        System.out.println("--Big--");
        big.liftUp();
        big.land();

        HotAirBalloon small = new SmallHotAirBalloon();
        System.out.println("--Small--");
        small.liftUp();
        small.land();







    }
}
