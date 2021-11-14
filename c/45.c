// 编程，输入一个１０进制正整数，然后输出它所对应的八进制数。
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