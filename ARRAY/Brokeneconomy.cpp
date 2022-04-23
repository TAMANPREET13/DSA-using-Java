#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int * arr = new int[n];
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }
    int data;
    cin>>data;
    int si = 0;
    int ei = n-1;
    int ceil = -1,floor = -1;

    while (si<=ei)
    {
        int mid = (si+ei)/2;
        if(arr[mid] == data){
            ceil = data;
            floor = data;
            break;
        }else if(arr[mid] < data){
            floor = arr[mid];
            si = mid+1;

        }else{
            ceil = arr[mid];
            ei = mid-1;
        }
    }
    cout<<ceil<<endl;
    cout<<floor<<endl;
    
}
