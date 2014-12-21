package DBMS.execute;

public class AllCombine {
	private int[] __up;
	private int[] combine;
	private int size;
	public AllCombine (int[] up){
		this.__up = up;
		this.size = up.length;
		this.combine = new int[size];
	}
	public boolean hasNext () {
		int i;
		for (i = 0; i < size; i++){
			if (combine[i] < __up[i-1]){
				return true;
			}
		}
		return false;
	}
	public int[] getNext (){
		int i;
		combine[0]++;
		for (i = 0; i < size; i++){
			if (combine[i] >= __up[i]){
				combine[i] = 0;
				if (i < size-1){
					combine[i+1]++;
				}
			} else{
				break;
			}
		}
		return this.combine;
	}
}
