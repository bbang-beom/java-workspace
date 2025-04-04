package section03;

import java.math.BigDecimal;

public record FloatingPoint() {
    public static void main(String[] args) {
        // 부동 소수점 오차
        double doubleNum1 = 0.1;
        doubleNum1 += 0.1;
        doubleNum1 += 0.1;
        System.out.println(doubleNum1); // 0.300000000000004

        BigDecimal bdNum1 = new BigDecimal("0.1");
        BigDecimal bdNum2 = new BigDecimal("0.1");
        BigDecimal bdNum3 = new BigDecimal("0.1");

        System.out.println(bdNum1.add(bdNum2).add(bdNum3));

        // 주의
         bdNum1 = new BigDecimal(0.1);
         bdNum2 = new BigDecimal(0.1);
         bdNum3 = new BigDecimal(0.1);

        System.out.println(bdNum1.add(bdNum2).add(bdNum3));
    }

}
