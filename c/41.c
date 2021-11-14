// 有N个学生，每个学生的数据包括学号、姓名、3门课的成绩，从键盘输入N个学生的数据，要求打印出3门课的总平均成绩，
// 以及最高分的学生的数据（包括学号、姓名、3门课成绩）
#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    struct score
    {
        /* data */
        char xuehao[20];
        char type[20];
        int d[3];
    } graden[n];
    int sum[n], sum1 = 0, sum2 = 0, sum3 = 0, arage = 0;
    for (int i = 0; i < n; i++)
    {
        /* code */
        scanf("%s %s %d %d %d", &graden[i].xuehao, &graden[i].type, &graden[i].d[0], &graden[i].d[1], &graden[i].d[2]);
    }
    for (int i = 0; i < n; i++)
    {
        /* code */
        sum1 += graden[i].d[0];
        sum2 += graden[i].d[1];
        sum3 += graden[i].d[2];
    }
    printf("%d %d %d\n", sum1 / n, sum2 / n, sum3 / n);
    for (int i = 0; i < n; i++)
    {
        /* code */
        sum[i] = graden[i].d[0] + graden[i].d[1] + graden[i].d[2];
    }
    int max = sum[0];
    int t=0;
    for (int i = 1; i < n; i++)
    {
        /* code */
        if (max < sum[i])
        {
            max = sum[i];
            t = i;
        }
    }
    printf("%s %s %d %d %d", graden[t].xuehao, graden[t].type, graden[t].d[0], graden[t].d[1], graden[t].d[2]);
}