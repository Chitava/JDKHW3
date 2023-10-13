public class Pair <T, U>{
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }


    @Override
    public String toString() {
        return String.format("Пара:\nПервый элемент - %s тип данных - %S\nВторой элемент - %s тип данных - %s",
                getFirst(), getFirst().getClass(), getSecond(), getSecond().getClass());
    }
}
