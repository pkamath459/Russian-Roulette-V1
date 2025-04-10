//Russian Roulette
//void bar: game in bar
//void play: the game
//void chance: probability
//void quit: quit game with twists
//void win: events that occur after your win

import java.util.*;
class thp
{
	public void wait(int sec)
	{
		try
		{
			Thread.currentThread().sleep(sec*1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class rrou
{
	boolean repeat=true,survivor=false;
	static String l=null,j=null;
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		thp tp=new thp();
		rrou obj=new rrou();
		String ch;
		char g,e,t,m;
		int a,b;
		obj.bar();
		m=sc.next().charAt(0);
		t=Character.toUpperCase(m);
		if(t=='C')
		{
			l="Cherenkov";
			j="Dimitri";
		}
		else if(t=='D')
		{
			l="Dimitri";
			j="Cherenkov";
		}
		else
			obj.quit();
		a=obj.chance();
		for(b=0;b<6;)
		{
			if(b==0)
				System.out.println("Press N to start playing. Press any other key to wimp out.");
			else
				System.out.println("Press N to keep playing. Press any other key to wimp out.");
			g=sc.next().charAt(0);
			e=Character.toUpperCase(g);
			if(e!='N')
				obj.quit();
			tp.wait(1);
			System.out.println("You pull the trigger.");
			tp.wait(1);
			obj.play(a,b);
			if(b>=2)
				System.out.println(j+": \"This is getting interesting.\"");
			System.out.println("You pass the gun to "+l);
			tp.wait(3);
			b++;
			System.out.println(l+" pulls the trigger.");
			tp.wait(1);
			obj.play(a,b);
			b++;

		}
	}
	void bar()
	{
		Scanner sc=new Scanner(System.in);
		String name;
		thp tp=new thp();
		rrou obj=new rrou();
		System.out.println("It's 1939, Russian roulette is growing in popularity, and is played almost everywhere.\nYou are in a not so popular town called \"Salekhard\" in northern USSR."); tp.wait(4);
		System.out.println("\nYou are cold, sad, depressed and miserable. You have no social life, no job, no friends or family.\nYou've got nothing to live for. You want to finish it off, but deep down you still want to live and fight.\nYou decide to go to a bar to have a smoke and some shots of vodka."); tp.wait(7);
		System.out.println("\nYou sit on the barstool near you and order 2 shots of vodka, a plate of pelmeni and a cigar.\n\"It's comfy in here compared to the biting cold outside.\" You say to yourself."); tp.wait(6);
		System.out.println("\nAs you wait for your order smoking your cigar, you are approached by two buff men, who look like they're in their forties and are visibly drunk."); tp.wait(5);
		System.out.println("\nMan 1: \"New to this town kid? Never seen you round here.\""); tp.wait(3);
		System.out.print("Man 2: \"I am Cherenkov and this is...");
		tp.wait(3);
		System.out.print(" Dim... Dimitri. Yes!");
		tp.wait(2);
		System.out.println(" What's your name kid?\"");
		System.out.print("Player: ");
		name=sc.next();
		if(name.equalsIgnoreCase("cherenkov"))
		{
			System.out.println("\nCherenkov: \"Ayyy! We have the same name! I'll call you Checko from now. That's what my mom used to call me.\"");
			name="Checko";
		}
		else if(name.equalsIgnoreCase("dimitri"))
		{
			System.out.println("\nDimitri: \"Hey! We have the same name! We're like brothers! I'm gonna call you D2 from now!\"");
			name="D2";
		}
		else
		{
			System.out.println("\nDimitri: \""+name+" Huh? Never heard of that name 'round here. Guess you're new to this town eh?.");
		}
		tp.wait(4);
		System.out.println("Care to join us in a game of russian roulette "+name+"?\"\nCherenkov: \"Yeah you've got nothing to lose except for maybe, your life\"\nThey laugh loudly."); tp.wait(5);
		System.out.println("\n"+name+": \"Right here? It's gonna get real messy.\""); tp.wait(3);
		System.out.println("Cherenkov: \"I know a place nearby where we can play without any hassle.\""); tp.wait(3);
		System.out.println("\nYou finish your food and drink and set off along with the duo to a nearby barn that looks like it was renovated specifically for this."); tp.wait(5);
		System.out.println("\nThe barn itself is big enough to fit 2 tanks, fairly lit and the floor covered in dark brown hay.\nDimitri opens up a shelf and produces a six round revolver, loads it with exactly one cartridge, spins it and places it on the table nearby."); tp.wait(4);
		System.out.println("\nDimitri: \"Alright "+name+". Tell me who you wanna go against first. Me or Cherenkov?\"\n\nPress C for Cherenkov, D for Dimitri\nPress any other key to quit.");
		
	}
	void play(int a,int b)
	{
		thp tp=new thp();
		rrou obj=new rrou();
		if(a==b)
		{
			System.out.println("*BANG*");
			if(b==1 || b==3 || b==5)
			{
				System.out.println(l+" died. You win...\n\nOr did you?\n");
				tp.wait(5);
				obj.win();
			}
			else
				System.exit(0);
		}
		else
			System.out.println("*click*");
	}
	int chance()
	{
		int c;
		Random rand=new Random();
		c=rand.nextInt(6);
		return c;
	}
	void quit()
	{
		rrou obj=new rrou();
		int quits;
		quits=obj.chance();
		switch(quits)
		{
			case 0:
			System.out.print("The duo get angry and are pissed at you for not playing. So they beat you up and mug you.");
			System.exit(0);
			break;
			case 1:
			System.out.print("Cherenkov is angry because you don't want to play, he calls you a wimp and tells you to get lost.");
			System.exit(0);
			break;
			case 2:
			System.out.print("Dimitri gets pissed at you for not playing, and shoots you.");
			System.exit(0);
			break;
			case 3:
			System.out.print("They are cool with you quitting and you reach home safely.");
			System.exit(0);
			break;
			case 4:
			System.out.print("The duo have no problem with you not playing with them.\nOn your way back home, you get hit by a truck and die.");
			System.exit(0);
			break;
			case 5:
			System.out.println("They don't care and force you to play anyways.");
			break;
		}
	}
	void win()
	{
		rrou obj=new rrou();
		int wincondition=obj.chance();
		switch(wincondition)
		{
			case 0:
			System.out.print(j+" is too drunk to process that his friend died. He pats you on the back and goes home.");
			System.exit(0);
			break;
			case 1:
			System.out.print(j+" is sad that his friend died and blames you for his death. You go home with your depression with an added guilt.");
			System.exit(0);
			break;
			case 2:
			System.out.print(j+" gets angry and blames you for "+l+"'s death. He produces a loaded revolver out of the cupboard and shoots you.");
			System.exit(0);
			break;
			case 3:
			System.out.print(j+" is extremely drunk, and passes out on the floor. You go home safely to process what exactly happened in the past hour.");
			System.exit(0);
			break;
			case 4:
			System.out.print(j+" is extremely drunk, and passes out on the floor. As you're walking home trying to process what exactly happened in the past hour, you get hit by a truck and die.");
			System.exit(0);
			break;
			case 5:
			survivor=true;
			System.out.println(j+" is angry at you as he blames you for "+l+"'s death and shoots himself. You go home with your depression with an added guilt of killing two people.");
			break;
		}
	}
}
//test thrd.java without the constructor
//javap program name- java deconstructor