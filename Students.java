package week3day1.assignment;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students st=new Students();
		
		int studentId = st.getStudentInfo(073043);
		
		System.out.println("Id of the Student is "+studentId);
		
		String studentIdName = st.getStudentInfo(073043, "Sridharan R");
		
		System.out.println("ID and Name of the Student is "+studentIdName);
		
		long studentemailphno = st.getStudentInfo("sridharan311@yahoo.com", 1234567890);
		
		System.out.println("Email and Phone Number of the Student is "+studentemailphno);

	}

	public int getStudentInfo(int id)
	{
		return id;
	}
	public String getStudentInfo(int id, String name)
	{
		return name;
	}
	public long getStudentInfo(String email, long phoneNumber)
	{
		return phoneNumber;
	}
}
