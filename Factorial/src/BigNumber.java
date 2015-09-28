
public class BigNumber {
	//˳������
	private int maxNum;
	//˳�������
	private int[] bigNum=new int[100];
	//��ǰ������
	private int currentNum;
	
	//���캯��
	public BigNumber(int maxNum){
		//��ʼ������
		this.maxNum=maxNum;
		//��ʼ��˳���
		for(int i=0;i<maxNum;i++){
			this.bigNum[i]=-1;
		}
		//��ʼ����ǰ������
		this.currentNum=0;
	}
	
	//��ʼ��˳���
	public void FormatSequenceList(){
		//��ʼ��˳���
		for(int i=0;i<maxNum;i++){
			this.bigNum[i]=-1;
		}
		//��ʼ����ǰ������
		this.currentNum=0;
	}
	
	//�ı�ĳ��λ�õ�ֵ
	public void changeElement(int currentNum,int number){
		this.bigNum[currentNum]=number;
	}
	
	//��ӡ�����
	public void print(){
		//��ȡ���λλ��
		for(int i=0;this.bigNum[i]!=-1;i++){
			this.currentNum=i;
		}
		for(int i=this.currentNum;i>=0;i--){
			System.out.printf("%d",this.bigNum[i]);
		}
		System.out.print("\n");
	}
	
	//���׳�
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
