import java.io.File;
import java.util.Scanner;

public class xoafile {
    /**
     * 
     */
    public xoafile() {
        Scanner sc = new Scanner(System.in);
        String path =sc.nextLine();
        File f=new File(path);
        recur(f);
    }

    public void recur(File file) {
        if (file.isDirectory()) {
            System.out.println(file.getName() + "  "+ file.delete());
            File[] children = file.listFiles();
            for (File child : children) {
                this.recur(child);
            }
        }
        else {
            System.out.println(file.getName());
        }
    }

    public static void main(String[] args) {
        new xoafile();
    }
}
