/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("\nWhat is the principal amount? "); //ask the user for the principal amount
        Scanner principalInput = new Scanner(System.in); //scan for the principal
        double principalAmount = principalInput.nextDouble();

        System.out.println("\nWhat is the rate of interest (%)? "); //ask the user for the rate of interest
        Scanner rateOfInterestInput = new Scanner(System.in); //scan for the rate of interest
        double rateOfInterest = rateOfInterestInput.nextDouble();

        System.out.println("\nWhat is the number of years? "); //ask the user for the number of years
        Scanner numYearsInput = new Scanner(System.in); //scan for the number of years
        double numYears = numYearsInput.nextDouble();

        System.out.println("\nWhat is the number of times the interest is compounded per year? "); //ask the user for the number of times the interest is compounded per year
        Scanner numCompoundsPerYearInput = new Scanner(System.in); //scan for the number of times the interest is compounded per year
        double numCompoundsPerYear = numCompoundsPerYearInput.nextDouble();

        double rateOfInterestPercent = rateOfInterest / 100.0; //calculate the rate of interest into a percentage

        double endInvestmentAmount = (principalAmount) * Math.pow(1 + (rateOfInterestPercent / numCompoundsPerYear), (numYears * numCompoundsPerYear)); //calculate the amount of money that will be earned by the end of the investment

        //output the amount of money the user would make at the end of their investment
        System.out.println("\n$" + (int)principalAmount + " invested at " + rateOfInterest + "% for " + (int)numYears + " years compounded " + (int)numCompoundsPerYear + " times per year is $" + String.format("%.2f", endInvestmentAmount) +".");
    }
}