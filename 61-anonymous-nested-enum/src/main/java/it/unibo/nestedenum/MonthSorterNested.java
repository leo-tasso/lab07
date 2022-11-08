package it.unibo.nestedenum;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/**
 * Implementation of {@link MonthSorter}.
 */
public final class MonthSorterNested implements MonthSorter {

    @Override
    public Comparator<String> sortByDays() {
        return null;
    }

    @Override
    public Comparator<String> sortByOrder() {
        return null;
    }
    
    private enum Month {
        JAN("january",31),
        FEB("feburary",28),
        MAR("march",31),
        APR("april",30),
        MAY("may",31),
        Jun("june",30),
        Jul("july",31),
        Aug("august",31),   
        Sep("september",30),
        Oct("october",31),
        Nov("november",30),
        Dec("december",31);


    private final String name;
    private final int days;
    private String getName(){
        return this.getName(m);
    }
    private Month(final String name, int days) {
        this.name = name;
        this.days = days;
    }
    public Month fromString(String in){
                for(Month m: Month.values()){
                    if Month.getName(m).startsWith(in);
                }
    }
    

    }
}
