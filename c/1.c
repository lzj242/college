// ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ�����֡��ո�������ַ��ĸ�����
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