import java.util.Arrays;

public class Homework6 {
    public Integer [] afterFourArray(Integer [] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 4){
                index = i;
            }
        }
        if(index == 0){
            throw new RuntimeException("В массиве нет цифры 4");
        }
        Integer [] res = new Integer[arr.length - 1 - index];
        for(int i = index + 1; i < arr.length; i++){
            res[i - 1 - index] = arr[i];
        }
        return res;
    }

    public boolean findOneAndFour(Integer [] arr){
        int indexFour = 0;
        int indexOne = 0;
        int countOtherDigit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                indexOne = i;
            }
            if(arr[i] == 4){
                indexFour = i;
            }
            if(arr[i] != 1 && arr[i] !=4){
                countOtherDigit++;
            }
        }
        if(indexFour != 0 && indexOne != 0 && countOtherDigit == 0){
            return true;
        }
        return false;
    }
}

