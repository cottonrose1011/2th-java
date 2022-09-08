
public class ProfileDriver {

	public static void main(String[] args) {
		Profile profile = new Profile();
		Profile profile2 = new Profile("홍길동","경성대학교","컴퓨터공학과",2);
		
		profile.show();
		System.out.println("\n----------프로필 변경----------\n");
		profile2.show();
		System.out.println("\n----------프로필 변경----------\n");
		profile.setGrade(4);
		profile.setName("김땡땡");
		profile.setUniv("경성대학교");
		profile.setMajor("전자공학과");
		profile.show();

	}

}
