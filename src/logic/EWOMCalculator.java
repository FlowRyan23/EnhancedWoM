package logic;

public class EWOMCalculator {
	
	private int[] weighting;
	private int totalWeight;
	
	public double compatibility(int[] stanceA, int[] stanceB) {
		double res = 0;
		for(int i=0; i<stanceA.length; i++) {
			if(stanceA[i] == stanceB[i])
				res += weighting[i]/(double) totalWeight;
			else if(stanceA[i] == -stanceB[i])
				continue;
			else
				res += 0.5d/totalWeight;
		}
		return res;
	}
	
	public void setWeighting(int[] weighting) {
		this.weighting = weighting.clone();
		totalWeight = 0;
		for(int i:weighting)
			totalWeight += i;
	}
	
}
