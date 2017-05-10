package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class User {
	private String username;
	private String account;
	private String password;
	private HashMap<String, Integer> mybook;

	static Scanner input = new Scanner(System.in);

	public User(String username, String account, String password) {
		this.username = username;
		this.account = account;
		this.password = password;
		this.mybook = new HashMap<String, Integer>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public HashMap<String, Integer> getMybook() {
		return mybook;
	}

	public void setMybook(HashMap<String, Integer> mybook) {
		this.mybook = mybook;
	}

	@Override
	public String toString() {
		return "用户 [昵称=" + username + ", 账号=" + account + ", 密码=" + password + "]";
	}

	/**
	 * 账号注册功能
	 * 
	 * @return
	 */
	public static User register(ArrayList<User> uset) {

		String acc;
		String pword;
		A: while (true) {
			System.out.println("您好，请输入您的账号(6到16位，由字母、数字、下划线组成):");
			acc = input.next();
			if (!acc.matches("[a-zA-Z0-9_]{6,16}")) { // 检测是否满足要求
				System.out.println("账号不符合要求，请重新输入!\n");
				break;
			}
			for (int i = 0; i < uset.size(); i++) { // 判断账号是否已存在
				if (uset.get(i).getAccount().equals(acc)) {
					System.out.println("您注册的账号已存在，请注册其他账号!\n");
					continue A;
				}
			}
			break;
		}
		do {
			System.out.println("您好，请输入您的密码(6到16位，由字母、数字、下划线组成):");
			pword = input.next();
			if (!pword.matches("[a-zA-Z0-9_]{6,16}")) // 检测是否满足要求
				System.out.println("密码不符合要求，请重新输入!\n");
			;
		} while (!pword.matches("[a-zA-Z0-9_]{6,16}"));
		System.out.println("为您的账号设置一个昵称吧:");
		String uname = input.next();
		User user = new User(uname, acc, pword);
		System.out.println("您好，" + uname + ",您好账号注册成功!\n");
		System.out
				.println("您的账号为:" + user.getAccount() + "\n您的密码为:" + user.getPassword() + "\n昵称:" + user.getUsername());
		return user;
	}

	/**
	 * 登录功能
	 * 
	 * @param uset
	 * @return
	 */
	public static User login(ArrayList<User> uset) {
		String lacc;
		String lpword;
		System.out.println("请输入您的账号：");
		lacc = input.next();
		System.out.println("请输入您的密码：");
		lpword = input.next();
		for (int i = 0; i < uset.size(); i++) {
			if (uset.get(i).getAccount().equals(lacc)) {
				if (uset.get(i).getPassword().equals(lpword)) {
					System.out.println("登录成功，欢迎您，" + uset.get(i).getUsername());
					return uset.get(i);
				}
			}
			if (i == uset.size() - 1) {
				System.out.println("您输入的账号密码不正确，请重新输入");
				System.out.println("请输入您的账号：");
				lacc = input.next();
				System.out.println("请输入您的密码：");
				lpword = input.next();
				i = 0;
				continue;
			}
		}
		return null;
	}
}
