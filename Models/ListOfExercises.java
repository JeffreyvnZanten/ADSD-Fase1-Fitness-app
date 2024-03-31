package FitnessApp.Models;
import java.util.ArrayList;
import java.util.List;

public class ListOfExercises {
    private String name;
    private List<Exercise> exercises;

    public ListOfExercises(String name) {
        this.name = name;
        this.exercises = new ArrayList<Exercise>();
    }

    public String getName() {
        return name;
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public List<Exercise> getExercises() {
        return exercises;
    }
}
