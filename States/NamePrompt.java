package FitnessApp.States;

import FitnessApp.FitnessApplication;
import FitnessApp.Utils.ConsoleColors;

public class NamePrompt extends State {
    private FitnessApplication app;

    public NamePrompt(FitnessApplication app) {
        this.app = app;
    }

    public void display() {
        System.out.println("\nWat is je naam?");
    }

    public void handleUserInput(String input) {
        if(input.isEmpty()) {
            ConsoleColors.printRedText("Je hebt geen naam ingevoerd. Probeer opnieuw.");
        }
        else if(hasNumbers(input)) {
            ConsoleColors.printRedText("Je naam bevat nummers. Probeer opnieuw.");
        }
        else {
            app.getCurrentUser().setName(input);
            onExit();
            app.setCurrentState(new ExercisesMenu(app));
        }
    }

    private boolean hasNumbers(String input) {
        return input.matches(".*\\d.*");
    }

    private void onExit() {
        System.out.println("\nWelkom, " + app.getCurrentUser().getName());
    }
}