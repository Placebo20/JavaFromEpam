package part_four.variant1_1;

import java.util.Vector;

public class Sentence {
	Vector<Word> sentence;
	
	public Sentence() {
		sentence = new Vector<Word>();
	}
	
	public Sentence(Vector<Word> sentence) {
		this.sentence = sentence;
	}
	
	public Sentence(String sentence) {
		this.sentence = new Vector<Word>();
		Word newWord = new Word(sentence);
		this.sentence.add(newWord);
	}
	
	public void setSentence(Vector<Word> newSentence) {
		this.sentence = newSentence;
	}
	
	public Vector<Word> getSentence() {
		return sentence;
	}
	
	public void addWord(Word word) {
		sentence.add(word);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Word word : sentence) {
			sb.append(word.toString());
		}

		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		int asciiSum = 0;
		for(int i = 0; i < sentence.size(); i++) {
			for(int j = 0; j < sentence.elementAt(i).toString().length(); j++) {
				asciiSum += (int) sentence.elementAt(i).toString().charAt(j);
			}
		}
		return (31 + asciiSum);
	}
	
	@Override
	public boolean equals(Object ob) {
		if(this.toString().equals(ob.toString())) {
			return true;
		}
		return false;
	}
}
