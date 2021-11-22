#include <stdio.h>
#include <stdbool.h>
int main()
{
    bool resolve(int x);
    int n;
    scanf("%d", &n);
    if (resolve(n))
    {
        printf("true");
    }
    else
    {
        printf("false");
    }
    return 0;
}
bool resolve(int x)
{
    int t = 0, i = -1, a, b;
    int nums[10];
    if (x < 0)
    {
        return false;
    }
    else
    {
        while (1)
        {
            t = x % 10;
            x /= 10;
            i++;
            nums[i] = t;
            if (x == 0)
            {
                break;
            }
        }
        for (int j = 0; j < i+1; j++)
        {
            for (int k = 0; k < i+1; k++)
            {
                if (j != k)
                {
                    if (j + k == i)
                    {
                        if (nums[j] != nums[k])
                        {
                            return false;
                        }
                    }
                }
            }
        }
    }
    return true;
}