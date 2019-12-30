import java.util.ArrayList;
import java.util.Iterator;

public class PrimeObservableThread implements SubjectObservable, Runnable 
{
	static final int SLEEPTIME = 500;
	ArrayList<Observer> observers = new ArrayList<Observer>();
	int primeNumber;
	int numCount;
	boolean first = true;
	boolean stopRunning = false;

	public void addObserver(Observer ob) 
	{
		observers.add(ob);
	}

	public void removeObserver(Observer ob) 
	{
		observers.remove(ob);
	}

	public void notifyObservers() 
	{
		for(Observer ob : observers)
			ob.update(primeNumber);
	}

	public int getPrimeNumber() 
	{
		return primeNumber;
	}

	public void stopRunning() 
	{
		stopRunning = true;
	}

	public void startRunning() 
	{
		stopRunning = false;
		run();
	}

	public void generatePrimeNumber() 
	{
		while (stopRunning == false)
		{
			if (first) 
			{
				first = false;
				primeNumber = 2;
				notifyObservers();
				numCount = 1;
			} 
			else 
			{
				numCount += 2;
				if (isPrimeNumber(numCount)) 
				{
					primeNumber = numCount;
					notifyObservers();
				}
			}

			try 
			{
				Thread.sleep(SLEEPTIME);
			} 
			catch (InterruptedException i) 
			{
				i.printStackTrace();
			}
		}

	}

	private boolean isPrimeNumber(int n) 
	{
		for (int i = 2; i * i <= n; ++i) 
		{
			if (n % i == 0) 
				return false;
		}
		return true;
	}

	public void run() 
	{
		this.generatePrimeNumber();
	}
}