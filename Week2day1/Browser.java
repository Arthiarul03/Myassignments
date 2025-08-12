package Week2day1;

public class Browser {
	  
		String launchBrowser(String browserName) {
	    System.out.println("Browser launched: " + browserName);
	    return browserName;
	}

	// Method to load URL
	     void loadUrl() {
	     System.out.println("Url loaded successfully");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser obj=new Browser();
		obj.launchBrowser("Chrome");
		obj.loadUrl();
	}

}
