package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<User> uset = new ArrayList<>();
		ArrayList<Book> lib = new ArrayList<>();
		lib.add(new Book("���ݽṹ"));
		lib.add(new Book("Java���"));
		lib.add(new Book("���ݽṹ"));
		lib.add(new Book("���ݿ⼼��"));
		lib.add(new Book("HTML���"));
		lib.add(new Book("JDBC"));
		lib.add(new Book("���ŵ���ͨ"));
		lib.add(new Book("���ŵ�����"));
		lib.add(new Book("�㷨"));
		lib.add(new Book("�㷨���"));
		User admin = new User("����Ա", "adminaa", "adminqw");
		User admin1 = new User("����Ա1", "admin123", "admin1qw");
		User wleiy = new User("����Ա2", "wleiy432", "wleiyasd");
		uset.add(admin);
		uset.add(admin1);
		uset.add(wleiy);
		System.out.println("���������ǹ���Ա�˺ţ����ڲ��ԣ�ֱ�ӿɵ�½");
		for (User str : uset) {
			System.out.println(str.toString());
		}
		System.out.println("\n");
		System.out.println("���ã���ӭ����ͼ���~\n��Ҫ�ȵ�¼����ʹ����صĹ��ܣ�������ѡ��\n\t1����¼\n\t2��ע�� ");
		String choice = input.next();
		User me;
		while (!(choice.equals("1") || choice.equals("2"))) {
			System.out.println("�밴��ʾ��������ѡ��~");
			choice = input.next();
		}
		switch (choice) {
		case "1":
			me = User.login(uset);
			break;
		case "2":
			me = User.register(uset);
			uset.add(me);
			break;
		default:
			me = admin;
			break;
		}
		while (true) {
			System.out.println("\n\n\t���ã�" + me.getUsername());
			System.out.println("\t**��ӭʹ��ͼ���***");
			System.out.println("\t��ѡ����Ҫ���еĲ�����");
			System.out.println("\t1����ѯͼ��");
			System.out.println("\t2������");
			System.out.println("\t3������");
			System.out.println("\t4����ʾͼ����е��鼮");
//			System.out.println("\t5��ע�����µ�¼");
			System.out.println("\t�������������˳�");
			System.out.println("��������Ҫ���еĲ�������ţ�");
			String ch = input.next();
			switch (ch) {
			case "1":
				Opera.search(lib);
				break;
			case "2":
				Opera.borrow(lib, me.getMybook());
				if (me.getMybook().size() != 0)
					Opera.showmybook(me.getMybook());
				break;
			case "3":
				Opera.giveback(lib, me.getMybook());
				break;
			case "4":
				Opera.libshow(lib);
				break;
//			case "5":
//				System.out.println("�����ڴ���������û��������������");
//				break ;
			default:
				System.out.println("��л����ʹ�ã��ټ�~");
				System.exit(0);
				break;
			}
		}
	}
}
