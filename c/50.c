// 求出10至1000之内能同时被2、3、7整除的数，并输出。
//     每行一个。
#include <stdio.h>
int main()
{
    for (int i = 10; i <= 1000; i++)
    {
        /* code */
        if (i % 42 == 0)
        {
            printf("%d\n", i);
        }
    }
}
