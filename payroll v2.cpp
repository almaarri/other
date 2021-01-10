#include <iostream>
#include <iomanip>
main() {
	using namespace std;
	int empid;
	int hw;
	float hr,gp,taxamount,netpay;
	float const TAXRATE = 0.10;
	while (1){
cout<< "Kovaka Payroll System"<<endl;
cout<<"ENTER EMPLOYEE ID: ";
cin>>empid;
cout<<"ENTER HOURS WORKED: ";
cin>>hw;
cout<<"ENTER HOURLY RATE: ";
cin>>hr;
gp = hw * hr;
taxamount = gp * TAXRATE;
netpay = gp - taxamount;
cout<<"YOUR ID IS: "<<empid<<endl;
cout<<"YOUR  HOURS WORKED IS: "<<hw<<endl;
cout<<"YOUR HOURLY RATE IS: $"<<setprecision(2)<<setiosflags(ios::showpoint|ios::fixed|ios::left)<<hr<<endl;
cout<<"YOUR GROSS PAY IS: $"<<setprecision(2)<<gp<<endl;
cout<<"YOUR TAX RATE IS: "<<TAXRATE<<endl;
cout<<"YOUR TAX AMOUNT IS: $"<<taxamount<<endl;
cout<<"YOUR NET PAY IS: $"<<netpay<<endl;
} //loop
return 0;
}//MAIN
