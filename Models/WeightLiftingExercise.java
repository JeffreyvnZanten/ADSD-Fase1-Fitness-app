package FitnessApp.Models;

public class WeightLiftingExercise extends Exercise
{
    private int weight;

    public WeightLiftingExercise(String name, int reps, int weight) {
        super(name, reps);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return super.toString() + ", Gewicht: " + weight;
    }
}