package com.Product.TC;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base
{
		ExtentReports reports;
		ExtentTest test;

		public Base() {

			reports=new ExtentReports("D:\\eclipse workspace\\ExtendReport\\ExtentTest.html");

		}

	}

