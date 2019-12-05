package Observer;

public class ObserverMain {
    public static void main(String[] args){
    ConcreteSubject subject = new ConcreteSubject();
    ConcreteObserver observer = new ConcreteObserver();
    ConcreteObserver observer1 = new ConcreteObserver();

    subject.attach(observer);
    subject.attach(observer1);

    subject.setState("Stan początkowy");
    System.out.println(observer.getObserverState());
    System.out.println(observer1.getObserverState());

    subject.setState("Zmiana stanu");
    System.out.println(observer.getObserverState());
    System.out.println(observer1.getObserverState());

    }
}
