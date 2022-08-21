#include<iostream>
using namespace std;
int binary(int n)
{
    int rem,product=1,ans=0;
    while(n!=0)
    {
        rem=n%2;
        ans=ans+(rem*product);
        n=n/2;
        product=product*10;
    }
    return ans;
}



int main()
{
    int n;
    cin>>n;
    cout<<"the conversion of decimal to binary is"<<" "<<binary(n)<<endl;
}

