// sum = 2 + 5 + 8 + 11 + 14 +��������������n����sum��ǰn��͡�
#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int sum = 0;
    sum = 2 * n + (n * (n - 1) * 3) / 2;
    printf("%d", sum);
}