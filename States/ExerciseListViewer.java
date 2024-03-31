package FitnessApp.States;

import FitnessApp.FitnessApplication;
import FitnessApp.Models.Exercise;
import FitnessApp.Models.ListOfExercises;

public class ExerciseListViewer extends State {
    private FitnessApplication app;
    private ListOfExercises list;

    public ExerciseListViewer(FitnessApplication app, ListOfExercises list) {
        this.app = app;
        this.list = list;
    }

    public void display() {
        System.out.println("\n" + list.getName());
        displayList();
        displayMenu();
    }

    public void handleUserInput(String input) {
        if(app.isValidInteger(input)) {
            int choice = Integer.parseInt(input);
            
            selectMenuOption(choice);
        }
    }

    private void selectMenuOption(int choice) {
        switch (choice) {
            case 0: {
                app.setCurrentState(getPreviousState());
                break;
            }
            case 1: {
                app.closeApplication();
                break;
            }
            default: {
                System.out.println("Het getal wat je hebt ingevoerd behoord niet tot de keuzes.");
                break;
            }
        }
    }

    private void displayList() {
        for (Exercise exercise : list.getExercises()) {
            System.out.println(exercise.toString());
        }
        System.out.println();
    }

    private void displayMenu() {
        System.out.println("0) Ga terug");
        System.out.println("1) Sluit de applicatie af");
    }
}