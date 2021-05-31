package caesarCipher;

public class CaesarCipherEfficient {
	private int key = 0;

	public CaesarCipherEfficient(int key) {
		this.key = key;
	}

	public String encrypt(String plainText) {
		return transform(plainText, true);
	}

	public String decrypt(String cipherText) {
		return transform(cipherText, false);
	}

	private String transform(String s, boolean encrypt) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {	
//			Use ternerary if statement instead - three parts in a ternerary statement : if, then, else
			char c = (char) (encrypt? s.codePointAt(i) + key : s.codePointAt(i) - key);
			sb.append(c);
//			if (encrypt) {
//				c = (char) s.codePointAt(i) + key;				
//			}else {
//				c = (char) s.codePointAt(i) - key;
//			}		
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		CaesarCipherEfficient cc = new CaesarCipherEfficient(7);
		String encrypted = cc.encrypt("Gauls are smelly and dangerous!");
		System.out.println(encrypted);
		System.out.println(cc.decrypt(encrypted));

	}
}