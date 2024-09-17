package com.example.employee.service;

import java.util.Calendar;
import java.util.Date;

public class TaxCalculator {

    public static double calculateTax(double yearlySalary) {
        double tax = 0;

        if (yearlySalary > 1000000) {
            tax += (yearlySalary - 1000000) * 0.20;
            yearlySalary = 1000000;
        }
        if (yearlySalary > 500000) {
            tax += (yearlySalary - 500000) * 0.10;
            yearlySalary = 500000;
        }
        if (yearlySalary > 250000) {
            tax += (yearlySalary - 250000) * 0.05;
        }

        return tax;
    }

    public static double calculateCess(double totalTax) {
        return totalTax > 2500000 ? (totalTax - 2500000) * 0.02 : 0;
    }

    public static double calculateSalaryForJoinedPeriod(Date doj, double monthlySalary) {
        Calendar joinDate = Calendar.getInstance();
        joinDate.setTime(doj);
        Calendar now = Calendar.getInstance();
        int months = (now.get(Calendar.YEAR) - joinDate.get(Calendar.YEAR)) * 12 + now.get(Calendar.MONTH) - joinDate.get(Calendar.MONTH) + 1;
        return monthlySalary * months;
    }
}
