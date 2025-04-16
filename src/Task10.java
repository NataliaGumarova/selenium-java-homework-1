public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание № 10");
        final float HEIGHT = 176f;
        final float WEIGHT= 69f;
        float idealWeight = HEIGHT - 110;//66
        float nWeight = idealWeight - WEIGHT;//-3
        String answer = (nWeight < 0) ? "Нужно сбросить " : "Нужно набрать ";
        System.out.println(answer + Math.abs(nWeight)+ " кг");
    }
}
