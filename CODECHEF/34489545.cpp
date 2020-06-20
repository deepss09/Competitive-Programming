#include <iostream>
// #define max 1,000,000
using namespace std;

int main() {
	int t;
	cin >> t;
	for (int i = 0; i < t; i++)
	{
	    int n, b;
	    cin >> n >> b;
	    int maxarea = 0;
	    int w, h, p;
	    for (int j = 0; j < n; j++)
	    {
	        cin >> w >> h >> p;
	        if (w * h > maxarea && p <= b)
	        {
	            maxarea = w * h;
	        }
	    }
	    if (maxarea != 0)
	        cout << maxarea << endl;
	   else
	        cout << "no tablet" << endl;
	}
	return 0;
}