package test.main;
/*
 * 연산자
 * 
 * 2. 증감 연산자
 * 
 * 종류 : ++,  --
 */
public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;// 1씩 증가 시키기 
		num++;
		num++;
		num++;
		
		int num2=0;
		num2--; //1씩 감소 시키기
		num2--;
		num2--;
		
		int num3=0;
		//++ 연산자가 변수 뒤에 있으면 연산의 우선순위가
		//= 보다 늦다
		int result1 =  num3++; //result1은 0
		
		int num4=0;
		//-- 연산자가 변수 앞에 있으면 연산의 우선 순위가
		//= 보다 빠르다
		int result2 = ++num4; // result2는 1 
		
	}

}










