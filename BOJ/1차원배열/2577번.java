
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Count {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 1;
		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			array[i] = 0;
		}

		for (int i = 0; i < 3; i++) {
			int num = Integer.parseInt(br.readLine());
			sum *= num;
		}

		while (sum != 0) {
			array[sum % 10]++;
			sum = sum / 10;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
	}

}
