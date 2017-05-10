package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<User> uset = new ArrayList<>();
		ArrayList<Book> lib = new ArrayList<>();
		lib.add(new Book("数据结构"));
		lib.add(new Book("Java编程"));
		lib.add(new Book("数据结构"));
		lib.add(new Book("数据库技术"));
		lib.add(new Book("HTML详解"));
		lib.add(new Book("JDBC"));
		lib.add(new Book("入门到精通"));
		lib.add(new Book("入门到放弃"));
		lib.add(new Book("算法"));
		lib.add(new Book("算法详解"));
		User admin = new User("管理员", "adminaa", "adminqw");
		User admin1 = new User("管理员1", "admin123", "admin1qw");
		User wleiy = new User("管理员2", "wleiy432", "wleiyasd");
		uset.add(admin);
		uset.add(admin1);
		uset.add(wleiy);
		System.out.println("下面三个是管理员账号，用于测试，直接可登陆");
		for (User str : uset) {
			System.out.println(str.toString());
		}
		System.out.println("\n");
		System.out.println("您好，欢迎来到图书馆~\n需要先登录才能使用相关的功能，您可以选择：\n\t1、登录\n\t2、注册 ");
		String choice = input.next();
		User me;
		while (!(choice.equals("1") || choice.equals("2"))) {
			System.out.println("请按提示输入您的选择~");
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
			System.out.println("\n\n\t您好，" + me.getUsername());
			System.out.println("\t**欢迎使用图书馆***");
			System.out.println("\t请选择您要进行的操作：");
			System.out.println("\t1、查询图书");
			System.out.println("\t2、借书");
			System.out.println("\t3、还书");
			System.out.println("\t4、显示图书馆中的书籍");
//			System.out.println("\t5、注销重新登录");
			System.out.println("\t按任意其他键退出");
			System.out.println("请输入您要进行的操作（序号）");
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
//				System.out.println("敬请期待。。。。没做出来。。。。");
//				break ;
			default:
				System.out.println("感谢您的使用，再见~");
				System.exit(0);
				break;
			}
		}
	}
}
