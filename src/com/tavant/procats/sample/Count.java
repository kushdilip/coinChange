package com.tavant.procats.sample;

import java.util.ArrayList;
import java.util.List;

public class Count implements ICount {

	private class CoinChangeAnswer {

		public ArrayList<String> allPossibleChanges = new ArrayList<>();
		private int target;
		public int[] denoms;

		public CoinChangeAnswer(int target, int[] denoms) {
			this.target = target;
			this.denoms = denoms;
		}
	}

	private void findAllCombinationsRecursive(String tsoln, int startIx,
			int remainingTarget, CoinChangeAnswer answer) {
		for (int i = startIx; i < answer.denoms.length; i++) {
			int temp = remainingTarget - answer.denoms[i];
			String tempSoln = tsoln + "" + answer.denoms[i] + ",";
			if (temp < 0) {
				break;
			}
			if (temp == 0) {
				answer.allPossibleChanges.add(tempSoln);
				break;
			} else {
				findAllCombinationsRecursive(tempSoln, i, temp, answer);
			}
		}
	}

	private CoinChangeAnswer findAllPossibleCombinations(int target,
			int[] denoms) {
		CoinChangeAnswer soln = new CoinChangeAnswer(target, denoms);
		String tempSoln = new String();
		findAllCombinationsRecursive(tempSoln, 0, target, soln);
		return soln;
	}

	@Override
	public Integer countRupeeNotes(Integer money, List<Integer> coins) {

		return null;
	}

	public static void main(String[] args) {
		Count count = new Count();
		int[] denoms = new int[] {1,2,3};
		count.findAllPossibleCombinations(4,denoms );
	}
}
