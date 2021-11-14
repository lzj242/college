#include <stdio.h>
int main()
{
// 函数extractDigit的功能：从文件a.txt中提取数值写入文件b.txt中
void extractDigit(); 

// 请在此添加代码，实现extractDigit函数
/********** Begin *********/
{
    int j=0,i,k=0;
    FILE *fp;
    fp=fopen("a.txt","r");
    FILE *fp1;
    fp1=fopen("b.txt","w");
    char b[100];
    fgets(b,100,fp);
    char a[100];
    for(i=0;b[i]!='\0';i++)
    {
        if(b[i]<='9'&&b[i]>='0')
    {
        a[j++]=b[i];
        k++;
    }
    if(k%3==0)
    {a[j++]=32;}
    }
    a[j++]=32;
    a[j]='\0';
    fputs(a,fp1);
    fclose(fp1);
    fclose(fp);
}
}
/********** End **********/
