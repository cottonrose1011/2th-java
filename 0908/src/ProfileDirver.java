
public class ProfileDirver {

	public static void main(String[] args) {
		Profile profile = new Profile();
		Profile profile2 = new Profile("홍길동","경성대학교","소프트웨어",2);
		
		profile.show();
		System.out.println("\n----------프로필 변경----------\n");
		profile2.show();

	}

}
