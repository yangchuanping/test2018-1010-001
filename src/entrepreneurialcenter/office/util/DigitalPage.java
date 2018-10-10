package entrepreneurialcenter.office.util;

public class DigitalPage {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				calcPage(j, i, 2);
				System.out.println();
			}
			System.out.println("***********************"+i);
		}
	}

	/**
	 * ������ʾ��ǰ��ҳ����ʼҳ
	 * @param pageNum ��ǰҳ��
	 * @param pageCount ��ҳ��
	 * @param sideNum ��ҳϵ��  ��ҳ������ʾ��������ҳ�롣
	 * ��ʾ����ҳ����� = 2 * sideNum + 1
	 */
	public static Integer[] calcPage(int pageNum,int pageCount,int sideNum){				
		int startNum = 0;
		int endNum = 0;
		
		if(pageCount<=sideNum){
			endNum = pageCount;
		}else{
			if((sideNum+pageNum)>=pageCount){
				endNum = pageCount;
			}else{
				endNum = sideNum+pageNum;
				if((sideNum+pageNum)<=(2*sideNum+1)){					
					if((2*sideNum+1)>=pageCount){
						endNum = pageCount;
					}else{
						endNum = 2*sideNum+1;
					}
				}else{
					endNum = sideNum + pageNum;
				}
			}
		}
		
		if(pageNum<=sideNum){
			startNum = 1;
		}else{			
			if((pageNum+sideNum)>=pageCount){
				if((2*sideNum+1)>=pageCount){
					if((pageCount - 2*sideNum)>=1){
						startNum = pageCount - 2*sideNum;
					}else{
						startNum = 1;
					}
				}else{
					startNum = pageCount - 2*sideNum;
				}				
			}else{
				if((pageNum-sideNum)>=1){
					startNum = pageNum - sideNum;
				}else{
					startNum = 1;
				}				
			}
		}		
		Integer[] DigitalPage;
		int j=0;
		
		if (endNum > (2*sideNum+1)) {
			DigitalPage = new Integer[2*sideNum+1];
		}else{
			DigitalPage = new Integer[endNum];
		}
		for (int i = startNum; i <= endNum; i++) {
			//System.out.println(i);
			DigitalPage[j] = i;
			j++;
		}
		return DigitalPage;
	}
	
}
