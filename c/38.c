/* ��һ�ַ���������n���ַ���дһ�����������ַ����дӵ�m���ַ���ʼ��ȫ���ַ����Ƴ�Ϊ��һ���ַ�����*/
#include <stdio.h>
int main()
{
    int n;
    int m;
    scanf("%d", &n);
    getchar();
    char c[n];
    gets(c);
    scanf("%d", &m);
    getchar();
    int t;
    int i;
    for (i = m - 1; i < n; i++)
    {
        /* code */
        printf("%c",c[i]);
    }
}
