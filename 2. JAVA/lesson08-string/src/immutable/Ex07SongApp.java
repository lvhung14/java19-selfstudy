package immutable;

import java.util.Arrays;

public class Ex07SongApp {
	public static void main(String[] args) {
		String[] paths = { "d:/music/shapeofyou.mp3", "d:/music/allweknow.mp3", "d:/music/onmyway.mov" };
		String result[] = getSongNames(paths);
		for (String path : result) {
			System.out.println(path);
		}
	}

	public static String[] getSongNames(String[] paths) {
		
		String[] result = new String[paths.length];
		int i = 0;
		for(String path : paths) {
			if(path.endsWith(".mp3")) {
			int temp = path.lastIndexOf("/");
			int temp2 = path.lastIndexOf(".");
			result[i++] = path.substring((temp + 1), temp2);
		}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
}
