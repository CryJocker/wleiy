package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Opera {
	/**
	 * ��ʾͼ��������е���
	 * 
	 * @param book
	 */
	public static void libshow(ArrayList<Book> book) {
		for (Book book2 : book) {
			System.out.println(book2.toString());
		}
	}

	/**
	 * ͨ��������ѯ�Ƿ�����Ҫ���飬����ѯ���ĵ�һ�����ӡ����
	 * 
	 * @param book
	 */
	public static void search(ArrayList<Book> book) {
		System.out.println("����������Ҫ��ѯ������:");
		Scanner input = new Scanner(System.in);
		String bname = input.next();
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getBookname().equals(bname)) {
				System.out.println("�������ҵ���");
				System.out.println(book.get(i).toString());
				break;
			}
			if (i == book.size() - 1) {
				System.out.println("��Ǹ��û������Ҫ����");
			}
		}
	}

	/**
	 * ���飬��ͼ�����������赽�ҵ�ͼ�����������֮��ͼ��ݵ���ӦԪ�ؽ���ɾ��
	 * 
	 * @param book
	 * @param mybook
	 */
	public static void borrow(ArrayList<Book> book, HashMap<String, Integer> mybook) {
		System.out.println("����������Ҫ�������:");
		Scanner input = new Scanner(System.in);
		String bname = input.next();
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getBookname().equals(bname)) {
				if (mybook.containsKey(bname)) {
					mybook.put(bname, mybook.get(bname) + 1);
				} else {
					mybook.put(bname, 1);
				}

				System.out.println("������Ҫ���飬��Ϊ�������");
				System.out.println(book.get(i).toString());
				book.remove(book.get(i));
				break;
			}
			if (i == book.size() - 1) {
				System.out.println("��Ǹ��û������Ҫ����");
			}
		}
	}

	/**
	 * ��ӡ��ǰ��¼�û��Ľ������
	 * 
	 * @param mybook
	 */
	public static void showmybook(HashMap<String, Integer> mybook) {
		System.out.println("���������Ľ������:");
		Set<String> key = mybook.keySet();
		for (String string : key) {
			System.out.println(string + "  " + mybook.get(string) + "��");
		}
	}

	/**
	 * ���飬���û�н������û����н��飬���ӡ������ľ��������������ص���Ϣ���й黹��
	 * 
	 * @param book
	 * @param mybook
	 */
	public static void giveback(ArrayList<Book> book, HashMap<String, Integer> mybook) {
		String gbname;
		int gbnum;
		if (mybook.size() == 0)
			System.out.println("��û�н��飬���ù黹~");
		else {
			Opera.showmybook(mybook);
			Scanner input = new Scanner(System.in);
			while (true) {
				System.out.println("��������Ҫ�黹������:");
				gbname = input.next();
				System.out.println("��������Ҫ�黹������:");
				while (!input.hasNextInt()) {
					input.next();
					System.out.println("���벻����������Ҫ�黹��������������");
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
					System.out.println("�黹�ɹ�~");
					break;
				} else {
					System.out.println("�黹��Ϣ�����������������!");
				}

			}
		}

	}
}
