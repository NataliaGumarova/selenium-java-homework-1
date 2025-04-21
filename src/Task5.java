public class Task5 {
    public static void main(String[] args){
        System.out.println("Задание № 5");
        final int RADIUS = 3;
        double area = Math.PI * (RADIUS * RADIUS);
        System.out.println("Площадь круга = " + Math.round(area));
        double circumference = Math.PI * 2 * RADIUS;
        System.out.println("Длина окружности = " + Math.round(circumference));
    }
}