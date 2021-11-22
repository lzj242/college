#include<stdio.h>
#include<limits.h>
int main(){
    int x;
    scanf("%d",&x);
    int rev = 0;
    while (x != 0) {
        if (rev < INT_MIN / 10 || rev > INT_MAX / 10) {
            printf("´íÎó");
            break;
        }
        int digit = x % 10;
        x /= 10;
        rev = rev * 10 + digit;
    }
    printf("%d",rev);
}