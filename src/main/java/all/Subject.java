package all;

public interface Subject {
    void signUpObserver(Observer observer);
    void notifyObservers();
}
