// ��̣�����һ������������������Ȼ�����������Ӧ�İ˽�������
#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    if (n < 0)
    {
        printf("-");
        n = -n;
        printf("%o", n);
    }
    else
    {
        printf("%o", n);
    }
}