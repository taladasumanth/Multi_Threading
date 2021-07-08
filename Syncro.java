class Wish
	
	{
		synchronized void sayWish()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Wishes from "+Thread.currentThread().getName());
				
			}
		}
	}


class WelcomeThread extends Thread
	{
		Wish wish;
		WelcomeThread(Wish wish)
		{
			this.wish=wish;
		}
			public void run()
			{
				wish.sayWish();
			}
	}


class HelloThread extends Thread
	{
		Wish wish;
		HelloThread(Wish wish)
		{
			this.wish=wish;
		}
			public void run()
			{
				wish.sayWish();
			}
	}
	
	
class HiThread extends Thread
	{
		Wish wish;
		HiThread(Wish wish)
		{
			this.wish=wish;
		}
			public void run()
			{
				wish.sayWish();
			}
	}


class Syncro 
	{
		public static void main(String[] args) 
		{
			Wish wish=new Wish();

			WelcomeThread wt=new WelcomeThread(wish);
			HelloThread hlt=new HelloThread(wish);
			HiThread hit=new HiThread(wish);

			wt.setName("WelcomeThread");
			hlt.setName("HelloThread");
			hit.setName("HiThread");
			
			wt.start();
			System.out.println();
			hlt.start();
			System.out.println();
			hit.start();
			System.out.println();
		}
	}