IMPORT JAVA.UTIL.SCANNER;
IMPORT JAVA.IO.IOEXCEPTION;

//CMD要输入CHCP 65001才能将GBK编码转换为UTF-8
CLASS CAR
{
    PUBLIC STATIC VOID MAIN(STRING[] ARGS) {

        //车辆信息
        INT[] E={1,2,3,4,5,6,7,8};//车辆序号
        STRING[] N= {"小轿车", "面包车", "大巴车", "低栏车", "高栏车", "厢式车", "日式皮卡车", "美式皮卡车"};//车辆名称
        INT[] F= {40,65,180,30,47,80, 60, 60};//租车费用（元/（车·天））
        DOUBLE[] M= {4,7,20,1.5,2.5,4.5,1,3};//最大载人（人）
        //DOUBLE[] MH= {1.5,2.5,4.5,1,3};//最大载货（吨）

        //车辆信息分为载人量和载货量
        FOR(INT I=0;I<3;I++)
        {
            SYSTEM.OUT.PRINTLN("序号:" + E[I]);
            SYSTEM.OUT.PRINTLN("车辆名称:" + N[I]);
            SYSTEM.OUT.PRINTLN("租车费用：" + F[I] + "元/（车·天）");
            SYSTEM.OUT.PRINTLN("最大载人：" + M[I] + "人");
        }
        FOR(INT S=3;S<8;S++)
        {
            SYSTEM.OUT.PRINTLN("序号:" + E[S]);
            SYSTEM.OUT.PRINTLN("车辆名称:" + N[S]);
            SYSTEM.OUT.PRINTLN("租车费用：" + F[S] + "元/（车·天）");
            SYSTEM.OUT.PRINTLN("最大载货：" + M[S] + "吨");
        }


        //租车数量和天数确认
        SCANNER SC = NEW SCANNER(SYSTEM.IN);
        INT L = 8;//遍历循环8次
        INT[] DAY = NEW INT[L];//租车天数
        INT[] NUM = NEW INT[L];//租车数量
        FOR(INT K=0;K<8;K++)
        {
                SYSTEM.OUT.PRINTLN("请输入序号" + E[K] + "的租车数量：" );
                NUM[K] = SC.NEXTINT();
                IF(NUM[K]>=0)
                {
                        SYSTEM.OUT.PRINTLN("序号"+E[K]+"的租车天数为：");
                        DAY[K] = SC.NEXTINT();
                        SYSTEM.OUT.PRINTLN("请确认序号"+E[K]+"的租车天数：");
                        INT DAY1 = SC.NEXTINT();

                IF(DAY[K] == DAY1)
                {
                        SYSTEM.OUT.PRINTLN("车辆序号为" + E[K] + "     " + "租车数量为：" + NUM[K] + "      " + "租车天数为：" + DAY[K]);
                }ELSE
                {
                        SYSTEM.OUT.PRINTLN("您输入的天数不一样!");
                }

                }ELSE
                {
                        SYSTEM.OUT.PRINTLN("没有该车辆的序号！");
                }
        }


        //数据的最终结算与展示
        INT SUMP = 0;//最大载人量
        INT SUMH = 0;//最大载货量
        INT SUMF = 0;//总体租车费用
        INT SUMC = 0;//租用车辆总数
        //遍历数组内相加
        FOR(INT X=0;X<NUM.LENGTH;X++)//INT Z:F[K];INT C:)
        {
                SUMC += NUM[X];
                SUMP += M[X]*NUM[X];//数组相乘
                SUMF += NUM[X]*DAY[X]*F[X];
                IF(X>3)
                {
                     SUMH += M[X]*NUM[X];
                }

        }
        //展示
        SYSTEM.OUT.PRINTLN("总体租车的最大载人量"+SUMP);
        SYSTEM.OUT.PRINTLN("总体租车的最大载货量"+SUMH);
        SYSTEM.OUT.PRINTLN("总体租车费用"+SUMF);
        SYSTEM.OUT.PRINTLN("租用车辆总数"+SUMC);
        FOR(INT Y=0;Y<NUM.LENGTH;Y++)
        {
                IF(NUM[Y] != 0)
                {
                     SYSTEM.OUT.PRINTLN("车辆序号" + E[Y] + "租用数目为：" + NUM[Y] + "       " + "租用天数为：" + DAY[Y]);

                }
        }
        SYSTEM.EXIT(0);
    }  
}