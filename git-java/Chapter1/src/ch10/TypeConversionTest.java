package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		//byte bNum = 125;
	/*	int iNum = 255;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		
		*/
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum; // 캐스팅하고 더하기
		int iNum2 = (int)(dNum + fNum); // 더하고 캐스팅
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
