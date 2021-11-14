// 输入两个正整数m和n(m < n) ，求m到n之间(包括m和n) 所有素数的和，要求定义并调用函数isprime(x) 来判断x是否为素数(素数是除1以外只能被自身整除的自然数)。
#include <stdio.h>
#include <stdbool.h>
int main()
{
    bool isprime(int x);
    int m, n, sum = 0;
    scanf("%d %d", &m, &n);
    for (int i = m; i <= n; i++)
    {
        /* code */
        if (isprime(i))
        {
            sum += i;
        }
    }
    printf("%d", sum);
}
bool isprime(int x)
{
    if (x <= 3)
    {
        return x > 1;
    }
    for (int i = 2; i < x; i++)
    {
        /* code */
        if (x % i == 0)
        {
            return false;
        }
    }
    return true;
}