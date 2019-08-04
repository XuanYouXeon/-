import java.util.Scanner;
import java.io.IOException;

//cmd要输入chcp 65001才能将GBK编码转换为UTF-8
class Car
{
    public static void main(String[] args) {

        //车辆信息
        int[] e={1,2,3,4,5,6,7,8};//车辆序号
        String[] n= {"小轿车", "面包车", "大巴车", "低栏车", "高栏车", "厢式车", "日式皮卡车", "美式皮卡车"};//车辆名称   
        int[] f= {40,65,180,30,47,80, 60, 60};//租车费用（元/（车·天））
        double[] m= {4,7,20,1.5,2.5,4.5,1,3};//最大载人（人）
        //double[] mh= {1.5,2.5,4.5,1,3};//最大载货（吨）

        //车辆信息分为载人量和载货量
        for(int i=0;i<3;i++)
        {
            System.out.println("序号:" + e[i]);
            System.out.println("车辆名称:" + n[i]);
            System.out.println("租车费用：" + f[i] + "元/（车·天）");
            System.out.println("最大载人：" + m[i] + "人");
        }
        for(int s=3;s<8;s++)
        {
            System.out.println("序号:" + e[s]);
            System.out.println("车辆名称:" + n[s]);
            System.out.println("租车费用：" + f[s] + "元/（车·天）");
            System.out.println("最大载货：" + m[s] + "吨");
        }


        //租车数量和天数确认
        Scanner sc = new Scanner(System.in);
        int l = 8;//遍历循环8次
        int[] day = new int[l];//租车天数
        int[] num = new int[l];//租车数量
        for(int k=0;k<8;k++)
        {
                System.out.println("请输入序号" + e[k] + "的租车数量：" );
                num[k] = sc.nextInt();
                if(num[k]>0)
                {
                        System.out.println("序号"+e[k]+"的租车天数为：");
                        day[k] = sc.nextInt();
                        System.out.println("请确认序号"+e[k]+"的租车天数：");
                        int day1 = sc.nextInt();

                if(day[k] == day1)
                {
                        System.out.println("车辆序号为" + e[k] + "     " + "租车数量为：" + num[k] + "      " + "租车天数为：" + day[k]);
                }else
                {
                        System.out.println("您输入的天数不一样!");
                }

                }else
                {
                        System.out.println("没有该车辆的序号！");
                }                       
        }


        //数据的最终结算与展示
        int sump = 0;//最大载人量
        int sumh = 0;//最大载货量
        int sumf = 0;//总体租车费用
        int sumc = 0;//租用车辆总数
        //遍历数组内相加
        for(int x=0;x<num.length;x++)//int z:f[k];int c:)
        {       
                sumc += num[x];
                sump += m[x]*num[x];//数组相乘
                sumf += num[x]*day[x]*f[x];
                if(x>3)
                {
                     sumh += m[x]*num[x]; 
                }
                
        }
        //展示
        System.out.println("总体租车的最大载人量"+sump);
        System.out.println("总体租车的最大载货量"+sumh);
        System.out.println("总体租车费用"+sumf);
        System.out.println("租用车辆总数"+sumc);
        for(int y=0;y<num.length;y++)
        {
                System.out.println("车辆序号"+e[y]+"租用数目为："+num[y]);
        }
        System.exit(0);
    }  
}
