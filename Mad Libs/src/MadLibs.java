import java.util.Scanner;

public class MadLibs
	{
		public static void main(String[] args)
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userInput .nextLine();
			System.out.println("Hello, " + name + "!");
			
			System.out.println("You can choose what story you would like to do. You will be given two choices. "
			+ "Then, you will be asked to provide words for the story. The words will be various parts of speech as follows:");
			
			String [ ] libs = new String [5];
			
			libs[0] = "noun";
			libs[1] = "verb";
			libs[2] = "adjective";
			libs[3] = "adverb";
			libs[4] = "Plural Noun";
			
			for(String i : libs)
				{
					System.out.println(i);
				}
			
			
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Do want to do the dog or cat story?");
			String choice = userInput2.nextLine();
			
			
			if(choice.equals("dog"))
				{
					System.out.println("You will do the dog story.");
					Scanner userInput3 = new Scanner(System.in);
					
					System.out.println("Please enter a noun. ");
					String dogNoun = userInput3.nextLine();
					
					System.out.println("Please enter a verb. ");
					String dogVerb = userInput3.nextLine();
					
					System.out.println("Please enter another verb. ");
					String dogVerb2 = userInput3.nextLine();
					
					System.out.println("Please enter another noun. ");
					String dogNoun2 = userInput3.nextLine();
					
					System.out.println("Please enter an adjective. ");
					String dogAdj = userInput3.nextLine();
					
					System.out.println("Please enter an adverb. ");
					String dogAdv = userInput3.nextLine();
					
					System.out.println("There once was a dog named " + dogNoun + ". He liked to "+ dogVerb +" and " + dogVerb2 + " in the " 
					+ dogNoun2 + ". He was a " +dogAdj+" dog. Every day he chews " + dogAdv + " on his bone.");
				}
			else if(choice.equals("cat"))
				{
					System.out.println("You will do the cat story.");
					Scanner userInput4 = new Scanner(System.in);
					
					System.out.println("Please enter a noun. ");
					String catNoun = userInput4.nextLine();
					
					System.out.println("Please enter an adjective. ");
					String catAdj = userInput4.nextLine();
					
					System.out.println("Please enter a plural noun. ");
					String catPluralNoun = userInput4.nextLine();
					
					System.out.println("Please enter a verb. ");
					String catVerb = userInput4.nextLine();
					
					System.out.println("Please enter another noun. ");
					String catNoun3 = userInput4.nextLine();
					
					System.out.println("Please enter an adverb. ");
					String catAdv = userInput4.nextLine();
					
					System.out.println("Once upon a time there was a cat named " + catNoun + ". She was a very " + catAdj + " cat. She had many " 
					+ catPluralNoun + " and liked to " + catVerb + " in the " + catNoun3 +". Sometimes she climbs " + catAdv + " up the tree.");
				}
			else
				{
					System.out.println("You can only do the dog or cat story.");
				}
		}
	}