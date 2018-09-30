
public class Conditions {
	public static void main(String[] args) {
		switch (getSubject())
		{
		case MATHEMATICS:
			System.out.println("Teacher");
			break;
		case PHYSICS:
			System.out.println("Teacher");
			break;
		case HISTORY:
			System.out.println("Student");
			break;
		case MUSIC:
			System.out.println("Student");
			break;
		case CHEMISTRY:
			System.out.println("Teacher and student");
			break;
		}

	}
	public static Subject getSubject()
	{
		return null;
		
	
	}
}
