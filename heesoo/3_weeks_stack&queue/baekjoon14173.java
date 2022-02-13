import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon14713 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		HashMap<Integer, LinkedList<String>> map = new HashMap();
		int queueSize = 0;
		int i = 0;
		while (i < num) {
			String str = br.readLine();
			String[] arr = str.split(" ");
			LinkedList<String> queue = new LinkedList<String>();

			for (int j = 0; j < arr.length; j++) {
				queue.add(arr[j]);
				queueSize++;
			}

			map.put(i, queue);
			i++;
		}

		String strL = br.readLine();
		String[] arrL = strL.split(" ");
		LinkedList<String> queueL = new LinkedList<String>();
		for (int j = 0; j < arrL.length; j++) {
			queueL.add(arrL[j]);
		}

		boolean flag = true;
		int cnt = 0;
		while (!queueL.isEmpty()) {
			for (int j = 0; j < map.size(); j++) {
				flag = false;
				if (map.get(j).isEmpty()) {
					continue;
				}

				if (queueL.peek().equals(map.get(j).peek())) {
					map.get(j).poll();
					queueL.poll();
					flag = true;
					cnt++;
					break;
				}

			}
			if (!flag)
				break;

		}
		if (flag) {

			if (cnt == queueSize) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
		} else {
			System.out.println("Impossible");
		}

	}
}
