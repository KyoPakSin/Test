package chapter6;

class CardCompany {
	private static CardCompany instance = new CardCompany();
	
	CardCompany(){	
	}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public Card creatCard(String name){
		Card card = new Card(name);
		return card;
	}
    
}
class Card {
		private static int serialNum = 1000;
		private int cardNum;
		String name;

	Card(String name){
		this.name = name;
		this.cardNum = ++serialNum;
	}

	String cardInfo(){
		String result ="카드이름 :" + name + "\n카드번호 : " + cardNum;
		return result;
	}	
}
	
public class Test2 {

	public static void main(String[] args) {
		CardCompany cardCompany = CardCompany.getInstance();
		
		Card KBCard1 = cardCompany.creatCard("국민카드1");	
		Card KBCard2 = cardCompany.creatCard("국민카드2");
		
		System.out.println(KBCard1.cardInfo());
		System.out.println(KBCard2.cardInfo());
	}
}