import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class GroupShuffler
	{
		
	static ArrayList<Student> classroom = new ArrayList<Student>();
	static int numberOfGroups = 0;
	static int num= 0;
	
	public static void main(String [] args) throws IOException 
		{
			Scanner userInput = new Scanner(System.in);
			Scanner roster = new Scanner(new File("StudentList.txt"));
			while (roster.hasNext())
			{
				String name = roster.nextLine();
				classroom.add(new Student(num, name));
				
				num++;
			}	
			System.out.println("How many groups do you want?");
			numberOfGroups = userInput.nextInt();
			
			groupAmount();
			
			
		}

	private static void groupAmount()
		{
			int groups = 22/numberOfGroups;
			int leftOvers = 22 % numberOfGroups;
			
			System.out.println(groups + " and " + leftOvers);
			
			System.out.println("You will have " + leftOvers + " of " + (groups + 1) + " and " + (numberOfGroups - leftOvers) + " of " + groups);
			
			
			
			for(int i = 0; i < leftOvers; i++)
				{
					
				}
			
			
		}




	


	}




















