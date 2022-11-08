package it.unibo.nestedenum;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Implementation of {@link MonthSorter}.
 */
public final class MonthSorterNested implements MonthSorter {

    @Override
    public Comparator<String> sortByDays() {
        return new Comparator<String>() {

            @Override
            public int compare(final String o1, String o2) {
                return Month.fromString(o1).days - Month.fromString(o2).days;
            }

        };
    }

    @Override
    public Comparator<String> sortByOrder() {
        return new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Month.fromString(o1).ordinal() - Month.fromString(o2).ordinal();
            }
        };
    }

    private enum Month {
        JAN("january", 31),
        FEB("february", 28),
        MAR("march", 31),
        APR("april", 30),
        MAY("may", 31),
        Jun("june", 30),
        Jul("july", 31),
        Aug("august", 31),
        Sep("september", 30),
        Oct("october", 31),
        Nov("november", 30),
        Dec("december", 31);

        private final String name;
        private final int days;

        private String getName() {
            return this.name;
        }

        private Month(final String name, int days) {
            this.name = name;
            this.days = days;
        }

        public static Month fromString(String in) {
            List<Month> res = new ArrayList<>();
            for (Month m : Month.values()) {
                if (m.getName().startsWith(in.toLowerCase())) {
                    res.add(m);
                }
            }
            if (res.size() == 1) {
                return res.get(0);
            } else {
                throw new InvalidParameterException();
            }
        }

    }
}
