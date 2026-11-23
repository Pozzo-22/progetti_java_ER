package progetto_da_chiamare.evolutionarialgos;

import progetto_da_chiamare.crossoveroperators.CrossoverOperator;
import progetto_da_chiamare.genotypemappers.GenotypeToSolutionMapFunc;
import progetto_da_chiamare.mutationoperators.MutationOperator;
import progetto_da_chiamare.selectioncriterions.SelectionCriterion;
import util.Pair;
import util.PartialComparator;

public interface StandardEvolutionaryAlgorithm {

    <G, P> Pair<G, P> solve(
            GenotypeToSolutionMapFunc<G, P> genotypeToSolutionMapFunc,
            PartialComparator<G> partialComparator,
            MutationOperator<G> mutOp, CrossoverOperator<G> xoverOp,
            int populationSize, int evaluationsQuantity,
            SelectionCriterion<G, P> reproductionCriterion, SelectionCriterion<G, P> deathCriterion

    );
}
