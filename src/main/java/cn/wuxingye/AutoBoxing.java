package cn.wuxingye;

/**
 * 将sum的声明从拆箱long变为装箱Long时，性能降低十倍
 * @author wuxingye
 */
public class AutoBoxing {
    public static void main(String[] args) {
        // 拆箱
        long startTime = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
        // 装箱
        long startTime2 = System.currentTimeMillis();
        Long sum2 = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        System.out.println(sum2);
        long endTime2 = System.currentTimeMillis();
        System.out.println((endTime2 - startTime2) + "ms");
    }
}
