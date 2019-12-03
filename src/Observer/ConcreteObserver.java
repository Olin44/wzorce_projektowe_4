package Observer;

public class ConcreteObserver implements Observer {

    private String observerState;
    @Override
    public void update(ConcreteSubject subject) {
        this.observerState = subject.getState();
    }

    public String getObserverState() {
        return observerState;
    }

}
