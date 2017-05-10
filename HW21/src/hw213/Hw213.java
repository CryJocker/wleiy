package hw213;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Hw213 {

	public static void main(String[] args) {
		ArrayList<WorldCup> arrayList = new ArrayList<>();
		File file = new File("D:/cup.txt");
		getString1(file, arrayList);
		for (WorldCup worldCup : arrayList) {
			System.out.println(worldCup.toString());
		}
	}

	// public static void fun(File file, ArrayList<WorldCup> arrayList) {
	// try (BufferedReader bfr = new BufferedReader(new FileReader(file));) {
	// while (true) {
	// String readLine = bfr.readLine();
	// if (readLine == null) {
	// break;
	// }
	// arrayList.add(split(readLine, ","));
	// }
	// } catch (FileNotFoundException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// public static WorldCup split(String str, String cut) {
	// String[] split = str.split(cut);
	// WorldCup cup = new WorldCup(split[0], split[1], split[2]);
	// return cup;
	// }
	//

//	public static String getString(File file) {
//		String str = "";
//		try (BufferedReader bfr = new BufferedReader(new FileReader(file));) {
//			while (true) {
//				String readLine = bfr.readLine();
//				if (readLine == null) {
//					break;
//				}
//				str += readLine + "@";
//			}
//			return str;
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			return null;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

	
//	public static void func(String str1, String m, String n, ArrayList<WorldCup> arrayList) {
//		String[] split = str1.split(m);
//		for (int i = 0; i < split.length; i++) {
//			String[] split2 = split[i].split(n);
//			WorldCup cup = new WorldCup(split2[0], split2[1], split2[2]);
//			arrayList.add(cup);
//		}
//	}
	
	
	public static String getString1(File file,ArrayList<WorldCup> arrayList) {
		String str = "";
		try (BufferedReader bfr = new BufferedReader(new FileReader(file));) {
			while (true) {
				String readLine = bfr.readLine();
				if (readLine == null) {
					break;
				}
				funm(readLine, ",", arrayList);
			}
			return str;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
		
	public static void funm(String str2,String x,ArrayList<WorldCup> arrayList){
		String[] split = str2.split(x);
		WorldCup cup = new WorldCup(split[0], split[1], split[2]);
		arrayList.add(cup);
	}
	
	
	
	
	
	
}
