package progetto_da_chiamare.selectioncriterions;

import util.Bag;
import util.Pair;
import util.PartialComparator;

public interface SelectionCriterion<G, P> {

    Pair<G, P> select(Bag<Pair<G, P>> population, PartialComparator<G> partialOrder);

}

