#include <stdio.h>
#include <stdbool.h>
int main()
{
    bool resolve(int x);
    int n;
    scanf("%d", &n);
    if (resolve(n))
    {
        printf("true");
    }
    else
    {
        printf("false");
    }
    return 0;
}
bool resolve(int x)
{
    long f = 0;
    int temp = x;
    for (; x; f = f * 10 + x % 10, x /= 10)//������֣��Ӹ�λ�����λ��Ȼ���ٵõ�һ�������֣����λʱ��ԭ�����ֵĸ�λ��ʼ��
        ;
    if (temp == f && temp >= 0)//�����ȣ���֤���ǻ�������
        return true;
    else
        return false;
}
