package test_ex;

public class CastOne {
	public static void main(String args[]){
		byte	byte1 = 127;
		short 	short1; 
		char	char1 = 10;
		int		int1;
		float	float1;
		long	long1;
		double	double1;
		
		
		/*큰그릇에 작은 그릇을 닮을때는 묵시적 형변환*/ 
		short1  = (short)byte1;		//byte(8 bits)	=> short(16bits)
		int1	= (int)short1;  	//short(16 bits) => int(32 bits)
		int1 	= (int)char1;   	// char(16 bits) => int(32bits)
		long1	= (long)int1;		//int(32bits)	=> long(64bits)
		float1	= (float)int1;		//int(32 bits)	=> long(64bits)
		double1	= (double)long1;	//long(64bits)	=> double(64bits)
		
		
		
		/*작은 그릇에 큰그릇을 닮을때는 명시적 형변환 casting*/ 
		
		byte1 = (byte)short1;		
		
		int1 = (int)long1;
	}

}
