import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

public class Melody {
	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		int maxcount = 0;

		List<Integer> inputvalue = inputValue();
		System.out.println("Input Value = " + inputvalue);

		for (int i = 0; i < inputvalue.size(); i++) {
			int reusltCount = 0;

			List<Integer> comparevalue = getCompareValue(inputvalue, i);
			System.out.println("Compare Value = " + comparevalue);

			for (int j = 0; j < inputvalue.size(); j++) {

				if (j + comparevalue.size() <= inputvalue.size()) {
					List<Integer> temp = new ArrayList<Integer>();

					for (int k = 0; k < comparevalue.size(); k++) {
						temp.add(inputvalue.get(j + k));
					}
					System.out.println("GetInput Value= " + temp);
					if (comparevalue.equals(temp)) {
						reusltCount++;
					}
				}
			}
			if (reusltCount >= maxcount) {
				maxcount = reusltCount;
			}
			System.out.println(reusltCount);

		}

		System.out.println("Max Count=" + maxcount);
		System.out.println((System.currentTimeMillis() - startTime));
	}

	public static List<Integer> getCompareValue(List<Integer> inputValue, int index) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= index; i++) {
			list.add(inputValue.get(i));
		}
		return list;
	}

	public static List<Integer> inputValue() {
		String s = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			s = br.readLine();
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		} catch (Exception e){
			e.printStackTrace();
		}
		return changeStringtoListOfInteger(s);
	}
	
	public static List<Integer> changeStringtoListOfInteger(String s) {
		List<Integer> returnvalue = new ArrayList<Integer>();
		try {
			StringTokenizer strt = new StringTokenizer(s, ",");
		
			while (strt.hasMoreTokens()) { 
				returnvalue.add(Integer.parseInt(strt.nextToken().trim()));
			} 
		} catch (NumberFormatException e) { 
			System.err.println("Invalid Format..");
		}
		
		return returnvalue;
		
	}
}
