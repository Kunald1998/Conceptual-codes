#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
    char fname[30];
    int fd = 0, ret = 0;
    char Data[11];

    printf("enter the file name that you want to write\n");
    scanf("%s",&fname);

    fd = open(fname,O_RDWR); 
    if(fd == -1)
    {
        printf("Unable to write file\n");
        return-1;
    }
    else
    {
        printf("file is sucessfully write with fd:%d\n",fd);
    }
    
    read(fd,Data,6);
    // for(iCnt =0;iCnt<6;iCnt++) //to print data
    /*
    {
        printf("%d",Data[iCnt]);

    }


    */
    //printf("Data from file is: %6s\n",Data); //
    write(1,Data,6); //1 = stdout
    close(fd);
    
return 0;
}