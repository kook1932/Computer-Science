public interface SubjectObservable 
{
	void addObserver(Observer ob);

	void removeObserver(Observer ob);

	void notifyObservers();
}