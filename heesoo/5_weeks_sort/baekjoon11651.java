import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

class XY implements Comparable<XY> {
	int x;
	int y;

	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(XY o) {
		if (this.y > o.y) {
			return 1;
		} else if (this.y < o.y ) {
			return -1;
		} else {
			if(this.x >o.x) {
				return 1;
			}else if( this.x < o.x) {
				return -1;
			}else {
			return 0;
			}
		}
	}

}

public class baekjoon11651 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		LinkedList<XY> list = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			String[] arr = str.split(" ");
			int x = Integer.parseInt(arr[0]);
			int y = Integer.parseInt(arr[1]);
			XY temp = new XY(x, y);

			list.add(temp);
		}

		Collections.sort(list);

		StringBuilder sb = new StringBuilder();
		while (!list.isEmpty())
			sb.append(list.peek().x + " " + list.poll().y + "\n");

		System.out.println(sb);

	}
}

