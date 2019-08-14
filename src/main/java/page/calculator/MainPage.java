package page.calculator;

import org.openqa.selenium.By;

import core.BasePage;
import utils.InvalidEntryException;

public class MainPage extends BasePage{
	
	public MainPage() {
//		super("com.google.android.calculator", "com.android.calculator2.Calculator");com.android.calculator2
		super("com.android.calculator2", ".Calculator");
	}
	
	private static final String NUMBER_0_ID = "com.android.calculator2:id/digit_0";
	private static final String NUMBER_1_ID = "com.android.calculator2:id/digit_1";
	private static final String NUMBER_2_ID = "com.android.calculator2:id/digit_2";
	private static final String NUMBER_3_ID = "com.android.calculator2:id/digit_3";
	private static final String NUMBER_4_ID = "com.android.calculator2:id/digit_4";
	private static final String NUMBER_5_ID = "com.android.calculator2:id/digit_5";
	private static final String NUMBER_6_ID = "com.android.calculator2:id/digit_6";
	private static final String NUMBER_7_ID = "com.android.calculator2:id/digit_7";
	private static final String NUMBER_8_ID = "com.android.calculator2:id/digit_8";
	private static final String NUMBER_9_ID = "com.android.calculator2:id/digit_9";
	
	private String[] numberKeys = new String[] {
		NUMBER_0_ID,
		NUMBER_1_ID,
		NUMBER_2_ID,
		NUMBER_3_ID,
		NUMBER_4_ID,
		NUMBER_5_ID,
		NUMBER_6_ID,
		NUMBER_7_ID,
		NUMBER_8_ID,
		NUMBER_9_ID
	};
	
	private static final String DISPLAY_ID = "com.android.calculator2:id/result";	
	private static final String KEY_EQUAL_ID = "com.android.calculator2:id/eq";
	private static final String KEY_PLUS_ID = "com.android.calculator2:id/op_add";
	private static final String KEY_MINUS_ID = "com.android.calculator2:id/op_sub";
	
	
	public void pressNumber(String number) {
		try {
			clickInTheNumber(number);
		} catch (InvalidEntryException e) {
			e.printStackTrace();
		}	
	}
	
	public void pressEQ() {
		click(By.id(KEY_EQUAL_ID));
	}
	
	public String verifyResult() {
		return getText(By.id(DISPLAY_ID));
	}
	
	public void pressPlus() {
		click(By.id(KEY_PLUS_ID));
	}
	
	public void pressMinus() {
		click(By.id(KEY_MINUS_ID));
	}
	
	void clickInTheNumber(String number)throws InvalidEntryException{
		String numberPattern = "[0-9]+";
		if (number.matches(numberPattern)) {
			char[] numbers = number.toCharArray();
			for (char c : numbers) {
				click(By.id(numberKeys[Integer.parseInt(Character.toString(c))]));
			}			
		}else {
			throw new InvalidEntryException("The entry value is not a number");
		}
	}
	
}
