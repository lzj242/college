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
    for (; x; f = f * 10 + x % 10, x /= 10)//拆分数字，从个位到最高位，然后再得到一个新数字（最高位时从原来数字的个位开始）
        ;
    if (temp == f && temp >= 0)//如果相等，则证明是回文数字
        return true;
    else
        return false;
}
