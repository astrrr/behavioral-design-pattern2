

import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        people.sort(Comparator.comparing(Person::getWeight));
    }
}
