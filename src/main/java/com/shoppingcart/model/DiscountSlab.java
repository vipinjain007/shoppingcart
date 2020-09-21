package com.shoppingcart.model;

/**
 * Class use to create discountSlap
 */
public class DiscountSlab {
	private float rangeMin;
	private float rangeMax;
	private int discPerc;

	public DiscountSlab(float rangeMin, float rangeMax, int discPerc) {
		super();
		this.rangeMin = rangeMin;
		this.rangeMax = rangeMax;
		this.discPerc = discPerc;
	}

	public DiscountSlab() {
		
	}
   
	public float getRangeMin() {
		return rangeMin;
	}

	public void setRangeMin(float rangeMin) {
		this.rangeMin = rangeMin;
	}

	public float getRangeMax() {
		return rangeMax;
	}

	public void setRangeMax(float rangeMax) {
		this.rangeMax = rangeMax;
	}

	public int getDiscPerc() {
		return discPerc;
	}

	public void setDiscPerc(int discPerc) {
		this.discPerc = discPerc;
	}

	@Override
	public String toString() {
		return "DiscountSlab [rangeMin=" + rangeMin + ", rangeMax=" + rangeMax + ", discPerc=" + discPerc + "]";
	}

	

}
