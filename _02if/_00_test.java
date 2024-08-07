package _02if;

public class _00_test {

	public static void main(String[] args) {
		// 1번
		double avg = 89.2;
		if(avg>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 2번
		int level=2;
		int point=30;
		if(level==1) {
			point += 30;
		}else {
			point += 10;
		}
		System.out.println(point);
		
		// 3번
		int [] lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2]+80);
		
		// 4번
		if(lotto[3]%2==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		// 5번
		int add = 0;
		if(lotto[0]%2==1) {
			add+=lotto[0];
		}if(lotto[1]%2==1) {
			add+=lotto[1];
		}if(lotto[2]%2==1) {
			add+=lotto[2];
		}if(lotto[3]%2==1) {
			add+=lotto[3];
		}if(lotto[4]%2==1) {
			add+=lotto[4];
		}if(lotto[5]%2==1) {
			add+=lotto[5];
		}
		System.out.println(add);
		
		// 6번
		int [] b = {45,34,64,45,24};
		int result = b[0]+b[1]+b[2]+b[3]+b[4];
		System.out.println(result);
		
		// 7번
		int [] a = {45,34,64};
		int a0 = (a[0]/10)+(a[0]%10);
		int a1 = (a[1]/10)+(a[1]%10);
		int a2 = (a[2]/10)+(a[2]%10);
		String answer = "";
		// 조건
		if((a0>=a1)&&(a0>=a2)) {
			answer="첫번째";
		}else if(a1>=a2) {
			answer="두번째";
		}else {
			answer="세번째";
		}
		System.out.println(answer);
		
		// 8번
		int [] x = {6,5,9};
		int [] y = {4,10,6};
		int [] x1 = {x[0]*2, x[1]*2, x[2]*2};
		int [] y1 = {y[0]*3, y[1]*3, y[2]*3};	
		String target = "";
		// 조건
		if(x1[0]==y1[0]) {
			target += "0번째 ";
		}if(x1[1]==y1[1]) {
			target += "1번째 ";
		}if(x1[2]==y1[2]) {
			target += "2번째";
		}
		System.out.println(target);
		
		// 9번
		int [] M = {11,5};
		int [] E = {10,20};
		int Xmi = E[0]-2;
		int Xmx = E[0]+5;
		int Ymi = E[1]-2;
		int Ymx = E[1]+6;
		String shot = "";
		// E[0]-2<=M[0]<=E0+5  이고  E[1]-2<=M1<=E1+6
	    // 최소 : 11,18 / 최대 : 11,26
		if(Xmi<=M[0]&&M[0]<=Xmx) {
			if(Ymi<=M[1]&&M[1]<=Ymx) {
				shot = "hit하였습니다.";
			}else {
				shot = "hit하지 못하였습니다.";
			}
		}
		System.out.println(shot);
		
	}

}
