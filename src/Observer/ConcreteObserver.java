package Observer;

public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(Subject subject) {
        this.observerState = subject.getState();
    }

    public String getObserverState() {
        return observerState;
    }

}
