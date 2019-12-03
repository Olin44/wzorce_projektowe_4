package Observer;

public class ConcreteSubject implements Subject {
    private String subjectState;

    public String getState(){
        return this.subjectState;
    }

    public void setState(String state){
        this.subjectState = state;
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : this.observers){
            observer.update(this);
        }
    }
}
