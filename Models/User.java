package FitnessApp.Models;

import java.util.*;

public class User {
    private int age;
    private String name;
    private List<ListOfExercises> createdListsExercises;

    public User() {
        createdListsExercises = new ArrayList<ListOfExercises>();
        createDummyList("Dummy lijst 1");
        createDummyList("Dummy lijst 2");
        createDummyList("Dummy lijst 3");
        createDummyList("Dummy lijst 4");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public List<ListOfExercises> getCreatedListsOfExercises() {
        return createdListsExercises;
    }

    private void createDummyList(String name) {
        ListOfExercises exercises = new ListOfExercises(name);

        exercises.addExercise(new WeightLiftingExercise("Squats", 10, 70));
        exercises.addExercise(new WeightLiftingExercise("Deadlift", 10, 60));
        exercises.addExercise(new Exercise("Pullups", 20));
        exercises.addExercise(new WeightLiftingExercise("Bench press", 10, 80));
        exercises.addExercise(new Exercise("Planks", 20));

        createdListsExercises.add(exercises);
    }
}