#include<iostream>
using namespace std;

template <class T>

class Arthematic 
{
    public:
    T No1;
    T No2;

    Arthematic(T a, T b)
    {
        No1 = a;
        No2 = b;
    }
    T Addition()
    {
        T ans;
        ans = No1 + No2;
        return ans;
    }
    T Substraction()
    {
        T ans;
        ans = No1 - No2;
        return ans;
    }
};

int main()
{
    Arthematic <int>iobj(10,11);
    int ret = 0;
    ret = iobj.Addition();
    cout<<"Addition is:"<<ret<<"\n";

    Arthematic <double>dobj(10.9,11.5);
    double dret = dobj.Addition();
    cout<<"Addition is:"<<dret<<"\n";
    
 return 0;   
}