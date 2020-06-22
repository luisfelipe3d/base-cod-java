package mercado.Interface;

public interface ISubject {
    public boolean attach(IObserver observer);    
    public boolean detach(IObserver observer);
    public void hasChanged();
    public void notifyObservers();
    
}
