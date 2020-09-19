package ru.mirea.lab10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercise4 {

	private static final String PATH = "src/ru/mirea/lab10";

	public static void main(String[] args) {
		List<String> list = getDirContent(new File(PATH));

		for (int i = 0; i < list.size() && i < 5; i++) {
			System.out.println(list.get(i));
		}
	}

	public static List<String> getDirContent(File dir) {
		List<String> list = new ArrayList<>();

		if (dir.isDirectory()) {
			for (File file : Objects.requireNonNull(dir.listFiles())) {
				list.add(file.getName());
			}
		}

		return list;
	}
}
