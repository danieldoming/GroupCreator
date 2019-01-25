
public class Student
	{
		private int value;
		private String name;
		
		public Student(int v, String n)
			{
				value = v;
				name = n;
				
			}

		public int getValue()
			{
				return value;
			}

		public void setValue(int value)
			{
				this.value = value;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}
	}
