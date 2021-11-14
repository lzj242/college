// 请设计输出实数的格式，包括：⑴一行输出一个实数；⑵一行内输出两个实数；⑶一行内输出三个实数。实数用 "6.2f"格式输出。
#include<stdio.h>
int main()
{
    void judge(float f);
    float x;
    scanf("%f",&x);
    judge(x);
    return 0;
}
void judge(float f)
{
    for (int i = 1; i < 4; i++)
    {
        /* code */
        for(int t=1;t<=i;t++)
        {
        printf("%6.2f ",f);
        }
        printf("\n");
    }
}