
public class Factorial {
	//bigNumber��λ��
	int MAX_NUM =50;
	//���׳˵�����
	private int numberToCalculate;
	//�����洢��
	BigNumber bigNum=new BigNumber(MAX_NUM);
	
	//���캯��
	public Factorial(int numberToCalculate){
		this.numberToCalculate=numberToCalculate;
		//��ʼ������
		formatBigNumber(getDigit());
		this.doFactorial(this.numberToCalculate);
	}
	
	//��ȡ��Ҫ�������λ��
	public int getDigit(){
		int weight=1;
		for(int i=1;i<=50;i++){
			if(this.numberToCalculate/weight<10){
				return i;
			}
			weight*=10;
		}
		return 0;
	}
	
	//��ʼ������
	public void formatBigNumber(int digit){
		int weight=1;
		int number=this.numberToCalculate;
		for(int i=1;i<digit;i++){
			weight*=10;
		}
		for (int i=digit;i>0;i--){
			this.bigNum.changeElement(i-1,number/weight);
			number-=(number/weight)*weight;
			weight/=10;
		}
	}
	
	//���׳�
	public void doFactorial(int numToCalculate){
		this.bigNum.doFactorial(numToCalculate);
	}
	
	public void printBigNum(){
		this.bigNum.print();
	}
}
