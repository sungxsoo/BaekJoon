
class SelfNum {
	public void findSn() {
		
		int n = 1;
		while(n<10000) {
			int constNum = 1;
			boolean selfness = true;
			while(constNum<n){
				//생성자를 통해 n이 만들어진다면 selfness = false
				if(sumAll(constNum)==n) {
					selfness = false;
				}
				constNum++;
			}
			//n보다 작은 값에 대해서 모든 수가 생성자가 될 수 없다면
			//n은 selfNumber이므로 출력한다.
			if(selfness) {
				System.out.println(n);
			}
			n++;
		}
	
	}

	
	public int sumAll(int n) {
		//일의자리
		int rst;
		
		if(n<10) {
			rst = n+n;
		}
		//십의자리
		else if(10<=n && n<100) {
			int second = n/10;
			int first = n - second*10;
			rst = n + first + second;
		}
		//백의자리
		else if(n<=100 && n<1000) {
			int third = n/100;
			int second = (n - third*100)/10;
			int first = n - second*10- third*1000;
			rst = n + first + second + third;
		}
		//천의자리
		else {
			int fourth = n/1000;
			int third = (n - fourth*1000)/100;
			int second = (n - third*100 - fourth*1000)/10;
			int first = n - second*10- third*100 - fourth*1000;
			
		
			rst = n + first + second + third + fourth;
		}
		
		return rst;
		
	}
	
}


