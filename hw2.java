public class hw2 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}
//답은 31
//이유는 연산자가 어디에 붙어있는지가 중요함
//연산자가 앞에 붙어있던 x는 뒤에 연산을 먼저하기전에 +1을 해 11로 바꿔있음
//근데 연산자가 뒤에 있는 y의경우 바뀐x의 값과 아직 바뀌지않은 y의 값을 더해 31을 만들고 그제서야 y의값을 -1하기때문에
//z의 값이 31이 나오는것이다. 최종적으로 봤을때 x=11, y=19, z=31 이라는 값을 가진다.