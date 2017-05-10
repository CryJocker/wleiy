package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Opera {
	/**
	 * 显示图书馆里所有的书
	 * 
	 * @param book
	 */
	public static void libshow(ArrayList<Book> book) {
		for (Book book2 : book) {
			System.out.println(book2.toString());
		}
	}

	/**
	 * 通过书名查询是否有需要的书，将查询到的第一本书打印出来
	 * 
	 * @param book
	 */
	public static void search(ArrayList<Book> book) {
		System.out.println("请输入能您要查询的书名:");
		Scanner input = new Scanner(System.in);
		String bname = input.next();
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getBookname().equals(bname)) {
				System.out.println("有您查找的书");
				System.out.println(book.get(i).toString());
				break;
			}
			if (i == book.size() - 1) {
				System.out.println("抱歉，没有您需要的书");
			}
		}
	}

	/**
	 * 借书，从图书馆容器将书借到我的图书容器。借出之后，图书馆的相应元素进行删除
	 * 
	 * @param book
	 * @param mybook
	 */
	public static void borrow(ArrayList<Book> book, HashMap<String, Integer> mybook) {
		System.out.println("请输入能您要借的书名:");
		Scanner input = new Scanner(System.in);
		String bname = input.next();
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getBookname().equals(bname)) {
				if (mybook.containsKey(bname)) {
					mybook.put(bname, mybook.get(bname) + 1);
				} else {
					mybook.put(bname, 1);
				}

				System.out.println("有您需要的书，已为您借出。");
				System.out.println(book.get(i).toString());
				book.remove(book.get(i));
				break;
			}
			if (i == book.size() - 1) {
				System.out.println("抱歉，没有您需要的书");
			}
		}
	}

	/**
	 * 打印当前登录用户的借书情况
	 * 
	 * @param mybook
	 */
	public static void showmybook(HashMap<String, Integer> mybook) {
		System.out.println("以下是您的借书情况:");
		Set<String> key = mybook.keySet();
		for (String string : key) {
			System.out.println(string + "  " + mybook.get(string) + "本");
		}
	}

	/**
	 * 还书，如果没有借书则不用还。有借书，则打印出借书的具体情况，输入相关的信息进行归还。
	 * 
	 * @param book
	 * @param mybook
	 */
	public static void giveback(ArrayList<Book> book, HashMap<String, Integer> mybook) {
		String gbname;
		int gbnum;
		if (mybook.size() == 0)
			System.out.println("您没有借书，不用归还~");
		else {
			Opera.showmybook(mybook);
			Scanner input = new Scanner(System.in);
			while (true) {
				System.out.println("请输入您要归还的书名:");
				gbname = input.next();
				System.out.println("请输入您要归还的数量:");
				while (!input.hasNextInt()) {
					input.next();
					System.out.println("输入不符，请输入要归还的数量（整数）");
				}
				gbnum = input.nextInt();
				if (mybook.containsKey(gbname) && mybook.get(gbname) >= gbnum && gbnum >= 0) {
					if (mybook.get(gbname) == gbnum) {
						for (int i = 0; i < gbnum; i++) {
							book.add(new Book(gbname));
						}
						mybook.remove(gbname);

					} else {
						for (int i = 0; i < gbnum; i++) {
							book.add(new Book(gbname));
						}
						mybook.put(gbname, mybook.get(gbname) - gbnum);

					}
					System.out.println("归还成功~");
					break;
				} else {
					System.out.println("归还信息输入错误，请重新输入!");
				}

			}
		}

	}
}
