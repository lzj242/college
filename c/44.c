// ��������������m��n(m < n) ����m��n֮��(����m��n) ���������ĺͣ�Ҫ���岢���ú���isprime(x) ���ж�x�Ƿ�Ϊ����(�����ǳ�1����ֻ�ܱ�������������Ȼ��)��
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