#include <iostream>
#include <fstream>
#include <cstdlib>
#include <string>

using namespace std;
/* Use of & signifies Call by Reference. What it means in short is whatever you change for these variables in the function is
 reflected back to the calling function. So, you need not return values */
bool getInt(ifstream&, bool&, int&, string&);
int getFileSize(ifstream&);

int main ()
{
	int intData;
	string junkData;
	bool valueIsGood = false;
	string fileName = "";
	cout << "Enter the input filename: ";
	cin >> fileName;
	cout <<endl;
	





	//Open the file in read mode with the ifstream object fin
	ifstream fin(fileName.c_str());
	ofstream iout("intVals.txt");
	ofstream jout("junkVals.txt");
	//Check if the file opened successfully. If not, exit the program
	if (!fin.is_open()) {
		cerr << "Unable to open file " << fileName <<endl;
		exit(10);
	}
	if (!iout.is_open()) {
		cerr << "Unable to open file intVals.txt" <<endl;
		exit(10);
	}
	if (!jout.is_open()) {
		cerr << "Unable to open file junkVals.txt" <<endl;
		exit(10);
	}



	//Print the size of the file
	cout << "File Size: " << getFileSize(fin) << endl; 
	int lines = 0;
	while (getInt(fin, valueIsGood, intData, junkData)){
		/* Code here: Check if the value in intData is good i.e. integer. This is done by checking valueIsGood boolean
		If value is good, save the intData in intVals.txt else save the junkData in junkVals.txt
		*/
		if (valueIsGood) {
			iout << intData << endl;
		} else {
			jout << junkData << endl;
		}
		lines++;
	}

	//---------------------

	// Close the files
	fin.close();
	iout.close();
	jout.close();

	//------------------------
	cout << "Number of lines in the input file: " << lines << endl;
	cout <<"You can now open intVals.txt and junkVals.txt to see the output!"<<endl;
	return 0;
}

int getFileSize(ifstream& fin){
	int fileSize = 0; //For our case, fileSize will not exceed integer's limit so we do not need long
	
	//------------------------
	
	//Write the logic to print the file size (in bytes)
	fin.seekg(0, ios::end);
	fileSize = fin.tellg();
	fin.seekg(0);

	//------------------------------

	return fileSize;
}

// Function returns False if you cannot continue reading the file i.e. either the EOF or the Bad flag got set
bool getInt(ifstream& fin, bool& goodFlag, int& intData, string& junkData){
	bool canContinue;

	//------------------------

	// Code the logic here
	//will handle empty line, negative int, fill chars, don't think it fails anywhere?
	string s;
	getline(fin, s);
	goodFlag = true;
	intData = 0;
	bool isPositive = s[0]!='-';
	if (s.length()<=1) {
		junkData = s;
		goodFlag = false;
	} else {
		for (int i = (isPositive)?0:1; i<s.length()-1; i++) {
			if (isdigit(s[i])) {
				intData = intData * 10 + (s[i]-'0');
			} else {
				goodFlag = false;
				junkData = s;
				break;
			}
		}
		if (!isPositive) intData *= -1;
	}
	canContinue = !(fin.eof() || fin.bad());

	//----------------------

	return canContinue;
}



