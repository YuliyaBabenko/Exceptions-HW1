public class Task3 {
    
    public int [] diffArray(int [] arr1, int [] arr2){
        if (arr1.length != arr2.length){
            throw new MyArraysSizeException();
        }
        int [] resultArray = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            resultArray[i] = arr1[i] - arr2[i];
        }
        return resultArray;
    }
}
