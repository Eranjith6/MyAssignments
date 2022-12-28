package mul.student;

public class Students {
	
		public void getStudentInfo(int studentnum) {
			System.out.println(studentnum);
		}
		public void getStudentInfo(String studentname) {
			System.out.println(studentname);
		}
		public void getStudentInfo(String emailId , int phoneNum) {
			System.out.println(emailId+", "+phoneNum);
		}
		public static void main(String[] args) {
		Students rep = new Students();
		rep.getStudentInfo(936064);
		rep.getStudentInfo("Eranjithkumar");
		rep.getStudentInfo("eranjithsankar@gmail.com", 80155);
			

}
}
