package part_four.variant2_1.entity;

import java.util.Vector;

public class Bouquet{
	private Vector<Flower> bouquet;
	private int priceOfBouquet;
	
	public Bouquet() {
		bouquet = new Vector<Flower>();
		priceOfBouquet = 0;
	}
	public Bouquet(Vector<Flower> bouquet) {
		this.bouquet = bouquet;
		int priceSum = 0;
		for(int i = 0; i < bouquet.size(); i++) {
			priceSum += bouquet.elementAt(i).getPrice();
		}
		this.priceOfBouquet = priceSum;
	}
	
	public void addFlower(Flower newFlower) {
		bouquet.add(newFlower);
	}
	public void addFlower(String title, FreshnessDegree freshness, int price, int stemLength) {
		bouquet.add(new Flower(title, freshness, price, stemLength));
	}
	
	public void setBouquet(Vector<Flower> bouquet) {
		this.bouquet = bouquet;
		int priceSum = 0;
		for(int i = 0; i < bouquet.size(); i++) {
			priceSum += bouquet.elementAt(i).getPrice();
		}
		this.priceOfBouquet = priceSum;
	}
	
	public Vector<Flower> getBouquet(){return bouquet;}
	public int getPriceOfBouquet() {return priceOfBouquet;}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Flower flower : bouquet) {
			sb.append(flower.toString() + "\n");
		}
		sb.append("Price of bouquet: " + priceOfBouquet);
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob.toString().equals(this.toString()))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		int asciiSum = 0;
		for(Flower flower : bouquet) {
			asciiSum += flower.hashCode();
		}
		return asciiSum;
	}
}
