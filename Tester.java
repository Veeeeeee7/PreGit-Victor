import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Tester {
    public static void main(String[]args) throws IOException{
        Index i = new Index();
    BufferedWriter bw = new BufferedWriter(new FileWriter("txt.txt"));
    bw.write("derpderpderp");
    bw.close();
    BufferedWriter bw2 = new BufferedWriter(new FileWriter("xtx.txt"));
    bw2.write("xnopyt");
    bw2.close();
    i.writePair("txt.txt");
    i.writePair("xtx.txt");
    i.removePair("txt.txt");
    }
}