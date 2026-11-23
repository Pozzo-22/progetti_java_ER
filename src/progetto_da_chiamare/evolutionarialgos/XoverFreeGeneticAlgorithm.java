package progetto_da_chiamare.evolutionarialgos;

import progetto_da_chiamare.crossoveroperators.CrossoverOperator;
import progetto_da_chiamare.mutationoperators.MutationOperator;
import progetto_da_chiamare.selectioncriterions.SelectionCriterion;
import util.Bag;
import util.OptimizationProblem;
import util.Pair;

public class GeneticAlgorithm<G, P> implements EvolutionaryAlgorithm<G> {

    int populationSize;
    int nEvaluations;
    double mutationProbability;
    double crossoverProbability;
    MutationOperator<G> mutation;
    CrossoverOperator<G> crossover;
    SelectionCriterion<G, P> breedingCriterion;
    SelectionCriterion<G, P> deathCriterion;

    public XoverFreeGeneticAlgorithm(int populationSize, int nEvaluations,
                            double mutationProbability, double crossoverProbability,
                            MutationOperator<G> mutation, CrossoverOperator<G> crossover,
                            SelectionCriterion<G, P> breedingCriterion,
                            SelectionCriterion<G, P> deathCriterion) {

        this.populationSize = populationSize;
        this.nEvaluations = nEvaluations;
        this.mutationProbability = mutationProbability;
        this.crossoverProbability = crossoverProbability;
        this.mutation = mutation;
        this.crossover = crossover;
        this.breedingCriterion = breedingCriterion;
        this.deathCriterion = deathCriterion;
    }

    @Override
    public <P> Pair<G, P> solve(OptimizationProblem<G> problem) {
        Bag<Pair<G, P>> population = new Bag<>();

        while (population.size() < populationSize) {
            G individual = problem.probabilityFunction().generate();
            double fitness = problem.fitness(individual);
        }

        int evaluationsCounter = 0;
        while (evaluationsCounter < nEvaluations) {
            evaluationsCounter = evaluationsCounter + populationSize;

            Bag<Pair<G, P>> offsprings = new Bag<>();

            G firstParent
        }

    }
}
