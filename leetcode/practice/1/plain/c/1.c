// ����һ���������� nums?��һ������Ŀ��ֵ target�������ڸ��������ҳ� ��ΪĿ��ֵ target? ����?����?���������������ǵ������±ꡣ
//     ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�
//     ����԰�����˳�򷵻ش𰸡�
#include <stdio.h>
#include <string.h>
int main()
{
    int target;
    int n;
    int first, second;
    scanf("%d",&n);
    int nums[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &nums[i]);
    }
    scanf("%d", &target);
    for (int k = 0; k < n; k++)
    {
        /* code */
        for (int j = 0; j < n; j++)
        {
            /* code */
            if (nums[j] != -1 && nums[k] != -1)
            {
                if (k != j && (nums[j] + nums[k] == target))
                {
                    first = k > j ? k : j;
                    second = k < j ? k : j;
                    nums[j] = -1;
                    nums[k] = -1;
                    printf("[%d %d]\n", second, first);
                }
            }
        }
    }
}