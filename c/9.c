// 题目描述
// 猴子吃桃问题。猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个。 第二天早上又将剩下的桃子吃掉一半，又多吃一个。
// 以后每天早上都吃了前一天剩下的一半零一个。 到第N天早上想再吃时，见只剩下一个桃子了。求第一天共摘多少桃子
#include <stdio.h>
#include <sys/socket.h>
int main()
{
    int peachnumbers(int n);
    int n, t;
    scanf("%d", &t);
    n = peachnumbers(t);
    printf("%d", n);
    return 0;
}
int peachnumbers(int n)
{
    int x, y;
    x = n;
    if (x == 1)
    {
        return 1;
    }
    else
    {
        return (peachnumbers(x-1)+1)*2;
    }
}
