package rocks.byivo.exec2;

public class ArraySum {
	
	private Integer[] mFilledArray;
	private Integer mUserInput;
	
	public ArraySum(Integer userInput) {
		this.mUserInput = userInput;
		this.mFilledArray = new Integer[10];
		
		this.validateUserInput();
		this.fillArray();
	}
	
	private void validateUserInput() {
		if(this.mUserInput != null) {
			
			if(this.mUserInput < 10 || this.mUserInput > 1000) {
				throw new OutOfRange(this.mUserInput);
			}
			
			if(this.mUserInput % 10 == 0) {
				return;
			}
		}
		
		throw new InvalidInput(this.mUserInput);
	}
	
	private void fillArray() {
		int value;
		int position;
		double multiplier;
		
		for(int i=0; i< mFilledArray.length; i++) {
			position= i + 1;
			multiplier = position % 3 == 0 ? .3 : .1;
			
			value = getFillValue(position, multiplier);
			this.mFilledArray[i] = value;
		}
	}
	
	private Integer getFillValue(int position, double multiplier) {
		return  position * (int) (multiplier * this.mUserInput);
	}
	
	public Integer[] getFilledArray() {
		return mFilledArray;
	}
	
	public Integer sumOdds() {
		return this.sum(false);
	}
	
	public Integer sumEvens() {
		return this.sum(true);
	}
	
	private int sum(boolean sumEvens) {
		int total = 0;
		
		for(int i=0;i < this.mFilledArray.length; i++) {
			int position = i+1;
			
			if((position % 2 == 0) == sumEvens) {
				total+= this.mFilledArray[i];
			}
		}
		
		return total;
	}
	
}
