#include<iostream>
using namespace std;
class Arthematic 
{
    public:
    int No1 ,No2;

    Arthematic(int a, int b)
    {
        No1 = a;
        No2 = b;
    }
    int Addition()
    {
        int ans = 0;
        ans = No1 + No2;
        return ans;
    }
    int Substraction()
    {
        int ans = 0;
        ans = No1 - No2;
        return ans;
    }
};

int main()
{
    Arthematic obj(10,11);
    int ret = 0;
    ret = obj.Addition();
    cout<<"Substrction is:"<<ret<<"\n";
    
    ret = obj.Substraction();
    cout<<"Addition is:"<<ret<<"\n";

 return 0;   
}