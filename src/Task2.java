public class Task2 {
    public static void main(String[] args){
        System.out.println("Задание №2");
        int n = 356;
        int x = n / 100;// узнаём сотни
        int y = n % 10; // 6
        int z = n / 10;//35
        int zS = z % 10;//5
        int r = x + y + zS;//14
        System.out.println(r);
    }
}
