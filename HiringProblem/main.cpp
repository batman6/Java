/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Monish De
 *
 * Created on 17 April, 2017, 6:00 PM
 */

#include <iostream>
#include <cstdlib>
#include <ctime>
#include <set>
using namespace std;
#define LEN 15
int person[15];

int main() {
    for(int i=0;i<LEN;i++) {
        person[i] = rand()%100;
    }
    
    srand(time(NULL));

    cout << "Preparing List...\n" << endl;
    cout << "People \t\t Quality" << endl;
    cout << "--------------------------" << endl;
    for(int i=0;i<LEN;i++) {
        cout << "   " << i+1 << " \t\t " << "   " << person[i] << endl;
    }
    cout << "Starting Hiring..." << endl;
    cout << "Person Hired => ";

    int currentTrushHold  = 0;

    set<int> s;
    int count = 0;
    while(count != 15) {
        int id = rand()%LEN;
        if(s.end() == s.find(id)) {
            count++;
            if(person[id] >= currentTrushHold) {
                currentTrushHold = person[id];
                cout << person[id] << " ";
            }
            s.insert(id);
        }
    }


    return 0;
}



