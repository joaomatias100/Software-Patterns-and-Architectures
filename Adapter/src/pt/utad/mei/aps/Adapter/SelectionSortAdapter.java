package pt.utad.mei.aps.Adapter;

public class SelectionSortAdapter implements SortArray{

    //private SelectionSort adaptee;
    @Override
    public void Sort(int[] array) {
        SelectionSort.DataSort(array);
    }
}
