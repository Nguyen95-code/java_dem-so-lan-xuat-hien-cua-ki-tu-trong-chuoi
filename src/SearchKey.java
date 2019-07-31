import java.util.Scanner;

public class SearchKey {
    public static void main(String[] args) {
        String chuoi;
        char key = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (key == chuoi.charAt(i)) {
                count++;
            }
        }
        System.out.println("so lan xuat hien ki tu " + key + " la : " + count);
    }
}
