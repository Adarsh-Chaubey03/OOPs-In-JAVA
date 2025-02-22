package adarsh.P_Enum;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        /*

        NOTE =>
        * these are enum constant
        * every enum is public static final
        * since it is final, child can't be created
        * type is week
        
         */


        Week() {
            System.out.println("constructor being called for " + this);
        }

        /*
         * this is not public or protected , only private or default
         * because we don't want to create a new object
         * and this is not enum concept
         */

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week); //Monday
        System.out.println(week.ordinal()); //0

        System.out.println();
        System.out.println("Now Printing loop data");
        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }


}
