package javasession;

public class SelectBrowser {

	public static void main(String[] args) {
		// WAP to launch browsers using If-ElseIf and Switch Case.
		//Browser: Chrome/Firefox/IE/Safari
		//If user passes wrong browser, print please pass the right browser name
		
		String browser="Chrome";
				switch (browser) {
				case "Chrome" :
					System.out.println("Chrome Browser");
					break;
				case "Firefox" :
					System.out.println("Firefox Browser");
					break;
				case "IE" :
					System.out.println("IE Browser");
					break;
				case "Safari" :
					System.out.println("Safari Browser");
					break;
				
				default:
					System.out.println("Please pass the right browser name");
				}
				
				if(browser=="IE")
				System.out.println("IE Browser");
				
				else if(browser=="Chrome")
				System.out.println("Chrome Browser");
				
				else if(browser=="Firefox")
					System.out.println("Firefox Browser");
				
				else if(browser=="Safari")
					System.out.println("Safari Browse");
				
				else
					System.out.println("Please pass the right browser name");
					
	}

}
