package hw211;

import java.io.File;

public class Hw21 {

	public static void main(String[] args) {
		File file = new File("D:/1.txt");
		File file2 = new File("D:/11.txt");
		String getin = Streamtool.getin(file);
		System.out.println(getin);
		Streamtool.putTo(getin, file2);
	}

	// public static String getin(File file) {
	// try (BufferedReader bfr = new BufferedReader(new FileReader(file));) {
	// char[] ch = new char[20];
	// String str = "";
	// while (true) {
	// int read = bfr.read(ch);
	// if (read == -1) {
	// break;
	// }
	// str += new String(ch).substring(0, read).toUpperCase();
	// }
	// return str;
	// } catch (FileNotFoundException e) {
	// e.printStackTrace();
	// return null;
	// } catch (IOException e) {
	// e.printStackTrace();
	// return null;
	// }
	// }
	//
	// public static void putTo(String str, File file) {
	// try (BufferedWriter bfw = new BufferedWriter(new FileWriter(file));) {
	//
	// bfw.write(str);
	// System.out.println("–¥»ÎÕÍ±œ~");
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

}
