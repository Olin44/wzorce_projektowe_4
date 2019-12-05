package Observer;

public class ConcreteSubject implements Subject {
    private String subjectState;

    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public String getState(){
        return this.subjectState;
    }

    public void setState(String state){
        this.subjectState = state;
        notifyObservers();
    }

}
