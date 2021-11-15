#include <stdio.h>

int main()
{
    int n;
    for (int n = 100; n >=0; n--)
    {
    while (1) //循环输入n
    {
        int ans = 0;   //定义答案 初始化为0
        while (n >= 2) //循环n>=2时可继续换汽水
        {
            if (n >= 3) //模式一：n>=3时三个瓶子换一瓶汽水
            {
                int temp = n / 3;        //temp记录当前瓶子可换取的汽水瓶数
                ans += temp;             //答案加上temp
                n = n - temp * 3 + temp; //n减去换汽水消耗的瓶子，再加上新得到的瓶子
            }
            else if (n == 2) //模式二：两个瓶子可以借汽水再换
            {
                ans++; //答案加一
                n = 0; //瓶子清零
            }
        }
        printf("%d\n", ans); //输出答案
    }
    }
    return 0;
}