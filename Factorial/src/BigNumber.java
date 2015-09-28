
public class BigNumber {
	//顺序表界限
	private int maxNum;
	//顺序表主体
	private int[] bigNum=new int[100];
	//当前操作数
	private int currentNum;
	
	//构造函数
	public BigNumber(int maxNum){
		//初始化界限
		this.maxNum=maxNum;
		//初始化顺序表
		for(int i=0;i<maxNum;i++){
			this.bigNum[i]=-1;
		}
		//初始化当前操作数
		this.currentNum=0;
	}
	
	//初始化顺序表
	public void FormatSequenceList(){
		//初始化顺序表
		for(int i=0;i<maxNum;i++){
			this.bigNum[i]=-1;
		}
		//初始化当前操作数
		this.currentNum=0;
	}
	
	//改变某个位置的值
	public void changeElement(int currentNum,int number){
		this.bigNum[currentNum]=number;
	}
	
	//打印这个表
	public void print(){
		//获取最高位位置
		for(int i=0;this.bigNum[i]!=-1;i++){
			this.currentNum=i;
		}
		for(int i=this.currentNum;i>=0;i--){
			System.out.printf("%d",this.bigNum[i]);
		}
		System.out.print("\n");
	}
	
	//做阶乘
	public void doFactorial(int numToCalculate){
		int carry=0;
		while(numToCalculate>1){
			numToCalculate-=1;
			for(int i=0 ;this.bigNum[i]!=-1;i++){
				bigNum[i]=carry+bigNum[i]*numToCalculate;
				carry=(bigNum[i]/10)*10;
				bigNum[i]=bigNum[i]-carry;
				carry/=10;
				if((bigNum[i+1]==-1)&&(carry!=0)){
					bigNum[i+1]=0;
				}
			}
		}
	}
}
