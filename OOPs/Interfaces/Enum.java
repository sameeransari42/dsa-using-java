package OOPs.Interfaces;

public class Enum {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // these are enum constants
        // by default public static final
        // since it's final you can't create child enums
        // type it is week
    }

    public static void main(String[] args) {

        Week week;

        week = Week.Friday;

        System.out.println(week.ordinal());
    }
}
