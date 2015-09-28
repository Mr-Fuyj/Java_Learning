
public class Factorial {
	//bigNumber的位数
	int MAX_NUM =50;
	//做阶乘的数字
	private int numberToCalculate;
	//大数存储器
	BigNumber bigNum=new BigNumber(MAX_NUM);
	
	//构造函数
	public Factorial(int numberToCalculate){
		this.numberToCalculate=numberToCalculate;
		//初始化大数
		formatBigNumber(getDigit());
		this.doFactorial(this.numberToCalculate);
	}
	
	//获取所要求的数的位数
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
	
	//初始化大数
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
	
	//做阶乘
	public void doFactorial(int numToCalculate){
		this.bigNum.doFactorial(numToCalculate);
	}
	
	public void printBigNum(){
		this.bigNum.print();
	}
}
