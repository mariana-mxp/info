

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

	    ///****////
	   public String representationColorFrench(String userColor){
	   	String colorRepresentation="";
	   	
	   	if (userColor.equals("rouge")) {
		 	colorRepresentation = "tomate";
		 }
		 	else if (userColor.equals("pourpre")) {
				colorRepresentation = "aubergine";
			}
			else if (userColor.equals("bleu")) {
				colorRepresentation = "blueberry";
			}
			else if (userColor.equals("vert")) {
				colorRepresentation = "salade";
			}
			else if (userColor.equals("jaune")) {
		 		colorRepresentation = "melon";
		 	}
		 	else if (userColor.equals("orange")) {
		 		colorRepresentation = "mandarine";
		 	};
			
			return colorRepresentation;
	   }//end representationColorFrench

	    public String complementaryColorFrench(String userColor){
	   	String complementaryColor="";
	   	
	   	if (userColor.equals("rouge")) {
		 	complementaryColor = "vert";
		 }
		 	else if (userColor.equals("pourpre")) {
				complementaryColor = "jaune";
			}
			else if (userColor.equals("bleu")) {
				complementaryColor = "orange";
			}
			else if (userColor.equals("vert")) {
				complementaryColor = "rouge";
			}
			else if (userColor.equals("jaune")) {
		 		complementaryColor = "pourpre";
		 	}
		 	else if (userColor.equals("orange")) {
		 		complementaryColor = "bleu";
		 	};
			
			return complementaryColor;
	   }//end complementaryColorFrench

	
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
	 		  args[0] French (fr)

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
				if (color.equals("vermelho")||color.equals("roxo")||color.equals("azul")||color.equals("verde")||color.equals("amarelo")
					||color.equals("laranja")){
					System.out.println("Cor de " + representationUserColor + ".");
					System.out.println("Sua cor complementar é: " + complementaryUserColor + "!");	
				} else {  
					System.out.println("Favor selecionar uma das cores disponíveis: vermelho, roxo, azul, verde, amarelo ou laranja. ");	
				}
				break;
				
			case "en":
				representationUserColor = complementaryColor.representationColorEnglish(color);
				complementaryUserColor = complementaryColor.complementaryColorEnglish(color);
				if (color.equals("red")||color.equals("purple")||color.equals("blue")||color.equals("green")||color.equals("yellow")
					||color.equals("orange")){
				System.out.println(representationUserColor + " color.");
				System.out.println("Your complementary color is: " + complementaryUserColor + "!");
				} else {  
					System.out.println("Please select one of the available colors: red, purple, blue, green, yellow or orange.");	
				}
				break;
				
			case "fr":
				representationUserColor = complementaryColor.representationColorFrench(color);
				complementaryUserColor = complementaryColor.complementaryColorFrench(color);
				if (color.equals("rouge")||color.equals("pourpre")||color.equals("bleu")||color.equals("vert")||color.equals("jaune")
					||color.equals("orange")){
				System.out.println("Couleur " + representationUserColor + ".");
				System.out.println("Sa couleur complémentaire est: " + complementaryUserColor + "!");
				} else {  
					System.out.println("S'il vous plaît sélectionnez une des couleurs disponibles: rouge, violet, bleu, vert, jaune ou orange.");	
				}
				break;

			default:
				System.out.println("Por favor escolha uma das linguagens aceitas: pt (Português), en (Inglês) ou fr (Francês).");
				System.out.println("Please choose one of the accepted languages pt (Portuguese), en (English) or fr (French).");
				System.out.println("S'il vous plaît choisissez l'une des langages supportés: pt (Portugais), en (Anglais) ou fr (Français).");
				break;
				
			
		}//end switch
		
			//System.out.println("COR: " + teste);
	}
}
