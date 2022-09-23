public class Hello {
    public static void main(String[] args) {
        int var1 = 5;  //int형끼리 계산하면 답도 int만 나옴 그렇기때문에 var1과 var2를 계산한다고
        int var2 = 2;  //소수로 바뀌지않음 그렇기때문에 5/2를했을때 소수점뒤를 다 없애버림
        double var3 = var1 / var2;
        System.out.println(var3);
        int var4 = (int) (var3 * var2);
        System.out.println(var4);
    }
}
//public class Hello {
//    public static void main(String[] args) {
//        float var1 = 5.0f;
//        float var2 = 2.0f;
//        double var3 = var1 / var2;
//        System.out.println(var3);
//        int var4 = (int) (var3 * var2);
//        System.out.println(var4);
//    }
//} 이렇게 처음부터 변수를 선언할때 float처럼 소수형을 선언하면 가능함