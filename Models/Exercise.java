package FitnessApp.Models;

public class Exercise
{
    private String name;
    private int reps;
    private int sets;

    public Exercise(String name, int reps) {
        this.name = name;
        this.reps = reps;

        this.sets = 12;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public int getReps() {
        return reps;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public String toString() {
        return "Naam: " + name + ", Reps: " + reps;
    }
}