package com.lossly;
import com.lossly.IOutputgeneratorr;
import com.lossly.csvOutputgenerator;
import com.lossly.JsonOutputgenerator;
public class Test_Call_it_directly 
{

	public static void main(String[] args)
	{
		//running csv class.................
	//	IOutputgeneratorr io = new csvOutputgenerator();
	//	io.generatoroutput();

		//running Json class.................
		IOutputgeneratorr io = new JsonOutputgenerator();
		io.generatoroutput();
	}

}
