package Pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo2
{
    public static void main(String []args) throws IOException
    {
        BufferedWriter bf1 = new BufferedWriter(new FileWriter("FileWriter2.txt"));
        bf1.write("Wali Raza");
        bf1.newLine();
        bf1.write("Ali Raza");
        bf1.close();
    }
}
