package Pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bf=new BufferedWriter(new FileWriter("FileWriter1.txt"));
        bf.write("Azra Manzoor");
        bf.newLine();
        bf.write("Ali Raza");
        bf.close();
    }
}
