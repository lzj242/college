// ���Ƴ�������n��������n�Ӽ������룬n > 0����������ǵ�ż���͡�
#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int nums[n];
    int sum=0;
    for (int i = 0; i < n; i++)
    {
        /* code */
        scanf("%d", &nums[i]);
        if (nums[i] % 2 == 0)
        {
            sum += nums[i];
        }
    }
    printf("%d",sum);
}