public class hw3 {
    public static void main(String[] args) {
        System.out.println("시작");
        for(;;){
            int num1=(int)(Math.random()*6)+1;
            int num2=(int)(Math.random()*6)+1;
            System.out.println("("+num1+","+num2+")");
            if(num1+num2 == 5){
                System.out.println("끝!");
                break;
            }
        }
    }
}
