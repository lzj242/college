// 输出一张摄氏一华氏温度转换表，摄氏温度的取值区间是[-100 C，150C] ，温度间隔50C。要求定义和调用函数 ctof(c), 将摄氏温度C转换成华氏温度F，计算公式：
//F = 32 + C * 9 / 5。
// 例如
//c = 0->f = 32 c = 5->f = 41 c = 10->f = 50 c = 15->f = 59 c = 20->f = 68 c = 25->f = 77
// c = 30->f = 86 c = 35->f = 95 c = 40->f = 104 c = 45->f = 113 c = 50->f = 122
// c = 55->f = 131 c = 60->f = 140 c = 65->f = 149
#include <stdio.h>
int main()
{
    int ctof(int c);
    for (int i = -100; i <= 150; i+=5)
    {
        /* code */
        printf("c=%d->f=%d\n", i, ctof(i));
    }
}
int ctof(int c)
{
    return (32+(c*(9/5.0)));
}