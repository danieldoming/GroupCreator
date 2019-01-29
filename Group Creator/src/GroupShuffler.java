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
			int smallGroupSize = classroom.size()/numberOfGroups;
			int numberOfBigGroups = classroom.size() % numberOfGroups;
			
			System.out.println(smallGroupSize + " and " + numberOfBigGroups);
			
			System.out.println("You will have " + numberOfBigGroups + " of " + (smallGroupSize + 1) + " and " + (numberOfGroups - numberOfBigGroups) + " of " + smallGroupSize);
			System.out.println(" ");
			
			int bigGroupSize = smallGroupSize + 1;
			int numberOfSmallGroups = numberOfGroups - numberOfBigGroups;
			int counter= 0;
			int groupLabel = 1;
			
			for(int a = 0; a < numberOfBigGroups ; a++)
				{
					System.out.println("Group " + (groupLabel));
					
					for(int i = 0; i < bigGroupSize ; i++ )
						{
							
							System.out.println(classroom.get(counter).getName());
							counter++;
							
							
						}
					System.out.println(" ");
					
					groupLabel++;
							
							
				}
			
			for(int a = 0; a < numberOfSmallGroups ; a++)
				{
					System.out.println("Group " + (groupLabel));
					
					for(int i = 0; i < smallGroupSize; i++ )
						{
							
							System.out.println(classroom.get(counter).getName());
							counter++;
							
							
						}
					System.out.println(" ");
					
					
							
					groupLabel++;	
				}
		}
			
			
		}




	


	




















