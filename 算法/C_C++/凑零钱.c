#include <stdio.h>
#include<string.h>
int main()
{
    int resolve(int coins[], int count);
    int k;
    scanf("%d", &k);
    int coins[k];
    for (int i = 0; i < k; i++)
    {
        /* code */
        scanf("%d", &coins[i]);
    }
    int amount;
    scanf("%d", &amount);
    printf("%d", resolve(coins, amount));
    return 0;
}
int resolve(int coins[], int amount)
{
    int mincoin=0;
    for (int i = 0; i < strlen(coins); i++)
    {
        /* code */
        if(mincoin<)
    }
    
    int min=0;
    if (amount == 0 || strlen(coins)==0)
    {
        return 0;
    }
    else
    {
        
    }
}