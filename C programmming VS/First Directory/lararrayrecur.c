#include<stdio.h>
int max=0;
int maxarr(int arr[],int n)
{
    if(arr[n-1]>max)max=arr[n-1];
    if((n-1)==0)return max;
    else return maxarr(arr,n-1);
}
void main()
{
    int n,i;
    printf("Enter the size of array:");
    scanf("%d",&n);
    int a[n];
    printf("Enter your array\n");
    for(i=0;i<n;++i)scanf("%d",&a[i]);
    printf("The largest element in your array is %d",maxarr(a,n));
}