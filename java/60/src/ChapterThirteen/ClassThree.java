package ChapterThirteen;

/**
 * @Author 墨宣
 * @Date 2021/10/27 19:39
 * 目的：
 */
import java.io.*;
import java.util.Scanner;
public class ClassThree {
            public static void main(String[] args) throws IOException {
                Scanner scanner = new Scanner(System.in);
                String javaFile = scanner.next();
                // 请在Begin-End间编写完整代码
                /********** Begin **********/
                BufferedReader bufferedReader = new BufferedReader(new FileReader(javaFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
                File file = new File("test.txt");
                // 读取文件内容
                long n=0;
                // 输出去除注释后的文件长度
                while(true){
                    String s = bufferedReader.readLine();
                    if(null==s){
                        break;
                    }
                    else {

                        if(!s.startsWith("//"))
                        {
                            bw.write(s);
                        }


                        /********** End **********/
                    }
                }
                bufferedReader.close();
                bw.close();
                n=file.length();


                file.delete();
                System.out.print("文件长度："+n);
            }
        }



