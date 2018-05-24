package cn.wuxingye;

public class SuperAndSub {

    public static void main(String[] args) {

        // Super s1 = new Sub();
        // Super s2 = new Super();
        Sub s3 = new Sub();
        Sub2.getA();
        new Sub2().getA();
    }
}

class Super {

    static int a = getA();

    static {
        System.out.println("2.加载Super的静态块");
    }

    int b = getB();

    {
        System.out.println("6.加载Super的普通块");
    }

    Super() {
        System.out.println("7.加载Super的构造器");
    }

    static int getA() {
        System.out.println("1.加载Super的静态变量");
        return 1;
    }

    static int getB() {
        System.out.println("5.加载Super的实例变量");
        return 2;
    }

}

class Sub extends Super {

    static int c = getC();

    static {
        System.out.println("4.加载Sub的静态块");
    }

    int d = getD();

    {
        System.out.println("9.加载Sub的普通块");
    }

    Sub() {
        System.out.println("10.加载Sub的构造器");
    }

    static int getC() {
        System.out.println("3.加载Sub的静态变量");
        return 1;
    }

    static int getD() {
        System.out.println("8.加载Sub的实例变量");
        return 2;
    }
}

class Sub2 {
    static String a = null;

    Sub2() {
        System.out.println("构造sub2" + a);
        a = "11";
    }
    
    static String getA(){
        System.out.println("11.打印a" + a);
        return a;
    }
}
