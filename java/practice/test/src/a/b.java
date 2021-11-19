package a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileWriter;
import java.util.Scanner;
public class b {
    public static void main(String[] args) throws IOException{
        //打开一个文件读取内容
        BufferedReader in=new BufferedReader(new FileReader(new File("file.txt")));
        //写入文件
        BufferedWriter out =new BufferedWriter(new FileWriter(new File("file10.txt")));
        String line=null;
        while((line=in.readLine())!=null) {
            //按字符检查是否为注释
            char[] ch=line.toCharArray();
            int i=0;
            for(i=0;i<ch.length;i++) {
                //找到注释,若这行只有注释清空注释
                if(ch[i]=='/'&&ch[i+1]=='/') {
                    for(i=i-1;i>=0;i--)
                        if(ch[i]!=' ')
                            break;
                    break;
                }
            }
            //写入
            if(i>0){
                String str=String.valueOf(Arrays.copyOf(ch, i));
                out.write(str+"\n");
                out.flush();
            }
        }
        in.close();
        out.close();
    }
}
