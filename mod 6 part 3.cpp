#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
using namespace std;

class payroll{
	//declare variables
	public:
	int employeeID, payStat, otHours;
	string firstName, lastName;
	double hourlyRate, hours, salary, taxRate, taxAmount, grossPay, netPay, regPay, otPay;
	public: void setVariables(int empID, string fName, string lName, int stat, double rate, double hrs){
      employeeID = empID; firstName = fName; lastName = lName;payStat = stat;
      if (payStat == 1){ hourlyRate = rate; }
      else { salary = rate;}
      hours = hrs; }
   //declare function to calculate gross pay
   public: virtual double calculateGrossPay() = 0;
   double calculateTaxAmount(){ taxRate = .30; //set a flat taxrate 30%
      taxAmount = grossPay * taxRate; //formula to calculate tax amount
      return taxAmount; } //end calculateTaxAmount() function
      double calculateNetPay(){
      	netPay = grossPay - taxAmount;
	   return netPay;    } //end
   void printData(){ //print out the data
    cout<<setprecision(2)<<setiosflags(ios::fixed | ios::showpoint);
 	cout<<employeeID<<"\t"<<firstName<<"\t"<<lastName<<"\t"<<hours<<"\t"<<payStat<<"\t"<<grossPay<<"\t"<<taxAmount<<"\t"<<netPay<<endl;
 }
     //end printData() function
}; //end Payroll class
class employeeSalary : public payroll{
   public: double calculateGrossPay() {
      regPay = salary/52;
      hourlyRate = regPay/40;
      if (hours > 40) {otHours = (hours - 40); //calculate OT hours
         otPay = (otHours * hourlyRate); //calculate OT pay
         grossPay = (regPay + otPay); }
      else if (hours <= 40) {otHours = 0; otPay = 0; grossPay = regPay;}
      return grossPay;    }
}; //end EmployeeSalary class
class employeeHourly : public payroll{
      public: double calculateGrossPay(){
      regPay = (40 * hourlyRate); //calculate regular hours
      if (hours > 40){   otHours = (hours - 40); //calculate OT hours
         otPay = (otHours * hourlyRate * 1.5); //calculate OT pay
         grossPay = (regPay + otPay); //calculate gross pay
      } //enf if clause for gross pay with overtime
      else { otHours = 0;   otPay = 0; grossPay = regPay;
      } //end else clause for four hours
      return grossPay;  } //end calculateGrossPay() function
}; //end EmployeeHourly class
void printHeader(){	
 	cout<<setw(45)<<"-PAYROLL REPORT-"<<endl;
	cout<<"------------------------------------------------------------------------------"<<endl;
	cout<<"ID"<<"\t"<<"First"<<"\t"<<"Last"<<"\t"<<"Hours"<<"\t"<<"Stat"<<"\t"<<"Gross"<<"\t"<<"Tax"<<"\t"<<"Net"<<endl;
	cout<<"------------------------------------------------------------------------------"<<endl; 
}//end printHeader() function
int main(void){
	//declare variables
	int empID, stat, totalEmployeeCount;
	int employeeCounter=0;
	string fName, lName;
	double rate, hrs, salary;
   cout<<"Enter # of employees you want to process: ";
   cin>>totalEmployeeCount;
   payroll *employee[100];  
   //while loop to get input for each employee
   while (employeeCounter < totalEmployeeCount){
      //prompt the user for hourly or salary employeej
      cout<<"Is employee "<<employeeCounter+1<<" hourly or salary? (Enter 1 for HOURLY / 2 for SALARY): ";
      cin>>stat;
      if (stat == 1){ cout<<"Instantiating an HOURLY employee object inherited from base class payroll..."<<endl<<endl;
         cout<<"Enter employee's ID: ";cin>>empID;
         cout<<"Enter employee's first name: ";cin>>fName;
         cout<<"Enter employee's last name: ";cin>>lName;
         cout<<"Enter employee's hourly wage: "; cin>>rate;
         cout<<"Enter employee's hours for this week: "; cin>>hrs;
         employee[employeeCounter] = new employeeHourly();        
         employee[employeeCounter]->setVariables(empID, fName, lName, stat, rate, hrs);
         employee[employeeCounter]->calculateGrossPay();
         employee[employeeCounter]->calculateTaxAmount();
         employee[employeeCounter]->calculateNetPay();
		 employeeCounter++; } //end if
      //if employee is NOT hourly (Salary clause)
      else { cout<<"Instantiating a SALARY employee object inherited from base class payroll..."<<endl<<endl;
	  //input for employee
	   	 cout<<"Enter employee's ID: ";cin>>empID;
         cout<<"Enter employee's first name: ";cin>>fName;
         cout<<"Enter employee's last name: ";cin>>lName;
         cout<<"Enter employee's salary: "; cin>>salary;
         cout<<"Enter employee's hours for this week: "; cin>>hrs;
         employee[employeeCounter] = new employeeSalary();        
         employee[employeeCounter]->setVariables(empID, fName, lName, stat, salary, hrs);
         employee[employeeCounter]->calculateGrossPay();
         employee[employeeCounter]->calculateTaxAmount();
         employee[employeeCounter]->calculateNetPay();
		 employeeCounter++; } //end if
	   }
		printHeader();
		employeeCounter = 0;
	   while (employeeCounter < totalEmployeeCount){
	   	employee[employeeCounter]->printData();
	   	employeeCounter++;
	   }
}


