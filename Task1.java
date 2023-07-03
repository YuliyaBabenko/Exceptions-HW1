public class Task1 {

    public double divide(int a, int b) {
        return a / b;
    }

    public void printValueByIndex(int[] array, int index) {
        System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
    }

    public int sumValue(Integer [] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
