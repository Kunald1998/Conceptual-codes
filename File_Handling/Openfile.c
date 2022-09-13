#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h> // f=file, cntl = control.

int main()
{
    char Fname[30];

    int fd = 0;
    printf("enter the file name that you want to open\n");
    scanf("%s",&Fname);

    fd = open(Fname,O_RDWR);
    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("file is sucessfully opened with fd:%d\n",fd);
    }

 return 0;
}