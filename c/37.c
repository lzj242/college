#include <stdio.h>

// 函数king：猴子选大王
// 参数：a-猴子数组n-1个猴子分别占据下标为~n-1的位置，n-数组长度
// 返回值：新猴王的下标序号
int king(int a[], int n);
int main()
{
    int n, a[1000], i; // 定义变量及数组，n-猴子数量，a-猴子数组
    scanf("%d", &n);   // 输入猴子数量，n>0
    // 初始化猴子数组,n 个猴子分别占据 n 个位置
    a[0] = 0; // 0号位置没有猴子
    for (i = 1; i <= n; i++)
        a[i] = 0;
    // 选大王啦
    i = king(a, n);
    printf("%d", i);
    return 0;
}

int king(int a[], int n)
{
    // 请在此添加代码，实现函数king
    /********** Begin *********/
    int x = 1, z = 0, l, j = 0, t;
    l = 0;
    while (l != (n - 1))
    {
        if (a[x] == 0)
            z++;
        if (z == 3)
        {
            z = 0;
            a[x] = 12;
            l++;
        }
        x++;
        if (x == n)
        {
            x = 0;
        }
    }
    for (x = 1; x <= n; x++)
    {
        if (a[x] == 0)
            return x;
    }
    /********** End **********/
}