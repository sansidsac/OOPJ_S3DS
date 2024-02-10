import java.io.*;
class FileSample{
    public static void main(String[] args) throws IOException, FileNotFoundException{
        FileInputStream fi=new FileInputStream("output.txt");
        FileOutputStream fo=new FileOutputStream("input.txt");
        int c=fi.read();
        do{
            fo.write(c);
            c=fi.read();
        }while(c!=-1);
        System.out.println("Completed");
        fi.close();
        fo.close();
    }
}