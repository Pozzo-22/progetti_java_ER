package progetto_da_chiamare;

import util.Pair;

public interface GenotypeToSolutionMapFunc<G, P> {

    Pair<G, P> encode(G genotype);

}
