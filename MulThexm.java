class WelcomeThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("welcome thread");
		}
	}
}

class MulThexm 
{
	public static void main(String[] args) 
	{
		WelcomeThread wt = new WelcomeThread();
		wt.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}