
class SelfNum {
	public void findSn() {
		
		int n = 1;
		while(n<10000) {
			int constNum = 1;
			boolean selfness = true;
			while(constNum<n){
				//�����ڸ� ���� n�� ��������ٸ� selfness = false
				if(sumAll(constNum)==n) {
					selfness = false;
				}
				constNum++;
			}
			//n���� ���� ���� ���ؼ� ��� ���� �����ڰ� �� �� ���ٸ�
			//n�� selfNumber�̹Ƿ� ����Ѵ�.
			if(selfness) {
				System.out.println(n);
			}
			n++;
		}
	
	}

	
	public int sumAll(int n) {
		//�����ڸ�
		int rst;
		
		if(n<10) {
			rst = n+n;
		}
		//�����ڸ�
		else if(10<=n && n<100) {
			int second = n/10;
			int first = n - second*10;
			rst = n + first + second;
		}
		//�����ڸ�
		else if(n<=100 && n<1000) {
			int third = n/100;
			int second = (n - third*100)/10;
			int first = n - second*10- third*1000;
			rst = n + first + second + third;
		}
		//õ���ڸ�
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

