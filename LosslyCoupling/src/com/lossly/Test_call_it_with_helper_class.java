package com.lossly;
import com.lossly.IOutputgeneratorr;
import com.lossly.csvOutputgenerator;
//import com.lossly.JsonOutputgenerator;
public class Test_call_it_with_helper_class {

	
		IOutputgeneratorr ioutput;
	//providing csv class object....................	
		public Test_call_it_with_helper_class ()
		{
			ioutput = new csvOutputgenerator();
			
	    }
		public void generatoroutput()
		{
			ioutput.generatoroutput();
		}
		
	

	}


