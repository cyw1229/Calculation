package calulate;
import java.util.*;

public class calulate {
	 
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x,y,i,a1;
        int d1=0;
        String d = null;
        System.out.println("1、整数计算式，2、输出学号");
        Scanner scan1=new Scanner(System.in);
        a1=scan1.nextInt();
        if(a1==1){
        System.out.println("请输入题目的数量");
        Scanner scan2=new Scanner(System.in);
        x=scan2.nextInt();
        int daan[]=new int [x];
        System.out.println("请输入数值的范围");
        y=scan2.nextInt();
        for(i=0;i<x;i++){
            int a=(int)(Math.random()*y);//随机生成一个1-10的整数
            int b=(int)(Math.random()*y);//随机生成一个1-10的整数
            int c=(int)(Math.random()*3);//随机生成一个1-4的整数，0表示加法，1表示减法，2表示乘法，3表示除法
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
        System.out.println("是否显示答案（显示请输入1）");
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

        



