#include<stdio.h>

int main(){
    int var = 789;

    int *ptr2;

    int **ptr1;

    ptr2 = &var;

    ptr1 = &ptr2;

    printf("Value of Var = %d\n", var);
    printf("value of var with single pointer = %d\n", *ptr2);
    printf("Value of var with double pointer = %d\n", **ptr1);

    return 0;
}