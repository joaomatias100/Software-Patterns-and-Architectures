package pt.utad.mei.aps.Adapter;

public class InsertionSortAdapter implements SortArray{

    private InsertionSort adaptee = new InsertionSort();
    @Override
    public void Sort(int[] array) {
        adaptee.DataSort(array);
    }
}
