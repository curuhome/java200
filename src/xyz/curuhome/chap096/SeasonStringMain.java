package xyz.curuhome.chap096;

public class SeasonStringMain {
    public static void main(String[] args)
    {
        SeasonString season = SeasonString.AUTUMN;
        System.out.println(season.getMonth());
        /* (from 9 to 11) */
        System.out.println(season); //toString-->valueOf
//        System.out.println(season.toString());
//        System.out.println(SeasonString.valueOf("AUTUMN"));
        /* Autumn (from 9 to 11) */

        //overriding 안하면 name()
        //enum types may mot be instantiated
        //SeasonString sea=new SeasonString("Fall");//error
        System.out.println(season.equals(SeasonString.SPRING));
        /* false */
        System.out.println(season.equals(SeasonString.AUTUMN));
        /* true */
        System.out.println(season.compareTo(SeasonString.SPRING)); //2  Autumn(2)-Spring(0)
        /* 2 */
        System.out.println(season.compareTo(SeasonString.SUMMER)); //1  Autumn(2)-Summer(1)
        /* 1 */
        System.out.println(season.compareTo(SeasonString.AUTUMN)); //0  Autumn(2)-Autumn(2)
        /* 0 */
        System.out.println(season.compareTo(SeasonString.WINTER)); //-1 Autumn(2)-Winter(3)
        /* -1 */
        System.out.println(season.ordinal());
        /* 2 */
        System.out.println(season.name());
        /* AUTUMN */
        System.out.println(SeasonString.AUTUMN.name());
        /* AUTUMN */
        System.out.println(SeasonString.valueOf("AUTUMN"));
        /* Autumn (from 9 to 11) */

        for(SeasonString sea : SeasonString.values()){
            System.out.println(sea);
        }
        /*
            Spring (from 3 to 5)
            Summer (from 6 to 8)
            Autumn (from 9 to 11)
            Winter (from 12 to 2)
         */
    }
}
