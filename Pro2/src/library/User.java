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
		return "�û� [�ǳ�=" + username + ", �˺�=" + account + ", ����=" + password + "]";
	}

	/**
	 * �˺�ע�Ṧ��
	 * 
	 * @return
	 */
	public static User register(ArrayList<User> uset) {

		String acc;
		String pword;
		A: while (true) {
			System.out.println("���ã������������˺�(6��16λ������ĸ�����֡��»������):");
			acc = input.next();
			if (!acc.matches("[a-zA-Z0-9_]{6,16}")) { // ����Ƿ�����Ҫ��
				System.out.println("�˺Ų�����Ҫ������������!\n");
				break;
			}
			for (int i = 0; i < uset.size(); i++) { // �ж��˺��Ƿ��Ѵ���
				if (uset.get(i).getAccount().equals(acc)) {
					System.out.println("��ע����˺��Ѵ��ڣ���ע�������˺�!\n");
					continue A;
				}
			}
			break;
		}
		do {
			System.out.println("���ã���������������(6��16λ������ĸ�����֡��»������):");
			pword = input.next();
			if (!pword.matches("[a-zA-Z0-9_]{6,16}")) // ����Ƿ�����Ҫ��
				System.out.println("���벻����Ҫ������������!\n");
			;
		} while (!pword.matches("[a-zA-Z0-9_]{6,16}"));
		System.out.println("Ϊ�����˺�����һ���ǳư�:");
		String uname = input.next();
		User user = new User(uname, acc, pword);
		System.out.println("���ã�" + uname + ",�����˺�ע��ɹ�!\n");
		System.out
				.println("�����˺�Ϊ:" + user.getAccount() + "\n��������Ϊ:" + user.getPassword() + "\n�ǳ�:" + user.getUsername());
		return user;
	}

	/**
	 * ��¼����
	 * 
	 * @param uset
	 * @return
	 */
	public static User login(ArrayList<User> uset) {
		String lacc;
		String lpword;
		System.out.println("�����������˺ţ�");
		lacc = input.next();
		System.out.println("�������������룺");
		lpword = input.next();
		for (int i = 0; i < uset.size(); i++) {
			if (uset.get(i).getAccount().equals(lacc)) {
				if (uset.get(i).getPassword().equals(lpword)) {
					System.out.println("��¼�ɹ�����ӭ����" + uset.get(i).getUsername());
					return uset.get(i);
				}
			}
			if (i == uset.size() - 1) {
				System.out.println("��������˺����벻��ȷ������������");
				System.out.println("�����������˺ţ�");
				lacc = input.next();
				System.out.println("�������������룺");
				lpword = input.next();
				i = 0;
				continue;
			}
		}
		return null;
	}
}
