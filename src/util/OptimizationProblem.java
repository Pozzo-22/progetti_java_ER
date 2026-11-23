package util;

import progetto_da_chiamare.genotypemappers.GenotypeToSolutionMapFunc;
import progetto_da_chiamare.probabilityfunctions.ProbabilityDistributions;

public interface OptimizationProblem<G, P> {

    ProbabilityDistributions<G> probabilityFunction();

    GenotypeToSolutionMapFunc<G, P> fitness();

    PartialComparator<P> comparator();

}
