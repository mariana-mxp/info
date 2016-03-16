

public class ComplementaryColor {
	
	
	   public String representationColorPortuguese(String userColor){
	   	String colorRepresentation="";
	   	
	   	if (userColor.equals("vermelho")) {
		 	colorRepresentation = "tomate";
		 }
		 	else if (userColor.equals("roxo")) {
				colorRepresentation = "berinjela";
			}
			else if (userColor.equals("azul")) {
				colorRepresentation = "mirtilo";
			}
			else if (userColor.equals("verde")) {
				colorRepresentation = "alface";
			}
			else if (userColor.equals("amarelo")) {
		 		colorRepresentation = "melão";
		 	}
		 	else if (userColor.equals("laranja")) {
		 		colorRepresentation = "tangerina";
		 	};
			
			return colorRepresentation;
	   }//end representationColorPortuguese

	    public String complementaryColorPortuguese(String userColor){
	   	String complementaryColor="";
	   	
	   	if (userColor.equals("vermelho")) {
		 	complementaryColor = "verde";
		 }
		 	else if (userColor.equals("roxo")) {
				complementaryColor = "amarelo";
			}
			else if (userColor.equals("azul")) {
				complementaryColor = "laranja";
			}
			else if (userColor.equals("verde")) {
				complementaryColor = "vermelho";
			}
			else if (userColor.equals("amarelo")) {
		 		complementaryColor = "roxo";
		 	}
		 	else if (userColor.equals("laranja")) {
		 		complementaryColor = "azul";
		 	};
			
			return complementaryColor;
	   }//end complementaryColorPortuguese

	   ///****////
	   public String representationColorEnglish(String userColor){
	   	String colorRepresentation="";
	   	
	   	if (userColor.equals("red")) {
		 	colorRepresentation = "Tomato";
		 }
		 	else if (userColor.equals("purple")) {
				colorRepresentation = "Eggplant";
			}
			else if (userColor.equals("blue")) {
				colorRepresentation = "Blueberry";
			}
			else if (userColor.equals("green")) {
				colorRepresentation = "Lettuce";
			}
			else if (userColor.equals("yellow")) {
		 		colorRepresentation = "Melon";
		 	}
		 	else if (userColor.equals("orange")) {
		 		colorRepresentation = "Tangerine";
		 	};
			
			return colorRepresentation;
	   }//end representationColorEnglish

	    public String complementaryColorEnglish(String userColor){
	   	String complementaryColor="";
	   	
	   	if (userColor.equals("red")) {
		 	complementaryColor = "green";
		 }
		 	else if (userColor.equals("purple")) {
				complementaryColor = "yellow";
			}
			else if (userColor.equals("blue")) {
				complementaryColor = "orange";
			}
			else if (userColor.equals("green")) {
				complementaryColor = "red";
			}
			else if (userColor.equals("yellow")) {
		 		complementaryColor = "purple";
		 	}
		 	else if (userColor.equals("orange")) {
		 		complementaryColor = "blue";
		 	};
			
			return complementaryColor;
	   }//end complementaryColorEnglish

	
	/* This main method receives two arguments: language and color.
	   Thus, you need to provide them when you're going to execute it.
	   For instance, if you run it on command line, you
	   could simply run: "java ComplementaryColor pt vermelho" or 
	   "java ComplementaryColor en red".
	  
	   If you're running on Eclipse, you need to set the arguments
	   in "Run/Run configurations/Arguments/Program arguments"
	   otherwise you'll just get a runtime exception and nothing will happen
	   Needing help with that don't hesitate on contacting me
	 */

	/**
	 * 
	 * @param args[0] Portuguese (pt)
	 		  args[0] English (en)

	 * @param args[1] color (Ex: vermelho)		
	 */
	public static void main(String[] args) {
		ComplementaryColor complementaryColor = new ComplementaryColor();

		//idioma do aplicativo
		String language=args[0];
		//cor escolhida pelo usuário
		String color = args[1];
		//representação da cor
		String representationUserColor = "";
		//cor complementar
		String complementaryUserColor = "";
		

		switch(language){
			case "pt":
				representationUserColor = complementaryColor.representationColorPortuguese(color);
				complementaryUserColor = complementaryColor.complementaryColorPortuguese(color);
				System.out.println("Cor de " + representationUserColor + ".");
				System.out.println("Sua cor complementar é: " + complementaryUserColor + "!");
				break;
				
			case "en":
				representationUserColor = complementaryColor.representationColorEnglish(color);
				complementaryUserColor = complementaryColor.complementaryColorEnglish(color);
				System.out.println(representationUserColor + " color.");
				System.out.println("Your complementary color is: " + complementaryUserColor + "!");
				break;
				
			default:
				break;
				
			
		}//end switch
		
			//System.out.println("COR: " + teste);
	}
}
