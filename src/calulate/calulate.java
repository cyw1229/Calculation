package calulate;
import java.util.*;

public class calulate {
	 
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x,y,i,a1;
        int d1=0;
        String d = null;
        System.out.println("1����������ʽ��2�����ѧ��");
        Scanner scan1=new Scanner(System.in);
        a1=scan1.nextInt();
        if(a1==1){
        System.out.println("��������Ŀ������");
        Scanner scan2=new Scanner(System.in);
        x=scan2.nextInt();
        int daan[]=new int [x];
        System.out.println("��������ֵ�ķ�Χ");
        y=scan2.nextInt();
        for(i=0;i<x;i++){
            int a=(int)(Math.random()*y);//�������һ��1-10������
            int b=(int)(Math.random()*y);//�������һ��1-10������
            int c=(int)(Math.random()*3);//�������һ��1-4��������0��ʾ�ӷ���1��ʾ������2��ʾ�˷���3��ʾ����
            if(c==0)
            {
                d1=a+b;
                System.out.print(a+"+"+b+"=       ");
            }
            if(c==1)
            {
                d1=a-b;
                System.out.print(a+"-"+b+"=       ");
            }
            if(c==2)
            {
                d1=a*b;
                System.out.print(a+"*"+b+"=       ");
            }
            if(c==3)
            {
                d1=a/b;
                System.out.print(a+"/"+b+"=       ");
            }
            if((i+1)%3==0){
                System.out.println();
            }
            daan[i]=d1;
        }
        System.out.println("�Ƿ���ʾ�𰸣���ʾ������1��");
        if(scan2.nextInt()==1){
       	 for(i=0;i<x;i++){
            System.out.print(daan[i]+"     ");
            }
        } 
        }
        if(a1==2){
       	 System.out.println("20157130102");
       	 
        }
            
            

    }
}

        



