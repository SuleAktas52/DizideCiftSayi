import java.util.Arrays;

public class DizideCiftSayi {
    public static void main(String[] args) {

        int[] dizi = {1, 2, 5, 5, 5, 6, 7, 4, 4,6,6,6};
        int[] tekrarlananSayi = new int[dizi.length];
        int startIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j]) && (dizi[i] % 2 == 0)) {  //Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program
                    if (!isFind(tekrarlananSayi, dizi[i])) {
                        tekrarlananSayi[startIndex++] = dizi[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(tekrarlananSayi));
    }
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if ((i == value)) {
                return true;
            }
        }
        return false;
    }
}
