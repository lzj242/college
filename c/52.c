// 输入两个正整数m和n，求其最大公约数和最小公倍数。
#include <stdio.h>
int main()
{
    int gcd(int x, int y);
    int m, n;
    scanf("%d %d", &m, &n);
    int max, min;
    max = gcd(m, n);
    min = (m * n) / max;
    printf("%d %d", max, min);
}
int gcd(int x, int y)
{
    return y ? gcd(y, x % y) : x;
}