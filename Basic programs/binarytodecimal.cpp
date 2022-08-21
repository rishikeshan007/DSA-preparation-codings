#include<iostream>
using namespace std;
int binarytodecimal(int n)
{
    int rem,product=1,ans=0;
    while(n!=0)
    {
        rem=n%10;
        ans=ans+(rem*product);
        n=n/10;
        product=product*2;
    }
    return ans;
}



int main()
{
    int n;
    cin>>n;
    cout<<"the conversion of decimal to binary is"<<" "<<binarytodecimal(n)<<endl;
}

