package com.samsungosp.local;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * The Class Melody.
 */
public class MelodyFinal {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			
			int round = Integer.parseInt(br.readLine());

			int[] inputSize = new int[round];
			List<List<Integer>> inputValues = new ArrayList<List<Integer>>();

			for (int rd = 0; rd < round; rd++) {
				inputSize[rd] = Integer.parseInt(br.readLine());

				inputValues.add(changeStringtoListOfInteger(br.readLine()));

			}
//			System.out.println(inputValues);

			Long startTime = System.nanoTime();

			for (int rr = 1; rr <= round; rr++) {
				int maxvlue = 0;
				int maxcount = 0;
				
				System.out.println();
				System.out.print("#" + rr + " ");

				List<Integer> inputvalue = inputValues.get(rr - 1);

				List<Integer> comparevalue = new ArrayList<Integer>();

				for (int i = 0; i < inputvalue.size(); i++) {
					int reusltCount = 0;

					comparevalue.add(inputvalue.get(i));

					reusltCount = searchAndCount(inputvalue, comparevalue);

					if (reusltCount >= maxcount) {
						maxcount = reusltCount;
						maxvlue = comparevalue.size();
					}
					
				}
				System.out.println(maxvlue);


			}
			
			System.out.println( "Total Time:" + ((System.nanoTime() - startTime) / 1000000000.0) + "s");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Change stringto list of integer.
	 *
	 * @param s
	 *            the s
	 * @return the list
	 */
	public static List<Integer> changeStringtoListOfInteger(String s) {
		List<Integer> returnvalue = new ArrayList<Integer>();
		try {
			StringTokenizer strt = new StringTokenizer(s, " ");
//			System.out.println(s);
			while (strt.hasMoreTokens()) {
				returnvalue.add(Integer.parseInt(strt.nextToken().trim()));
			}
		} catch (NumberFormatException e) {
			System.err.println("Invalid Format..");
		}

		return returnvalue;

	}

	/**
	 * Search and count.
	 *
	 * @param input
	 *            the input
	 * @param compare
	 *            the compare
	 * @return the int
	 */
	public static int searchAndCount(List<Integer> input, List<Integer> compare) {
		int count = 0;
		for (int j = 0; j < input.size(); j++) {

			if (input.get(j) == compare.get(0)) {

				if (j + compare.size() <= input.size()) {

					List<Integer> temp = new ArrayList<Integer>();

					for (int k = 0; k < compare.size(); k++) {
						temp.add(input.get(j + k));
					}
					// System.out.println("GetInput Value= " + temp);
					if (compare.equals(temp)) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
