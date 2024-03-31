package FitnessApp.States;

import FitnessApp.FitnessApplication;

public class ExercisesMenu extends State {
    private FitnessApplication app;

    public ExercisesMenu(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("\nLijsten van oefeningen");
        System.out.println("0) Ga terug");
        for(int i=0; i < app.getCurrentUser().getCreatedListsOfExercises().size(); i++) {
            System.out.println((i+1) + ") " + app.getCurrentUser().getCreatedListsOfExercises().get(i).getName());
        }
        System.out.println(app.getCurrentUser().getCreatedListsOfExercises().size() + 1 + ") Nieuwe lijst van oefeningen");
        System.out.println(app.getCurrentUser().getCreatedListsOfExercises().size() + 2 + ") Sluit de applicatie af");
    }

    public void handleUserInput(String input) {
        if(app.isValidInteger(input)) {
            int choice = Integer.parseInt(input);
            selectMenuOption(choice);
        }
    }

    private void selectMenuOption(int choice) {
        if(choice == 0) {
            app.setCurrentState(getPreviousState());
        }
        else if(choice >= 1 && choice <= app.getCurrentUser().getCreatedListsOfExercises().size()) {
            ExerciseListViewer state = new ExerciseListViewer(app, app.getCurrentUser().getCreatedListsOfExercises().get(choice -1));
            state.setPreviousState(this);
            app.setCurrentState(state);
        }
        else if(choice == app.getCurrentUser().getCreatedListsOfExercises().size() + 1) {
            System.out.println("Nieuwe lijst");
        }
        else if(choice == app.getCurrentUser().getCreatedListsOfExercises().size() + 2) {
            app.closeApplication();
        }
        else {
            System.out.println("Het getal wat je hebt ingevoerd behoord niet tot de keuzes.");
        }
    }
}