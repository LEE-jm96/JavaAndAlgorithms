package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

class Birth implements Comparable<Birth> {
	String name;
	Date date;

	public Birth(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	@Override
	public int compareTo(Birth b) {
		if (this.date.after(b.date)) {
			return 1;
		} else if (this.date.before(b.date)) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class baekjoon5635 {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {

		HashMap map = new HashMap();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		// String[] name = new String[num];
		// String[][] birth = new String[num][2];

		List<Birth> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {

			String str = br.readLine();
			String[] array = str.split(" ");

			String name = array[0];

			String birthday;
			birthday = array[3] + "-" + array[2] + "-" + array[1];

			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = transFormat.parse(birthday);

			Birth birth = new Birth(name, date);

			list.add(birth);

		}

		Collections.sort(list);

		StringBuilder sb = new StringBuilder();
		sb.append(list.get(num - 1).name + "\n" + list.get(0).name);
		System.out.println(sb);

	}
}
