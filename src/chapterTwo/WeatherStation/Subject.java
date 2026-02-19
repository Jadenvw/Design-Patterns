package chapterTwo.WeatherStation;

public interface Subject {
    // both methods take an Observer as an argument that should be added or removed
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // method called to notify observers of subject state change
    public void notifyObserver();

}
