
public class Driver {

	public static void main(String[] args) {
		Folder folder1 = new Folder("Folder 1");
		File file1 = new File("File 1");
		folder1.add(file1);
		Folder folder2 = new Folder("Folder 2");
		folder1.add(folder2);
		File file2 = new File("File 2");
		folder2.add(file2);
		
		folder1.showDetail();
	}

}
