package pt.utad.mei.aps.Adapter;

public class InsertionSort {
    public static void DataSort(int[] v){
        for(int i = 1; i < v.length -1; i++){
            int i_aux = i;
            int value_aux = v[i];
            while(i_aux > 0 && v[i_aux] > value_aux){
                v[i_aux]= v[i_aux - 1];
                i_aux--;
            }
            v[i_aux] = value_aux;
        }
    }
}
