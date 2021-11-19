#include <stdio.h>
int main()
{
    int nums[100];
    int i = 0, t;
    while (scanf("%d", &nums[i]) != EOF)//EOF(ctrl+z+enter)
    {
        /* code */

            i++;
    }
    for ( t = 0; t < i; t++)
    {
        /* code */
        printf("%c", (char)nums[t]);
    }
    return 0;
}
