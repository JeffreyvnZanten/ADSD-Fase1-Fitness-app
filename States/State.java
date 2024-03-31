package FitnessApp.States;

public abstract class State {
    private State previous;
    public abstract void display();
    public abstract void handleUserInput(String input);

    public void setPreviousState(State state) {previous = state;}

    public State getPreviousState() {return previous;}
}