//import java.util.stream;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q24tabstream{
	public static void main(String[] argv){
		String[] tab = {"Ala", null, "ma", " ", "kota", "", null, ","};
		List<String> lines = Arrays.asList(tab); //?

		List<String> result = lines.stream()
			.filter(line -> !"".equals(line))
			.filter(Objects::nonNull)
			.collect(Collectors.toList());
		
		result.forEach(System.out::println);
	}
}

