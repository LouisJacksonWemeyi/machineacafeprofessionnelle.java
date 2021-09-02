package com.yakindu.sct.machineacafeprofessionnelle.java;

import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Interface {
private Button btExpresso;
private Button btExpressoMacch;
private Button btCafe;
private Button btCappuccino;
private Button btLatteMacchiato;
private Button btCafeAuLait;
private Button btMousseLait;
private Button btStartStop;
private Button btBoissonSpeciales;
private Button btMenu;
private Button btOk;
private Button btSecuEnfant;
private Button btMl;
private Button btRetour;
private Button btIntensite;
private Button btDeuxTasses;
private Button btnExpresso;
private Button btnExpressoMacch;
private Button btnCafe;
private Button btnCappuccino;
private Button btnLatteMacchiato;
private Button btnCafeAuLait;
private Button btnMousseLait;
private Button btnBoissonSpeciales;
private Button btnDeuxTasses;
private Button btnOk;
private Button btNav;
private Button btExpressoSelected;
private Button btExpressoMacchSelected;
private Button btCafeSelected;
private Button btCappuccinoSelected;
private Button btLatteMacchiatoSelected;
private Button btCafeAuLaitSelected;
private Button btMousseLaitSelected;
private Button btBoissonSpecialeSelected;
private Button btBacCollecteurVider;
private Button btFiltreRemplacer;
private Button btReservoirEauRempli;
private Button btReservoirGrainsRempli;
private String intensiteDucafe;
private String tailleDeLaTasse;
private Long tailleTasseBoiFav;
private Long nbreBoissons;
private String message;
private String temperatureBoissonFav;
private String dureteDeLeau;
private Long ratioLaitCafe;
private String tempsArretAutomatique;
private String numFavBoisson;
private Boolean isHandlingBoissonFav;
private Boolean isTailleDeLaTasseMlValeurDifUsine;
private Boolean isFilterPresent;
private Boolean bipSonore;
private boolean deuxTasses=false;
private double progressBarValue = 0.0;
private double progressBarCafe = 0.0;
private double progressBarLait = 0.0;
private ImageView tasse1;
private ImageView tasse2;
private ImageView choixLangue;

private Stage stage;

ResourceBundle bundleFR = ResourceBundle.getBundle("internationalization.ApplicationMessages", new Locale("fr", "FR"));
ResourceBundle bundleEN = ResourceBundle.getBundle("internationalization.ApplicationMessages", new Locale("en", "EN"));
ResourceBundle bundleNL = ResourceBundle.getBundle("internationalization.ApplicationMessages", new Locale("nl", "NL"));
ResourceBundle langueBundle = null;
String langue = null;





	public Interface(Stage stage) {
	
		ImageView expresso= new ImageView(new Image("/images/expresso.png"));
		expresso.setFitHeight(66);
		expresso.setFitWidth(55);
		btExpresso = new Button("",expresso);
		btExpresso.setStyle("-fx-background-color: black");
		
		ImageView expressoMacch= new ImageView(new Image("/images/expressoMacch.png"));
		expressoMacch.setFitHeight(66);
		expressoMacch.setFitWidth(55);
		btExpressoMacch = new Button("", expressoMacch);
		btExpressoMacch.setStyle("-fx-background-color: black");
		
		ImageView cafe= new ImageView(new Image("/images/cafe.png"));
		cafe.setFitHeight(66);
		cafe.setFitWidth(55);
		btCafe = new Button("",cafe);
		btCafe.setStyle("-fx-background-color: black");
		
		ImageView cappuccino= new ImageView(new Image("/images/cappuccino.png"));
		cappuccino.setFitHeight(66);
		cappuccino.setFitWidth(55);
		btCappuccino = new Button("",cappuccino);
		btCappuccino.setStyle("-fx-background-color: black");
		
		ImageView latteMacchiato= new ImageView(new Image("/images/latteMacchiato.png"));
		latteMacchiato.setFitHeight(66);
		latteMacchiato.setFitWidth(55);
		btLatteMacchiato = new Button("", latteMacchiato);
		btLatteMacchiato.setStyle("-fx-background-color: black");

		
		ImageView cafeAuLait = new ImageView(new Image("/images/cafeAuLait.png"));
		cafeAuLait.setFitHeight(66);
		cafeAuLait.setFitWidth(55);
		btCafeAuLait = new Button("", cafeAuLait);
		btCafeAuLait.setStyle("-fx-background-color: black");

		
		ImageView MousseLait = new ImageView(new Image("/images/MousseLait.png"));
		MousseLait.setFitHeight(66);
		MousseLait.setFitWidth(55);
		btMousseLait = new Button("", MousseLait);
		btMousseLait.setStyle("-fx-background-color: black");

		
		ImageView boissonSpeciales = new ImageView(new Image("/images/boissonSpeciales.png"));
		boissonSpeciales.setFitHeight(66);
		boissonSpeciales.setFitWidth(55);
		btBoissonSpeciales = new Button("", boissonSpeciales);
		btBoissonSpeciales.setStyle("-fx-background-color: black");

		
		ImageView startStop = new ImageView(new Image("/images/startStop.png"));
		startStop.setFitHeight(66);
		startStop.setFitWidth(55);
		btStartStop = new Button("", startStop);
		btStartStop.setStyle("-fx-background-color: black");

		
		ImageView menu = new ImageView(new Image("/images/menu.png"));
		menu.setFitHeight(41);
		menu.setFitWidth(66);
		btMenu = new Button("", menu);
		btMenu.setStyle("-fx-background-color: black");

		
		ImageView ok = new ImageView(new Image("/images/ok.png"));
		ok.setFitHeight(41);
		ok.setFitWidth(66);
		btOk = new Button("", ok);
		btOk.setStyle("-fx-background-color: black");

		
		ImageView secuEnfant = new ImageView(new Image("/images/secuEnfant.png"));
		secuEnfant.setFitHeight(41);
		secuEnfant.setFitWidth(66);
		btSecuEnfant = new Button("", secuEnfant);
		btSecuEnfant.setStyle("-fx-background-color: black");

		
		ImageView ml = new ImageView(new Image("/images/ml.png"));
		ml.setFitHeight(41);
		ml.setFitWidth(66);
		btMl = new Button("", ml);
		btMl.setStyle("-fx-background-color: black");

		
		ImageView retourArriere = new ImageView(new Image("/images/retourArriere.png"));
		retourArriere.setFitHeight(41);
		retourArriere.setFitWidth(66);
		btRetour= new Button("", retourArriere);
		btRetour.setStyle("-fx-background-color: black");

		
		ImageView intensite = new ImageView(new Image("/images/intensite.png"));
		intensite.setFitHeight(41);
		intensite.setFitWidth(66);
		btIntensite = new Button("", intensite);
		btIntensite.setStyle("-fx-background-color: black");

		ImageView deuxtasses = new ImageView(new Image("/images/deuxtasses.png"));
		deuxtasses.setFitHeight(41);
		deuxtasses.setFitWidth(66);
		btDeuxTasses = new Button("", deuxtasses);
		btDeuxTasses.setStyle("-fx-background-color: black");

		
		ImageView navi = new ImageView(new Image("/images/navi.png"));
		navi.setFitHeight(17);
		navi.setFitWidth(27);
		btNav = new Button("",navi);
		btNav.setStyle("-fx-background-color: black");
		
		ImageView expressoSelected= new ImageView(new Image("/images/expressoSel.png"));
		expressoSelected.setFitHeight(66);
		expressoSelected.setFitWidth(55);
		btExpressoSelected = new Button("",expressoSelected);
		btExpressoSelected.setStyle("-fx-background-color: black");
		
		ImageView expressoMacchSelected= new ImageView(new Image("/images/expressoMacchSel.png"));
		expressoMacchSelected.setFitHeight(66);
		expressoMacchSelected.setFitWidth(55);
		btExpressoMacchSelected = new Button("", expressoMacchSelected);
		btExpressoMacchSelected.setStyle("-fx-background-color: black");
		
		ImageView cafeSelected= new ImageView(new Image("/images/cafeSel.png"));
		cafeSelected.setFitHeight(66);
		cafeSelected.setFitWidth(55);
		btCafeSelected = new Button("",cafeSelected);
		btCafeSelected.setStyle("-fx-background-color: black");
		
		ImageView cappuccinoSelected = new ImageView(new Image("/images/cappuccinoSel.png"));
		cappuccinoSelected.setFitHeight(66);
		cappuccinoSelected.setFitWidth(55);
		btCappuccinoSelected = new Button("",cappuccinoSelected);
		btCappuccinoSelected.setStyle("-fx-background-color: black");
		
		ImageView latteMacchiatoSelected= new ImageView(new Image("/images/latteMacchiatoSel.png"));
		latteMacchiatoSelected.setFitHeight(66);
		latteMacchiatoSelected.setFitWidth(55);
		btLatteMacchiatoSelected = new Button("", latteMacchiatoSelected);
		btLatteMacchiatoSelected.setStyle("-fx-background-color: black");
		
		ImageView cafeAuLaitSelected = new ImageView(new Image("/images/cafeAuLaitSel.png"));
		cafeAuLaitSelected.setFitHeight(66);
		cafeAuLaitSelected.setFitWidth(55);
		btCafeAuLaitSelected = new Button("", cafeAuLaitSelected);
		btCafeAuLaitSelected.setStyle("-fx-background-color: black");
		
		ImageView MousseLaitSelected = new ImageView(new Image("/images/MousseLaitSel.png"));
		MousseLaitSelected.setFitHeight(66);
		MousseLaitSelected.setFitWidth(55);
		btMousseLaitSelected = new Button("", MousseLaitSelected);
		btMousseLaitSelected.setStyle("-fx-background-color: black");
		
		ImageView boissonSpecialeSelected = new ImageView(new Image("/images/boissonSpecialeSel.png"));
		boissonSpecialeSelected.setFitHeight(66);
		boissonSpecialeSelected.setFitWidth(55);
		btBoissonSpecialeSelected = new Button("", boissonSpecialeSelected);
		btBoissonSpecialeSelected.setStyle("-fx-background-color: black");
			
		tasse1 = new ImageView(new Image("/images/tasse1.png"));
		tasse1.setFitHeight(16);
		tasse1.setFitWidth(15);
		tasse1.setStyle("-fx-background-color:lightgray");
		 
		tasse2 = new ImageView(new Image("/images/tasse2.png"));
		tasse2.setFitHeight(16);
		tasse2.setFitWidth(15);
		tasse2.setStyle("-fx-background-color:lightgray");
		
		choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		choixLangue.setFitHeight(16);
		choixLangue.setFitWidth(15);
		choixLangue.setStyle("-fx-background-color:lightgray");
		
		btBacCollecteurVider = new Button("Button 1");
		btFiltreRemplacer = new Button("Button 2");
		btReservoirEauRempli = new Button("Button 3");
		btReservoirGrainsRempli = new Button("Button 4");
				
		this.stage = stage;
		
		bundleFR = ResourceBundle.getBundle("internationalization.ApplicationMessages",new Locale("fr", "FR"));
		bundleEN = ResourceBundle.getBundle("internationalization.ApplicationMessages",new Locale("en", "EN"));
		bundleNL = ResourceBundle.getBundle("internationalization.ApplicationMessages",new Locale("nl", "NL"));
	}
	
	/**
	 * Cette function switch les boutons    
	 */
	void switchBoutons(String value) {
	this.btnExpresso = value == "expresso" ? btExpressoSelected : btExpresso;
	this.btnExpressoMacch = value == "expressomacch" ? btExpressoMacchSelected : btExpressoMacch;
	this.btnCafe = value == "cafe" ? btCafeSelected : btCafe;
	this.btnCappuccino = value == "cappuccino" ? btCappuccinoSelected : btCappuccino;
	this.btnLatteMacchiato = value == "lattemacchiato" ? btLatteMacchiatoSelected : btLatteMacchiato;
	this.btnCafeAuLait = value == "cafeaulait" ? btCafeAuLaitSelected : btCafeAuLait;
	this.btnMousseLait = value == "mousselait" ? btMousseLaitSelected : btMousseLait;
	this.btnBoissonSpeciales = (value == "eauchaude" || value == "laitchaud" || value == "verseuse"
			|| value == "americano" || value == "flatwhite" || value == "cafecortado") ? btBoissonSpecialeSelected
					: btBoissonSpeciales;
	this.btnOk = (value == "selectBoisFav") ? getEmptyButtonType2() : btOk;
	this.btnDeuxTasses = (value == "selectBoisFav") ? getEmptyButtonType2() : btDeuxTasses;
   }

	/**
	 * Cette function retourne le bouton de navigation  
	 */
	HBox navBouton(Button bouton) {
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(bouton);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 return btNavBandeau;
	}
	
	/**
	 * Cette function retourne le bandeau de commande
	 * de l'interface graphique
	 */
	GridPane bandeauDeCommandes(Button bouton1,Button bouton2, Button bouton3, Button bouton4, Button bouton5, Button bouton6, Button bouton7, Button bouton8,Button bouton9) {
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(bouton1, 0, 0);
		bandeauDeCommandes.add(bouton2, 1, 0);
		bandeauDeCommandes.add(bouton3, 2, 0);
		bandeauDeCommandes.add(bouton4, 3, 0);
		bandeauDeCommandes.add(bouton5, 4, 0);
		bandeauDeCommandes.add(bouton6, 5, 0);
		bandeauDeCommandes.add(bouton7, 6, 0);
		bandeauDeCommandes.add(bouton8, 7, 0);
		bandeauDeCommandes.add(bouton9, 8, 0);
		bandeauDeCommandes.setHgap(2);
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		return bandeauDeCommandes;
	}
	
	/**
	 * Cette function retourne les boutons du côté gauches de l'interface graphique    
	 */
	GridPane leftSettingBouttons(Button btRetour,Button btIntensite, Button btDeuxTasses) {
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(btRetour, 1, 0);
	leftSetting.add(btIntensite, 1, 1);
	leftSetting.add(btDeuxTasses, 0, 1);
	GridPane.setHalignment(btRetour, HPos.RIGHT);
	return leftSetting;
	}
	
	/**
	 * Cette function retourne les boutons du côté droit de l'interface graphique    
	 */ 
	GridPane rightSettingBouttons(Button btOk,Button btMenu, Button btSecuEnfant, Button btMl) {
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(btOk, 0, 0);
	rightSetting.add(btMenu, 1, 0);
	rightSetting.add(btSecuEnfant, 1, 1);
	rightSetting.add(btMl, 0, 1);
	return rightSetting;
	}
	
	/**
	 * Cette function retourne l'interface graphique de l'interface utilisateur    
	 */
	void userInterface(Stage stage, GridPane bandeauDeCommandes, HBox navBouton, GridPane leftSettingBouttons, GridPane rightSettingBouttons, Pane centralScreenText) {
	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSettingBouttons, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSettingBouttons, 2, 0);
	bandeauScreenText.setHgap(15);	
	
	//Ecran texte central de l'interface utilisateur
	VBox screen = new VBox(5);
	screen.setPadding(new Insets(15,15, 15, 15));
	screen.getChildren().addAll(bandeauDeCommandes,navBouton,bandeauScreenText);
	screen.setStyle("-fx-background-color: black");
	
	Scene scene = new Scene(screen,700,300);
	stage.setScene(scene);
	return;
	}
    
	/**
	 * Cette function configure et retourne l'ecran des messages qui s'affiche sur l'écran texte de l'interface utilisateur    
	 */
	void userInterfaceAlertMessage(Stage stage, GridPane bandeauDeCommandes, HBox navBouton, GridPane leftSettingBouttons, GridPane rightSettingBouttons, 
		Pane centralScreenText, Node node) {
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSettingBouttons, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSettingBouttons, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox screen = new VBox(5);
		screen.setPadding(new Insets(15,15, 15, 15));
		screen.getChildren().addAll(bandeauDeCommandes,navBouton,bandeauScreenText,node);
		screen.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(screen,700,300);
		stage.setScene(scene);
		return;
		}

	/**
	 * Cette function retourne l'écran texte central configuré de l'interface utilisateur    
	 */
	Pane centralScreenText(String background, int width) {
	Pane centralScreenText = new Pane();
	centralScreenText.setPrefWidth(width);
	String setStylevalue = "-fx-background-color: "+background;
	centralScreenText.setStyle(setStylevalue);
	return centralScreenText;
	}
	
	/**
	 * Cette function retourne le rectangle de l'interface utilisateur    
	 */
	Pane rectangle(Pane centralScreenText, int height, Color stroke, Color fill, int subtract, HBox line) {
		Pane pane = new StackPane();
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(height);
		rectangle.setStroke(stroke);
		rectangle.setFill(fill);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(subtract));
		pane.getChildren().addAll(rectangle, line);
		return pane;
	}
	
	/**
	 * Cette function retourne la partie centrale de l'interface graphique de l'interface utilisateur    
	 */
	VBox centralScreen(Node[] arg, double top, double bottom, double left, double right) {
		VBox centralScreen = new VBox();
		centralScreen.setPadding(new Insets(top, bottom, left, right));
		for (int i = 0; i < arg.length; ++i) {
			centralScreen.getChildren().add(arg[i]);
		}
		return centralScreen;
	}
	
	/**
	 * Cette function retourne les messages qui s'affiche sur l'écran texte de l'interface utilisateur    
	 */
	HBox message(String value, FontWeight fontweight) {
		 HBox message = new HBox(); 
		 Text messageText = new Text(getLangueBundle().getString(value));
		 messageText.setFont(Font.font("courier", fontweight, FontPosture.REGULAR, 12));
		 messageText.setTextAlignment(TextAlignment.CENTER);
		 message.getChildren().addAll(messageText);
		 message.setAlignment(Pos.CENTER);
		 return message;
	}
	
	public void displayOffState() {

		Pane centralScreenText = centralScreenText("black", 285);

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), btStartStop),
				navBouton(getEmptyButtonType3()),
				leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(),
						getEmptyButtonType2()),
				centralScreenText);
	}

	public void displayChoixLangueState(String langue) {

		setLangue(langue);
		this.langueBundle = this.langue == "nederland" ? bundleNL : this.langue == "english" ? bundleEN : bundleFR;
		
		HBox ligne1 = new HBox();
		Text ligne1Text = new Text("English");
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);

		HBox ligne2 = new HBox();
		Text ligne2Text = new Text("Nederland");
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox(8);
		Text ligne3Text = new Text("Français");
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne3.getChildren().addAll(ligne3Text, choixLangue);
		ligne3.setAlignment(Pos.CENTER);
        
		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text };
		String[] text = { "Français", "English", "Nederland" };

		int index = (langue == "francais" ? 1 : (langue == "english" ? 2 : 3));
		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(text[(i + index) % text.length]);
		}
		
		Pane centralScreenText = centralScreenText("lightgray", 285);
		Pane rectangle = rectangle(centralScreenText, 20, Color.BLACK, Color.LIGHTGRAY, 30, ligne3) ;
		centralScreenText.getChildren().add(centralScreen(new Pane[] {rectangle, ligne2, ligne1},25,15,15,15));

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), btStartStop),
				navBouton(btNav),
				leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(),
						getEmptyButtonType2()),
				centralScreenText);
	}

	public void displayLogoState(String value) {

		Button btnExpresso = value == "expresso" ? btExpresso : getEmptyButtonType1();
		Button btnExpressoMacch = value == "expressomacch" ? btExpressoMacch : getEmptyButtonType1();
		Button btnCafe = value == "cafe" ? btCafe : getEmptyButtonType1();
		Button btnCappuccino = value == "cappuccino" ? btCappuccino : getEmptyButtonType1();
		Button btnLatteMacchiato = value == "lattemacchiato" ? btLatteMacchiato : getEmptyButtonType1();
		Button btnCafeAuLait = value == "cafeaulait" ? btCafeAuLait : getEmptyButtonType1();
		Button btnMousseLait = value == "mousselait" ? btMousseLait : getEmptyButtonType1();
		Button btnBoissonSpeciales = (value == "specialDrink") ? btBoissonSpeciales : getEmptyButtonType1();
		Button btnStartStop = (value == "startstop") ? btStartStop : getEmptyButtonType1();

		HBox logo = new HBox();
		Text logoText = new Text("SIEMENS");
		logoText.setStroke(Color.BLACK);
		logoText.setFill(Color.CYAN);
		logoText.setFont(Font.font("time new romance", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 60));
		logo.getChildren().addAll(logoText);
		logo.setAlignment(Pos.CENTER);

		Pane centralScreenText = centralScreenText("white", 285);
		centralScreenText.getChildren().add(centralScreen(new Pane[] {logo},15,15,15,15));

		userInterface(this.stage,
				bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
						btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, btnStartStop),
				navBouton(getEmptyButtonType3()),
				leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(),
						getEmptyButtonType2()),
				centralScreenText);
	}
	
	private Button getEmptyButtonType1() {
		ImageView empty = new ImageView();
		empty.setFitHeight(66);
		empty.setFitWidth(55);
		Button btempty = new Button("", empty);
		btempty.setStyle("-fx-background-color: black");
		return btempty;

	}
	
	private Button getEmptyButtonType2() {
		ImageView empty = new ImageView();
		empty.setFitHeight(41);
		empty.setFitWidth(66);
		Button btempty = new Button("", empty);
		btempty.setStyle("-fx-background-color: black");
		return btempty;
	}
	
	private Button getEmptyButtonType3() {
		ImageView empty = new ImageView();
		empty.setFitHeight(17);
		empty.setFitWidth(27);
		Button btempty = new Button("", empty);
		btempty.setStyle("-fx-background-color: black");
		return btempty;
	}

	public void displayHeatingUpState(Long temperature) {
		
		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		HBox heating = new HBox();
		Text heatingText = new Text(getLangueBundle().getString("heatText") + " " + temperature + " °C");
		heatingText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12));
		heating.getChildren().addAll(heatingText);
		heating.setAlignment(Pos.CENTER);

		HBox action = new HBox();
		Text actionText = new Text(getLangueBundle().getString("actionHeatTextPlease"));
		actionText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12));
		action.getChildren().addAll(actionText);
		action.setAlignment(Pos.CENTER);

		HBox progressBar = new HBox();
		ProgressBar progressbar = new ProgressBar(temperature / 95.0);
		progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
		progressBar.getChildren().addAll(progressbar);
		progressBar.setAlignment(Pos.CENTER);

		centralScreenText.getChildren().add(centralScreen(new Node[] {new Text(""), heating, new Text(""), progressBar, action},5,5,5,5));

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(getEmptyButtonType3()),
				leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(),
						getEmptyButtonType2()),
				centralScreenText);
	}
	
	public void displayRincageState() {

		HBox action = new HBox();
		Text actionText = new Text(getLangueBundle().getString("rinsing"));
		actionText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12));
		action.getChildren().addAll(actionText);
		action.setAlignment(Pos.CENTER);

		HBox progressindicator = new HBox();
		ProgressIndicator progressIndicator = new ProgressIndicator();
		progressindicator.getChildren().addAll(progressIndicator);
		progressindicator.setAlignment(Pos.CENTER);
		
		Pane centralScreenText = centralScreenText("lightgray", 285);
        Pane rectangle = rectangle(centralScreenText, 60, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, progressindicator) ;
		centralScreenText.getChildren().add(centralScreen(new Node[] {rectangle, action},15,15,15,15));

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(getEmptyButtonType3()),
				leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(),
						getEmptyButtonType2()),
				centralScreenText);
	}

	public void displayNormalDrinkSelected(String value) {
        
		switchBoutons(value);
        
		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		HBox selectedDrink = new HBox();
		Text selectedDrinkText = new Text(
				deuxTasses ? ("2 " + getLangueBundle().getString(value)) : getLangueBundle().getString(value));
		selectedDrinkText.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
		selectedDrink.getChildren().addAll(selectedDrinkText);
		selectedDrink.setAlignment(Pos.CENTER);

		HBox boissonFav = new HBox();
		Text boissonFavText = new Text(
				getIsHandlingBoissonFav() ? (getLangueBundle().getString(getNumFavBoisson())) : "");
		boissonFavText.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
		boissonFav.getChildren().addAll(boissonFavText);
		boissonFav.setAlignment(Pos.CENTER);

		Boolean isIntensiteCafe = !(value == "eauchaude" || value == "mousselait" || value == "laitchaud");
		Text intensiteCafe = isIntensiteCafe ? new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()))
				: new Text();
		System.out.println(getIsTailleDeLaTasseMlValeurDifUsine() + " " + getTailleDeLaTasse());
		Text tailleDeLaTasse = new Text(220, 90,
				getIsHandlingBoissonFav() ? getLangueBundle().getString(getTailleDeLaTasse()) + "*"
						: (getIsTailleDeLaTasseMlValeurDifUsine()
								? (getLangueBundle().getString(getTailleDeLaTasse()) + "*")
								: getLangueBundle().getString(getTailleDeLaTasse())));
		intensiteCafe.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		tailleDeLaTasse.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		
        Pane rectangle = rectangle(centralScreenText, 60, Color.LIGHTGRAY, Color.LIGHTGRAY, 1, selectedDrink) ;


		if (getIsHandlingBoissonFav()) {
			centralScreenText.getChildren().addAll(centralScreen(new Node[] {boissonFav, rectangle},0,0,0,0),intensiteCafe, tailleDeLaTasse);
		} else {
			centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle},0,0,0,0),intensiteCafe, tailleDeLaTasse);
		}

		userInterface(this.stage,
				bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
						btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, btStartStop),
				navBouton(btNav), leftSettingBouttons(btRetour, btIntensite, btDeuxTasses),
				rightSettingBouttons(btOk, btMenu, btSecuEnfant, btMl), centralScreenText);
	}

	public void displayPreparationBoissonState(String value) {
		
		Button btnExpresso = value == "expresso" ? btExpressoSelected : getEmptyButtonType1();
		Button btnExpressoMacch = value == "expressomacch" ? btExpressoMacchSelected : getEmptyButtonType1();
		Button btnCafe = value == "cafe" ? btCafeSelected : getEmptyButtonType1();
		Button btnCappuccino = value == "cappuccino" ? btCappuccinoSelected : getEmptyButtonType1();
		Button btnLatteMacchiato = value == "lattemacchiato" ? btLatteMacchiatoSelected : getEmptyButtonType1();
		Button btnCafeAuLait = value == "cafeaulait" ? btCafeAuLaitSelected : getEmptyButtonType1();
		Button btnMousseLait = value == "mousselait" ? btMousseLaitSelected : getEmptyButtonType1();
		Button btnBoissonSpeciales = (value == "eauchaude" || value == "laitchaud" || value == "verseuse"
				|| value == "americano" || value == "flatwhite" || value == "cafecortado") ? btBoissonSpecialeSelected
						: getEmptyButtonType1();

		Pane centralScreenText = centralScreenText("lightgray", 285);

		if ((value == "expressomacch" || value == "cappuccino" || value == "lattemacchiato" || value == "cafeaulait"
				|| value == "flatwhite" || value == "cafecortado")) {
			HBox drink = new HBox();
			Text drinkText = new Text(
					deuxTasses ? ("2 " + getLangueBundle().getString(value)) : getLangueBundle().getString(value));
			drinkText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20));
			drinkText.setTextAlignment(TextAlignment.CENTER);
			drink.getChildren().addAll(drinkText);
			drink.setAlignment(Pos.CENTER);

			HBox action = new HBox();
			Text actionText = new Text(getLangueBundle().getString("annuler"));
			actionText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12));
			actionText.setTextAlignment(TextAlignment.CENTER);
			action.getChildren().addAll(actionText);
			action.setAlignment(Pos.CENTER);

			HBox progressBar = new HBox();
			ProgressBar progressbarlait = new ProgressBar(getProgressBarLait());
			ProgressBar progressbarcafe = new ProgressBar(getProgressBarCafe());
			progressBar.getChildren().addAll(progressbarlait, progressbarcafe);
			progressBar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
			progressBar.setAlignment(Pos.CENTER);

			centralScreenText.getChildren().addAll(centralScreen(new Node[] {drink, new Text(""), action, progressBar},5, 5, 5, 5));
			
		} else if (value == "expresso" || value == "cafe" || value == "verseuse" || value == "americano") {
			HBox drink = new HBox();
			Text drinkText = new Text(
					deuxTasses ? ("2 " + getLangueBundle().getString(value)) : getLangueBundle().getString(value));
			drinkText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20));
			drinkText.setTextAlignment(TextAlignment.CENTER);
			drink.getChildren().addAll(drinkText);
			drink.setAlignment(Pos.CENTER);

			HBox action = new HBox();
			Text actionText = new Text(getLangueBundle().getString("annuler"));
			actionText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12));
			actionText.setTextAlignment(TextAlignment.CENTER);
			action.getChildren().addAll(actionText);
			action.setAlignment(Pos.CENTER);

			HBox progressBar = new HBox();
			ProgressBar progressbar = new ProgressBar(getProgressBarCafe());
			progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
			progressBar.getChildren().addAll(progressbar);
			progressBar.setAlignment(Pos.CENTER);
			centralScreenText.getChildren().addAll(centralScreen(new Node[] {drink, new Text(""), action, progressBar},5, 5, 5, 5));

		} else if (value == "laitchaud" || value == "mousselait") {
			HBox drink = new HBox();
			Text drinkText = new Text(
					deuxTasses ? ("2 " + getLangueBundle().getString(value)) : getLangueBundle().getString(value));
			drinkText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20));
			drinkText.setTextAlignment(TextAlignment.CENTER);
			drink.getChildren().addAll(drinkText);
			drink.setAlignment(Pos.CENTER);

			HBox action = new HBox();
			Text actionText = new Text(getLangueBundle().getString("annuler"));
			actionText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12));
			actionText.setTextAlignment(TextAlignment.CENTER);
			action.getChildren().addAll(actionText);
			action.setAlignment(Pos.CENTER);

			HBox progressBar = new HBox();
			ProgressBar progressbar = new ProgressBar(getProgressBarLait());
			progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
			progressBar.getChildren().addAll(progressbar);
			progressBar.setAlignment(Pos.CENTER);
			
			centralScreenText.getChildren().addAll(centralScreen(new Node[] {drink, new Text(""), action, progressBar},5, 5, 5, 5));


		} else {
			HBox drink = new HBox();
			Text drinkText = new Text(
					deuxTasses ? ("2 " + getLangueBundle().getString(value)) : getLangueBundle().getString(value));
			drinkText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20));
			drinkText.setTextAlignment(TextAlignment.CENTER);
			drink.getChildren().addAll(drinkText);
			drink.setAlignment(Pos.CENTER);

			HBox action = new HBox();
			Text actionText = new Text(getLangueBundle().getString("annuler"));
			actionText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12));
			action.getChildren().addAll(actionText);
			action.setAlignment(Pos.CENTER);

			HBox progressBar = new HBox();
			ProgressBar progressbar = new ProgressBar(getProgressBarValue());
			progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
			progressBar.getChildren().addAll(progressbar);
			progressBar.setAlignment(Pos.CENTER);

			centralScreenText.getChildren().addAll(centralScreen(new Node[] {drink, new Text(""), action, progressBar},5, 5, 5, 5));
		}

		userInterface(this.stage,
				bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
						btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, btStartStop),
				navBouton(getEmptyButtonType3()),
				leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(),
						getEmptyButtonType2()),
				centralScreenText);
	}

	public void displayBoissonReadyState(String value) {

		Pane centralScreenText = centralScreenText("lightgray", 285);

		HBox boissonPrete = new HBox();
		Text boissonPreteText = new Text(
				getLangueBundle().getString("boissonPrete") + " " + getLangueBundle().getString(value));
		boissonPreteText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 12));
		boissonPrete.getChildren().addAll(boissonPreteText);
		boissonPrete.setAlignment(Pos.CENTER);
		
        Pane rectangle = rectangle(centralScreenText, 20, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, boissonPrete) ;

		HBox bssonPretImg = new HBox();
		ImageView boissonPreteImage = new ImageView(new Image("/images/coffeready.png"));
		boissonPreteImage.setFitHeight(66);
		boissonPreteImage.setFitWidth(55);
		bssonPretImg.getChildren().addAll(boissonPreteImage);
		bssonPretImg.setAlignment(Pos.CENTER);

		centralScreenText.getChildren().addAll(centralScreen(new Node[] {bssonPretImg, rectangle},5, 5, 5, 5));

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(getEmptyButtonType3()),
				leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(),
						getEmptyButtonType2()),
				centralScreenText);
	}

	public void displayMessageState(String value) {

		Button btnStartStop = (value == "boissonEnregistrerMessage") ? getEmptyButtonType1() : btStartStop;

		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		HBox message = new HBox();
		Text messageText = new Text(getLangueBundle().getString(value));
		messageText.setFont(Font.font("courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		message.getChildren().addAll(messageText);
		message.setAlignment(Pos.CENTER);
		
        Pane rectangle = rectangle(centralScreenText, 60, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, message) ;

		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle},15, 15, 15, 15));


		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), btnStartStop),
				navBouton(getEmptyButtonType3()),
				leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(),
						getEmptyButtonType2()),
				centralScreenText);
	}

	public void displayMenuState(String value) {

		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		HBox ligne1 = new HBox();
		Text ligne1Text = new Text(getLangueBundle().getString("nettoyageEntretien"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);

		HBox ligne2 = new HBox();
		Text ligne2Text = new Text(getLangueBundle().getString("reglerQteBoissons"));
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox();
		Text ligne3Text = new Text(getLangueBundle().getString("proportionLaitCafe"));
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);

		HBox ligne4 = new HBox();
		Text ligne4Text = new Text(getLangueBundle().getString("favori"));
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne4.getChildren().addAll(ligne4Text);
		ligne4.setAlignment(Pos.CENTER);

		HBox ligne5 = new HBox();
		Text ligne5Text = new Text(getLangueBundle().getString("dureteEau"));
		ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne5.getChildren().addAll(ligne5Text);
		ligne5.setAlignment(Pos.CENTER);

		HBox ligne6 = new HBox();
		Text ligne6Text = new Text(getLangueBundle().getString("arretAutomatique"));
		ligne6Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne6.getChildren().addAll(ligne6Text);
		ligne6.setAlignment(Pos.CENTER);

		HBox ligne7 = new HBox();
		Text ligne7Text = new Text(getLangueBundle().getString("temperatureCafe"));
		ligne7Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne7.getChildren().addAll(ligne7Text);
		ligne7.setAlignment(Pos.CENTER);

		HBox ligne8 = new HBox();
		Text ligne8Text = new Text(getLangueBundle().getString("filtreEau"));
		ligne8Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne8.getChildren().addAll(ligne8Text);
		ligne8.setAlignment(Pos.CENTER);

		HBox ligne9 = new HBox();
		Text ligne9Text = new Text(getLangueBundle().getString("langues"));
		ligne9Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne9.getChildren().addAll(ligne9Text);
		ligne9.setAlignment(Pos.CENTER);

		HBox ligne10 = new HBox();
		Text ligne10Text = new Text(getLangueBundle().getString("protectionContreGel"));
		ligne10Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne10.getChildren().addAll(ligne10Text);
		ligne10.setAlignment(Pos.CENTER);

		HBox ligne11 = new HBox(8);
		Text ligne11Text = new Text(getLangueBundle().getString("bipSonore"));
		ligne11Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne11.getChildren().addAll(ligne11Text);
		ligne11.setAlignment(Pos.CENTER);

		HBox ligne12 = new HBox(8);
		Text ligne12Text = new Text(getLangueBundle().getString("nbreBoissons"));
		ligne12Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne12.getChildren().addAll(ligne12Text);
		ligne12.setAlignment(Pos.CENTER);

		HBox ligne13 = new HBox(8);
		Text ligne13Text = new Text(getLangueBundle().getString("prereglagesUsine"));
		ligne13Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne13.getChildren().addAll(ligne13Text);
		ligne13.setAlignment(Pos.CENTER);

		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text, ligne4Text, ligne5Text, ligne6Text, ligne7Text,
				ligne8Text, ligne9Text, ligne10Text, ligne11Text, ligne12Text, ligne13Text };
		String[] text = { "nettoyageEntretien", "reglerQteBoissons", "proportionLaitCafe", "favori", "dureteEau",
				"arretAutomatique", "temperatureCafe", "filtreEau", "langues", "protectionContreGel", "bipSonore",
				"nbreBoissons", "prereglagesUsine" };
		
		int index = (value == "nettoyageEntretien" ? 1
				: (value == "reglerQteBoissons" ? 2
						: (value == "proportionLaitCafe" ? 3
								: (value == "favori" ? 4
										: (value == "dureteEau" ? 5
												: (value == "arretAutomatique" ? 6
														: (value == "temperatureCafe" ? 7
																: (value == "filtreEau" ? 8
																		: (value == "langues" ? 9
																				: (value == "protectionContreGel" ? 10
																						: (value == "bipSonore" ? 11
																								: (value == "nbreBoissons"
																										? 12
																										: 13))))))))))));
		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(getLangueBundle().getString(text[(i + index - 1) % text.length]));
		}
		
        Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne1) ;

		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne2, ligne3, ligne4, ligne5},15, 0, 0, 0));

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}

	public void displayChoixBoissonFavori(String value) {

        switchBoutons(value);

		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		HBox selectedDrink = new HBox();
		Text selectedDrinkText = (value == "selectBoisFav") ? new Text(getLangueBundle().getString(value))
				: new Text(
						deuxTasses ? ("2 " + getLangueBundle().getString(value)) : getLangueBundle().getString(value));
		selectedDrinkText.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20));
		selectedDrinkText.setTextAlignment(TextAlignment.CENTER);
		selectedDrink.getChildren().addAll(selectedDrinkText);
		selectedDrink.setAlignment(Pos.CENTER);

		HBox messageContinu1 = new HBox();
		Text messageContinu1Text = (value == "selectBoisFav") ? new Text()
				: new Text(getLangueBundle().getString("messageContinu1"));
		messageContinu1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		messageContinu1.getChildren().addAll(messageContinu1Text);
		messageContinu1.setAlignment(Pos.CENTER);

        Pane rectangle = rectangle(centralScreenText, 60, Color.LIGHTGRAY, Color.LIGHTGRAY, 1, selectedDrink) ;
		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, messageContinu1},0, 0, 0, 0));

		userInterface(this.stage,
				bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
						btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, getEmptyButtonType1()),
				navBouton(getEmptyButtonType3()), leftSettingBouttons(btRetour, getEmptyButtonType2(), btnDeuxTasses),
				rightSettingBouttons(btnOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}

	public void displaySelectTailleIntensiteBoissonFav(String value) {

        switchBoutons(value);
        
		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		HBox selectIntensiteTailleCafeMessage = message(getMessage(), FontWeight.BOLD); 

		Boolean isIntensiteCafe = !(value == "eauchaude" || value == "mousselait" || value == "laitchaud");

		Text intensiteCafe = isIntensiteCafe ? new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()))
				: new Text();
		Text tailleDeLaTasse = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		intensiteCafe.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		tailleDeLaTasse.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		
        Pane rectangle = rectangle(centralScreenText, 60, Color.LIGHTGRAY, Color.LIGHTGRAY, 1, selectIntensiteTailleCafeMessage) ;
		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle},0, 0, 0, 0),intensiteCafe,tailleDeLaTasse);

		userInterface(this.stage,
				bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
						btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, getEmptyButtonType1()),
				navBouton(getEmptyButtonType3()), leftSettingBouttons(btRetour, btIntensite, getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), btMl), centralScreenText);
	}
	
	public void displayTailleTasseBoissonFavMessage(String value) {
		switchBoutons(value);
				
		Pane centralScreenText = centralScreenText("lightgray", 285);		
		
		HBox selectIntensiteTailleCafeMessage = new HBox(); 
		Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
		selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
		selectIntensiteTailleCafeMessageText.setTextAlignment(TextAlignment.CENTER);
		selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
		selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);

	     Pane rectangle = rectangle(centralScreenText, 60, Color.LIGHTGRAY, Color.LIGHTGRAY, 1, selectIntensiteTailleCafeMessage) ;
		 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle},0, 0, 0, 0));
		
		 userInterface(this.stage,
					bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
							btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, getEmptyButtonType1()),
					navBouton(getEmptyButtonType3()), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}
	
	public void displaySelectTailleTasseBoissonFav(String value) {

		switchBoutons(value);

		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		HBox ligne1 = new HBox();
		Text ligne1Text = new Text("120 ml");
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);

		HBox ligne2 = new HBox();
		Text ligne2Text = new Text("140 ml");
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox();
		Text ligne3Text = new Text("160 ml");
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);

		HBox ligne4 = new HBox();
		Text ligne4Text = new Text("180 ml");
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne4.getChildren().addAll(ligne4Text);
		ligne4.setAlignment(Pos.CENTER);

		HBox ligne5 = new HBox();
		Text ligne5Text = new Text("200 ml");
		ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne5.getChildren().addAll(ligne5Text);
		ligne5.setAlignment(Pos.CENTER);

		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text, ligne4Text, ligne5Text };
		String[] text = { "120 ml", "140 ml", "160 ml", "180 ml", "200 ml" };

		int index = ((int) (double) getTailleTasseBoiFav() == 120 ? 1
				: ((int) (double) getTailleTasseBoiFav() == 140 ? 2
						: ((int) (double) getTailleTasseBoiFav() == 160 ? 3
								: ((int) (double) getTailleTasseBoiFav() == 180 ? 4 : 5))));
		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(text[(i + index - 1) % text.length]);
		}
		
        Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne1) ;
		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne2, ligne3},15, 0, 0, 0));

		userInterface(this.stage,
				bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
						btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, getEmptyButtonType1()),
				navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}
	
	public void displayTemperatureBoissonFavMessage(String value) {

		switchBoutons(value);

		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		HBox temperatureBoissonMessage = message(getMessage(),FontWeight.BOLD);

        Pane rectangle = rectangle(centralScreenText, 60, Color.LIGHTGRAY, Color.LIGHTGRAY, 1, temperatureBoissonMessage) ;
		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle},0, 0, 0, 0));

		userInterface(this.stage,
				bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
						btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, getEmptyButtonType1()),
				navBouton(getEmptyButtonType3()),
				leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}

	public void displaySelectTemperatureBoissonFav(String value) {
		
        switchBoutons(value);
	
		Pane centralScreenText = centralScreenText("lightgray", 285);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("haute"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		 
		HBox ligne2 = new HBox(); 
		Text ligne2Text = new Text(getLangueBundle().getString("maxi"));
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox(); 
		Text ligne3Text = new Text(getLangueBundle().getString("normale"));
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);
		
		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text };
		String[] text = { "haute", "maxi", "normale" };
		
		int index = (getTemperatureBoissonFav() == "haute" ? 1
				: (getTemperatureBoissonFav() == "maxi" ? 2 : 3));
		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(getLangueBundle().getString(text[(i + index - 1) % text.length]));
		}
		 
	     Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne1) ;
		 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne2,ligne3},15, 0, 0, 0));
		
		 userInterface(this.stage,
					bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
							btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, getEmptyButtonType1()),
					navBouton(btNav),
					leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
     }

	public void displayRatioLaitCafeFavMessage(String value) {
			switchBoutons(value);

			Pane centralScreenText = centralScreenText("lightgray", 285);
			
			HBox ratioLaitCafeFavMessage = message(getMessage(), FontWeight.BOLD);
			
	        Pane rectangle = rectangle(centralScreenText, 60, Color.LIGHTGRAY, Color.LIGHTGRAY, 1, ratioLaitCafeFavMessage) ;
			centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle},0, 0, 0, 0));

			userInterface(this.stage,
					bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
							btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, getEmptyButtonType1()),
					navBouton(getEmptyButtonType3()),
					leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()),
					centralScreenText);

		}

	public void displaySelectRatioLaitCafeFav(String value) {
			switchBoutons(value);

			Pane centralScreenText = centralScreenText("lightgray", 285);

			HBox ligne1 = new HBox();
			Text ligne1Text = new Text("50 %");
			ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
			ligne1.getChildren().addAll(ligne1Text);
			ligne1.setAlignment(Pos.CENTER);

			HBox ligne2 = new HBox();
			Text ligne2Text = new Text("60 %");
			ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
			ligne2.getChildren().addAll(ligne2Text);
			ligne2.setAlignment(Pos.CENTER);

			HBox ligne3 = new HBox();
			Text ligne3Text = new Text("70 %");
			ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
			ligne3.getChildren().addAll(ligne3Text);
			ligne3.setAlignment(Pos.CENTER);

			HBox ligne4 = new HBox();
			Text ligne4Text = new Text("80 %");
			ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
			ligne4.getChildren().addAll(ligne4Text);
			ligne4.setAlignment(Pos.CENTER);

			HBox ligne5 = new HBox();
			Text ligne5Text = new Text("90 %");
			ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
			ligne5.getChildren().addAll(ligne5Text);
			ligne5.setAlignment(Pos.CENTER);

			Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text, ligne4Text, ligne5Text };
			String[] text = { "50 %", "60 %", "70 %", "80 %", "90 %" };

			int index = ((int) (double) getRatioLaitCafe() == 50 ? 1
					: ((int) (double) getRatioLaitCafe() == 60 ? 2
							: ((int) (double) getRatioLaitCafe() == 70 ? 3
									: ((int) (double) getRatioLaitCafe() == 80 ? 4 : 5))));
			for (int i = 0; i < text.length; ++i) {
				ligneText[i].setText(text[(i + index - 1) % text.length]);
			}

	        Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne1) ;
			centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne2, ligne3},15, 0, 0, 0));

			userInterface(this.stage,
					bandeauDeCommandes(btnExpresso, btnExpressoMacch, btnCafe, btnCappuccino, btnLatteMacchiato,
							btnCafeAuLait, btnMousseLait, btnBoissonSpeciales, getEmptyButtonType1()),
					navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()),
					centralScreenText);

		}
	
	public void beepSound() {
        Media media = new Media(new File("src/main/resources/audio/beep-08b.wav").toURI().toString());  
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);
	}
	
	public void displayMenuNettoyageEtEntretien(String value) {

		Pane centralScreenText = centralScreenText("lightgray", 285);

		String[] text = { getLangueBundle().getString("nettoyerMousseurLait"), getLangueBundle().getString("nettoyer"),
				getLangueBundle().getString("detartrer"), getLangueBundle().getString("calcnClean"),
				getLangueBundle().getString("nettoyerDans") + ((30 - getNbreBoissons()) + " "),
				getLangueBundle().getString("detartrerDans")
						+ (" " + (getIsFilterPresent() ? 120 - getNbreBoissons() : 60 - getNbreBoissons()) + " ") };

		HBox ligne1 = new HBox();
		Text ligne1Text = new Text(text[0]);
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);

		HBox ligne2 = new HBox();
		Text ligne2Text = new Text(text[1]);
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox();
		Text ligne3Text = new Text(text[2]);
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);

		HBox ligne4 = new HBox();
		Text ligne4Text = new Text(text[3]);
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne4.getChildren().addAll(ligne4Text);
		ligne4.setAlignment(Pos.CENTER);

		HBox ligne5 = new HBox();
		Text ligne5Text = new Text(text[4]);
		ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne5.getChildren().addAll(ligne5Text);
		ligne5.setAlignment(Pos.CENTER);

		HBox ligne6 = new HBox();
		Text ligne6Text = new Text(text[5]);
		ligne6Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne6.getChildren().addAll(ligne6Text);
		ligne6.setAlignment(Pos.CENTER);

		HBox[] ligne = { ligne1, ligne2, ligne3, ligne4, ligne5, ligne6 };

		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text, ligne4Text, ligne5Text, ligne6Text };

		int index = (value == "nettoyerMousseurLait" ? 1
				: (value == "nettoyer" ? 2
						: (value == "detartrer" ? 3
								: (value == "calcnClean" ? 4 : (value == "nettoyerDans" ? 5 : 6)))));

		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(text[(i + index - 1) % text.length]);
			if (ligneText[i].getText() == text[4]) {
				ligne[i].getChildren().addAll(tasse1);
			} else if (ligneText[i].getText() == text[5]) {
				ligne[i].getChildren().addAll(tasse2);
			}
		}

        Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2]},15, 0, 0, 0));

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}

	public void displayReglageDureteDeLeau(String value) {

		Pane centralScreenText = centralScreenText("lightgray", 285);

		String[] text = { "dureteEau1", "dureteEau2", "dureteEau3", "dureteEau4" };

		HBox ligne1 = new HBox();
		Text ligne1Text = new Text(getLangueBundle().getString(text[0]));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);

		HBox ligne2 = new HBox();
		Text ligne2Text = new Text(getLangueBundle().getString(text[1]));
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox();
		Text ligne3Text = new Text(getLangueBundle().getString(text[2]));
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);

		HBox ligne4 = new HBox();
		Text ligne4Text = new Text(getLangueBundle().getString(text[3]));
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne4.getChildren().addAll(ligne4Text);
		ligne4.setAlignment(Pos.CENTER);

		HBox[] ligne = { ligne1, ligne2, ligne3, ligne4 };

		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text, ligne4Text };

		int index = (value == "dureteEau1" ? 1 : (value == "dureteEau2" ? 2 : (value == "dureteEau3" ? 3 : 4)));

		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(getLangueBundle().getString(text[(i + index) % text.length]));
			ligne[i].getChildren()
					.addAll(text[(i + index - 1) % text.length] == getDureteDeLeau() ? choixLangue : new ImageView());
		}

        Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2]},15, 0, 0, 0));

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);

	}
	
	public void displayReglageLangue(String value) {

		this.langueBundle = (getLangue() == "nederland") ? bundleNL
				: ((getLangue() == "english") ? bundleEN : bundleFR);

		Pane centralScreenText = centralScreenText("lightgray", 285);

		String[] text = { "english", "nederland", "francais" };

		HBox ligne1 = new HBox();
		Text ligne1Text = new Text(text[0]);
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		
		HBox ligne2 = new HBox();
		Text ligne2Text = new Text(getLangueBundle().getString(text[1]));
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox();
		Text ligne3Text = new Text(getLangueBundle().getString(text[2]));
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);

		HBox[] ligne = { ligne1, ligne2, ligne3 };

		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text };

		int index = (value == "english" ? 1 : (value == "nederland" ? 2 : 3));

		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(getLangueBundle().getString(text[(i + index - 1) % text.length]));
			ligne[i].getChildren()
					.addAll(text[(i + index - 1) % text.length] == getLangue() ? choixLangue : new ImageView());
		}

        Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
		centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2]},15, 0, 0, 0));

		userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}

	public void displayReglageQteBoisson(String value) {

		Pane centralScreenText = centralScreenText("lightgray", 285);

		String[] text = { "expressoPetit", "expressoMoyen", "expressoGrand", "expressomacchPetit", "expressomacchMoyen",
				"expressomacchGrand", "cafePetit", "cafeMoyen", "cafeGrand", "cappuccinoPetit", "cappuccinoMoyen",
				"cappuccinoGrand", "lattemacchiatoPetit", "lattemacchiatoMoyen", "lattemacchiatoGrand",
				"cafeaulaitPetit", "cafeaulaitMoyen", "cafeaulaitGrand", "mousselaitPetit", "mousselaitMoyen",
				"mousselaitGrand", "eauchaudePetit", "eauchaudeMoyen", "eauchaudeGrand", "laitchaudPetit",
				"laitchaudMoyen", "laitchaudGrand", "verseusePetit", "verseuseMoyen", "verseuseGrand", "americanoPetit",
				"americanoMoyen", "americanoGrand", "flatwhitePetit", "flatwhiteMoyen", "flatwhiteGrand",
				"cafecortadoPetit", "cafecortadoMoyen", "cafecortadoGrand" };

		HBox ligne1 = new HBox();
		Text ligne1Text = new Text(getLangueBundle().getString(text[0]));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);

		HBox ligne2 = new HBox();
		Text ligne2Text = new Text(getLangueBundle().getString(text[1]));
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox();
		Text ligne3Text = new Text(getLangueBundle().getString(text[2]));
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);

		HBox ligne4 = new HBox();
		Text ligne4Text = new Text(getLangueBundle().getString(text[3]));
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne4.getChildren().addAll(ligne4Text);
		ligne4.setAlignment(Pos.CENTER);

		HBox ligne5 = new HBox();
		Text ligne5Text = new Text(getLangueBundle().getString(text[4]));
		ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne5.getChildren().addAll(ligne5Text);
		ligne5.setAlignment(Pos.CENTER);

		HBox ligne6 = new HBox();
		Text ligne6Text = new Text(getLangueBundle().getString(text[5]));
		ligne6Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne6.getChildren().addAll(ligne6Text);
		ligne6.setAlignment(Pos.CENTER);

		HBox ligne7 = new HBox();
		Text ligne7Text = new Text(getLangueBundle().getString(text[6]));
		ligne7Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne7.getChildren().addAll(ligne7Text);
		ligne7.setAlignment(Pos.CENTER);

		HBox ligne8 = new HBox();
		Text ligne8Text = new Text(getLangueBundle().getString(text[7]));
		ligne8Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne8.getChildren().addAll(ligne8Text);
		ligne8.setAlignment(Pos.CENTER);

		HBox ligne9 = new HBox();
		Text ligne9Text = new Text(getLangueBundle().getString(text[8]));
		ligne9Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne9.getChildren().addAll(ligne9Text);
		ligne9.setAlignment(Pos.CENTER);

		HBox ligne10 = new HBox();
		Text ligne10Text = new Text(getLangueBundle().getString(text[9]));
		ligne10Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne10.getChildren().addAll(ligne10Text);
		ligne10.setAlignment(Pos.CENTER);

		HBox ligne11 = new HBox();
		Text ligne11Text = new Text(getLangueBundle().getString(text[10]));
		ligne11Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne11.getChildren().addAll(ligne11Text);
		ligne11.setAlignment(Pos.CENTER);

		HBox ligne12 = new HBox();
		Text ligne12Text = new Text(getLangueBundle().getString(text[11]));
		ligne12Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne12.getChildren().addAll(ligne12Text);
		ligne12.setAlignment(Pos.CENTER);

		HBox ligne13 = new HBox();
		Text ligne13Text = new Text(getLangueBundle().getString(text[12]));
		ligne13Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne13.getChildren().addAll(ligne13Text);
		ligne13.setAlignment(Pos.CENTER);

		HBox ligne14 = new HBox();
		Text ligne14Text = new Text(getLangueBundle().getString(text[13]));
		ligne14Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne14.getChildren().addAll(ligne14Text);
		ligne14.setAlignment(Pos.CENTER);

		HBox ligne15 = new HBox();
		Text ligne15Text = new Text(getLangueBundle().getString(text[14]));
		ligne15Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne15.getChildren().addAll(ligne15Text);
		ligne15.setAlignment(Pos.CENTER);

		HBox ligne16 = new HBox();
		Text ligne16Text = new Text(getLangueBundle().getString(text[15]));
		ligne16Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne16.getChildren().addAll(ligne16Text);
		ligne16.setAlignment(Pos.CENTER);

		HBox ligne17 = new HBox();
		Text ligne17Text = new Text(getLangueBundle().getString(text[16]));
		ligne17Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne17.getChildren().addAll(ligne17Text);
		ligne17.setAlignment(Pos.CENTER);

		HBox ligne18 = new HBox();
		Text ligne18Text = new Text(getLangueBundle().getString(text[17]));
		ligne18Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne18.getChildren().addAll(ligne18Text);
		ligne18.setAlignment(Pos.CENTER);

		HBox ligne19 = new HBox();
		Text ligne19Text = new Text(getLangueBundle().getString(text[18]));
		ligne19Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne19.getChildren().addAll(ligne19Text);
		ligne19.setAlignment(Pos.CENTER);

		HBox ligne20 = new HBox();
		Text ligne20Text = new Text(getLangueBundle().getString(text[19]));
		ligne20Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne20.getChildren().addAll(ligne20Text);
		ligne20.setAlignment(Pos.CENTER);

		HBox ligne21 = new HBox();
		Text ligne21Text = new Text(getLangueBundle().getString(text[20]));
		ligne21Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne21.getChildren().addAll(ligne21Text);
		ligne21.setAlignment(Pos.CENTER);

		HBox ligne22 = new HBox();
		Text ligne22Text = new Text(getLangueBundle().getString(text[21]));
		ligne22Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne22.getChildren().addAll(ligne22Text);
		ligne22.setAlignment(Pos.CENTER);

		HBox ligne23 = new HBox();
		Text ligne23Text = new Text(getLangueBundle().getString(text[22]));
		ligne23Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne23.getChildren().addAll(ligne23Text);
		ligne23.setAlignment(Pos.CENTER);

		HBox ligne24 = new HBox();
		Text ligne24Text = new Text(getLangueBundle().getString(text[23]));
		ligne24Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne24.getChildren().addAll(ligne24Text);
		ligne24.setAlignment(Pos.CENTER);

		HBox ligne25 = new HBox();
		Text ligne25Text = new Text(getLangueBundle().getString(text[24]));
		ligne25Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne25.getChildren().addAll(ligne25Text);
		ligne25.setAlignment(Pos.CENTER);

		HBox ligne26 = new HBox();
		Text ligne26Text = new Text(getLangueBundle().getString(text[25]));
		ligne26Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne26.getChildren().addAll(ligne26Text);
		ligne26.setAlignment(Pos.CENTER);

		HBox ligne27 = new HBox();
		Text ligne27Text = new Text(getLangueBundle().getString(text[26]));
		ligne27Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne27.getChildren().addAll(ligne27Text);
		ligne27.setAlignment(Pos.CENTER);

		HBox ligne28 = new HBox();
		Text ligne28Text = new Text(getLangueBundle().getString(text[27]));
		ligne28Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne28.getChildren().addAll(ligne28Text);
		ligne28.setAlignment(Pos.CENTER);

		HBox ligne29 = new HBox();
		Text ligne29Text = new Text(getLangueBundle().getString(text[28]));
		ligne29Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne29.getChildren().addAll(ligne29Text);
		ligne29.setAlignment(Pos.CENTER);

		HBox ligne30 = new HBox();
		Text ligne30Text = new Text(getLangueBundle().getString(text[29]));
		ligne30Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne30.getChildren().addAll(ligne30Text);
		ligne30.setAlignment(Pos.CENTER);

		HBox ligne31 = new HBox();
		Text ligne31Text = new Text(getLangueBundle().getString(text[30]));
		ligne31Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne31.getChildren().addAll(ligne31Text);
		ligne31.setAlignment(Pos.CENTER);

		HBox ligne32 = new HBox();
		Text ligne32Text = new Text(getLangueBundle().getString(text[31]));
		ligne32Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne32.getChildren().addAll(ligne31Text);
		ligne32.setAlignment(Pos.CENTER);

		HBox ligne33 = new HBox();
		Text ligne33Text = new Text(getLangueBundle().getString(text[32]));
		ligne33Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne33.getChildren().addAll(ligne33Text);
		ligne33.setAlignment(Pos.CENTER);

		HBox ligne34 = new HBox();
		Text ligne34Text = new Text(getLangueBundle().getString(text[33]));
		ligne34Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne34.getChildren().addAll(ligne34Text);
		ligne34.setAlignment(Pos.CENTER);

		HBox ligne35 = new HBox();
		Text ligne35Text = new Text(getLangueBundle().getString(text[34]));
		ligne35Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne35.getChildren().addAll(ligne35Text);
		ligne35.setAlignment(Pos.CENTER);

		HBox ligne36 = new HBox();
		Text ligne36Text = new Text(getLangueBundle().getString(text[35]));
		ligne36Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne36.getChildren().addAll(ligne36Text);
		ligne36.setAlignment(Pos.CENTER);

		HBox ligne37 = new HBox();
		Text ligne37Text = new Text(getLangueBundle().getString(text[36]));
		ligne37Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne37.getChildren().addAll(ligne37Text);
		ligne37.setAlignment(Pos.CENTER);

		HBox ligne38 = new HBox();
		Text ligne38Text = new Text(getLangueBundle().getString(text[37]));
		ligne38Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne38.getChildren().addAll(ligne38Text);
		ligne38.setAlignment(Pos.CENTER);

		HBox ligne39 = new HBox();
		Text ligne39Text = new Text(getLangueBundle().getString(text[38]));
		ligne39Text.setFont(Font.font("Courier", FontWeight.NORMAL, FontPosture.REGULAR, 12));
		ligne39.getChildren().addAll(ligne39Text);
		ligne39.setAlignment(Pos.CENTER);
		 
		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text,ligne4Text, ligne5Text, ligne6Text, ligne7Text, ligne8Text, ligne9Text, 
		ligne10Text, ligne11Text, ligne12Text, ligne13Text, ligne14Text, ligne15Text, ligne16Text, ligne17Text, ligne18Text, ligne19Text, 
		ligne20Text, ligne21Text, ligne22Text, ligne23Text, ligne24Text, ligne25Text, ligne26Text, ligne27Text, ligne28Text, ligne29Text, 
		ligne30Text, ligne31Text, ligne32Text, ligne33Text, ligne34Text, ligne35Text, ligne36Text, ligne37Text, ligne38Text, ligne39Text };

		int index = (value == text[0] ? 1 : (value == text[1] ? 2 : (value == text[2] ? 3 :(value == text[3] ? 4 :
			 (value == text[4] ? 5 :(value == text[5] ? 6 :(value == text[6] ? 7 :(value == text[7] ? 8 :
				 (value == text[8] ? 9 :(value == text[9] ? 10 :(value == text[10] ? 11 :(value == text[11] ? 12 :
					 (value == text[12] ? 13 :(value == text[13] ? 14 :(value == text[14] ? 15 :(value == text[15] ? 16 :
						 (value == text[16] ? 17 :(value == text[17] ? 18 :(value == text[18] ? 19 :(value == text[19] ? 20 :
							 (value == text[20] ? 21 :(value == text[21] ? 22 :(value == text[22] ? 23 :(value == text[23] ? 24 :
								 (value == text[24] ? 25 :(value == text[25] ? 26 :(value == text[26] ? 27 :(value == text[27] ? 28 :
									 (value == text[28] ? 29 :(value == text[29] ? 30 :(value == text[30] ? 31 :(value == text[31] ? 32 :
										 (value == text[32] ? 33 :(value == text[33] ? 34 :(value == text[34] ? 35 :(value == text[35] ? 36 :
											 (value == text[36] ? 37 :(value == text[37] ? 38 :(39)))))))))))))))))))))))))))))))))))))));

		 for (int i = 0; i < text.length; ++i) {
				ligneText[i].setText(getLangueBundle().getString(text[(i + index -1) % text.length]));
		 }
		 
	     Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne1) ;
		 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne2, ligne3, ligne4, ligne5},15, 0, 0, 0));
		
		 userInterface(this.stage,
					bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1()),
					navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}
	
	public void displayReglageQteBoissonPetit(Long value) {		
		
		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		String[] text = { "20 ml ", "25 ml ", "30 ml " };
				 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(text[0]);
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		 
		HBox ligne2 = new HBox(); 
		Text ligne2Text = new Text(text[1]);
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox(); 
		Text ligne3Text = new Text(text[2]);
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);
		
		HBox[] ligne = { ligne1, ligne2, ligne3 };

		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text };

		int index = ((int)(double)value == 20 ? 1 : ((int)(double)value == 25 ? 2 : 3));
		
		String tailleTasse = (getTailleTasseBoiFav()==20?text[0]:(getTailleTasseBoiFav()==25?text[1]:text[2]));

		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(text[(i + index - 1) % text.length]);
			ligne[i].getChildren()
					.addAll(text[(i + index - 1) % text.length] == tailleTasse? choixLangue : new ImageView());
		}
	
		Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
	    centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2]},15, 0, 0, 0));
		
		userInterface(this.stage,
					bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1()),
					navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}
	public void displayReglageQteBoissonMoyen(Long value) {
		
		Pane centralScreenText = centralScreenText("lightgray", 285);
	
		String[] text = { "35 ml ", "40 ml ", "45 ml " };
			
			HBox ligne1 = new HBox(); 
			Text ligne1Text = new Text(text[0]);
			ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne1.getChildren().addAll(ligne1Text);
			ligne1.setAlignment(Pos.CENTER);
			
			HBox ligne2 = new HBox(); 
			Text ligne2Text = new Text(text[1]);
			ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne2.getChildren().addAll(ligne2Text);
			ligne2.setAlignment(Pos.CENTER);

			HBox ligne3 = new HBox(); 
			Text ligne3Text = new Text(text[2]);
			ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne3.getChildren().addAll(ligne3Text);
			ligne3.setAlignment(Pos.CENTER);
			
			HBox[] ligne = { ligne1, ligne2, ligne3 };

			Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text };

			int index = ((int)(double)value == 35 ? 1 : ((int)(double)value == 40 ? 2 : 3));
			
			String tailleTasse = (getTailleTasseBoiFav()==35?text[0]:(getTailleTasseBoiFav()==40?text[1]:text[2]));

			for (int i = 0; i < text.length; ++i) {
				ligneText[i].setText(text[(i + index - 1) % text.length]);
				ligne[i].getChildren()
						.addAll(text[(i + index - 1) % text.length] == tailleTasse? choixLangue : new ImageView());
			}
			
		    Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
			centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2]},15, 0, 0, 0));
			
			 userInterface(this.stage,
						bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
								getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
								getEmptyButtonType1(), getEmptyButtonType1()),
						navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
						rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
		}
	
	public void displayReglageQteBoissonGrand(Long value) {
		
		Pane centralScreenText = centralScreenText("lightgray", 285);
		//Pane pane = new StackPane();
		
		String[] text = { "120 ml ", "140 ml ", "160 ml ", "180 ml ", "200 ml " };
			 
			HBox ligne1 = new HBox(); 
			Text ligne1Text = new Text(text[0]);
			ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne1.getChildren().addAll(ligne1Text);
			ligne1.setAlignment(Pos.CENTER);
			 
			HBox ligne2 = new HBox(); 
			Text ligne2Text = new Text(text[1]);
			ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne2.getChildren().addAll(ligne2Text);
			ligne2.setAlignment(Pos.CENTER);

			HBox ligne3 = new HBox(); 
			Text ligne3Text = new Text(text[2]);
			ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne3.getChildren().addAll(ligne3Text);
			ligne3.setAlignment(Pos.CENTER);
			
			HBox ligne4 = new HBox(); 
			Text ligne4Text = new Text(text[3]);
			ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne4.getChildren().addAll(ligne4Text);
			ligne4.setAlignment(Pos.CENTER);
			
			HBox ligne5 = new HBox(); 
			Text ligne5Text = new Text(text[4]);
			ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne5.getChildren().addAll(ligne5Text);
			ligne5.setAlignment(Pos.CENTER);
			
			HBox[] ligne = { ligne1, ligne2, ligne3, ligne4, ligne5 };

			Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text, ligne4Text, ligne5Text };

			int index = ((int)(double)value == 120 ? 1 : ((int)(double)value == 140 ? 2 : ((int)(double)value == 160 ? 3 : ((int)(double)value == 180 ? 4 : 5))));
			
			String tailleTasse = (getTailleTasseBoiFav()==120?text[0]:(getTailleTasseBoiFav()==140?text[1]:
				(getTailleTasseBoiFav()==160?text[2]:(getTailleTasseBoiFav()==180?text[3]:text[4]))));

			for (int i = 0; i < text.length; ++i) {
				ligneText[i].setText(text[(i + index - 1) % text.length]);
				ligne[i].getChildren()
						.addAll(text[(i + index - 1) % text.length] == tailleTasse? choixLangue : new ImageView());
			}
			
		     Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
			 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2], ligne[3]},15, 0, 0, 0));
			
			
			 userInterface(this.stage,
						bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
								getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
								getEmptyButtonType1(), getEmptyButtonType1()),
						navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
						rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
		}
	
	public void displayReglageProportionLaitCafe(String value) {
				
		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		String[] text = { "expressomacch", "lattemacchiato", "cappuccino", "cafeaulait", "flatwhite", "cafecortado" };
				 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString(text[0]));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString(text[1]));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne2.getChildren().addAll(ligne2Text);
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString(text[2]));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text);
		 ligne3.setAlignment(Pos.CENTER);
		 
		 HBox ligne4 = new HBox(); 
		 Text ligne4Text = new Text(getLangueBundle().getString(text[3]));
		 ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne4.getChildren().addAll(ligne4Text);
		 ligne4.setAlignment(Pos.CENTER);
		 
		 HBox ligne5 = new HBox(); 
		 Text ligne5Text = new Text(getLangueBundle().getString(text[4]));
		 ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne5.getChildren().addAll(ligne5Text);
		 ligne5.setAlignment(Pos.CENTER);
		 
		 HBox ligne6 = new HBox(); 
		 Text ligne6Text = new Text(getLangueBundle().getString(text[5]));
		 ligne6Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne6.getChildren().addAll(ligne6Text);
		 ligne6.setAlignment(Pos.CENTER);
		 
		 Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text, ligne4Text, ligne5Text, ligne5Text };

		 int index = (value == text[0] ? 1 : (value == text[1] ? 2 : (value == text[2] ? 3 : (value == text[3] ? 4 : (value == text[4] ? 5 : (6))))));	

		 for (int i = 0; i < text.length; ++i) {
				ligneText[i].setText(getLangueBundle().getString(text[(i + index - 1) % text.length]));
		 }

	     Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne1) ;
		 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne2, ligne3, ligne4, ligne5},15, 0, 0, 0));
		
		 userInterface(this.stage,
					bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1()),
					navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
	}
	
	public void displayProportionLaitCafe(Long value) {
		
		Pane centralScreenText = centralScreenText("lightgray", 285);
		
		String[] text = { "50 %  ", "60 %  ", "70 %  ", "80 %  ", "90 %  " };
				
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(text[0]);
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		
		HBox ligne2 = new HBox(); 
		Text ligne2Text = new Text(text[1]);
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox(); 
		Text ligne3Text = new Text(text[2]);
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);
		
		HBox ligne4 = new HBox(); 
		Text ligne4Text = new Text(text[3]);
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne4.getChildren().addAll(ligne4Text);
		ligne4.setAlignment(Pos.CENTER);
		
		HBox ligne5 = new HBox(); 
		Text ligne5Text = new Text(text[4]);
		ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne5.getChildren().addAll(ligne5Text);
		ligne5.setAlignment(Pos.CENTER);
		
		HBox[] ligne = { ligne1, ligne2, ligne3, ligne4, ligne5 };

		Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text, ligne4Text, ligne5Text };

		int index = ((int)(double)value == 50 ? 1 : ((int)(double)value == 60 ? 2 : ((int)(double)value == 70 ? 3 : ((int)(double)value == 80 ? 4 : (5)))));
		
		String ratioLaitCafe = (getRatioLaitCafe()==50?text[0]:(getRatioLaitCafe()==60?text[1]:
			(getRatioLaitCafe()==70?text[2]:(getRatioLaitCafe()==80?text[3]:text[4]))));

		for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(text[(i + index - 1) % text.length]);
			ligne[i].getChildren()
					.addAll(text[(i + index - 1) % text.length] == ratioLaitCafe? choixLangue : new ImageView());
		}
				 
	     Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
		 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2],ligne[3],ligne[4]},15, 0, 0, 0));
		
		 userInterface(this.stage,
					bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1()),
					navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);

	}


 public void displayReglageTemperatureBoisson(String value) {
				
	    Pane centralScreenText = centralScreenText("lightgray", 285);
	    
	    String[] text = { "normale", "haute", "maxi" };
	    
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString(text[0]));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);

		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString(text[1]));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
    	 ligne2.getChildren().addAll(ligne2Text);
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString(text[2]));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text);
		 ligne3.setAlignment(Pos.CENTER);
		 
		 HBox[] ligne = { ligne1, ligne2, ligne3 };

		 Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text };

		 int index = (value == text[0] ? 1 : (value == text[1] ? 2 : 3));
			
		 for (int i = 0; i < text.length; ++i) {
				ligneText[i].setText(getLangueBundle().getString(text[(i + index - 1) % text.length]));
				ligne[i].getChildren()
						.addAll(new Text(" "),text[(i + index - 1) % text.length] == getTemperatureBoissonFav()? choixLangue : new ImageView());
		 }
		 	
		 Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
		 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2]},15, 0, 0, 0));
		 
		
		 userInterface(this.stage,
					bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
							getEmptyButtonType1(), getEmptyButtonType1()),
					navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
					rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);

	}

 public void displayReglageArretAutomatique(String value) {
	
    Pane centralScreenText = centralScreenText("lightgray", 285);
	
	String[] text = { "30minutes", "1heure", "2heures" };
		 
	HBox ligne1 = new HBox(); 
	Text ligne1Text = new Text(getLangueBundle().getString(text[0]));
	ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	ligne1.getChildren().addAll(ligne1Text);
	ligne1.setAlignment(Pos.CENTER);

	 
	 HBox ligne2 = new HBox(); 
	 Text ligne2Text = new Text(getLangueBundle().getString(text[1]));
	 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 ligne2.getChildren().addAll(ligne2Text);
	 ligne2.setAlignment(Pos.CENTER);
	 
	 HBox ligne3 = new HBox(); 
	 Text ligne3Text = new Text(getLangueBundle().getString(text[2]));
	 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 ligne3.getChildren().addAll(ligne3Text);
	 ligne3.setAlignment(Pos.CENTER);
	 
	 HBox[] ligne = { ligne1, ligne2, ligne3 };

	 Text[] ligneText = { ligne1Text, ligne2Text, ligne3Text };

	 int index = (value == text[0] ? 1 : (value == text[1] ? 2 : 3));
		
	 for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(getLangueBundle().getString(text[(i + index - 1) % text.length]));
			ligne[i].getChildren()
					.addAll(new Text(" "),text[(i + index - 1) % text.length] == getTempsArretAutomatique()? choixLangue : new ImageView());
	 }
	 		 	 
     Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
	 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1], ligne[2]},15, 0, 0, 0));
	
	 userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
   }
 
 public void displayReglageFiltreEau(String value) {		
	
	Pane centralScreenText = centralScreenText("lightgray", 285);
    
	String[] text = { "pasDeFiltre", "filtre" };
	 
	HBox ligne1 = new HBox(); 
	Text ligne1Text = new Text(getLangueBundle().getString(text[0]));
	ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	ligne1.getChildren().addAll(ligne1Text);
	ligne1.setAlignment(Pos.CENTER);

	 
	 HBox ligne2 = new HBox(); 
	 Text ligne2Text = new Text(getLangueBundle().getString(text[1]));
	 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 ligne2.getChildren().addAll(ligne2Text);
	 ligne2.setAlignment(Pos.CENTER);
	 
	 HBox[] ligne = { ligne1, ligne2 };

	 Text[] ligneText = { ligne1Text, ligne2Text };

	 int index = (value == text[0] ? 1 : (value == text[1] ? 2 : 3));
		
	 for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(getLangueBundle().getString(text[(i + index - 1) % text.length]));
			if (text[(i + index - 1) % text.length] == text[0] && !getIsFilterPresent()) {
				ligne[i].getChildren().addAll(new Text(" "), choixLangue);
			}else if (text[(i + index - 1) % text.length] == text[1] && getIsFilterPresent()) {
				ligne[i].getChildren().addAll(new Text(" "), choixLangue);
			}
		 }
	 		 
     Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
	 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1]},15, 0, 0, 0));
	
	 userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
 }

 public void displayReglageBipsonore(String value) {
	 
	Pane centralScreenText = centralScreenText("lightgray", 285);
	    
	String[] text = { "bipActiver", "bipDesactiver" };
		 
	HBox ligne1 = new HBox(); 
	Text ligne1Text = new Text(getLangueBundle().getString(text[0]));
	ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	ligne1.getChildren().addAll(ligne1Text);
	ligne1.setAlignment(Pos.CENTER);

	 
	 HBox ligne2 = new HBox(); 
	 Text ligne2Text = new Text(getLangueBundle().getString(text[1]));
	 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 ligne2.getChildren().addAll(ligne2Text);
	 ligne2.setAlignment(Pos.CENTER);
	 
	 HBox[] ligne = { ligne1, ligne2 };

	 Text[] ligneText = { ligne1Text, ligne2Text };

	 int index = (value == text[0] ? 1 : (value == text[1] ? 2 : 3));
		
	 for (int i = 0; i < text.length; ++i) {
			ligneText[i].setText(getLangueBundle().getString(text[(i + index - 1) % text.length]));
			if (text[(i + index - 1) % text.length] == text[0] && getBipSonore()) {
				ligne[i].getChildren().addAll(new Text(" "), choixLangue);
			}else if (text[(i + index - 1) % text.length] == text[1] && !getBipSonore()) {
				ligne[i].getChildren().addAll(new Text(" "), choixLangue);
			}
		 }
	 		 
     Pane rectangle = rectangle(centralScreenText, 20, Color.WHITE, Color.WHITE, 1, ligne[0]) ;
	 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, ligne[1]},15, 0, 0, 0));
	
	 userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(btNav), leftSettingBouttons(btRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btOk, btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
 }

 public void displayProgMaintCalcNclean(String value) {
	 
	Button btnStartStop = (value=="step0"||value=="step2"||value=="step3"||value=="step4"||value=="step6")?btStartStop:getEmptyButtonType1();
	Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
	Button btnOk = (value=="step1"||value=="step9")?btOk:getEmptyButtonType1();

	Pane centralScreenText = centralScreenText("lightgray", 300);
	 
	 HBox message = message(getMessage(), FontWeight.NORMAL); 
	 
	 ProgressBar[] barDeProgression = { new ProgressBar(0),new ProgressBar(0),new ProgressBar(0),new ProgressBar(0),new ProgressBar(0),
			 new ProgressBar(0),new ProgressBar(0),new ProgressBar(0),new ProgressBar(0) };
	 
	 String step = (value=="step1"?"1":(value=="step2"?"2":(value=="step3"?"3":(value=="step4"?"4":(value=="step5"?"5":
		 (value=="step6"?"6":(value=="step7"?"7":(value=="step8"?"8":("9")))))))));
	 
	 int index = (value=="step1"?1:(value=="step2"?2:(value=="step3"?3:(value=="step4"?4:(value=="step5"?5:(value=="step6"?6:
		 (value=="step7"?7:(value=="step8"?8:(9)))))))));
	 
     for (int i=1; i<= index;++i) {
    	 barDeProgression[i-1].setProgress(1);
     }
     
	    HBox progressBar = new HBox(); 
		progressBar.setMaxWidth(285);
		progressBar.getChildren().addAll(barDeProgression[0],barDeProgression[1],barDeProgression[2],barDeProgression[3],barDeProgression[4],
		barDeProgression[5],barDeProgression[6],barDeProgression[7],barDeProgression[8],new Text("  "+step+"/9 "));
		progressBar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
		progressBar.setAlignment(Pos.CENTER);
	
	 Pane rectangle = rectangle(centralScreenText, 80, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, message) ;
	 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, value!="step0"?progressBar:new Text()},15, 15, 15, 15));
	 
	 userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), btnStartStop),
				navBouton(getEmptyButtonType3()), leftSettingBouttons(btnRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btnOk, getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
 }
 
 public void displayProgMaintDetartrage(String value) {
	 
	Button btnStartStop = (value=="step0"||value=="step2"||value=="step3"||value=="step5"||(value=="step1"&&getIsFilterPresent()))?btStartStop:getEmptyButtonType1();
	Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
	Button btnOk = (value=="step1"||value=="step7")?btOk:getEmptyButtonType1();
	
	Pane centralScreenText = centralScreenText("lightgray", 300);
	
	HBox message = message(getMessage(), FontWeight.NORMAL); 
	
	 ProgressBar[] barDeProgression = { new ProgressBar(0),new ProgressBar(0),new ProgressBar(0),new ProgressBar(0),new ProgressBar(0),
			 new ProgressBar(0),new ProgressBar(0) };
	 
	 String step = (value=="step1"?"1":(value=="step2"?"2":(value=="step3"?"3":(value=="step4"?"4":(value=="step5"?"5":
		 (value=="step6"?"6":(("7"))))))));
	 
	 int index = (value=="step1"?1:(value=="step2"?2:(value=="step3"?3:(value=="step4"?4:(value=="step5"?5:(value=="step6"?6:(7)))))));
	 
     for (int i=1; i<= index;++i) {
    	 barDeProgression[i-1].setProgress(1);
     }
     
	    HBox progressBar = new HBox(); 
		progressBar.setMaxWidth(285);
		progressBar.getChildren().addAll(barDeProgression[0],barDeProgression[1],barDeProgression[2],barDeProgression[3],
		barDeProgression[4],barDeProgression[5],barDeProgression[6],new Text("  "+step+"/7 "));
		progressBar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
		progressBar.setAlignment(Pos.CENTER);

	 Pane rectangle = rectangle(centralScreenText, 80, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, message) ;
	 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, value!="step0"?progressBar:new Text()},15, 15, 15, 15));
	 
	 userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), btnStartStop),
				navBouton(getEmptyButtonType3()), leftSettingBouttons(btnRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btnOk, getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
 
 }

 public void displayProgMaintNettoyage(String value) {
	 
	Button btnStartStop = (value=="step0"||value=="step2")?btStartStop:getEmptyButtonType1();
	Button btnOk = (value=="step1"||value=="step4")?btOk:getEmptyButtonType1();
	Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
	
	Pane centralScreenText = centralScreenText("lightgray", 300);
	 
	HBox message = message(getMessage(), FontWeight.NORMAL); 
  	 
    HBox progressBar = new HBox(); 
	ProgressBar progressbar=new ProgressBar(getProgressBarValue());
	progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
	progressBar.getChildren().addAll(progressbar);
	progressBar.setAlignment(Pos.CENTER);
		
	Pane rectangle = rectangle(centralScreenText, 80, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, message) ;
	centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, value=="step3"?progressBar:new Text()},5, 5, 5, 5));

	 userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), btnStartStop),
				navBouton(getEmptyButtonType3()), leftSettingBouttons(btnRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(btnOk, getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
 }

 
 public void displayProgMaintMousseLait(String value) {
	 
	Button btnStartStop = (value=="step0"||value=="step1")?btStartStop:getEmptyButtonType1();
	Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
		
	Pane centralScreenText = centralScreenText("lightgray", 300);

	HBox message = message(getMessage(), FontWeight.NORMAL);   
	
    HBox progressBar = new HBox(); 
	ProgressBar progressbar=new ProgressBar(getProgressBarValue());
	progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
	progressBar.getChildren().addAll(progressbar);
	progressBar.setAlignment(Pos.CENTER);
	
	 Pane rectangle = rectangle(centralScreenText, 80, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, message) ;
	 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle, value=="step2"?progressBar:new Text()},5, 5, 5, 5));

	 userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), btnStartStop),
				navBouton(getEmptyButtonType3()), leftSettingBouttons(btnRetour, getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);
 }
	
 public void displayAlertMessage(String value) {
	 
	if(value=="alertActionMessage1") {
	btFiltreRemplacer.setText(getLangueBundle().getString("filtreRemplacer"));
	}else if(value=="alertActionMessage2") {
    btReservoirEauRempli.setText(getLangueBundle().getString("reservoirEauRempli"));
	}else if(value=="alertActionMessage3") {
	btBacCollecteurVider.setText(getLangueBundle().getString("bacCollecteurVider"));
	}else if(value=="alertActionMessage4") {
	btReservoirGrainsRempli.setText(getLangueBundle().getString("reservoirGrainsRempli"));
	}
	
	
	Pane centralScreenText = centralScreenText("lightgray", 300);
	HBox message = message(value, FontWeight.NORMAL);  

	Pane rectangle = rectangle(centralScreenText, 40, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, message) ;
	centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle},5, 5, 5, 5));
	
	GridPane basdEcran = new GridPane();
	basdEcran.add(value=="alertActionMessage1"?btFiltreRemplacer:(value=="alertActionMessage2"?btReservoirEauRempli:
	(value=="alertActionMessage3"?btBacCollecteurVider:(btReservoirGrainsRempli))), 0, 0);
	
	userInterfaceAlertMessage(this.stage,
			bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
					getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
					getEmptyButtonType1(), getEmptyButtonType1()),
			navBouton(getEmptyButtonType3()), leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
			rightSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText,basdEcran);

 }
 public void displayAttenteActionMessage(String value) {
	
	Pane centralScreenText = centralScreenText("lightgray", 300);
	HBox message = message(value, FontWeight.NORMAL); 
	 
	 Pane rectangle = rectangle(centralScreenText, 40, Color.LIGHTGRAY, Color.LIGHTGRAY, 30, message) ;
	 centralScreenText.getChildren().addAll(centralScreen(new Node[] {rectangle},5, 5, 5, 5));

	 userInterface(this.stage,
				bandeauDeCommandes(getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(), getEmptyButtonType1(),
						getEmptyButtonType1(), getEmptyButtonType1()),
				navBouton(getEmptyButtonType3()), leftSettingBouttons(getEmptyButtonType2(), getEmptyButtonType2(), getEmptyButtonType2()),
				rightSettingBouttons(getEmptyButtonType2(), btMenu, getEmptyButtonType2(), getEmptyButtonType2()), centralScreenText);

 }

 
 	public Button getBtStartStop(){
		return btStartStop;
	}
	
	public Button getBtNav() {
		return btNav;
	}
	
	public ResourceBundle getLangueBundle() {
		return langueBundle;
	}

	public void setLangueBundle(ResourceBundle langueBundle) {
		this.langueBundle = langueBundle;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Button getBtExpresso() {
		return btExpresso;
	}

	public Button getBtExpressoMacch() {
		return btExpressoMacch;
	}

	public Button getBtCafe() {
		return btCafe;
	}

	public Button getBtCappuccino() {
		return btCappuccino;
	}

	public Button getBtLatteMacchiato() {
		return btLatteMacchiato;
	}

	public Button getBtCafeAuLait() {
		return btCafeAuLait;
	}

	public Button getBtMousseLait() {
		return btMousseLait;
	}

	public Button getBtBoissonSpeciales() {
		return btBoissonSpeciales;
	}
	
	public Button getBtBoissonSpecialeSelected() {
		return btBoissonSpecialeSelected ;
	}
	
	public Button getBtBacCollecteurVider() {
		return btBacCollecteurVider;
	}
	public Button getBtFiltreRemplacer() {
		return btFiltreRemplacer;
	}

	public Button getBtReservoirEauRempli() {
		return btReservoirEauRempli;
	}

	public Button getBtReservoirGrainsRempli() {
		return btReservoirGrainsRempli;
	}

	public Button getBtMenu() {
		return btMenu;
	}

	public Button getBtOk() {
		return btOk;
	}

	public Button getBtSecuEnfant() {
		return btSecuEnfant;
	}

	public Button getBtMl() {
		return btMl;
	}

	public Button getBtRetour() {
		return btRetour;
	}

	public Button getBtIntensite() {
		return btIntensite;
	}

	public Button getBtDeuxTasses() {
		return btDeuxTasses;
	}

	public String getIntensiteDucafe() {
		return intensiteDucafe;
	}

	public String getTailleDeLaTasse() {
		return tailleDeLaTasse;
	}

	public void setIntensiteDucafe(String intensiteDucafe) {
		this.intensiteDucafe = intensiteDucafe;
	}

	public void setTailleDeLaTasse(String tailleDeLaTasse) {
		this.tailleDeLaTasse = tailleDeLaTasse;
	}

	public Long getTailleTasseBoiFav() {
		return tailleTasseBoiFav;
	}

	public void setTailleTasseBoiFav(Long tailleTasseBoiFav) {
		this.tailleTasseBoiFav = tailleTasseBoiFav;
	}

	public Long getNbreBoissons() {
		return nbreBoissons;
	}

	public void setNbreBoissons(Long nbreBoissons) {
		this.nbreBoissons = nbreBoissons;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTemperatureBoissonFav() {
		return temperatureBoissonFav;
	}

	public void setTemperatureBoissonFav(String temperatureBoissonFav) {
		this.temperatureBoissonFav = temperatureBoissonFav;
	}

	public String getDureteDeLeau() {
		return dureteDeLeau;
	}

	public void setDureteDeLeau(String dureteDeLeau) {
		this.dureteDeLeau = dureteDeLeau;
	}

	public String getNumFavBoisson() {
		return numFavBoisson;
	}

	public void setNumFavBoisson(String numFavBoisson) {
		this.numFavBoisson = numFavBoisson;
	}

	public Boolean getIsHandlingBoissonFav() {
		return isHandlingBoissonFav;
	}

	public void setIsHandlingBoissonFav(Boolean isHandlingBoissonFav) {
		this.isHandlingBoissonFav = isHandlingBoissonFav;
	}

	public Boolean getIsTailleDeLaTasseMlValeurDifUsine() {
		return isTailleDeLaTasseMlValeurDifUsine;
	}

	public void setIsTailleDeLaTasseMlValeurDifUsine(Boolean isTailleDeLaTasseMlValeurDifUsine) {
		this.isTailleDeLaTasseMlValeurDifUsine = isTailleDeLaTasseMlValeurDifUsine;
	}

	public Boolean getIsFilterPresent() {
		return isFilterPresent;
	}

	public void setIsFilterPresent(Boolean isFilterPresent) {
		this.isFilterPresent = isFilterPresent;
	}

	public Boolean getBipSonore() {
		return bipSonore;
	}

	public void setBipSonore(Boolean bipSonore) {
		this.bipSonore = bipSonore;
	}

	public Long getRatioLaitCafe() {
		return ratioLaitCafe;
	}

	public String getTempsArretAutomatique() {
		return tempsArretAutomatique;
	}

	public void setTempsArretAutomatique(String tempsArretAutomatique) {
		this.tempsArretAutomatique = tempsArretAutomatique;
	}

	public void setRatioLaitCafe(Long ratioLaitCafe) {
		this.ratioLaitCafe = ratioLaitCafe;
	}

	public boolean isDeuxTasses() {
		return deuxTasses;
	}

	public void setDeuxTasses(boolean deuxTasses) {
		this.deuxTasses = deuxTasses;
	}

	public double getProgressBarValue() {
		return progressBarValue;
	}

	public void setProgressBarValue(double progressBarValue) {
		this.progressBarValue = progressBarValue;
	}

	public double getProgressBarCafe() {
		return progressBarCafe;
	}

	public void setProgressBarCafe(double progressBarCafe) {
		this.progressBarCafe = progressBarCafe;
	}

	public double getProgressBarLait() {
		return progressBarLait;
	}

	public void setProgressBarLait(double progressBarLait) {
		this.progressBarLait = progressBarLait;
	}	
}