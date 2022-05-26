class ATM {
	long[] atm = new long[5];                                                
	int[] denoms = {20,50,100,200,500 };
	public ATM() {
		//denoms = new int[]{ 20,50,100,200,500 };                              
	}

	public void deposit(int[] banknotesCount) {
        
		for(int i = 0; i < banknotesCount.length; i++){
			atm[i] += banknotesCount[i];                                       
		}
        
        
	}

	public int[] withdraw(int amount) {                 
		int[] result = new int[5];                                             
		for(int i = 4; i >= 0; i--){
			if(amount >= denoms[i] ){                                              
				int quantity = (int) Math.min(atm[i], amount / denoms[i]);     
				amount -= denoms[i] * quantity;                                 
				result[i] = quantity;
			}
		}
		if(amount != 0){ return new int[]{-1}; }
		for(int i = 0; i < 5; i++){  atm[i] -= result[i];  }                   
		return result;
	}
}
/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */