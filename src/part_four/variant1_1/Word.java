package part_four.variant1_1;

public class Word {
	private String word;
	
	public Word(String word) {
		this.word = word;
	}
	
	public void setWord(String newWord) {
		word = newWord;
	}
	
	public String getWord() {
		return word;
	}
	
	@Override
	public String toString() {
		return word;
	}
	
	@Override
	public boolean equals(Object ob){
		if(this.word == ob.toString())
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		int asciiSum = 0;
		for(int i = 0; i < word.length(); i++) {
			asciiSum += (int) word.charAt(i);
		}
		return (31 + asciiSum);
	}
}


