package test17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();		
		map.put(1, "��һ��");      //��map�����key-value�ԡ�
		map.put(2, "�ڶ���");
		map.put(3, "������");
		Set<Integer> set = map.keySet();    //keySet()�������õ�map����key��Set����
		System.out.println("��Ӧ��key-value��Ϊ��");
		for (Integer integer : set) {        //foreach������
			System.out.print(integer);
			System.out.println("\t"+map.get(integer));      //ͨ��key�õ���Ӧkey��value��
		}
		System.out.println();
		System.out.println("���Ӻ͸���֮��");
		map.put(1, "�����˵�һ��");     //��map�����key-value�ԣ���Ϊkey�Ѿ����ڣ��ʸ����˶�Ӧkey��valueֵ��
		map.put(4, "���ӵĵ��ĸ�");     ////��map������µ�key-value�ԡ�
		for (Integer integer : set) {
			System.out.print(integer);
			System.out.println("\t"+map.get(integer));
		}
	}
}
