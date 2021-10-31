package seedu.address.model.person;

import java.util.List;
import java.util.function.Predicate;

/**
 * Tests that a {@code Person}'s {@code TodayAttendance} matches any of the keywords given.
 */
public class TodayAttendanceContainsKeywordsPredicate implements Predicate<Person> {

    private final List<TodayAttendance> todayAttendance;

    public TodayAttendanceContainsKeywordsPredicate(List<TodayAttendance> todayAttendance) {
        this.todayAttendance = todayAttendance;
    }

    @Override
    public boolean test(Person person) {
        return todayAttendance.stream()
                .anyMatch(todayAttendance -> person.getTodayAttendance().equals(todayAttendance));
    }

    @Override
    public boolean equals(Object other) {
        return other == this
                || (other instanceof TodayAttendanceContainsKeywordsPredicate
                && todayAttendance.equals(((TodayAttendanceContainsKeywordsPredicate) other).todayAttendance));
    }
}