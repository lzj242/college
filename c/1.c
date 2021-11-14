// 输入一行字符，分别统计出其中英文字母、数字、空格和其他字符的个数。
#include<stdio.h>
#include<string.h>
    int main()
    {
        char a[200];
        gets(a);
        int n=strlen(a);
        int enumbers=0,mnumbers=0,snumbers=0,onumbers=0;
        for(int i=0;i<n;i++){
            if (a[i]>='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')
            {
                /* code */
                enumbers++;
            }
            else if (a[i]>='0'&&a[i]<='9')
            {
                /* code */
                mnumbers++;
            }
            else if (a[i]==' ')
            {
                /* code */
                snumbers++;
            }
            else{
                onumbers++;
            }
        }
        printf("%d %d %d %d", enumbers, mnumbers, snumbers, onumbers);
    }