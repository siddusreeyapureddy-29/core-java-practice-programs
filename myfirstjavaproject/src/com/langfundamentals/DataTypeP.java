package com.langfundamentals;

public class DataTypeP {
//	Type mismatch: cannot convert from int to byte
//	by default the rhs value will be stored in int so it is giving cannot convert int to byte
//	byte b=128;
	byte b = (byte) 128; // explicit type casting because it is exceeding byte range so we convert it to
							// byte
	short s = 32767;
	short s2 = (short) 32768;
	short s1 = (short) 65536;
	int i = s1;
//	int i1=2147483648; index is out of range error
	int i1 = (int) 2147483648L;
	long l = i1;
	long l1 = 922337203685477807L;
	float f = l1;
	float f1 = 34568965667876543345678987654322345678.767898765433456643212346752F;
	double d = f1;
	double d1 = 7898765432345678909876543212345678098765432123456789.987654321234567890D;
	char c = 'g';
	char c1 = 65 + 1;
	boolean bool = true;
	boolean bool1 = false;
//	boolean bool2=True; True cannot be resolved to a variable
	

	public static void main(String[] args) {
		DataTypeP d = new DataTypeP();
		System.out.println("byte value:" + d.b);
		System.out.println("short value:" + d.s);
		System.out.println("short value:" + d.s2);
		System.out.println("short value:" + d.s1);
		System.out.println("int value:" + d.i1);
		System.out.println("long value:" + d.l);
		System.out.println("long value:" + d.l1);
		System.out.println("float value:" + d.f);
		System.out.println("float value:" + d.f1);
		System.out.println("double value:" + d.d);
		System.out.println("double value:" + d.d1);
		System.out.println("char value:" + d.c);
		System.out.println("char value:" + d.c1);
		System.out.println("boolean value:" + d.bool);
		System.out.println("boolean value:" + d.bool1);
		

	}

}
