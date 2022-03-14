import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	static HashMap<String, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		BufferedReader br = null;
		ArrayList<String> arr = new ArrayList<>();
		int max = 0;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			for(int i = 0; i < testcase; i++) {
				check(br.readLine());
			}
			for(String str : map.keySet()) {
				if(max < map.get(str)) max = map.get(str);
			}
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for(Entry<String, Integer> entry : entrySet) {
				if(entry.getValue().equals(max)) {
					arr.add(entry.getKey());
				}
			}
			Collections.sort(arr);
			System.out.println(arr.get(0));
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try { br.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
	public static void check(String str) {
		if(map.containsKey(str)) map.put(str, map.get(str) + 1);
		else map.put(str, 1);
	}
}