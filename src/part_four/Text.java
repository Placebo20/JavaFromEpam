package part_four;

import java.util.Vector;

public class Text {
	
	private Sentence title;
	private Vector<Sentence> text;
	
	public Text() {
		this.title = new Sentence();
		this.text = new Vector<Sentence>();
	}
	
	public Text(Sentence title, Vector<Sentence> text) {
		this.title = title;
		this.text = text;
	}
	
	public void setTitle(Sentence title) {
		this.title = title;
	}
	
	public void setText(Vector<Sentence> text) {
		this.text = text;
	}
	
	public Sentence getTitle() {
		return title;
	}
	
	public Vector<Sentence> getText(){
		return text;
	}
	
	public void addSentence(Sentence newSentence) {
		text.add(newSentence);
	}
	
	public void addSentence(String newSentence) {
		Sentence newSen = new Sentence(newSentence);
		text.add(newSen);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("*" + title + "*\n");
		for(Sentence sentence : text) {
			sb.append(sentence);
		}
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob.toString().equals(text.toString())){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int asciiSum = 0;
		for(int i = 0; i < text.size(); i++) {
			Sentence currentSentence = text.elementAt(i);
			for(int j = 0; j < currentSentence.sentence.size(); j++) {
				Word currentWord = currentSentence.sentence.elementAt(j);
				for(int k = 0; k < currentWord.toString().length(); k++)
					asciiSum += (int) currentWord.toString().charAt(k);
			}
		}
		return (31 + asciiSum);
	}
	
	
}
