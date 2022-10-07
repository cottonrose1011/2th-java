package bank;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
	HashMap<String, Account> map = new HashMap<>();

	public void prompt(String s) {
		System.out.println(s);
	}
	
	public void go() {
		Scanner scanner = new Scanner(System.in);
		prompt("생년월일 6자리 입력.");
		String birthday = scanner.nextLine();
		
		while(true) {
			prompt("1.신규개설  2.입금  3.출금  4.조회  5.이체  0.종료");
			prompt("메뉴 번호를 선택해주세요.");
			int menu = scanner.nextInt();
			
			switch (menu) {
			case 1:
				newAccount(birthday);
				break;
			case 2:
				deposit(birthday);
				break;
			case 3:
				//withdraw();
				break;
			case 4:
				//lookup();
				break;
			case 5:
				//transfer();
				break;
			case 0:
				//quit();
				break;

			default:
				break;
			}
		}
	}
	
	public void newAccount(String birthday) {
		Scanner scanner = new Scanner(System.in);
		prompt("이름은?");
		String name = scanner.nextLine();
		prompt("입금할 금액");
		double money = scanner.nextDouble();
		
		if(map.containsKey(birthday)) {
			prompt("이미 개설된 계좌");
			return;
		}
		else {
			map.put(birthday, new Account(name, money));
		}
	}
	
	public void deposit(String birthday) {
		Account account = map.get(birthday);
		Scanner scanner = new Scanner(System.in);
		prompt("얼마나?");
		double money = scanner.nextDouble();
		account.setMoney(account.getMoney()+money);
		map.put(birthday, account);
	}
	
	private class Account {
		private String name="";
		double money = 0.0;
		
		public Account(String name, double money) {
			super();
			this.name = name;
			this.money = money;
		}
		
		public Account(String name) {
			super();
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getMoney() {
			return money;
		}
		public void setMoney(double money) {
			this.money = money;
		}
		
	}
}
