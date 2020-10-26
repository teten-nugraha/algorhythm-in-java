package id.algorythm.sort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) throws ParseException {
        ArrayList<Date> date=new ArrayList<>();
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        Date date1=format.parse("02-12-2001");
        Date date2=format.parse("12-09-1999");
        Date date3=format.parse("13-11-2016");
        date.add(date1);
        date.add(date2);
        date.add(date3);
        Collections.sort(date);
        date.forEach(action-> System.out.println(format.format(action)));

    }

}
