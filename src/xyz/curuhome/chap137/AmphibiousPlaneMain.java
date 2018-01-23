package xyz.curuhome.chap137;

public class AmphibiousPlaneMain {
    public static void main(String[] args)
    {
        AmphibiousPlane amphi = new AmphibiousPlane("Peach",6000,"Narita Airport", 8);
        AmphibiousPlane amphi2 = new AmphibiousPlane();
        System.out.println(amphi);
        System.out.println(amphi2);
        System.out.println(amphi2.getLandingZone());
    }
}
