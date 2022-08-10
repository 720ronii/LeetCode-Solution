#include<stdio.h>
#include<stdlib.h>
void main(){
    int arr[]={{1,2,3,4,5},{6,7,8,9,10}};
    int  **p=*arr;


    for(int i=0;i<sizeof(arr)/4;i++){
            for(int j=0;j<sizeof(arr)/4;j++)
                printf("%d ,",*(*arr+i+j));
        }
}
