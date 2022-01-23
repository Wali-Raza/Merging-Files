package Pack1;

import java.io.*;

public class Merging_Files_Consecutively
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw=new PrintWriter(new FileWriter("FIle4.txt"));
        BufferedReader reader1=new BufferedReader(new FileReader("File1.txt"));
        BufferedReader reader2=new BufferedReader(new FileReader("File2.txt"));
        String F1line=reader1.readLine();
        String F2line=reader2.readLine();
        while (F1line!=null || F2line!=null)
        {
            if(F1line!=null)
            {
                pw.println(F1line);
                F1line=reader1.readLine();
            }
            if(F2line!=null)
            {
                pw.println(F2line);
                F2line=reader2.readLine();
            }
        }
        pw.flush();
        reader1.close();
        reader2.close();
    }
}
