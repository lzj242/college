#include <stdio.h>
int main()
{
// ����extractDigit�Ĺ��ܣ����ļ�a.txt����ȡ��ֵд���ļ�b.txt��
void extractDigit(); 

// ���ڴ���Ӵ��룬ʵ��extractDigit����
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
