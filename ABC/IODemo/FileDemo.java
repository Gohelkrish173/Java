import java.io.File;
public class FileDemo{
	public static void main(String[] args) {
		File f1 = new File("myFolder");
		String[] filesInFolder = f1.list();

		for(int i=0;i<filesInFolder.length;i++){
			File temp = new File(f1,filesInFolder[i]);
			System.out.println(temp.delete());
		}
	}
}