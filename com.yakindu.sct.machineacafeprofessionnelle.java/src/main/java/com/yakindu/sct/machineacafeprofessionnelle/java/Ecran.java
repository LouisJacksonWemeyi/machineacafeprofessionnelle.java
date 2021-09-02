package com.yakindu.sct.machineacafeprofessionnelle.java;

import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

public class Ecran {
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
//private MachineAcafeProfessionnelleCtrl statemachine;


private Stage stage;

ResourceBundle bundleFR = ResourceBundle.getBundle("internationalization.ApplicationMessages", new Locale("fr", "FR"));
ResourceBundle bundleEN = ResourceBundle.getBundle("internationalization.ApplicationMessages", new Locale("en", "EN"));
ResourceBundle bundleNL = ResourceBundle.getBundle("internationalization.ApplicationMessages", new Locale("nl", "NL"));
ResourceBundle langueBundle = null;
String langue = null;





	public Ecran(Stage stage) {
		// TODO Auto-generated constructor stub
		ImageView expresso= new ImageView(new Image("/images/expresso.png"));
		expresso.setFitHeight(66);
		expresso.setFitWidth(55);
		btExpresso = new Button("",expresso);
		//btExpresso.setStyle("-fx-background-color: derive(grey, -60%)");
		btExpresso.setStyle("-fx-background-color: black");
		
		ImageView expressoMacch= new ImageView(new Image("/images/expressoMacch.png"));
		expressoMacch.setFitHeight(66);
		expressoMacch.setFitWidth(55);
		btExpressoMacch = new Button("", expressoMacch);
		//btExpressoMacch.setStyle("-fx-background-color: derive(grey, -60%)");
		btExpressoMacch.setStyle("-fx-background-color: black");
		
		ImageView cafe= new ImageView(new Image("/images/cafe.png"));
		cafe.setFitHeight(66);
		cafe.setFitWidth(55);
		btCafe = new Button("",cafe);
		//btCafe.setStyle("-fx-background-color: derive(grey, -60%)");
		btCafe.setStyle("-fx-background-color: black");
		
		ImageView cappuccino= new ImageView(new Image("/images/cappuccino.png"));
		cappuccino.setFitHeight(66);
		cappuccino.setFitWidth(55);
		btCappuccino = new Button("",cappuccino);
		//btCappuccino.setStyle("-fx-background-color: derive(grey, -60%)");
		btCappuccino.setStyle("-fx-background-color: black");
		
		ImageView latteMacchiato= new ImageView(new Image("/images/latteMacchiato.png"));
		latteMacchiato.setFitHeight(66);
		latteMacchiato.setFitWidth(55);
		btLatteMacchiato = new Button("", latteMacchiato);
		//btLatteMacchiato.setStyle("-fx-background-color: derive(grey, -60%)");
		btLatteMacchiato.setStyle("-fx-background-color: black");

		
		ImageView cafeAuLait = new ImageView(new Image("/images/cafeAuLait.png"));
		cafeAuLait.setFitHeight(66);
		cafeAuLait.setFitWidth(55);
		btCafeAuLait = new Button("", cafeAuLait);
		//btCafeAuLait.setStyle("-fx-background-color: derive(grey, -60%)");
		btCafeAuLait.setStyle("-fx-background-color: black");

		
		ImageView MousseLait = new ImageView(new Image("/images/MousseLait.png"));
		MousseLait.setFitHeight(66);
		MousseLait.setFitWidth(55);
		btMousseLait = new Button("", MousseLait);
		//btMousseLait.setStyle("-fx-background-color: derive(grey, -60%)");
		btMousseLait.setStyle("-fx-background-color: black");

		
		ImageView boissonSpeciales = new ImageView(new Image("/images/boissonSpeciales.png"));
		boissonSpeciales.setFitHeight(66);
		boissonSpeciales.setFitWidth(55);
		btBoissonSpeciales = new Button("", boissonSpeciales);
		//btBoissonSpeciales.setStyle("-fx-background-color: derive(grey, -60%)");
		btBoissonSpeciales.setStyle("-fx-background-color: black");

		
		ImageView startStop = new ImageView(new Image("/images/startStop.png"));
		startStop.setFitHeight(66);
		startStop.setFitWidth(55);
		btStartStop = new Button("", startStop);
		//btStartStop.setStyle("-fx-background-color: derive(grey, -60%)");
		btStartStop.setStyle("-fx-background-color: black");

		
		ImageView menu = new ImageView(new Image("/images/menu.png"));
		menu.setFitHeight(41);
		menu.setFitWidth(66);
		btMenu = new Button("", menu);
		//btMenu.setStyle("-fx-background-color: derive(grey, -60%)");
		btMenu.setStyle("-fx-background-color: black");

		
		ImageView ok = new ImageView(new Image("/images/ok.png"));
		ok.setFitHeight(41);
		ok.setFitWidth(66);
		btOk = new Button("", ok);
		//btOk.setStyle("-fx-background-color: derive(grey, -60%)");
		btOk.setStyle("-fx-background-color: black");

		
		ImageView secuEnfant = new ImageView(new Image("/images/secuEnfant.png"));
		secuEnfant.setFitHeight(41);
		secuEnfant.setFitWidth(66);
		btSecuEnfant = new Button("", secuEnfant);
		//btSecuEnfant.setStyle("-fx-background-color: derive(grey, -60%)");
		btSecuEnfant.setStyle("-fx-background-color: black");

		
		ImageView ml = new ImageView(new Image("/images/ml.png"));
		ml.setFitHeight(41);
		ml.setFitWidth(66);
		btMl = new Button("", ml);
		//btMl.setStyle("-fx-background-color: derive(grey, -60%)");
		btMl.setStyle("-fx-background-color: black");

		
		ImageView retourArriere = new ImageView(new Image("/images/retourArriere.png"));
		retourArriere.setFitHeight(41);
		retourArriere.setFitWidth(66);
		btRetour= new Button("", retourArriere);
		//btRetour.setStyle("-fx-background-color: derive(grey, -60%)");
		btRetour.setStyle("-fx-background-color: black");

		
		ImageView intensite = new ImageView(new Image("/images/intensite.png"));
		intensite.setFitHeight(41);
		intensite.setFitWidth(66);
		btIntensite = new Button("", intensite);
		//btIntensite.setStyle("-fx-background-color: derive(grey, -60%)");
		btIntensite.setStyle("-fx-background-color: black");

		ImageView deuxtasses = new ImageView(new Image("/images/deuxtasses.png"));
		deuxtasses.setFitHeight(41);
		deuxtasses.setFitWidth(66);
		btDeuxTasses = new Button("", deuxtasses);
		//btDeuxTasses.setStyle("-fx-background-color: derive(grey, -60%)");
		btDeuxTasses.setStyle("-fx-background-color: black");

		
		ImageView navi = new ImageView(new Image("/images/navi.png"));
		navi.setFitHeight(17);
		navi.setFitWidth(27);
		btNav = new Button("",navi);
		//btNav.setStyle("-fx-background-color: derive(grey, -60%)");
		btNav.setStyle("-fx-background-color: black");
		
		ImageView expressoSelected= new ImageView(new Image("/images/expressoSel.png"));
		expressoSelected.setFitHeight(66);
		expressoSelected.setFitWidth(55);
		btExpressoSelected = new Button("",expressoSelected);
		//btExpressoSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		btExpressoSelected.setStyle("-fx-background-color: black");
		
		ImageView expressoMacchSelected= new ImageView(new Image("/images/expressoMacchSel.png"));
		expressoMacchSelected.setFitHeight(66);
		expressoMacchSelected.setFitWidth(55);
		btExpressoMacchSelected = new Button("", expressoMacchSelected);
		//btExpressoMacchSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		btExpressoMacchSelected.setStyle("-fx-background-color: black");
		
		ImageView cafeSelected= new ImageView(new Image("/images/cafeSel.png"));
		cafeSelected.setFitHeight(66);
		cafeSelected.setFitWidth(55);
		btCafeSelected = new Button("",cafeSelected);
		//btCafeSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		btCafeSelected.setStyle("-fx-background-color: black");
		
		ImageView cappuccinoSelected = new ImageView(new Image("/images/cappuccinoSel.png"));
		cappuccinoSelected.setFitHeight(66);
		cappuccinoSelected.setFitWidth(55);
		btCappuccinoSelected = new Button("",cappuccinoSelected);
		//btCappuccinoSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		btCappuccinoSelected.setStyle("-fx-background-color: black");
		
		ImageView latteMacchiatoSelected= new ImageView(new Image("/images/latteMacchiatoSel.png"));
		latteMacchiatoSelected.setFitHeight(66);
		latteMacchiatoSelected.setFitWidth(55);
		btLatteMacchiatoSelected = new Button("", latteMacchiatoSelected);
		//btLatteMacchiatoSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		btLatteMacchiatoSelected.setStyle("-fx-background-color: black");
		
		ImageView cafeAuLaitSelected = new ImageView(new Image("/images/cafeAuLaitSel.png"));
		cafeAuLaitSelected.setFitHeight(66);
		cafeAuLaitSelected.setFitWidth(55);
		btCafeAuLaitSelected = new Button("", cafeAuLaitSelected);
		//btCafeAuLaitSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		btCafeAuLaitSelected.setStyle("-fx-background-color: black");
		
		ImageView MousseLaitSelected = new ImageView(new Image("/images/MousseLaitSel.png"));
		MousseLaitSelected.setFitHeight(66);
		MousseLaitSelected.setFitWidth(55);
		btMousseLaitSelected = new Button("", MousseLaitSelected);
		//btMousseLaitSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		btMousseLaitSelected.setStyle("-fx-background-color: black");
		
		ImageView boissonSpecialeSelected = new ImageView(new Image("/images/boissonSpecialeSel.png"));
		boissonSpecialeSelected.setFitHeight(66);
		boissonSpecialeSelected.setFitWidth(55);
		btBoissonSpecialeSelected = new Button("", boissonSpecialeSelected);
		//btBoissonSpecialeSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		btBoissonSpecialeSelected.setStyle("-fx-background-color: black");
		
		btBacCollecteurVider = new Button("Button 1");
		btFiltreRemplacer = new Button("Button 2");
		btReservoirEauRempli = new Button("Button 3");
		btReservoirGrainsRempli = new Button("Button 4");
		
		//statemachine = machineAetat;
		
		this.stage = stage;
		
		bundleFR = ResourceBundle.getBundle("internationalization.ApplicationMessages",new Locale("fr", "FR"));
		bundleEN = ResourceBundle.getBundle("internationalization.ApplicationMessages",new Locale("en", "EN"));
		bundleNL = ResourceBundle.getBundle("internationalization.ApplicationMessages",new Locale("nl", "NL"));
	}
	
	public void screenSelectDrink() {
	
		/*
		 * HBox bandeauCommandes = new HBox();
		 * //bandeauCommandes.setStyle("-fx-background-color: black");
		 * bandeauCommandes.getChildren().addAll(btExpresso,btExpressoMacch,btCafe,
		 * btCappuccino,btlatteMacchiato,btCafeAuLait,btMousseLait,btBoissonSpeciales);
		 * bandeauCommandes.setAlignment(Pos.CENTER);
		 */
		
		/*
		 * HBox bandeauTop = new HBox();
		 * bandeauTop.getChildren().addAll(bandeauCommandes, btStartStop);
		 * //bandeauTop.setStyle("-fx-background-color: black");
		 * bandeauTop.setAlignment(Pos.CENTER);
		 */
		
		
		 HBox btNavBandeau = new HBox(); btNavBandeau.getChildren().addAll(btNav);
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btExpressoSelected, 0, 0);
		bandeauDeCommandes.add(btExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btCafe, 2, 0);
		bandeauDeCommandes.add(btCappuccino, 3, 0);
		bandeauDeCommandes.add(btLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btMousseLait, 6, 0);
		bandeauDeCommandes.add(btBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(btStartStop, 8, 0);
		bandeauDeCommandes.setHgap(2);
		bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		
		
		
		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(btIntensite, 1, 1);
		leftSetting.add(btDeuxTasses, 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(btSecuEnfant, 1, 1);
		rightSetting.add(btMl, 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Text selectedDrink = new Text(100, 30, "Expresso");
		selectedDrink.setFont(Font.font("Courier", FontWeight.BOLD,
		FontPosture.ITALIC, 15));
		centralScreenText.getChildren().add(selectedDrink);
		Text intensiteCafe = new Text(30, 90, "normal");
		centralScreenText .getChildren().add(intensiteCafe);
		Text cupSize = new Text(220, 90, "moyen");
		centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;
	}
	
	public void displayOffState() {
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		//bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		//bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(btStartStop, 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		
		
		
		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: black");
		//centralScreenText.setStyle("-fx-background-color: lightgray");
		//Text selectedDrink = new Text(100, 30, "Expresso");
		//selectedDrink.setFont(Font.font("Courier", FontWeight.BOLD,
		//FontPosture.ITALIC, 15));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text intensiteCafe = new Text(30, 90, "normal");
		//centralScreenText.getChildren().add(intensiteCafe);
		//Text cupSize = new Text(220, 90, "moyen");
		//centralScreenText.getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");


		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
	}

	public void displayChoixLangueState(String langue){
		
		setLangue(langue);
		this.langueBundle=this.langue=="nederland"?bundleNL:this.langue=="english"?bundleEN:bundleFR;
				
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		 choixLangue.setFitHeight(16);
		 choixLangue.setFitWidth(15);
		 choixLangue.setStyle("-fx-background-color:lightgray");
		
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(btStartStop, 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
		pane.getChildren().add(rectangle);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text("English");
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text("Nederland");
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne2.getChildren().addAll(ligne2Text);
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(8); 
		 Text ligne3Text = new Text("Français");
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text,choixLangue);
		 ligne3.setAlignment(Pos.CENTER);
		 pane.getChildren().add(ligne3); 
		 
	    switch (langue) {
		case "english":ligne3Text.setText("English");ligne2Text.setText("Français");ligne1Text.setText("Nederland");
			break;
		case "nederland":ligne3Text.setText("Nederland");ligne2Text.setText("English");ligne1Text.setText("Français");
		    break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(25,15,15,15));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne1);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
	}
	
	public void displayLogoState(String value) {
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		btNavBandeau.setAlignment(Pos.CENTER);
		
	    Button btnExpresso = value=="expresso"?btExpresso:getEmptyButtonType1();
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacch:getEmptyButtonType1();
		Button btnCafe = value=="cafe"?btCafe:getEmptyButtonType1();
		Button btnCappuccino = value=="cappuccino"?btCappuccino:getEmptyButtonType1();
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiato:getEmptyButtonType1();
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLait:getEmptyButtonType1();
		Button btnMousseLait = value=="mousselait"?btMousseLait:getEmptyButtonType1();
		Button btnBoissonSpeciales = (value=="specialDrink")?btBoissonSpeciales:getEmptyButtonType1();
		Button btnStartStop = (value=="startstop")?btStartStop:getEmptyButtonType1();
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(btnStartStop, 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		//centralScreenText.setStyle("-fx-background-color: lightgray");
		centralScreenText.setStyle("-fx-background-color: white");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
		pane.getChildren().add(rectangle);
		 
		 HBox logo = new HBox(); 
		 Text logoText = new Text("SIEMENS");
		 logoText.setStroke(Color.BLACK);
		 logoText.setFill(Color.CYAN);
		 logoText.setFont(Font.font("time new romance", FontWeight.EXTRA_BOLD,FontPosture.REGULAR,60));
		 logo.getChildren().addAll(logoText);
		 logo.setAlignment(Pos.CENTER);
		 pane.getChildren().add(logo); 
	   
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,15,15,15));
		 centralScreen.getChildren().addAll(pane);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenLogo = new VBox();
		ScreenLogo.setPadding(new Insets(15,15, 15, 15));
		ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenLogo.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(ScreenLogo,700,300);
		stage.setScene(scene);
		return;
	}
	
	private Button getEmptyButtonType1() {
		ImageView empty = new ImageView();
		empty.setFitHeight(66);
		empty.setFitWidth(55);
		Button btempty = new Button("", empty);
		//btempty.setStyle("-fx-background-color: derive(grey, -60%)");
		btempty.setStyle("-fx-background-color: black");
		return btempty;

	}
	
	private Button getEmptyButtonType2() {
		ImageView empty = new ImageView();
		empty.setFitHeight(41);
		empty.setFitWidth(66);
		Button btempty = new Button("", empty);
		//btempty.setStyle("-fx-background-color: derive(grey, -60%)");
		btempty.setStyle("-fx-background-color: black");
		return btempty;
	}
	
	private Button getEmptyButtonType3() {
		ImageView empty = new ImageView();
		empty.setFitHeight(17);
		empty.setFitWidth(27);
		Button btempty = new Button("", empty);
		//btempty.setStyle("-fx-background-color: derive(grey, -60%)");
		btempty.setStyle("-fx-background-color: black");
		return btempty;
	}

	public void displayHeatingUpState(Long temperature) {
		HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		
		
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		//Text selectedDrink = new Text(100, 30, "Expresso");
		//selectedDrink.setFont(Font.font("Courier", FontWeight.BOLD,
		//FontPosture.ITALIC, 15));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text intensiteCafe = new Text(30, 90, "normal");
		//centralScreenText.getChildren().add(intensiteCafe);
		//Text cupSize = new Text(220, 90, "moyen");
		//centralScreenText.getChildren().add(cupSize);
//		String process =".";
//		for (Long i = temperature; i > 0; i-=5) {
//			process+=" .";
//		}
		 //DecimalFormat format = new DecimalFormat();
		 //format.setMaximumFractionDigits(2);
		 HBox heating = new HBox(); 
		 //Text heatingText = new Text(getLangueBundle().getString("heatText")+" "+((temperature*100)/95)+" %");
		 Text heatingText = new Text(getLangueBundle().getString("heatText")+" "+temperature+" °C");
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 heatingText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
		 //drink.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
		 heating.getChildren().addAll(heatingText);
		 heating.setAlignment(Pos.CENTER);
		 
		 HBox action = new HBox(); 
		 Text actionText = new Text(getLangueBundle().getString("actionHeatTextPlease"));
		 actionText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
		 action.getChildren().addAll(actionText);
		 //action.getChildren().addAll(new Text("Appuyer sur stop pour annuler"));
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 action.setAlignment(Pos.CENTER);
		 
		 HBox progressBar = new HBox(); 
		 ProgressBar progressbar=new ProgressBar(temperature/95.0);
		 progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
		 progressBar.getChildren().addAll(progressbar);
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 progressBar.setAlignment(Pos.CENTER);
		 
		 
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(5,5,5,5));
		 centralScreen.getChildren().addAll(new Text(""),heating, new Text(""),progressBar,action);
		 //BorderPane pane = new BorderPane();
		 //pane.setCenter(centralScreen);
		 centralScreenText.getChildren().add(centralScreen);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(5,5,5,5));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");


		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}
	
	public void displayRincageState() {
		HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30)); 
		pane.getChildren().add(rectangle);
		
		/*
		 * HBox heating = new HBox(); Text heatingText = new
		 * Text(getLangueBundle().getString("heatText")+" "+((temperature*100)/95)+" %"
		 * ); //btNavBandeau.setStyle("-fx-background-color: black");
		 * heatingText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC,
		 * 12));
		 * //drink.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0
		 * )); heating.getChildren().addAll(heatingText);
		 * heating.setAlignment(Pos.CENTER);
		 */
		 
		 HBox action = new HBox(); 
		 Text actionText = new Text(getLangueBundle().getString("rinsing"));
		 actionText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
		 action.getChildren().addAll(actionText);
		 action.setAlignment(Pos.CENTER);

		 
		 HBox progressindicator = new HBox(); 
		 ProgressIndicator progressIndicator=new ProgressIndicator();
		 //progressIndicator.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
		 progressindicator.getChildren().addAll(progressIndicator);
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 progressindicator.setAlignment(Pos.CENTER);
		 pane.getChildren().add(progressindicator); 

		 
		 
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,15,15,15));
		 //centralScreen.getChildren().addAll(new Text(""),progressindicator,action);
		 centralScreen.getChildren().addAll(pane,action);
		 //BorderPane pane = new BorderPane();
		 //pane.setCenter(centralScreen);
		 centralScreenText.getChildren().add(centralScreen);

		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox screen = new VBox(5);
		screen.setPadding(new Insets(15,15, 15, 15));
		screen.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//screen.setStyle("-fx-background-color: derive(grey, -60%)");
		screen.setStyle("-fx-background-color: black");



		Scene scene = new Scene(screen,700,300);
		stage.setScene(scene);
		return;
		
	}

	public void displayNormalDrinkSelected(String value) {
		
//		if ((value=="tresdoux"||value=="doux"||value=="normal"||value=="fort"||value=="tresfort"||value=="doubleshortfort"||value=="doubleshortfort+"||value=="comp.poudre")) {
//			setIntensiteDucafe(value);					
//		}else if ((value=="petit"||value=="moyen"||value=="grand")) {
//			setTailleDeLaTasse(value);
//		}
//		else if ((value=="expresso"||value=="expressomacch"||value=="cafe"||value=="cappuccino"||value=="lattemacchiato"||value=="cafeaulait"||value=="mousselait"||value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")) {
//			setBoissonSelectionner(value);
//		}else if (value=="deuxtasses") {
//			setBoissonSelectionner("2 "+getBoissonSelectionner());
//		}
		
	    Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		
		HBox btNavBandeau = new HBox(); btNavBandeau.getChildren().addAll(btNav);
		 //btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(btStartStop, 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(btIntensite, 1, 1);
		leftSetting.add(btDeuxTasses, 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(btSecuEnfant, 1, 1);
		rightSetting.add(btMl, 0, 1);
				
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
        Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		 HBox selectedDrink = new HBox(); 
		 Text selectedDrinkText = new Text(deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		 selectedDrinkText.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		 selectedDrink.getChildren().addAll(selectedDrinkText);
		 selectedDrink.setAlignment(Pos.CENTER);
		 pane.getChildren().add(selectedDrink); 
		 
		 HBox boissonFav = new HBox(); 
		 Text boissonFavText = new Text(getIsHandlingBoissonFav()?(getLangueBundle().getString(getNumFavBoisson())):"");
		 boissonFavText.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		 boissonFav.getChildren().addAll(boissonFavText);
		 boissonFav.setAlignment(Pos.CENTER);
		 
		 Boolean isIntensiteCafe = !(value=="eauchaude"||value=="mousselait"||value=="laitchaud");
		 //GridPane tailleIntensiteCafe= new GridPane(); 
		 Text intensiteCafe = isIntensiteCafe?new Text(30, 90,getLangueBundle().getString(getIntensiteDucafe())): new Text();
		 System.out.println(getIsTailleDeLaTasseMlValeurDifUsine()+" "+getTailleDeLaTasse());
		 Text tailleDeLaTasse = new Text(220, 90,getIsHandlingBoissonFav()?getLangueBundle().getString(getTailleDeLaTasse())+"*":(getIsTailleDeLaTasseMlValeurDifUsine()?(getLangueBundle().getString(getTailleDeLaTasse())+"*"):getLangueBundle().getString(getTailleDeLaTasse())));
		 intensiteCafe.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 tailleDeLaTasse.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 //tailleIntensiteCafe.add(intensiteCafe,0,0);
		 //tailleIntensiteCafe.add(tailleDeLaTasse,4,0);
		 //tailleIntensiteCafe.setAlignment(Pos.CENTER);

		 
//		 VBox centralScreen = new VBox();
//		 //centralScreen.setPadding(new Insets(0,0,0,0));
//		 centralScreen.getChildren().addAll(boissonFav,pane);
//		 centralScreenText.getChildren().add(centralScreen);
//		 centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
		 
		 if(getIsHandlingBoissonFav()) {
			 VBox centralScreen = new VBox();
			 //centralScreen.setPadding(new Insets(0,0,0,0));
			 centralScreen.getChildren().addAll(boissonFav,pane);
			 centralScreenText.getChildren().add(centralScreen);
			 centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
		 }else {
			 VBox centralScreen = new VBox();
			 //centralScreen.setPadding(new Insets(0,0,0,0));
			 centralScreen.getChildren().addAll(pane);
			 centralScreenText.getChildren().add(centralScreen);
			 centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
		 }
//		 VBox centralScreenBoissonFav = new VBox();
//		 //centralScreen.setPadding(new Insets(0,0,0,0));
//		 centralScreenBoissonFav.getChildren().addAll(boissonFav,pane);
//		 VBox centralScreenSansBoissonFav = new VBox();
//		 centralScreenSansBoissonFav.getChildren().add(pane);
//		 VBox centralScreen=new VBox();
//		 centralScreen=(getIsHandlingBoissonFav()?centralScreenBoissonFav:centralScreenSansBoissonFav);
//		 centralScreenText.getChildren().add(centralScreen);
//		 centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
		
		//Text selectedDrink = new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(intensiteCafe);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;
		
	}

	public void displayPreparationBoissonState(String value) {
	
	Button btnExpresso = value=="expresso"?btExpressoSelected:getEmptyButtonType1();
	Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:getEmptyButtonType1();
	Button btnCafe = value=="cafe"?btCafeSelected:getEmptyButtonType1();
	Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:getEmptyButtonType1();
	Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:getEmptyButtonType1();
	Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:getEmptyButtonType1();
	Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:getEmptyButtonType1();
	Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:getEmptyButtonType1();
	
		
		HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		 GridPane bandeauDeCommandes = new GridPane();
			bandeauDeCommandes.add(btnExpresso, 0, 0);
			bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
			bandeauDeCommandes.add(btnCafe, 2, 0);
			bandeauDeCommandes.add(btnCappuccino, 3, 0);
			bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
			bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
			bandeauDeCommandes.add(btnMousseLait, 6, 0);
			bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
			bandeauDeCommandes.add(btStartStop, 8, 0);
			bandeauDeCommandes.setHgap(2);
			//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
			bandeauDeCommandes.setStyle("-fx-background-color: black");
			bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
		if((value=="expressomacch"||value=="cappuccino"||value=="lattemacchiato"||value=="cafeaulait"||value=="flatwhite"||value=="cafecortado")) {
			
		    HBox drink = new HBox(); 
			Text drinkText = new Text(deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
			//btNavBandeau.setStyle("-fx-background-color: black");
			drinkText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 20));
			drinkText.setTextAlignment(TextAlignment.CENTER);
			//drink.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
			drink.getChildren().addAll(drinkText);
			drink.setAlignment(Pos.CENTER);
			
			HBox action = new HBox(); 
			Text actionText = new Text(getLangueBundle().getString("annuler"));
			actionText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
			actionText.setTextAlignment(TextAlignment.CENTER);
			action.getChildren().addAll(actionText);
			//action.getChildren().addAll(new Text("Appuyer sur stop pour annuler"));
			//btNavBandeau.setStyle("-fx-background-color: black");
			action.setAlignment(Pos.CENTER);
			
			HBox progressBar = new HBox(); 
			ProgressBar progressbarlait=new ProgressBar(getProgressBarLait());
			ProgressBar progressbarcafe=new ProgressBar(getProgressBarCafe());
			progressBar.getChildren().addAll(progressbarlait,progressbarcafe);
			progressBar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
			//btNavBandeau.setStyle("-fx-background-color: black");
			progressBar.setAlignment(Pos.CENTER);
			
			VBox centralScreen = new VBox();
			centralScreen.setPadding(new Insets(5,5,5,5));
			centralScreen.getChildren().addAll(drink,new Text(""),action,progressBar);
			centralScreenText.getChildren().add(centralScreen);
		}else if(value=="expresso"||value=="cafe"||value=="verseuse"||value=="americano") {
			HBox drink = new HBox(); 
			 Text drinkText = new Text(deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
			 //btNavBandeau.setStyle("-fx-background-color: black");
			 drinkText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 20));
			 drinkText.setTextAlignment(TextAlignment.CENTER);
			 //drink.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
			 drink.getChildren().addAll(drinkText);
			 drink.setAlignment(Pos.CENTER);
			 
			 HBox action = new HBox(); 
			 Text actionText = new Text(getLangueBundle().getString("annuler"));
			 actionText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
			 actionText.setTextAlignment(TextAlignment.CENTER);
			 action.getChildren().addAll(actionText);
			 //action.getChildren().addAll(new Text("Appuyer sur stop pour annuler"));
			 //btNavBandeau.setStyle("-fx-background-color: black");
			 action.setAlignment(Pos.CENTER);
			 
			 HBox progressBar = new HBox(); 
			 ProgressBar progressbar=new ProgressBar(getProgressBarCafe());
			 progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
			 progressBar.getChildren().addAll(progressbar);
			 //btNavBandeau.setStyle("-fx-background-color: black");
			 progressBar.setAlignment(Pos.CENTER);
			 
			 VBox centralScreen = new VBox();
			 centralScreen.setPadding(new Insets(5,5,5,5));
			 centralScreen.getChildren().addAll(drink,new Text(""),action,progressBar);
			 //BorderPane pane = new BorderPane();
			 //pane.setCenter(centralScreen);
			 centralScreenText.getChildren().add(centralScreen);
			
		}else if(value=="laitchaud"||value=="mousselait") {
			HBox drink = new HBox(); 
			 Text drinkText = new Text(deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
			 //btNavBandeau.setStyle("-fx-background-color: black");
			 drinkText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 20));
			 drinkText.setTextAlignment(TextAlignment.CENTER);
			 //drink.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
			 drink.getChildren().addAll(drinkText);
			 drink.setAlignment(Pos.CENTER);
			 
			 HBox action = new HBox(); 
			 Text actionText = new Text(getLangueBundle().getString("annuler"));
			 actionText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
			 actionText.setTextAlignment(TextAlignment.CENTER);
			 action.getChildren().addAll(actionText);
			 //action.getChildren().addAll(new Text("Appuyer sur stop pour annuler"));
			 //btNavBandeau.setStyle("-fx-background-color: black");
			 action.setAlignment(Pos.CENTER);
			 
			 HBox progressBar = new HBox(); 
			 ProgressBar progressbar=new ProgressBar(getProgressBarLait());
			 progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
			 progressBar.getChildren().addAll(progressbar);
			 //btNavBandeau.setStyle("-fx-background-color: black");
			 progressBar.setAlignment(Pos.CENTER);
			 
			 VBox centralScreen = new VBox();
			 centralScreen.setPadding(new Insets(5,5,5,5));
			 centralScreen.getChildren().addAll(drink,new Text(""),action,progressBar);
			 //BorderPane pane = new BorderPane();
			 //pane.setCenter(centralScreen);
			 centralScreenText.getChildren().add(centralScreen);
			
		}else {
		 HBox drink = new HBox(); 
		 Text drinkText = new Text(deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 drinkText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 20));
		 drinkText.setTextAlignment(TextAlignment.CENTER);
		 //drink.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
		 drink.getChildren().addAll(drinkText);
		 drink.setAlignment(Pos.CENTER);
		 
		 HBox action = new HBox(); 
		 Text actionText = new Text(getLangueBundle().getString("annuler"));
		 actionText.setFont(Font.font("Courier", FontWeight.BOLD,
					FontPosture.ITALIC, 12));
		 action.getChildren().addAll(actionText);
		 //action.getChildren().addAll(new Text("Appuyer sur stop pour annuler"));
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 action.setAlignment(Pos.CENTER);
		 
		 HBox progressBar = new HBox(); 
		 ProgressBar progressbar=new ProgressBar(getProgressBarValue());
		 progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
		 progressBar.getChildren().addAll(progressbar);
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 progressBar.setAlignment(Pos.CENTER);
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(5,5,5,5));
		 centralScreen.getChildren().addAll(drink,new Text(""),action,progressBar);
		 //BorderPane pane = new BorderPane();
		 //pane.setCenter(centralScreen);
		 centralScreenText.getChildren().add(centralScreen);
		} 
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");


		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}

	public void displayBoissonReadyState(String value) {
		
		HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
		pane.getChildren().add(rectangle);

		 HBox boissonPrete = new HBox(); 
		 //Text heatingText = new Text(getLangueBundle().getString("heatText")+" "+((temperature*100)/95)+" %");
		 Text boissonPreteText = new Text(getLangueBundle().getString("boissonPrete")+" "+getLangueBundle().getString(value));
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 boissonPreteText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
		 //drink.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
		 boissonPrete.getChildren().addAll(boissonPreteText);
		 boissonPrete.setAlignment(Pos.CENTER);
		 pane.getChildren().add(boissonPrete);
		 
		 //HBox action = new HBox(); 
		 //Text actionText = new Text(getLangueBundle().getString("actionBoissonPrete"));
		 //actionText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
		 //action.getChildren().addAll(actionText);
		 //action.getChildren().addAll(new Text("Appuyer sur stop pour annuler"));
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 //action.setAlignment(Pos.CENTER);
		 
		 HBox bssonPretImg = new HBox(); 
		 ImageView boissonPreteImage = new ImageView(new Image("/images/coffeready.png"));
		 boissonPreteImage.setFitHeight(66);
		 boissonPreteImage.setFitWidth(55);
		 bssonPretImg.getChildren().addAll(boissonPreteImage);
		 bssonPretImg.setAlignment(Pos.CENTER);
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(5,5,5,5));
		 centralScreen.getChildren().addAll(bssonPretImg,pane);
		 //BorderPane pane = new BorderPane();
		 //pane.setCenter(centralScreen);
		 centralScreenText.getChildren().add(centralScreen);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(5,5,5,5));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");


		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
	}

	public void displayMessageState(String value) {
		HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		Button btnStartStop = (value=="boissonEnregistrerMessage")?getEmptyButtonType1():btStartStop;
		
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(btnStartStop, 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
		pane.getChildren().add(rectangle);
		 
		 HBox message = new HBox(); 
		 Text messageText = new Text(getLangueBundle().getString(value));
		 messageText.setFont(Font.font("courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 message.getChildren().addAll(messageText);
		 message.setAlignment(Pos.CENTER);
		 pane.getChildren().add(message); 
	   
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,15,15,15));
		 centralScreen.getChildren().addAll(pane);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenLogo = new VBox();
		ScreenLogo.setPadding(new Insets(15,15, 15, 15));
		ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenLogo.setStyle("-fx-background-color: black");

		Scene scene = new Scene(ScreenLogo,700,300);
		stage.setScene(scene);
		return;	
	}

	public void displayMenuState(String value) {
		
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
//		 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
//		 choixLangue.setFitHeight(16);
//		 choixLangue.setFitWidth(15);
//		 choixLangue.setStyle("-fx-background-color:lightgray");
		
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("nettoyageEntretien"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1);

		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString("reglerQteBoissons"));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne2.getChildren().addAll(ligne2Text);
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString("proportionLaitCafe"));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text);
		 ligne3.setAlignment(Pos.CENTER);
		 
		 HBox ligne4 = new HBox(); 
		 Text ligne4Text = new Text(getLangueBundle().getString("favori"));
		 ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne4.getChildren().addAll(ligne4Text);
		 ligne4.setAlignment(Pos.CENTER);
		 
		 HBox ligne5 = new HBox(); 
		 Text ligne5Text = new Text(getLangueBundle().getString("dureteEau"));
		 ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne5.getChildren().addAll(ligne5Text);
		 ligne5.setAlignment(Pos.CENTER);
		 
		 HBox ligne6 = new HBox(); 
		 Text ligne6Text = new Text(getLangueBundle().getString("arretAutomatique"));
		 ligne6Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne6.getChildren().addAll(ligne6Text);
		 ligne6.setAlignment(Pos.CENTER);
		 
		 HBox ligne7 = new HBox(); 
		 Text ligne7Text = new Text(getLangueBundle().getString("temperatureCafe"));
		 ligne7Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne7.getChildren().addAll(ligne7Text);
		 ligne7.setAlignment(Pos.CENTER);
		 
		 HBox ligne8 = new HBox(); 
		 Text ligne8Text = new Text(getLangueBundle().getString("filtreEau"));
		 ligne8Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne8.getChildren().addAll(ligne8Text);
		 ligne8.setAlignment(Pos.CENTER);
		 
		 HBox ligne9 = new HBox(); 
		 Text ligne9Text = new Text(getLangueBundle().getString("langues"));
		 ligne9Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne9.getChildren().addAll(ligne9Text);
		 ligne9.setAlignment(Pos.CENTER);

		 HBox ligne10 = new HBox(); 
		 Text ligne10Text = new Text(getLangueBundle().getString("protectionContreGel"));
		 ligne10Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne10.getChildren().addAll(ligne10Text);
		 ligne10.setAlignment(Pos.CENTER);
		 
		 HBox ligne11 = new HBox(8); 
		 Text ligne11Text = new Text(getLangueBundle().getString("bipSonore"));
		 ligne11Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne11.getChildren().addAll(ligne11Text);
		 ligne11.setAlignment(Pos.CENTER);
		 
		 HBox ligne12 = new HBox(8); 
		 Text ligne12Text = new Text(getLangueBundle().getString("nbreBoissons"));
		 ligne12Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne12.getChildren().addAll(ligne12Text);
		 ligne12.setAlignment(Pos.CENTER);
		 
		 HBox ligne13 = new HBox(8); 
		 Text ligne13Text = new Text(getLangueBundle().getString("prereglagesUsine"));
		 ligne13Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne13.getChildren().addAll(ligne13Text);
		 ligne13.setAlignment(Pos.CENTER);
		 
		switch (value) {
		case "nettoyageEntretien":ligne1Text.setText(getLangueBundle().getString("nettoyageEntretien"));ligne2Text.setText(getLangueBundle().getString("reglerQteBoissons"));ligne3Text.setText(getLangueBundle().getString("proportionLaitCafe"));
		ligne4Text.setText(getLangueBundle().getString("favori"));ligne5Text.setText(getLangueBundle().getString("dureteEau"));ligne6Text.setText(getLangueBundle().getString("arretAutomatique"));ligne7Text.setText(getLangueBundle().getString("temperatureCafe"));
		ligne8Text.setText(getLangueBundle().getString("filtreEau"));ligne9Text.setText(getLangueBundle().getString("langues"));ligne10Text.setText(getLangueBundle().getString("protectionContreGel"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));
		ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
			break;
		case "reglerQteBoissons":ligne1Text.setText(getLangueBundle().getString("reglerQteBoissons"));ligne2Text.setText(getLangueBundle().getString("nettoyageEntretien"));ligne3Text.setText(getLangueBundle().getString("proportionLaitCafe"));
		ligne4Text.setText(getLangueBundle().getString("favori"));ligne5Text.setText(getLangueBundle().getString("dureteEau"));ligne6Text.setText(getLangueBundle().getString("arretAutomatique"));ligne7Text.setText(getLangueBundle().getString("temperatureCafe"));
		ligne8Text.setText(getLangueBundle().getString("filtreEau"));ligne9Text.setText(getLangueBundle().getString("langues"));ligne10Text.setText(getLangueBundle().getString("protectionContreGel"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));
		ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "proportionLaitCafe":ligne1Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne2Text.setText(getLangueBundle().getString("reglerQteBoissons"));ligne3Text.setText(getLangueBundle().getString("nettoyageEntretien"));
		ligne4Text.setText(getLangueBundle().getString("favori"));ligne5Text.setText(getLangueBundle().getString("dureteEau"));ligne6Text.setText(getLangueBundle().getString("arretAutomatique"));ligne7Text.setText(getLangueBundle().getString("temperatureCafe"));
		ligne8Text.setText(getLangueBundle().getString("filtreEau"));ligne9Text.setText(getLangueBundle().getString("langues"));ligne10Text.setText(getLangueBundle().getString("protectionContreGel"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));
		ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "favori":ligne1Text.setText(getLangueBundle().getString("favori"));ligne2Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne3Text.setText(getLangueBundle().getString("reglerQteBoissons"));
		ligne4Text.setText(getLangueBundle().getString("nettoyageEntretien"));ligne5Text.setText(getLangueBundle().getString("dureteEau"));ligne6Text.setText(getLangueBundle().getString("arretAutomatique"));ligne7Text.setText(getLangueBundle().getString("temperatureCafe"));
		ligne8Text.setText(getLangueBundle().getString("filtreEau"));ligne9Text.setText(getLangueBundle().getString("langues"));ligne10Text.setText(getLangueBundle().getString("protectionContreGel"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));
		ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "dureteEau":ligne1Text.setText(getLangueBundle().getString("dureteEau"));ligne2Text.setText(getLangueBundle().getString("favori"));ligne3Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne4Text.setText(getLangueBundle().getString("reglerQteBoissons"));
		ligne5Text.setText(getLangueBundle().getString("nettoyageEntretien"));ligne6Text.setText(getLangueBundle().getString("arretAutomatique"));ligne7Text.setText(getLangueBundle().getString("temperatureCafe"));
		ligne8Text.setText(getLangueBundle().getString("filtreEau"));ligne9Text.setText(getLangueBundle().getString("langues"));ligne10Text.setText(getLangueBundle().getString("protectionContreGel"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));
		ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "arretAutomatique":ligne1Text.setText(getLangueBundle().getString("arretAutomatique"));ligne2Text.setText("dureteEau");ligne3Text.setText("favori");ligne4Text.setText("proportionLaitCafe");
		ligne5Text.setText("reglerQteBoissons");ligne6Text.setText("nettoyageEntretien");ligne7Text.setText("temperatureCafe");ligne8Text.setText("filtreEau");
		ligne9Text.setText("langues");ligne10Text.setText("protectionContreGel");ligne11Text.setText("bipSonore");ligne12Text.setText("nbreBoissons");
		ligne13Text.setText("prereglagesUsine");
		    break;
		case "temperatureCafe":ligne1Text.setText(getLangueBundle().getString("temperatureCafe"));ligne2Text.setText(getLangueBundle().getString("arretAutomatique"));ligne3Text.setText(getLangueBundle().getString("dureteEau"));ligne4Text.setText(getLangueBundle().getString("favori"));
		ligne5Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne6Text.setText(getLangueBundle().getString("reglerQteBoissons"));ligne7Text.setText(getLangueBundle().getString("nettoyageEntretien"));ligne8Text.setText(getLangueBundle().getString("filtreEau"));
		ligne9Text.setText(getLangueBundle().getString("langues"));ligne10Text.setText(getLangueBundle().getString("protectionContreGel"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));
		ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "filtreEau":ligne1Text.setText(getLangueBundle().getString("filtreEau"));ligne2Text.setText(getLangueBundle().getString("temperatureCafe"));ligne3Text.setText(getLangueBundle().getString("arretAutomatique"));ligne4Text.setText(getLangueBundle().getString("dureteEau"));
		ligne5Text.setText(getLangueBundle().getString("favori"));ligne6Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne7Text.setText(getLangueBundle().getString("reglerQteBoissons"));ligne8Text.setText(getLangueBundle().getString("nettoyageEntretien"));
		ligne9Text.setText(getLangueBundle().getString("langues"));ligne10Text.setText(getLangueBundle().getString("protectionContreGel"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));
		ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "langues":ligne1Text.setText(getLangueBundle().getString("langues"));ligne2Text.setText(getLangueBundle().getString("filtreEau"));ligne3Text.setText(getLangueBundle().getString("temperatureCafe"));ligne4Text.setText("arretAutomatique");
		ligne5Text.setText(getLangueBundle().getString("dureteEau"));ligne6Text.setText(getLangueBundle().getString("favori"));ligne7Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne8Text.setText(getLangueBundle().getString("reglerQteBoissons"));
		ligne9Text.setText(getLangueBundle().getString("nettoyageEntretien"));ligne10Text.setText(getLangueBundle().getString("protectionContreGel"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));
		ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "protectionContreGel":ligne1Text.setText(getLangueBundle().getString("protectionContreGel"));ligne2Text.setText(getLangueBundle().getString("langues"));ligne3Text.setText(getLangueBundle().getString("filtreEau"));ligne4Text.setText(getLangueBundle().getString("temperatureCafe"));
		ligne5Text.setText(getLangueBundle().getString("arretAutomatique"));ligne6Text.setText(getLangueBundle().getString("dureteEau"));ligne7Text.setText(getLangueBundle().getString("favori"));ligne8Text.setText(getLangueBundle().getString("proportionLaitCafe"));
		ligne9Text.setText(getLangueBundle().getString("reglerQteBoissons"));ligne10Text.setText(getLangueBundle().getString("nettoyageEntretien"));ligne11Text.setText(getLangueBundle().getString("bipSonore"));ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));
		ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "bipSonore":ligne1Text.setText(getLangueBundle().getString("bipSonore"));ligne2Text.setText(getLangueBundle().getString("protectionContreGel"));ligne3Text.setText(getLangueBundle().getString("langues"));ligne4Text.setText(getLangueBundle().getString("filtreEau"));
		ligne5Text.setText(getLangueBundle().getString("temperatureCafe"));ligne6Text.setText(getLangueBundle().getString("arretAutomatique"));ligne7Text.setText(getLangueBundle().getString("dureteEau"));ligne8Text.setText(getLangueBundle().getString("favori"));
		ligne9Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne10Text.setText(getLangueBundle().getString("reglerQteBoissons"));ligne11Text.setText(getLangueBundle().getString("nettoyageEntretien"));ligne12Text.setText(getLangueBundle().getString("nbreBoissons"));
		ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "nbreBoissons":ligne1Text.setText(getLangueBundle().getString("nbreBoissons"));ligne2Text.setText(getLangueBundle().getString("bipSonore"));ligne3Text.setText(getLangueBundle().getString("protectionContreGel"));ligne4Text.setText(getLangueBundle().getString("langues"));
		ligne5Text.setText(getLangueBundle().getString("filtreEau"));ligne6Text.setText(getLangueBundle().getString("temperatureCafe"));ligne7Text.setText(getLangueBundle().getString("arretAutomatique"));ligne8Text.setText(getLangueBundle().getString("dureteEau"));
		ligne9Text.setText(getLangueBundle().getString("favori"));ligne10Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne11Text.setText(getLangueBundle().getString("reglerQteBoissons"));ligne12Text.setText(getLangueBundle().getString("nettoyageEntretien"));
		ligne13Text.setText(getLangueBundle().getString("prereglagesUsine"));
		    break;
		case "prereglagesUsine":ligne1Text.setText(getLangueBundle().getString("prereglagesUsine"));ligne2Text.setText(getLangueBundle().getString("nbreBoissons"));ligne3Text.setText(getLangueBundle().getString("bipSonore"));ligne4Text.setText(getLangueBundle().getString("protectionContreGel"));
		ligne5Text.setText(getLangueBundle().getString("langues"));ligne6Text.setText(getLangueBundle().getString("filtreEau"));ligne7Text.setText(getLangueBundle().getString("temperatureCafe"));ligne8Text.setText(getLangueBundle().getString("arretAutomatique"));
		ligne9Text.setText(getLangueBundle().getString("dureteEau"));ligne10Text.setText(getLangueBundle().getString("favori"));ligne11Text.setText(getLangueBundle().getString("proportionLaitCafe"));ligne12Text.setText(getLangueBundle().getString("reglerQteBoissons"));
		ligne13Text.setText(getLangueBundle().getString("nettoyageEntretien"));
		    break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3,ligne4,ligne5);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}

	public void displayChoixBoissonFavori(String value) {
		
		Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		Button btnOk = (value=="selectBoisFav")?getEmptyButtonType2():btOk;
		Button btnDeuxTasses = (value=="selectBoisFav")?getEmptyButtonType2():btDeuxTasses;
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		//btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(btnDeuxTasses, 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btnOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		 HBox selectedDrink = new HBox(); 
		 Text selectedDrinkText =(value=="selectBoisFav")? new Text(getLangueBundle().getString(value)): new Text(deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		 selectedDrinkText.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		 selectedDrinkText.setTextAlignment(TextAlignment.CENTER);
		 selectedDrink.getChildren().addAll(selectedDrinkText);
		 selectedDrink.setAlignment(Pos.CENTER);
		 pane.getChildren().add(selectedDrink); 
		 
		 HBox messageContinu1 = new HBox(); 
		 Text messageContinu1Text = (value=="selectBoisFav")?new Text():new Text(getLangueBundle().getString("messageContinu1"));
		 messageContinu1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 messageContinu1.getChildren().addAll(messageContinu1Text);
		 messageContinu1.setAlignment(Pos.CENTER);

		 
		 VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 centralScreen.getChildren().addAll(pane,messageContinu1);
		 centralScreenText.getChildren().add(centralScreen);
	
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;

	}

	public void displaySelectTailleIntensiteBoissonFav(String value) {
		Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		//Button btnOk = (value=="selectBoisFav")?getEmptyButtonType2():btOk;
		//Button btnDeuxTasses = (value=="selectBoisFav")?getEmptyButtonType2():btDeuxTasses;
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		//btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(btIntensite, 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(btMl, 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
		HBox selectIntensiteTailleCafeMessage = new HBox(); 
		Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
		selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
		selectIntensiteTailleCafeMessageText.setTextAlignment(TextAlignment.CENTER);
		selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
		selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
		pane.getChildren().add(selectIntensiteTailleCafeMessage); 
		 
		 Boolean isIntensiteCafe = !(value=="eauchaude"||value=="mousselait"||value=="laitchaud");

		 //GridPane tailleIntensiteCafe= new GridPane(); 
		 Text intensiteCafe = isIntensiteCafe?new Text(30, 90,getLangueBundle().getString(getIntensiteDucafe())):new Text();
		 Text tailleDeLaTasse = new Text(220, 90,getLangueBundle().getString(getTailleDeLaTasse()));
		 intensiteCafe.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 tailleDeLaTasse.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 //tailleIntensiteCafe.add(intensiteCafe,0,0);
		 //tailleIntensiteCafe.add(tailleDeLaTasse,4,0);
		 //tailleIntensiteCafe.setAlignment(Pos.CENTER);

		 
		 VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 centralScreen.getChildren().addAll(pane);
		 centralScreenText.getChildren().add(centralScreen);
		 centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
			
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;
		
	}
	
	public void displayTailleTasseBoissonFavMessage(String value) {
		Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		//Button btnOk = (value=="selectBoisFav")?getEmptyButtonType2():btOk;
		//Button btnDeuxTasses = (value=="selectBoisFav")?getEmptyButtonType2():btDeuxTasses;
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		//btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
		HBox selectIntensiteTailleCafeMessage = new HBox(); 
		Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
		selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
		selectIntensiteTailleCafeMessageText.setTextAlignment(TextAlignment.CENTER);
		selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
		selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
		pane.getChildren().add(selectIntensiteTailleCafeMessage); 
		 
		 //GridPane tailleIntensiteCafe= new GridPane(); 
		 //Text intensiteCafe = new Text(30, 90,getLangueBundle().getString(getIntensiteDucafe()));
		 //Text tailleDeLaTasse = new Text(220, 90,getLangueBundle().getString(getTailleDeLaTasse()));
		 //intensiteCafe.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 //tailleDeLaTasse.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 //tailleIntensiteCafe.add(intensiteCafe,0,0);
		 //tailleIntensiteCafe.add(tailleDeLaTasse,4,0);
		 //tailleIntensiteCafe.setAlignment(Pos.CENTER);

		 
		 VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 centralScreen.getChildren().addAll(pane);
		 centralScreenText.getChildren().add(centralScreen);
		 //centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
			
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;

	}
	
	public void displaySelectTailleTasseBoissonFav(String value) {
		
		Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		//Button btnOk = (value=="selectBoisFav")?getEmptyButtonType2():btOk;
		//Button btnDeuxTasses = (value=="selectBoisFav")?getEmptyButtonType2():btDeuxTasses;
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(btNav);
		//btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
        Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
//		HBox selectIntensiteTailleCafeMessage = new HBox(); 
//		Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
//		selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
//		selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
//		selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text("120 ml");
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1); 
		 
		HBox ligne2 = new HBox(); 
		Text ligne2Text = new Text("140 ml");
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox(); 
		Text ligne3Text = new Text("160 ml");
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);
		
		HBox ligne4 = new HBox(); 
		Text ligne4Text = new Text("180 ml");
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne4.getChildren().addAll(ligne4Text);
		ligne4.setAlignment(Pos.CENTER);
		
		HBox ligne5 = new HBox(); 
		Text ligne5Text = new Text("200 ml");
		ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne5.getChildren().addAll(ligne5Text);
		ligne5.setAlignment(Pos.CENTER);
		
		switch ((int)(double)getTailleTasseBoiFav()) {
		case 140:ligne1Text.setText("140 ml");ligne2Text.setText("160 ml");ligne3Text.setText("180 ml");ligne4Text.setText("200 ml");ligne5Text.setText("120 ml");
		    break;
		case 160:ligne1Text.setText("160 ml");ligne2Text.setText("180 ml");ligne3Text.setText("200 ml");ligne4Text.setText("120 ml");ligne5Text.setText("140 ml");
			break;
		case 180:ligne1Text.setText("180 ml");ligne2Text.setText("200 ml");ligne3Text.setText("120 ml");ligne4Text.setText("140 ml");ligne5Text.setText("160 ml");
	    	break;
		case 200:ligne1Text.setText("200 ml");ligne2Text.setText("120 ml");ligne3Text.setText("140 ml");ligne4Text.setText("160 ml");ligne5Text.setText("180 ml");
    		break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
		 centralScreenText.getChildren().add(centralScreen); 
		
		//VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 //centralScreen.getChildren().addAll(pane);
		 //centralScreenText.getChildren().add(centralScreen);
		 //centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
			
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;
	}
	
	public void displayTemperatureBoissonFavMessage(String value) {
		
		Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		//Button btnOk = (value=="selectBoisFav")?getEmptyButtonType2():btOk;
		//Button btnDeuxTasses = (value=="selectBoisFav")?getEmptyButtonType2():btDeuxTasses;
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		//btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
		HBox temperatureBoissonMessage = new HBox(); 
		Text temperatureBoissonText = new Text(getLangueBundle().getString(getMessage()));
		temperatureBoissonText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
		temperatureBoissonText.setTextAlignment(TextAlignment.CENTER);
		temperatureBoissonMessage.getChildren().addAll(temperatureBoissonText);
		temperatureBoissonMessage.setAlignment(Pos.CENTER);
		pane.getChildren().add(temperatureBoissonMessage); 
		 
		 //GridPane tailleIntensiteCafe= new GridPane(); 
		 //Text intensiteCafe = new Text(30, 90,getLangueBundle().getString(getIntensiteDucafe()));
		 //Text tailleDeLaTasse = new Text(220, 90,getLangueBundle().getString(getTailleDeLaTasse()));
		 //intensiteCafe.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 //tailleDeLaTasse.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 //tailleIntensiteCafe.add(intensiteCafe,0,0);
		 //tailleIntensiteCafe.add(tailleDeLaTasse,4,0);
		 //tailleIntensiteCafe.setAlignment(Pos.CENTER);

		 
		 VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 centralScreen.getChildren().addAll(pane);
		 centralScreenText.getChildren().add(centralScreen);
		 //centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
			
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;
	}

	public void displaySelectTemperatureBoissonFav(String value) {
		
		Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		//Button btnOk = (value=="selectBoisFav")?getEmptyButtonType2():btOk;
		//Button btnDeuxTasses = (value=="selectBoisFav")?getEmptyButtonType2():btDeuxTasses;
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(btNav);
		//btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
        Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
//		HBox selectIntensiteTailleCafeMessage = new HBox(); 
//		Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
//		selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
//		selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
//		selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("haute"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1); 
		 
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
		
		switch (getTemperatureBoissonFav()) {
		case "haute":ligne1Text.setText(getLangueBundle().getString("haute"));ligne2Text.setText(getLangueBundle().getString("maxi"));ligne3Text.setText(getLangueBundle().getString("normale"));
			break;
		case "maxi":ligne1Text.setText(getLangueBundle().getString("maxi"));ligne2Text.setText(getLangueBundle().getString("haute"));ligne3Text.setText(getLangueBundle().getString("normale"));
		    break;
		case "normale":ligne1Text.setText(getLangueBundle().getString("normale"));ligne2Text.setText(getLangueBundle().getString("maxi"));ligne3Text.setText(getLangueBundle().getString("haute"));
			break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
		 centralScreenText.getChildren().add(centralScreen); 
		
		//VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 //centralScreen.getChildren().addAll(pane);
		 //centralScreenText.getChildren().add(centralScreen);
		 //centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
			
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;

	}

	public void displayRatioLaitCafeFavMessage(String value) {
		Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		//Button btnOk = (value=="selectBoisFav")?getEmptyButtonType2():btOk;
		//Button btnDeuxTasses = (value=="selectBoisFav")?getEmptyButtonType2():btDeuxTasses;
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		//btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(60);
		rectangle.setStroke(Color.LIGHTGRAY);
		rectangle.setFill(Color.LIGHTGRAY);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
		HBox ratioLaitCafeFavMessage = new HBox(); 
		Text ratioLaitCafeFavMessageText = new Text(getLangueBundle().getString(getMessage()));
		ratioLaitCafeFavMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
		ratioLaitCafeFavMessageText.setTextAlignment(TextAlignment.CENTER);
		ratioLaitCafeFavMessage.getChildren().addAll(ratioLaitCafeFavMessageText);
		ratioLaitCafeFavMessage.setAlignment(Pos.CENTER);
		pane.getChildren().add(ratioLaitCafeFavMessage); 
		 
		 //GridPane tailleIntensiteCafe= new GridPane(); 
		 //Text intensiteCafe = new Text(30, 90,getLangueBundle().getString(getIntensiteDucafe()));
		 //Text tailleDeLaTasse = new Text(220, 90,getLangueBundle().getString(getTailleDeLaTasse()));
		 //intensiteCafe.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 //tailleDeLaTasse.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 12));
		 //tailleIntensiteCafe.add(intensiteCafe,0,0);
		 //tailleIntensiteCafe.add(tailleDeLaTasse,4,0);
		 //tailleIntensiteCafe.setAlignment(Pos.CENTER);

		 
		 VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 centralScreen.getChildren().addAll(pane);
		 centralScreenText.getChildren().add(centralScreen);
		 //centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
			
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;

	}

	public void displaySelectRatioLaitCafeFav(String value) {
		Button btnExpresso = value=="expresso"?btExpressoSelected:btExpresso;
		Button btnExpressoMacch = value=="expressomacch"?btExpressoMacchSelected:btExpressoMacch;
		Button btnCafe = value=="cafe"?btCafeSelected:btCafe;
		Button btnCappuccino = value=="cappuccino"?btCappuccinoSelected:btCappuccino;
		Button btnLatteMacchiato = value=="lattemacchiato"?btLatteMacchiatoSelected:btLatteMacchiato;
		Button btnCafeAuLait = value=="cafeaulait"?btCafeAuLaitSelected:btCafeAuLait;
		Button btnMousseLait = value=="mousselait"?btMousseLaitSelected:btMousseLait;
		Button btnBoissonSpeciales = (value=="eauchaude"||value=="laitchaud"||value=="verseuse"||value=="americano"||value=="flatwhite"||value=="cafecortado")?btBoissonSpecialeSelected:btBoissonSpeciales;
		//Button btnOk = (value=="selectBoisFav")?getEmptyButtonType2():btOk;
		//Button btnDeuxTasses = (value=="selectBoisFav")?getEmptyButtonType2():btDeuxTasses;
		
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(btNav);
		//btNavBandeau.setStyle("-fx-background-color: black");
		btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(btnExpresso, 0, 0);
		bandeauDeCommandes.add(btnExpressoMacch, 1, 0);
		bandeauDeCommandes.add(btnCafe, 2, 0);
		bandeauDeCommandes.add(btnCappuccino, 3, 0);
		bandeauDeCommandes.add(btnLatteMacchiato, 4, 0);
		bandeauDeCommandes.add(btnCafeAuLait, 5, 0);
		bandeauDeCommandes.add(btnMousseLait, 6, 0);
		bandeauDeCommandes.add(btnBoissonSpeciales, 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
        Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
//		HBox selectIntensiteTailleCafeMessage = new HBox(); 
//		Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
//		selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
//		selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
//		selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text("50 %");
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1); 
		 
		HBox ligne2 = new HBox(); 
		Text ligne2Text = new Text("60 %");
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne2.getChildren().addAll(ligne2Text);
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox(); 
		Text ligne3Text = new Text("70 %");
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne3.getChildren().addAll(ligne3Text);
		ligne3.setAlignment(Pos.CENTER);
		
		HBox ligne4 = new HBox(); 
		Text ligne4Text = new Text("80 %");
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne4.getChildren().addAll(ligne4Text);
		ligne4.setAlignment(Pos.CENTER);
		
		HBox ligne5 = new HBox(); 
		Text ligne5Text = new Text("90 %");
		ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne5.getChildren().addAll(ligne5Text);
		ligne5.setAlignment(Pos.CENTER);
		
		switch ((int)(double)getRatioLaitCafe()) {
		case 60:ligne1Text.setText("60 %");ligne2Text.setText("70 %");ligne3Text.setText("80 %");ligne4Text.setText("90 %");ligne5Text.setText("50 %");
			break;
		case 70:ligne1Text.setText("70 %");ligne2Text.setText("80 %");ligne3Text.setText("90 %");ligne4Text.setText("50 %");ligne5Text.setText("60 %");
		    break;
		case 80:ligne1Text.setText("80 %");ligne2Text.setText("90 %");ligne3Text.setText("50 %");ligne4Text.setText("60 %");ligne5Text.setText("70 %");
			break;
		case 90:ligne1Text.setText("90 %");ligne2Text.setText("50 %");ligne3Text.setText("60 %");ligne4Text.setText("70 %");ligne5Text.setText("80 %");
	    	break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
		 centralScreenText.getChildren().add(centralScreen); 
		
		//VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 //centralScreen.getChildren().addAll(pane);
		 //centralScreenText.getChildren().add(centralScreen);
		 //centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
			
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;

	}
	
	public void beepSound() {
		//java.awt.Toolkit.getDefaultToolkit().beep();
		/*try{

	        InputStream inputStream = getClass().getResourceAsStream("/audio/beep-08b.wav"); //Note this is path to whatever wav file you want
	            AudioStream audioStream = new AudioStream(inputStream);
	            AudioPlayer.player.start(audioStream);
	        }
	    catch (IOException e) {
	       // Whatever exception you please;
	    }*/
        Media media = new Media(new File("src/main/resources/audio/beep-08b.wav").toURI().toString());  
        //Media media = new Media(new File("\\Users\\User\\Downloads\\apartirdu041220aprescopieCdisk\\beep-08b.wav").toURI().toString());  
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);
	}
	
	public void displayMenuNettoyageEtEntretien(String value) {
		
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		 /*ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		 choixLangue.setFitHeight(16);
		 choixLangue.setFitWidth(15);
		 choixLangue.setStyle("-fx-background-color:lightgray");*/
		 
		 ImageView tasse1 = new ImageView(new Image("/images/tasse1.png"));
		 tasse1.setFitHeight(16);
		 tasse1.setFitWidth(15);
		 tasse1.setStyle("-fx-background-color:lightgray");
		 
		 ImageView tasse2 = new ImageView(new Image("/images/tasse2.png"));
		 tasse2.setFitHeight(16);
		 tasse2.setFitWidth(15);
		 tasse2.setStyle("-fx-background-color:lightgray");
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("nettoyerMousseurLait"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1);

		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString("nettoyer"));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne2.getChildren().addAll(ligne2Text);
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString("detartrer"));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text);
		 ligne3.setAlignment(Pos.CENTER);
		 
		 HBox ligne4 = new HBox(); 
		 Text ligne4Text = new Text(getLangueBundle().getString("calcnClean"));
		 ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne4.getChildren().addAll(ligne4Text);
		 ligne4.setAlignment(Pos.CENTER);
		 
		 HBox ligne5 = new HBox(); 
		 Text ligne5Text = new Text(getLangueBundle().getString("nettoyerDans")+(30-getNbreBoissons())+" ");
		 ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne5.getChildren().addAll(ligne5Text,tasse1);
		 ligne5.setAlignment(Pos.CENTER);
		 
		 HBox ligne6 = new HBox(); 
		 Text ligne6Text = new Text(getLangueBundle().getString("detartrerDans")+(getIsFilterPresent()?120-getNbreBoissons():60-getNbreBoissons())+" ");
		 ligne6Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne6.getChildren().addAll(ligne6Text,tasse2);
		 ligne6.setAlignment(Pos.CENTER);
		 		 
		switch (value) {
		case "nettoyer":ligne1Text.setText(getLangueBundle().getString("nettoyer"));ligne2Text.setText(getLangueBundle().getString("detartrer"));ligne3Text.setText(getLangueBundle().getString("calcnClean"));
		ligne4Text.setText(getLangueBundle().getString("nettoyerDans")+(30-getNbreBoissons())+" ");ligne5Text.setText(getLangueBundle().getString("detartrerDans")+(getIsFilterPresent()?120-getNbreBoissons():60-getNbreBoissons())+" ");
		ligne6Text.setText(getLangueBundle().getString("nettoyerMousseurLait"));
		    break;
		case "detartrer":ligne1Text.setText(getLangueBundle().getString("detartrer"));ligne2Text.setText(getLangueBundle().getString("calcnClean"));ligne3Text.setText(getLangueBundle().getString("nettoyerDans")+(30-getNbreBoissons())+" ");
		ligne4Text.setText(getLangueBundle().getString("detartrerDans")+(getIsFilterPresent()?120-getNbreBoissons():60-getNbreBoissons())+" ");ligne5Text.setText(getLangueBundle().getString("nettoyerMousseurLait"));
		ligne6Text.setText(getLangueBundle().getString("nettoyer"));ligne3.getChildren().addAll(tasse1);
		    break;
		case "calcnClean":ligne1Text.setText(getLangueBundle().getString("calcnClean"));ligne2Text.setText(getLangueBundle().getString("nettoyerDans")+(30-getNbreBoissons())+" ");ligne3Text.setText(getLangueBundle().getString("detartrerDans")+(getIsFilterPresent()?120-getNbreBoissons():60-getNbreBoissons())+" ");
		ligne4Text.setText(getLangueBundle().getString("nettoyerMousseurLait"));ligne5Text.setText(getLangueBundle().getString("nettoyer"));ligne6Text.setText(getLangueBundle().getString("detartrer"));
		ligne2.getChildren().addAll(tasse1);ligne3.getChildren().addAll(tasse2);
		    break;
		case "nettoyerDans":ligne1Text.setText(getLangueBundle().getString("nettoyerDans")+(30-getNbreBoissons())+" ");ligne2Text.setText(getLangueBundle().getString("detartrerDans")+(getIsFilterPresent()?120-getNbreBoissons():60-getNbreBoissons())+" ");
		ligne3Text.setText(getLangueBundle().getString("nettoyerMousseurLait"));ligne4Text.setText(getLangueBundle().getString("nettoyer"));ligne5Text.setText(getLangueBundle().getString("detartrer"));ligne6Text.setText(getLangueBundle().getString("calcnClean"));
		ligne1.getChildren().addAll(tasse1);ligne2.getChildren().addAll(tasse2);
		    break;
		case "detartrerDans":ligne1Text.setText(getLangueBundle().getString("detartrerDans")+(getIsFilterPresent()?120-getNbreBoissons():60-getNbreBoissons())+" ");ligne2Text.setText(getLangueBundle().getString("nettoyerMousseurLait"));
		ligne3Text.setText(getLangueBundle().getString("nettoyer"));ligne4Text.setText(getLangueBundle().getString("detartrer"));ligne5Text.setText(getLangueBundle().getString("calcnClean"));
		ligne6Text.setText(getLangueBundle().getString("nettoyerDans")+(30-getNbreBoissons())+" ");ligne1.getChildren().addAll(tasse1);
		    break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}

	public void displayReglageDureteDeLeau(String value) {
		
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		 choixLangue.setFitHeight(16);
		 choixLangue.setFitWidth(15);
		 choixLangue.setStyle("-fx-background-color:lightgray");
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("dureteEau1"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text,(getDureteDeLeau()=="dureteEau1"?choixLangue:new ImageView()));
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1);

		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString("dureteEau2"));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne2.getChildren().addAll(ligne2Text,(getDureteDeLeau()=="dureteEau2"?choixLangue:new ImageView()));
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString("dureteEau3"));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text,(getDureteDeLeau()=="dureteEau3"?choixLangue:new ImageView()));
		 ligne3.setAlignment(Pos.CENTER);
		 
		 HBox ligne4 = new HBox(); 
		 Text ligne4Text = new Text(getLangueBundle().getString("dureteEau4"));
		 ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne4.getChildren().addAll(ligne4Text,(getDureteDeLeau()=="dureteEau4"?choixLangue:new ImageView()));
		 ligne4.setAlignment(Pos.CENTER);
		 		 
		switch (value) {
		case "dureteEau2":ligne1Text.setText(getLangueBundle().getString("dureteEau2"));ligne2Text.setText(getLangueBundle().getString("dureteEau3"));
		ligne3Text.setText(getLangueBundle().getString("dureteEau4"));ligne4Text.setText(getLangueBundle().getString("dureteEau1"));
		ligne1.getChildren().addAll((getDureteDeLeau()=="dureteEau2"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getDureteDeLeau()=="dureteEau3"?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getDureteDeLeau()=="dureteEau4"?choixLangue:new ImageView()));ligne4.getChildren().addAll((getDureteDeLeau()=="dureteEau1"?choixLangue:new ImageView()));
		    break;
		case "dureteEau3":ligne1Text.setText(getLangueBundle().getString("dureteEau3"));ligne2Text.setText(getLangueBundle().getString("dureteEau4"));
		ligne3Text.setText(getLangueBundle().getString("dureteEau1"));ligne4Text.setText(getLangueBundle().getString("dureteEau2"));
		ligne1.getChildren().addAll((getDureteDeLeau()=="dureteEau3"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getDureteDeLeau()=="dureteEau4"?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getDureteDeLeau()=="dureteEau1"?choixLangue:new ImageView()));ligne4.getChildren().addAll((getDureteDeLeau()=="dureteEau2"?choixLangue:new ImageView()));
		    break;
		case "dureteEau4":ligne1Text.setText(getLangueBundle().getString("dureteEau4"));ligne2Text.setText(getLangueBundle().getString("dureteEau1"));
		ligne3Text.setText(getLangueBundle().getString("dureteEau2"));ligne4Text.setText(getLangueBundle().getString("dureteEau3"));
		ligne1.getChildren().addAll((getDureteDeLeau()=="dureteEau4"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getDureteDeLeau()=="dureteEau1"?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getDureteDeLeau()=="dureteEau2"?choixLangue:new ImageView()));ligne4.getChildren().addAll((getDureteDeLeau()=="dureteEau3"?choixLangue:new ImageView()));
		    break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3,ligne4);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}
	public void displayReglageLangue(String value) {
		
		this.langueBundle=(getLangue()=="nederland")?bundleNL:((getLangue()=="english")?bundleEN:bundleFR);
		
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		 choixLangue.setFitHeight(16);
		 choixLangue.setFitWidth(15);
		 choixLangue.setStyle("-fx-background-color:lightgray");
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("english"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text,(getLangue()=="english"?choixLangue:new ImageView()));
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1);

		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString("nederland"));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
    	 ligne2.getChildren().addAll(ligne2Text,(getLangue()=="nederland"?choixLangue:new ImageView()));
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString("francais"));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text,(getLangue()=="francais"?choixLangue:new ImageView()));
		 ligne3.setAlignment(Pos.CENTER);
		 
		 		 
		switch (value) {
		case "nederland":ligne1Text.setText(getLangueBundle().getString("nederland"));ligne2Text.setText(getLangueBundle().getString("francais"));
		ligne3Text.setText(getLangueBundle().getString("english"));
		ligne1.getChildren().addAll((getLangue()=="nederland"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getLangue()=="francais"?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getLangue()=="english"?choixLangue:new ImageView()));
		    break;
		case "francais":ligne1Text.setText(getLangueBundle().getString("francais"));ligne2Text.setText(getLangueBundle().getString("english"));
		ligne3Text.setText(getLangueBundle().getString("nederland"));
		ligne1.getChildren().addAll((getLangue()=="francais"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getLangue()=="english"?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getLangue()=="nederland"?choixLangue:new ImageView()));
		    break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}

	public void displayReglageQteBoisson(String value) {
		
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("expressoPetit"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1);

		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString("expressoMoyen"));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne2.getChildren().addAll(ligne2Text);
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString("expressoGrand"));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text);
		 ligne3.setAlignment(Pos.CENTER);
		 
		 HBox ligne4 = new HBox(); 
		 Text ligne4Text = new Text(getLangueBundle().getString("expressomacchPetit"));
		 ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne4.getChildren().addAll(ligne4Text);
		 ligne4.setAlignment(Pos.CENTER);
		 
		 HBox ligne5 = new HBox(); 
		 Text ligne5Text = new Text(getLangueBundle().getString("expressomacchMoyen"));
		 ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne5.getChildren().addAll(ligne5Text);
		 ligne5.setAlignment(Pos.CENTER);
		 
		 HBox ligne6 = new HBox(); 
		 Text ligne6Text = new Text(getLangueBundle().getString("expressomacchGrand"));
		 ligne6Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne6.getChildren().addAll(ligne6Text);
		 ligne6.setAlignment(Pos.CENTER);
		 
		 HBox ligne7 = new HBox(); 
		 Text ligne7Text = new Text(getLangueBundle().getString("cafePetit"));
		 ligne7Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne7.getChildren().addAll(ligne7Text);
		 ligne7.setAlignment(Pos.CENTER);
		 
		 HBox ligne8 = new HBox(); 
		 Text ligne8Text = new Text(getLangueBundle().getString("cafeMoyen"));
		 ligne8Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne8.getChildren().addAll(ligne8Text);
		 ligne8.setAlignment(Pos.CENTER);
		 
		 HBox ligne9 = new HBox(); 
		 Text ligne9Text = new Text(getLangueBundle().getString("cafeGrand"));
		 ligne9Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne9.getChildren().addAll(ligne9Text);
		 ligne9.setAlignment(Pos.CENTER);
		 
		 HBox ligne10 = new HBox(); 
		 Text ligne10Text = new Text(getLangueBundle().getString("cappuccinoPetit"));
		 ligne10Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne10.getChildren().addAll(ligne10Text);
		 ligne10.setAlignment(Pos.CENTER);
		 
		 HBox ligne11 = new HBox(); 
		 Text ligne11Text = new Text(getLangueBundle().getString("cappuccinoMoyen"));
		 ligne11Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne11.getChildren().addAll(ligne11Text);
		 ligne11.setAlignment(Pos.CENTER);
		 
		 HBox ligne12 = new HBox(); 
		 Text ligne12Text = new Text(getLangueBundle().getString("cappuccinoGrand"));
		 ligne12Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne12.getChildren().addAll(ligne12Text);
		 ligne12.setAlignment(Pos.CENTER);
		 
		 HBox ligne13 = new HBox(); 
		 Text ligne13Text = new Text(getLangueBundle().getString("lattemacchiatoPetit"));
		 ligne13Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne13.getChildren().addAll(ligne13Text);
		 ligne13.setAlignment(Pos.CENTER);
		 
		 HBox ligne14 = new HBox(); 
		 Text ligne14Text = new Text(getLangueBundle().getString("lattemacchiatoMoyen"));
		 ligne14Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne14.getChildren().addAll(ligne14Text);
		 ligne14.setAlignment(Pos.CENTER);
		 
		 HBox ligne15 = new HBox(); 
		 Text ligne15Text = new Text(getLangueBundle().getString("lattemacchiatoGrand"));
		 ligne15Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne15.getChildren().addAll(ligne15Text);
		 ligne15.setAlignment(Pos.CENTER);
		 
		 HBox ligne16 = new HBox(); 
		 Text ligne16Text = new Text(getLangueBundle().getString("cafeaulaitPetit"));
		 ligne16Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne16.getChildren().addAll(ligne16Text);
		 ligne16.setAlignment(Pos.CENTER);
		 
		 HBox ligne17 = new HBox(); 
		 Text ligne17Text = new Text(getLangueBundle().getString("cafeaulaitMoyen"));
		 ligne17Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne17.getChildren().addAll(ligne17Text);
		 ligne17.setAlignment(Pos.CENTER);
		 
		 HBox ligne18 = new HBox(); 
		 Text ligne18Text = new Text(getLangueBundle().getString("cafeaulaitGrand"));
		 ligne18Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne18.getChildren().addAll(ligne18Text);
		 ligne18.setAlignment(Pos.CENTER);
		 
		 HBox ligne19 = new HBox(); 
		 Text ligne19Text = new Text(getLangueBundle().getString("mousselaitPetit"));
		 ligne19Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne19.getChildren().addAll(ligne19Text);
		 ligne19.setAlignment(Pos.CENTER);
		 
		 HBox ligne20 = new HBox(); 
		 Text ligne20Text = new Text(getLangueBundle().getString("mousselaitMoyen"));
		 ligne20Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne20.getChildren().addAll(ligne20Text);
		 ligne20.setAlignment(Pos.CENTER);
		 
		 HBox ligne21 = new HBox(); 
		 Text ligne21Text = new Text(getLangueBundle().getString("mousselaitGrand"));
		 ligne21Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne21.getChildren().addAll(ligne21Text);
		 ligne21.setAlignment(Pos.CENTER);
		 
		 HBox ligne22 = new HBox(); 
		 Text ligne22Text = new Text(getLangueBundle().getString("eauchaudePetit"));
		 ligne22Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne22.getChildren().addAll(ligne22Text);
		 ligne22.setAlignment(Pos.CENTER);
		 
		 HBox ligne23 = new HBox(); 
		 Text ligne23Text = new Text(getLangueBundle().getString("eauchaudeMoyen"));
		 ligne23Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne23.getChildren().addAll(ligne23Text);
		 ligne23.setAlignment(Pos.CENTER);
		 
		 HBox ligne24 = new HBox(); 
		 Text ligne24Text = new Text(getLangueBundle().getString("eauchaudeGrand"));
		 ligne24Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne24.getChildren().addAll(ligne24Text);
		 ligne24.setAlignment(Pos.CENTER);
		 
		 HBox ligne25 = new HBox(); 
		 Text ligne25Text = new Text(getLangueBundle().getString("laitchaudPetit"));
		 ligne25Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne25.getChildren().addAll(ligne25Text);
		 ligne25.setAlignment(Pos.CENTER);
		 
		 HBox ligne26 = new HBox(); 
		 Text ligne26Text = new Text(getLangueBundle().getString("laitchaudMoyen"));
		 ligne26Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne26.getChildren().addAll(ligne26Text);
		 ligne26.setAlignment(Pos.CENTER);
		 
		 HBox ligne27 = new HBox(); 
		 Text ligne27Text = new Text(getLangueBundle().getString("laitchaudGrand"));
		 ligne27Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne27.getChildren().addAll(ligne27Text);
		 ligne27.setAlignment(Pos.CENTER);
		 
		 HBox ligne28 = new HBox(); 
		 Text ligne28Text = new Text(getLangueBundle().getString("verseusePetit"));
		 ligne28Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne28.getChildren().addAll(ligne28Text);
		 ligne28.setAlignment(Pos.CENTER);
		 
		 HBox ligne29 = new HBox(); 
		 Text ligne29Text = new Text(getLangueBundle().getString("verseuseMoyen"));
		 ligne29Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne29.getChildren().addAll(ligne29Text);
		 ligne29.setAlignment(Pos.CENTER);
		 
		 HBox ligne30 = new HBox(); 
		 Text ligne30Text = new Text(getLangueBundle().getString("verseuseGrand"));
		 ligne30Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne30.getChildren().addAll(ligne30Text);
		 ligne30.setAlignment(Pos.CENTER);
		 
		 HBox ligne31 = new HBox(); 
		 Text ligne31Text = new Text(getLangueBundle().getString("americanoPetit"));
		 ligne31Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne31.getChildren().addAll(ligne31Text);
		 ligne31.setAlignment(Pos.CENTER);
		 
		 HBox ligne32 = new HBox(); 
		 Text ligne32Text = new Text(getLangueBundle().getString("americanoMoyen"));
		 ligne32Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne32.getChildren().addAll(ligne31Text);
		 ligne32.setAlignment(Pos.CENTER);
		 
		 HBox ligne33 = new HBox(); 
		 Text ligne33Text = new Text(getLangueBundle().getString("americanoGrand"));
		 ligne33Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne33.getChildren().addAll(ligne33Text);
		 ligne33.setAlignment(Pos.CENTER);
		 
		 HBox ligne34 = new HBox(); 
		 Text ligne34Text = new Text(getLangueBundle().getString("flatwhitePetit"));
		 ligne34Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne34.getChildren().addAll(ligne34Text);
		 ligne34.setAlignment(Pos.CENTER);
		 
		 HBox ligne35 = new HBox(); 
		 Text ligne35Text = new Text(getLangueBundle().getString("flatwhiteMoyen"));
		 ligne35Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne35.getChildren().addAll(ligne35Text);
		 ligne35.setAlignment(Pos.CENTER);
		 
		 HBox ligne36 = new HBox(); 
		 Text ligne36Text = new Text(getLangueBundle().getString("flatwhiteGrand"));
		 ligne36Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne36.getChildren().addAll(ligne36Text);
		 ligne36.setAlignment(Pos.CENTER);
		 
		 HBox ligne37 = new HBox(); 
		 Text ligne37Text = new Text(getLangueBundle().getString("cafecortadoPetit"));
		 ligne37Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne37.getChildren().addAll(ligne37Text);
		 ligne37.setAlignment(Pos.CENTER);
		 
		 HBox ligne38 = new HBox(); 
		 Text ligne38Text = new Text(getLangueBundle().getString("cafecortadoMoyen"));
		 ligne38Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne38.getChildren().addAll(ligne38Text);
		 ligne38.setAlignment(Pos.CENTER);
		 
		 HBox ligne39 = new HBox(); 
		 Text ligne39Text = new Text(getLangueBundle().getString("cafecortadoGrand"));
		 ligne39Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne39.getChildren().addAll(ligne39Text);
		 ligne39.setAlignment(Pos.CENTER);
		 
		switch (value) {
		case "expressoMoyen":ligne1Text.setText(getLangueBundle().getString("expressoMoyen"));ligne2Text.setText(getLangueBundle().getString("expressoGrand"));ligne3Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne4Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne5Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne6Text.setText(getLangueBundle().getString("cafePetit"));
		ligne7Text.setText(getLangueBundle().getString("cafeMoyen"));ligne8Text.setText(getLangueBundle().getString("cafeGrand"));ligne9Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne10Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne11Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne12Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne13Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne14Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne15Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne16Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne17Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne18Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne19Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne20Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne21Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne22Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne23Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne24Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne25Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne26Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne27Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne28Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne29Text.setText(getLangueBundle().getString("verseuseGrand"));ligne30Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne31Text.setText(getLangueBundle().getString("americanoMoyen"));ligne32Text.setText(getLangueBundle().getString("americanoGrand"));ligne33Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne34Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne35Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne36Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne37Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne38Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne39Text.setText(getLangueBundle().getString("expressoPetit"));
			break;
		case "expressoGrand":ligne39Text.setText(getLangueBundle().getString("expressoMoyen"));ligne1Text.setText(getLangueBundle().getString("expressoGrand"));ligne2Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne3Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne4Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne5Text.setText(getLangueBundle().getString("cafePetit"));
		ligne6Text.setText(getLangueBundle().getString("cafeMoyen"));ligne7Text.setText(getLangueBundle().getString("cafeGrand"));ligne8Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne9Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne10Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne11Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne12Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne13Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne14Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne15Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne16Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne17Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne18Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne19Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne20Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne21Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne22Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne23Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne24Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne25Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne26Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne27Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne28Text.setText(getLangueBundle().getString("verseuseGrand"));ligne29Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne30Text.setText(getLangueBundle().getString("americanoMoyen"));ligne31Text.setText(getLangueBundle().getString("americanoGrand"));ligne32Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne33Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne34Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne35Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne36Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne37Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne38Text.setText(getLangueBundle().getString("expressoPetit"));
		    break;
		case "expressomacchPetit":ligne38Text.setText(getLangueBundle().getString("expressoMoyen"));ligne39Text.setText(getLangueBundle().getString("expressoGrand"));ligne1Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne2Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne3Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne4Text.setText(getLangueBundle().getString("cafePetit"));
		ligne5Text.setText(getLangueBundle().getString("cafeMoyen"));ligne6Text.setText(getLangueBundle().getString("cafeGrand"));ligne7Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne8Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne9Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne10Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne11Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne12Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne13Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne14Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne15Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne16Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne17Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne18Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne19Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne20Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne21Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne22Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne25Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne24Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne25Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne26Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne27Text.setText(getLangueBundle().getString("verseuseGrand"));ligne28Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne29Text.setText(getLangueBundle().getString("americanoMoyen"));ligne30Text.setText(getLangueBundle().getString("americanoGrand"));ligne31Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne32Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne33Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne34Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne35Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne36Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne37Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "expressomacchMoyen":ligne37Text.setText(getLangueBundle().getString("expressoMoyen"));ligne38Text.setText(getLangueBundle().getString("expressoGrand"));ligne39Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne1Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne2Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne3Text.setText(getLangueBundle().getString("cafePetit"));
		ligne4Text.setText(getLangueBundle().getString("cafeMoyen"));ligne5Text.setText(getLangueBundle().getString("cafeGrand"));ligne6Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne7Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne8Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne9Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne10Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne11Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne12Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne13Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne14Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne15Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne16Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne17Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne18Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne19Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne20Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne21Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne22Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne23Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne24Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne25Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne26Text.setText(getLangueBundle().getString("verseuseGrand"));ligne27Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne28Text.setText(getLangueBundle().getString("americanoMoyen"));ligne29Text.setText(getLangueBundle().getString("americanoGrand"));ligne30Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne31Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne32Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne33Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne34Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne35Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne36Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "expressomacchGrand":ligne36Text.setText(getLangueBundle().getString("expressoMoyen"));ligne37Text.setText(getLangueBundle().getString("expressoGrand"));ligne38Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne39Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne1Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne2Text.setText(getLangueBundle().getString("cafePetit"));
		ligne3Text.setText(getLangueBundle().getString("cafeMoyen"));ligne4Text.setText(getLangueBundle().getString("cafeGrand"));ligne5Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne6Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne7Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne8Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne9Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne10Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne11Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne12Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne13Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne14Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne15Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne16Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne17Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne18Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne19Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne20Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne23Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne22Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne23Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne24Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne25Text.setText(getLangueBundle().getString("verseuseGrand"));ligne26Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne27Text.setText(getLangueBundle().getString("americanoMoyen"));ligne28Text.setText(getLangueBundle().getString("americanoGrand"));ligne29Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne30Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne31Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne32Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne33Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne34Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne35Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafePetit":ligne35Text.setText(getLangueBundle().getString("expressoMoyen"));ligne36Text.setText(getLangueBundle().getString("expressoGrand"));ligne37Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne38Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne39Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne1Text.setText(getLangueBundle().getString("cafePetit"));
		ligne2Text.setText(getLangueBundle().getString("cafeMoyen"));ligne3Text.setText(getLangueBundle().getString("cafeGrand"));ligne4Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne5Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne6Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne7Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne8Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne9Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne10Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne11Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne12Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne13Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne14Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne15Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne16Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne17Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne18Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne19Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne20Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne21Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne22Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne23Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne24Text.setText(getLangueBundle().getString("verseuseGrand"));ligne25Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne26Text.setText(getLangueBundle().getString("americanoMoyen"));ligne27Text.setText(getLangueBundle().getString("americanoGrand"));ligne28Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne29Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne30Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne31Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne32Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne33Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne34Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafeMoyen":ligne34Text.setText(getLangueBundle().getString("expressoMoyen"));ligne35Text.setText(getLangueBundle().getString("expressoGrand"));ligne36Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne37Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne38Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne39Text.setText(getLangueBundle().getString("cafePetit"));
		ligne1Text.setText(getLangueBundle().getString("cafeMoyen"));ligne2Text.setText(getLangueBundle().getString("cafeGrand"));ligne3Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne4Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne5Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne6Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne7Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne8Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne9Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne10Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne11Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne12Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne13Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne14Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne15Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne16Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne17Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne18Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne19Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne20Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne21Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne22Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne23Text.setText(getLangueBundle().getString("verseuseGrand"));ligne24Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne25Text.setText(getLangueBundle().getString("americanoMoyen"));ligne26Text.setText(getLangueBundle().getString("americanoGrand"));ligne27Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne28Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne29Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne30Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne31Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne32Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne33Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafeGrand":ligne33Text.setText(getLangueBundle().getString("expressoMoyen"));ligne34Text.setText(getLangueBundle().getString("expressoGrand"));ligne35Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne36Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne37Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne38Text.setText(getLangueBundle().getString("cafePetit"));
		ligne39Text.setText(getLangueBundle().getString("cafeMoyen"));ligne1Text.setText(getLangueBundle().getString("cafeGrand"));ligne2Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne3Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne4Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne5Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne6Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne7Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne8Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne9Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne10Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne11Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne12Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne13Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne14Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne15Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne16Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne17Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne18Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne19Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne20Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne21Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne22Text.setText(getLangueBundle().getString("verseuseGrand"));ligne23Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne24Text.setText(getLangueBundle().getString("americanoMoyen"));ligne25Text.setText(getLangueBundle().getString("americanoGrand"));ligne26Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne27Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne28Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne29Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne30Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne31Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne32Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cappuccinoPetit":ligne32Text.setText(getLangueBundle().getString("expressoMoyen"));ligne33Text.setText(getLangueBundle().getString("expressoGrand"));ligne34Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne35Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne36Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne37Text.setText(getLangueBundle().getString("cafePetit"));
		ligne38Text.setText(getLangueBundle().getString("cafeMoyen"));ligne39Text.setText(getLangueBundle().getString("cafeGrand"));ligne1Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne2Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne3Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne4Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne5Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne6Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne7Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne8Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne9Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne10Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne11Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne12Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne13Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne14Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne15Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne16Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne17Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne18Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne19Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne20Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne21Text.setText(getLangueBundle().getString("verseuseGrand"));ligne22Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne23Text.setText(getLangueBundle().getString("americanoMoyen"));ligne24Text.setText(getLangueBundle().getString("americanoGrand"));ligne25Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne26Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne27Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne28Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne29Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne30Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne31Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cappuccinoMoyen":ligne31Text.setText(getLangueBundle().getString("expressoMoyen"));ligne32Text.setText(getLangueBundle().getString("expressoGrand"));ligne33Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne34Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne35Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne36Text.setText(getLangueBundle().getString("cafePetit"));
		ligne37Text.setText(getLangueBundle().getString("cafeMoyen"));ligne38Text.setText(getLangueBundle().getString("cafeGrand"));ligne39Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne1Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne2Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne3Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne4Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne5Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne6Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne7Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne8Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne9Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne10Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne11Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne12Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne13Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne14Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne15Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne16Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne17Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne18Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne19Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne20Text.setText(getLangueBundle().getString("verseuseGrand"));ligne21Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne22Text.setText(getLangueBundle().getString("americanoMoyen"));ligne23Text.setText(getLangueBundle().getString("americanoGrand"));ligne24Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne25Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne26Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne27Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne28Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne29Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne30Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cappuccinoGrand":ligne30Text.setText(getLangueBundle().getString("expressoMoyen"));ligne31Text.setText(getLangueBundle().getString("expressoGrand"));ligne32Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne33Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne34Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne35Text.setText(getLangueBundle().getString("cafePetit"));
		ligne35Text.setText(getLangueBundle().getString("cafeMoyen"));ligne37Text.setText(getLangueBundle().getString("cafeGrand"));ligne38Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne39Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne1Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne2Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne3Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne4Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne5Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne6Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne7Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne8Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne19Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne10Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne11Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne12Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne13Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne14Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne15Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne16Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne19Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne18Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne19Text.setText(getLangueBundle().getString("verseuseGrand"));ligne20Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne21Text.setText(getLangueBundle().getString("americanoMoyen"));ligne22Text.setText(getLangueBundle().getString("americanoGrand"));ligne23Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne24Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne25Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne26Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne27Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne28Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne29Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "lattemacchiatoPetit":ligne29Text.setText(getLangueBundle().getString("expressoMoyen"));ligne30Text.setText(getLangueBundle().getString("expressoGrand"));ligne31Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne32Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne33Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne34Text.setText(getLangueBundle().getString("cafePetit"));
		ligne34Text.setText(getLangueBundle().getString("cafeMoyen"));ligne36Text.setText(getLangueBundle().getString("cafeGrand"));ligne37Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne38Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne39Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne1Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne2Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne3Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne4Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne5Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne6Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne7Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne18Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne9Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne10Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne11Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne12Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne13Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne14Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne15Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne18Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne17Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne18Text.setText(getLangueBundle().getString("verseuseGrand"));ligne19Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne20Text.setText(getLangueBundle().getString("americanoMoyen"));ligne21Text.setText(getLangueBundle().getString("americanoGrand"));ligne22Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne23Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne24Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne25Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne26Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne27Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne28Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "lattemacchiatoMoyen":ligne28Text.setText(getLangueBundle().getString("expressoMoyen"));ligne29Text.setText(getLangueBundle().getString("expressoGrand"));ligne30Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne31Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne32Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne33Text.setText(getLangueBundle().getString("cafePetit"));
		ligne34Text.setText(getLangueBundle().getString("cafeMoyen"));ligne35Text.setText(getLangueBundle().getString("cafeGrand"));ligne36Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne37Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne38Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne39Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne1Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne2Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne3Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne4Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne5Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne6Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne7Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne8Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne9Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne10Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne11Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne12Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne13Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne14Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne15Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne16Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne17Text.setText(getLangueBundle().getString("verseuseGrand"));ligne18Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne19Text.setText(getLangueBundle().getString("americanoMoyen"));ligne20Text.setText(getLangueBundle().getString("americanoGrand"));ligne21Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne22Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne23Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne24Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne25Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne26Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne27Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "lattemacchiatoGrand":ligne27Text.setText(getLangueBundle().getString("expressoMoyen"));ligne28Text.setText(getLangueBundle().getString("expressoGrand"));ligne29Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne30Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne31Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne32Text.setText(getLangueBundle().getString("cafePetit"));
		ligne33Text.setText(getLangueBundle().getString("cafeMoyen"));ligne34Text.setText(getLangueBundle().getString("cafeGrand"));ligne35Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne36Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne37Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne38Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne39Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne1Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne2Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne3Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne4Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne5Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne6Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne7Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne8Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne9Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne10Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne11Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne12Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne13Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne14Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne15Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne16Text.setText(getLangueBundle().getString("verseuseGrand"));ligne17Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne18Text.setText(getLangueBundle().getString("americanoMoyen"));ligne19Text.setText(getLangueBundle().getString("americanoGrand"));ligne20Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne21Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne22Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne23Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne24Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne25Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne26Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafeaulaitPetit":ligne26Text.setText(getLangueBundle().getString("expressoMoyen"));ligne27Text.setText(getLangueBundle().getString("expressoGrand"));ligne28Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne29Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne30Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne31Text.setText(getLangueBundle().getString("cafePetit"));
		ligne32Text.setText(getLangueBundle().getString("cafeMoyen"));ligne33Text.setText(getLangueBundle().getString("cafeGrand"));ligne34Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne35Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne36Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne37Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne38Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne39Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne1Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne2Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne3Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne4Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne5Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne6Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne7Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne8Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne9Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne10Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne11Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne12Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne13Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne14Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne15Text.setText(getLangueBundle().getString("verseuseGrand"));ligne16Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne17Text.setText(getLangueBundle().getString("americanoMoyen"));ligne18Text.setText(getLangueBundle().getString("americanoGrand"));ligne19Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne20Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne21Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne22Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne23Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne24Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne25Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafeaulaitMoyen":ligne25Text.setText(getLangueBundle().getString("expressoMoyen"));ligne26Text.setText(getLangueBundle().getString("expressoGrand"));ligne27Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne28Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne29Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne30Text.setText(getLangueBundle().getString("cafePetit"));
		ligne31Text.setText(getLangueBundle().getString("cafeMoyen"));ligne32Text.setText(getLangueBundle().getString("cafeGrand"));ligne33Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne34Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne35Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne36Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne37Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne38Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne39Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne1Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne2Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne3Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne4Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne5Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne6Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne7Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne8Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne11Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne10Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne11Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne12Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne13Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne14Text.setText(getLangueBundle().getString("verseuseGrand"));ligne15Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne16Text.setText(getLangueBundle().getString("americanoMoyen"));ligne17Text.setText(getLangueBundle().getString("americanoGrand"));ligne18Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne19Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne20Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne21Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne22Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne23Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne24Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafeaulaitGrand":ligne24Text.setText(getLangueBundle().getString("expressoMoyen"));ligne25Text.setText(getLangueBundle().getString("expressoGrand"));ligne26Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne27Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne28Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne29Text.setText(getLangueBundle().getString("cafePetit"));
		ligne30Text.setText(getLangueBundle().getString("cafeMoyen"));ligne31Text.setText(getLangueBundle().getString("cafeGrand"));ligne32Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne33Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne34Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne35Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne36Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne37Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne38Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne39Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne1Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne2Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne3Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne4Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne5Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne6Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne7Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne8Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne9Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne10Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne11Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne12Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne13Text.setText(getLangueBundle().getString("verseuseGrand"));ligne14Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne15Text.setText(getLangueBundle().getString("americanoMoyen"));ligne16Text.setText(getLangueBundle().getString("americanoGrand"));ligne17Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne18Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne19Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne20Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne21Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne22Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne23Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "mousselaitPetit":ligne23Text.setText(getLangueBundle().getString("expressoMoyen"));ligne24Text.setText(getLangueBundle().getString("expressoGrand"));ligne25Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne26Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne27Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne28Text.setText(getLangueBundle().getString("cafePetit"));
		ligne29Text.setText(getLangueBundle().getString("cafeMoyen"));ligne30Text.setText(getLangueBundle().getString("cafeGrand"));ligne31Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne32Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne33Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne34Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne35Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne36Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne37Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne38Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne39Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne1Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne2Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne3Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne4Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne5Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne6Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne7Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne8Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne9Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne10Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne11Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne12Text.setText(getLangueBundle().getString("verseuseGrand"));ligne13Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne14Text.setText(getLangueBundle().getString("americanoMoyen"));ligne15Text.setText(getLangueBundle().getString("americanoGrand"));ligne16Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne17Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne18Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne19Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne20Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne21Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne22Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "mousselaitMoyen":ligne22Text.setText(getLangueBundle().getString("expressoMoyen"));ligne23Text.setText(getLangueBundle().getString("expressoGrand"));ligne24Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne25Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne26Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne27Text.setText(getLangueBundle().getString("cafePetit"));
		ligne28Text.setText(getLangueBundle().getString("cafeMoyen"));ligne29Text.setText(getLangueBundle().getString("cafeGrand"));ligne30Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne31Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne32Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne33Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne34Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne35Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne36Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne37Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne38Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne39Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne1Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne2Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne3Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne4Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne7Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne6Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne7Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne8Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne9Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne10Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne11Text.setText(getLangueBundle().getString("verseuseGrand"));ligne12Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne13Text.setText(getLangueBundle().getString("americanoMoyen"));ligne14Text.setText(getLangueBundle().getString("americanoGrand"));ligne15Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne16Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne17Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne18Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne19Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne18Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne21Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "mousselaitGrand":ligne21Text.setText(getLangueBundle().getString("expressoMoyen"));ligne22Text.setText(getLangueBundle().getString("expressoGrand"));ligne23Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne24Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne25Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne26Text.setText(getLangueBundle().getString("cafePetit"));
		ligne27Text.setText(getLangueBundle().getString("cafeMoyen"));ligne28Text.setText(getLangueBundle().getString("cafeGrand"));ligne29Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne30Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne31Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne32Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne33Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne34Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne35Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne36Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne37Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne38Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne39Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne1Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne2Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne3Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne4Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne5Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne6Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne7Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne8Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne9Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne10Text.setText(getLangueBundle().getString("verseuseGrand"));ligne11Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne12Text.setText(getLangueBundle().getString("americanoMoyen"));ligne13Text.setText(getLangueBundle().getString("americanoGrand"));ligne14Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne15Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne16Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne17Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne18Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne19Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne20Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "eauchaudePetit":ligne20Text.setText(getLangueBundle().getString("expressoMoyen"));ligne21Text.setText(getLangueBundle().getString("expressoGrand"));ligne22Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne23Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne24Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne25Text.setText(getLangueBundle().getString("cafePetit"));
		ligne26Text.setText(getLangueBundle().getString("cafeMoyen"));ligne27Text.setText(getLangueBundle().getString("cafeGrand"));ligne28Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne29Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne30Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne31Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne32Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne33Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne34Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne35Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne36Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne37Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne38Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne39Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne1Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne2Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne3Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne4Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne5Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne6Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne7Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne8Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne9Text.setText(getLangueBundle().getString("verseuseGrand"));ligne10Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne11Text.setText(getLangueBundle().getString("americanoMoyen"));ligne12Text.setText(getLangueBundle().getString("americanoGrand"));ligne13Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne14Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne15Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne16Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne17Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne18Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne19Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "eauchaudeMoyen":ligne19Text.setText(getLangueBundle().getString("expressoMoyen"));ligne20Text.setText(getLangueBundle().getString("expressoGrand"));ligne21Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne22Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne23Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne24Text.setText(getLangueBundle().getString("cafePetit"));
		ligne25Text.setText(getLangueBundle().getString("cafeMoyen"));ligne26Text.setText(getLangueBundle().getString("cafeGrand"));ligne27Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne28Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne29Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne30Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne31Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne32Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne33Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne34Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne35Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne36Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne37Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne38Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne39Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne1Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne2Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne3Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne4Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne5Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne6Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne7Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne8Text.setText(getLangueBundle().getString("verseuseGrand"));ligne9Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne10Text.setText(getLangueBundle().getString("americanoMoyen"));ligne11Text.setText(getLangueBundle().getString("americanoGrand"));ligne12Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne13Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne14Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne15Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne16Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne17Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne18Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "eauchaudeGrand":ligne18Text.setText(getLangueBundle().getString("expressoMoyen"));ligne19Text.setText(getLangueBundle().getString("expressoGrand"));ligne20Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne21Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne22Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne23Text.setText(getLangueBundle().getString("cafePetit"));
		ligne24Text.setText(getLangueBundle().getString("cafeMoyen"));ligne25Text.setText(getLangueBundle().getString("cafeGrand"));ligne26Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne27Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne28Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne29Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne30Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne31Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne32Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne33Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne34Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne35Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne36Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne37Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne38Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne39Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne1Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne2Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne3Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne4Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne5Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne6Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne7Text.setText(getLangueBundle().getString("verseuseGrand"));ligne8Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne9Text.setText(getLangueBundle().getString("americanoMoyen"));ligne10Text.setText(getLangueBundle().getString("americanoGrand"));ligne11Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne12Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne13Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne14Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne15Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne16Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne17Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "laitchaudPetit":ligne17Text.setText(getLangueBundle().getString("expressoMoyen"));ligne18Text.setText(getLangueBundle().getString("expressoGrand"));ligne19Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne20Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne21Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne22Text.setText(getLangueBundle().getString("cafePetit"));
		ligne23Text.setText(getLangueBundle().getString("cafeMoyen"));ligne24Text.setText(getLangueBundle().getString("cafeGrand"));ligne25Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne26Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne27Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne28Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne29Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne30Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne31Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne32Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne33Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne34Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne35Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne36Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne37Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne38Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne39Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne1Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne2Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne3Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne4Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne5Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne6Text.setText(getLangueBundle().getString("verseuseGrand"));ligne7Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne8Text.setText(getLangueBundle().getString("americanoMoyen"));ligne9Text.setText(getLangueBundle().getString("americanoGrand"));ligne10Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne11Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne12Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne13Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne14Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne15Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne16Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "laitchaudMoyen":ligne16Text.setText(getLangueBundle().getString("expressoMoyen"));ligne17Text.setText(getLangueBundle().getString("expressoGrand"));ligne18Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne19Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne20Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne21Text.setText(getLangueBundle().getString("cafePetit"));
		ligne22Text.setText(getLangueBundle().getString("cafeMoyen"));ligne23Text.setText(getLangueBundle().getString("cafeGrand"));ligne24Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne25Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne26Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne27Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne28Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne29Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne30Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne31Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne32Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne33Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne34Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne35Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne36Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne37Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne38Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne39Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne1Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne2Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne3Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne4Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne5Text.setText(getLangueBundle().getString("verseuseGrand"));ligne6Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne7Text.setText(getLangueBundle().getString("americanoMoyen"));ligne8Text.setText(getLangueBundle().getString("americanoGrand"));ligne9Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne10Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne11Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne12Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne13Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne14Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne15Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "laitchaudGrand":ligne15Text.setText(getLangueBundle().getString("expressoMoyen"));ligne16Text.setText(getLangueBundle().getString("expressoGrand"));ligne17Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne18Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne19Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne20Text.setText(getLangueBundle().getString("cafePetit"));
		ligne21Text.setText(getLangueBundle().getString("cafeMoyen"));ligne22Text.setText(getLangueBundle().getString("cafeGrand"));ligne23Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne24Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne25Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne26Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne27Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne28Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne29Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne30Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne31Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne32Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne33Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne34Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne35Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne36Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne37Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne38Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne39Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne1Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne2Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne3Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne4Text.setText(getLangueBundle().getString("verseuseGrand"));ligne5Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne6Text.setText(getLangueBundle().getString("americanoMoyen"));ligne7Text.setText(getLangueBundle().getString("americanoGrand"));ligne8Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne9Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne10Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne11Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne12Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne13Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne14Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "verseusePetit":ligne14Text.setText(getLangueBundle().getString("expressoMoyen"));ligne15Text.setText(getLangueBundle().getString("expressoGrand"));ligne16Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne17Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne18Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne19Text.setText(getLangueBundle().getString("cafePetit"));
		ligne20Text.setText(getLangueBundle().getString("cafeMoyen"));ligne21Text.setText(getLangueBundle().getString("cafeGrand"));ligne22Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne23Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne24Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne25Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne26Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne27Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne28Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne29Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne30Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne31Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne32Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne33Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne34Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne37Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne36Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne37Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne38Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne39Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne1Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne2Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne3Text.setText(getLangueBundle().getString("verseuseGrand"));ligne4Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne5Text.setText(getLangueBundle().getString("americanoMoyen"));ligne6Text.setText(getLangueBundle().getString("americanoGrand"));ligne7Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne8Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne9Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne10Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne11Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne12Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne13Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "verseuseMoyen":ligne13Text.setText(getLangueBundle().getString("expressoMoyen"));ligne14Text.setText(getLangueBundle().getString("expressoGrand"));ligne15Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne16Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne17Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne18Text.setText(getLangueBundle().getString("cafePetit"));
		ligne19Text.setText(getLangueBundle().getString("cafeMoyen"));ligne20Text.setText(getLangueBundle().getString("cafeGrand"));ligne21Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne22Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne23Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne24Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne25Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne26Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne27Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne28Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne29Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne30Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne31Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne32Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne33Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne34Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne35Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne36Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne37Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne38Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne39Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne1Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne2Text.setText(getLangueBundle().getString("verseuseGrand"));ligne3Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne4Text.setText(getLangueBundle().getString("americanoMoyen"));ligne5Text.setText(getLangueBundle().getString("americanoGrand"));ligne6Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne7Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne8Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne9Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne10Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne11Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne12Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "verseuseGrand":ligne12Text.setText(getLangueBundle().getString("expressoMoyen"));ligne13Text.setText(getLangueBundle().getString("expressoGrand"));ligne14Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne15Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne16Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne17Text.setText(getLangueBundle().getString("cafePetit"));
		ligne18Text.setText(getLangueBundle().getString("cafeMoyen"));ligne19Text.setText(getLangueBundle().getString("cafeGrand"));ligne20Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne21Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne22Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne23Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne24Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne25Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne26Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne27Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne28Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne29Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne30Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne31Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne32Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne33Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne34Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne35Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne36Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne37Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne38Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne39Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne1Text.setText(getLangueBundle().getString("verseuseGrand"));ligne2Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne3Text.setText(getLangueBundle().getString("americanoMoyen"));ligne4Text.setText(getLangueBundle().getString("americanoGrand"));ligne5Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne6Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne7Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne8Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne9Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne10Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne11Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "americanoPetit":ligne11Text.setText(getLangueBundle().getString("expressoMoyen"));ligne12Text.setText(getLangueBundle().getString("expressoGrand"));ligne13Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne14Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne15Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne16Text.setText(getLangueBundle().getString("cafePetit"));
		ligne17Text.setText(getLangueBundle().getString("cafeMoyen"));ligne18Text.setText(getLangueBundle().getString("cafeGrand"));ligne19Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne20Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne21Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne22Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne23Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne24Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne25Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne26Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne27Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne28Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne29Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne30Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne31Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne32Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne33Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne34Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne35Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne36Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne37Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne38Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne39Text.setText(getLangueBundle().getString("verseuseGrand"));ligne1Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne2Text.setText(getLangueBundle().getString("americanoMoyen"));ligne3Text.setText(getLangueBundle().getString("americanoGrand"));ligne4Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne5Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne6Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne7Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne8Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne9Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne10Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "americanoMoyen":ligne10Text.setText(getLangueBundle().getString("expressoMoyen"));ligne11Text.setText(getLangueBundle().getString("expressoGrand"));ligne12Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne13Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne14Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne15Text.setText(getLangueBundle().getString("cafePetit"));
		ligne16Text.setText(getLangueBundle().getString("cafeMoyen"));ligne17Text.setText(getLangueBundle().getString("cafeGrand"));ligne18Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne19Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne20Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne21Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne22Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne23Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne24Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne25Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne26Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne27Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne28Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne29Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne30Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne31Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne32Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne33Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne34Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne35Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne36Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne37Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne38Text.setText(getLangueBundle().getString("verseuseGrand"));ligne39Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne1Text.setText(getLangueBundle().getString("americanoMoyen"));ligne2Text.setText(getLangueBundle().getString("americanoGrand"));ligne3Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne4Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne5Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne6Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne7Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne8Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne9Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "americanoGrand":ligne9Text.setText(getLangueBundle().getString("expressoMoyen"));ligne10Text.setText(getLangueBundle().getString("expressoGrand"));ligne11Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne12Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne13Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne14Text.setText(getLangueBundle().getString("cafePetit"));
		ligne15Text.setText(getLangueBundle().getString("cafeMoyen"));ligne16Text.setText(getLangueBundle().getString("cafeGrand"));ligne17Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne18Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne19Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne20Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne21Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne22Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne23Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne24Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne25Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne26Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne27Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne28Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne29Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne30Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne31Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne32Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne33Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne34Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne35Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne36Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne37Text.setText(getLangueBundle().getString("verseuseGrand"));ligne38Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne39Text.setText(getLangueBundle().getString("americanoMoyen"));ligne1Text.setText(getLangueBundle().getString("americanoGrand"));ligne2Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne3Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne4Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne5Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne6Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne7Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne8Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "flatwhitePetit":ligne8Text.setText(getLangueBundle().getString("expressoMoyen"));ligne9Text.setText(getLangueBundle().getString("expressoGrand"));ligne10Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne11Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne12Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne13Text.setText(getLangueBundle().getString("cafePetit"));
		ligne14Text.setText(getLangueBundle().getString("cafeMoyen"));ligne15Text.setText(getLangueBundle().getString("cafeGrand"));ligne16Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne17Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne18Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne19Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne20Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne21Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne22Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne23Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne24Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne25Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne26Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne27Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne28Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne29Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne30Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne31Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne32Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne33Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne34Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne35Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne36Text.setText(getLangueBundle().getString("verseuseGrand"));ligne37Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne38Text.setText(getLangueBundle().getString("americanoMoyen"));ligne39Text.setText(getLangueBundle().getString("americanoGrand"));ligne1Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne2Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne3Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne4Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne5Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne6Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne7Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "flatwhiteMoyen":ligne7Text.setText(getLangueBundle().getString("expressoMoyen"));ligne8Text.setText(getLangueBundle().getString("expressoGrand"));ligne9Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne10Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne11Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne12Text.setText(getLangueBundle().getString("cafePetit"));
		ligne13Text.setText(getLangueBundle().getString("cafeMoyen"));ligne14Text.setText(getLangueBundle().getString("cafeGrand"));ligne15Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne16Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne17Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne18Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne19Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne20Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne21Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne22Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne23Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne24Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne25Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne26Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne27Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne28Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne29Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne30Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne31Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne32Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne33Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne34Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne35Text.setText(getLangueBundle().getString("verseuseGrand"));ligne36Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne37Text.setText(getLangueBundle().getString("americanoMoyen"));ligne38Text.setText(getLangueBundle().getString("americanoGrand"));ligne39Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne1Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne2Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne3Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne4Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne5Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne6Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "flatwhiteGrand":ligne6Text.setText(getLangueBundle().getString("expressoMoyen"));ligne7Text.setText(getLangueBundle().getString("expressoGrand"));ligne8Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne9Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne10Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne11Text.setText(getLangueBundle().getString("cafePetit"));
		ligne12Text.setText(getLangueBundle().getString("cafeMoyen"));ligne13Text.setText(getLangueBundle().getString("cafeGrand"));ligne14Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne15Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne16Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne17Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne18Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne19Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne20Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne21Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne22Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne23Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne24Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne25Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne26Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne27Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne28Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne29Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne30Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne31Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne32Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne33Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne34Text.setText(getLangueBundle().getString("verseuseGrand"));ligne35Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne36Text.setText(getLangueBundle().getString("americanoMoyen"));ligne37Text.setText(getLangueBundle().getString("americanoGrand"));ligne38Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne39Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne1Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne2Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne3Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne4Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne5Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafecortadoPetit":ligne5Text.setText(getLangueBundle().getString("expressoMoyen"));ligne6Text.setText(getLangueBundle().getString("expressoGrand"));ligne7Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne8Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne9Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne10Text.setText(getLangueBundle().getString("cafePetit"));
		ligne11Text.setText(getLangueBundle().getString("cafeMoyen"));ligne12Text.setText(getLangueBundle().getString("cafeGrand"));ligne13Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne14Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne15Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne16Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne17Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne18Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne19Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne20Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne21Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne22Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne23Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne24Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne25Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne26Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne27Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne28Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne29Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne30Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne31Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne32Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne33Text.setText(getLangueBundle().getString("verseuseGrand"));ligne34Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne35Text.setText(getLangueBundle().getString("americanoMoyen"));ligne36Text.setText(getLangueBundle().getString("americanoGrand"));ligne37Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne38Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne39Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne1Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne2Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne3Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne4Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafecortadoMoyen":ligne4Text.setText(getLangueBundle().getString("expressoMoyen"));ligne5Text.setText(getLangueBundle().getString("expressoGrand"));ligne6Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne7Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne8Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne9Text.setText(getLangueBundle().getString("cafePetit"));
		ligne10Text.setText(getLangueBundle().getString("cafeMoyen"));ligne11Text.setText(getLangueBundle().getString("cafeGrand"));ligne12Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne13Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne14Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne15Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne16Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne17Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne18Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne19Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne20Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne20Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne22Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne23Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne23Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne25Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne26Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne27Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne28Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne29Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne30Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne31Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne32Text.setText(getLangueBundle().getString("verseuseGrand"));ligne33Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne34Text.setText(getLangueBundle().getString("americanoMoyen"));ligne35Text.setText(getLangueBundle().getString("americanoGrand"));ligne36Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne37Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne38Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne39Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne1Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne2Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne3Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		case "cafecortadoGrand":ligne3Text.setText(getLangueBundle().getString("expressoMoyen"));ligne4Text.setText(getLangueBundle().getString("expressoGrand"));ligne5Text.setText(getLangueBundle().getString("expressomacchPetit"));
		ligne6Text.setText(getLangueBundle().getString("expressomacchMoyen"));ligne7Text.setText(getLangueBundle().getString("expressomacchGrand"));ligne8Text.setText(getLangueBundle().getString("cafePetit"));
		ligne9Text.setText(getLangueBundle().getString("cafeMoyen"));ligne10Text.setText(getLangueBundle().getString("cafeGrand"));ligne11Text.setText(getLangueBundle().getString("cappuccinoPetit"));
		ligne12Text.setText(getLangueBundle().getString("cappuccinoMoyen"));ligne13Text.setText(getLangueBundle().getString("cappuccinoGrand"));ligne14Text.setText(getLangueBundle().getString("lattemacchiatoPetit"));
		ligne15Text.setText(getLangueBundle().getString("lattemacchiatoMoyen"));ligne16Text.setText(getLangueBundle().getString("lattemacchiatoGrand"));ligne17Text.setText(getLangueBundle().getString("cafeaulaitPetit"));
		ligne18Text.setText(getLangueBundle().getString("cafeaulaitMoyen"));ligne19Text.setText(getLangueBundle().getString("cafeaulaitGrand"));ligne19Text.setText(getLangueBundle().getString("mousselaitPetit"));    
		ligne21Text.setText(getLangueBundle().getString("mousselaitMoyen"));ligne22Text.setText(getLangueBundle().getString("mousselaitGrand"));ligne22Text.setText(getLangueBundle().getString("eauchaudePetit"));
		ligne24Text.setText(getLangueBundle().getString("eauchaudeMoyen"));ligne25Text.setText(getLangueBundle().getString("eauchaudeGrand"));ligne26Text.setText(getLangueBundle().getString("laitchaudPetit"));
		ligne27Text.setText(getLangueBundle().getString("laitchaudMoyen"));ligne28Text.setText(getLangueBundle().getString("laitchaudGrand"));ligne29Text.setText(getLangueBundle().getString("verseusePetit"));
		ligne30Text.setText(getLangueBundle().getString("verseuseMoyen"));ligne31Text.setText(getLangueBundle().getString("verseuseGrand"));ligne32Text.setText(getLangueBundle().getString("americanoPetit"));
		ligne33Text.setText(getLangueBundle().getString("americanoMoyen"));ligne34Text.setText(getLangueBundle().getString("americanoGrand"));ligne35Text.setText(getLangueBundle().getString("flatwhitePetit"));
		ligne36Text.setText(getLangueBundle().getString("flatwhiteMoyen"));ligne37Text.setText(getLangueBundle().getString("flatwhiteGrand"));ligne38Text.setText(getLangueBundle().getString("cafecortadoPetit"));
		ligne39Text.setText(getLangueBundle().getString("cafecortadoMoyen"));ligne1Text.setText(getLangueBundle().getString("cafecortadoGrand"));ligne2Text.setText(getLangueBundle().getString("expressoPetit"));		    
			break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3,ligne4,ligne5);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}
	
	public void displayReglageQteBoissonPetit(Long value) {
		
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(btNav);
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
	 choixLangue.setFitHeight(16);
	 choixLangue.setFitWidth(15);
	 choixLangue.setStyle("-fx-background-color:lightgray");
	 
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
        Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
//		HBox selectIntensiteTailleCafeMessage = new HBox(); 
//		Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
//		selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
//		selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
//		selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text("20 ml ");
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text,(getTailleTasseBoiFav()==20?choixLangue:new ImageView()));
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1); 
		 
		HBox ligne2 = new HBox(); 
		Text ligne2Text = new Text("25 ml ");
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne2.getChildren().addAll(ligne2Text,(getTailleTasseBoiFav()==25?choixLangue:new ImageView()));
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox(); 
		Text ligne3Text = new Text("30 ml ");
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne3.getChildren().addAll(ligne3Text,(getTailleTasseBoiFav()==30?choixLangue:new ImageView()));
		ligne3.setAlignment(Pos.CENTER);

		switch ((int)(double)value) {
		case 25:ligne1Text.setText("25 ml ");ligne2Text.setText("30 ml ");ligne3Text.setText("20 ml ");
		ligne1.getChildren().addAll((getTailleTasseBoiFav()==25?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTailleTasseBoiFav()==30?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getTailleTasseBoiFav()==20?choixLangue:new ImageView()));
			break;
		case 30:ligne1Text.setText("30 ml ");ligne2Text.setText("20 ml ");ligne3Text.setText("25 ml ");
		ligne1.getChildren().addAll((getTailleTasseBoiFav()==30?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTailleTasseBoiFav()==20?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getTailleTasseBoiFav()==25?choixLangue:new ImageView()));
		    break;
		default:
			break;
		}
		
		VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
		 centralScreenText.getChildren().add(centralScreen); 
		
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;
	}
	public void displayReglageQteBoissonMoyen(Long value) {
		
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		 choixLangue.setFitHeight(16);
		 choixLangue.setFitWidth(15);
		 choixLangue.setStyle("-fx-background-color:lightgray");
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

			GridPane leftSetting = new GridPane();
			//leftSetting.setAlignment(Pos.CENTER);
			//leftSetting.setPadding(new Insets(0, 10, 10, 10));
			leftSetting.setHgap(5.5);
			leftSetting.setVgap(5.5);
			leftSetting.add(btRetour, 1, 0);
			leftSetting.add(getEmptyButtonType2(), 1, 1);
			leftSetting.add(getEmptyButtonType2(), 0, 1);
			GridPane.setHalignment(btRetour, HPos.RIGHT);
			
			GridPane rightSetting = new GridPane();
			//rightSetting.setAlignment(Pos.CENTER);
			//rightSetting.setPadding(new Insets(0, 10, 10, 10));
			rightSetting.setHgap(5.5);
			rightSetting.setVgap(5.5);
			rightSetting.add(btOk, 0, 0);
			//rightSetting.add(new Pane(), 0, 0);
			rightSetting.add(btMenu, 1, 0);
			rightSetting.add(getEmptyButtonType2(), 1, 1);
			rightSetting.add(getEmptyButtonType2(), 0, 1);
			
			Pane centralScreenText = new Pane();
			//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
			centralScreenText.setPrefWidth(285);;
			//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
			centralScreenText.setStyle("-fx-background-color: lightgray");
			
	        Pane pane = new StackPane();
			
	        Rectangle rectangle = new Rectangle();
			rectangle.setHeight(20);
			rectangle.setStroke(Color.WHITE);
			rectangle.setFill(Color.WHITE);
			rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
			pane.getChildren().add(rectangle);
			
//			HBox selectIntensiteTailleCafeMessage = new HBox(); 
//			Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
//			selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
//			selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
//			selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
			 
			HBox ligne1 = new HBox(); 
			Text ligne1Text = new Text("35 ml  ");
			ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne1.getChildren().addAll(ligne1Text,(getTailleTasseBoiFav()==35?choixLangue:new ImageView()));
			ligne1.setAlignment(Pos.CENTER);
			pane.getChildren().add(ligne1); 
			 
			HBox ligne2 = new HBox(); 
			Text ligne2Text = new Text("40 ml  ");
			ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne2.getChildren().addAll(ligne2Text,(getTailleTasseBoiFav()==40?choixLangue:new ImageView()));
			ligne2.setAlignment(Pos.CENTER);

			HBox ligne3 = new HBox(); 
			Text ligne3Text = new Text("45 ml  ");
			ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne3.getChildren().addAll(ligne3Text,(getTailleTasseBoiFav()==45?choixLangue:new ImageView()));
			ligne3.setAlignment(Pos.CENTER);

			switch ((int)(double)value) {
			case 40:ligne1Text.setText("40 ml  ");ligne2Text.setText("45 ml  ");ligne3Text.setText("35 ml  ");
			ligne1.getChildren().addAll((getTailleTasseBoiFav()==40?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTailleTasseBoiFav()==45?choixLangue:new ImageView()));
			ligne3.getChildren().addAll((getTailleTasseBoiFav()==35?choixLangue:new ImageView()));
				break;
			case 45:ligne1Text.setText("45 ml  ");ligne2Text.setText("35 ml  ");ligne3Text.setText("40 ml  ");
			ligne1.getChildren().addAll((getTailleTasseBoiFav()==45?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTailleTasseBoiFav()==35?choixLangue:new ImageView()));
			ligne3.getChildren().addAll((getTailleTasseBoiFav()==40?choixLangue:new ImageView()));
			    break;
			default:
				break;
			}
			
			VBox centralScreen = new VBox();
			 centralScreen.setPadding(new Insets(15,0,0,0));
			 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
			 centralScreenText.getChildren().add(centralScreen); 
			
			
			GridPane bandeauScreenText = new GridPane();
			bandeauScreenText.add(leftSetting, 0, 0);
			bandeauScreenText.add(centralScreenText, 1, 0);
			bandeauScreenText.add(rightSetting, 2, 0);
			bandeauScreenText.setHgap(15);

			
			VBox ScreenSelectDrink = new VBox(5);
			ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
			ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
			//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
			ScreenSelectDrink.setStyle("-fx-background-color: black");

			Scene scene = new Scene(ScreenSelectDrink,700,300);
			stage.setScene(scene);
			  
			return;
		}
	public void displayReglageQteBoissonGrand(Long value) {
		
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		 choixLangue.setFitHeight(16);
		 choixLangue.setFitWidth(15);
		 choixLangue.setStyle("-fx-background-color:lightgray");
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

			GridPane leftSetting = new GridPane();
			//leftSetting.setAlignment(Pos.CENTER);
			//leftSetting.setPadding(new Insets(0, 10, 10, 10));
			leftSetting.setHgap(5.5);
			leftSetting.setVgap(5.5);
			leftSetting.add(btRetour, 1, 0);
			leftSetting.add(getEmptyButtonType2(), 1, 1);
			leftSetting.add(getEmptyButtonType2(), 0, 1);
			GridPane.setHalignment(btRetour, HPos.RIGHT);
			
			GridPane rightSetting = new GridPane();
			//rightSetting.setAlignment(Pos.CENTER);
			//rightSetting.setPadding(new Insets(0, 10, 10, 10));
			rightSetting.setHgap(5.5);
			rightSetting.setVgap(5.5);
			rightSetting.add(btOk, 0, 0);
			//rightSetting.add(new Pane(), 0, 0);
			rightSetting.add(btMenu, 1, 0);
			rightSetting.add(getEmptyButtonType2(), 1, 1);
			rightSetting.add(getEmptyButtonType2(), 0, 1);
			
			Pane centralScreenText = new Pane();
			//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
			centralScreenText.setPrefWidth(285);;
			//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
			centralScreenText.setStyle("-fx-background-color: lightgray");
			
	        Pane pane = new StackPane();
			
	        Rectangle rectangle = new Rectangle();
			rectangle.setHeight(20);
			rectangle.setStroke(Color.WHITE);
			rectangle.setFill(Color.WHITE);
			rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
			pane.getChildren().add(rectangle);
			
//			HBox selectIntensiteTailleCafeMessage = new HBox(); 
//			Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
//			selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
//			selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
//			selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
			 
			HBox ligne1 = new HBox(); 
			Text ligne1Text = new Text("120 ml  ");
			ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne1.getChildren().addAll(ligne1Text,(getTailleTasseBoiFav()==120?choixLangue:new ImageView()));
			ligne1.setAlignment(Pos.CENTER);
			pane.getChildren().add(ligne1); 
			 
			HBox ligne2 = new HBox(); 
			Text ligne2Text = new Text("140 ml  ");
			ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne2.getChildren().addAll(ligne2Text,(getTailleTasseBoiFav()==140?choixLangue:new ImageView()));
			ligne2.setAlignment(Pos.CENTER);

			HBox ligne3 = new HBox(); 
			Text ligne3Text = new Text("160 ml  ");
			ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne3.getChildren().addAll(ligne3Text,(getTailleTasseBoiFav()==160?choixLangue:new ImageView()));
			ligne3.setAlignment(Pos.CENTER);
			
			HBox ligne4 = new HBox(); 
			Text ligne4Text = new Text("180 ml  ");
			ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne4.getChildren().addAll(ligne4Text,(getTailleTasseBoiFav()==180?choixLangue:new ImageView()));
			ligne4.setAlignment(Pos.CENTER);
			
			HBox ligne5 = new HBox(); 
			Text ligne5Text = new Text("200 ml  ");
			ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
			ligne5.getChildren().addAll(ligne5Text,(getTailleTasseBoiFav()==200?choixLangue:new ImageView()));
			ligne5.setAlignment(Pos.CENTER);

			switch ((int)(double)value) {
			case 140:ligne1Text.setText("140 ml  ");ligne2Text.setText("160 ml  ");ligne3Text.setText("180 ml  ");ligne4Text.setText("200 ml  ");ligne5Text.setText("120 ml  ");
			ligne1.getChildren().addAll((getTailleTasseBoiFav()==140?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTailleTasseBoiFav()==160?choixLangue:new ImageView()));
			ligne3.getChildren().addAll((getTailleTasseBoiFav()==180?choixLangue:new ImageView()));ligne4.getChildren().addAll((getTailleTasseBoiFav()==200?choixLangue:new ImageView()));
			ligne5.getChildren().addAll((getTailleTasseBoiFav()==120?choixLangue:new ImageView()));
				break;
			case 160:ligne1Text.setText("160 ml  ");ligne2Text.setText("180 ml  ");ligne3Text.setText("200 ml  ");ligne4Text.setText("120 ml  ");ligne5Text.setText("140 ml  ");
			ligne1.getChildren().addAll((getTailleTasseBoiFav()==160?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTailleTasseBoiFav()==180?choixLangue:new ImageView()));
			ligne3.getChildren().addAll((getTailleTasseBoiFav()==200?choixLangue:new ImageView()));ligne4.getChildren().addAll((getTailleTasseBoiFav()==120?choixLangue:new ImageView()));
			ligne5.getChildren().addAll((getTailleTasseBoiFav()==140?choixLangue:new ImageView()));
			    break;
			case 180:ligne1Text.setText("180 ml  ");ligne2Text.setText("200 ml  ");ligne3Text.setText("120 ml  ");ligne4Text.setText("140 ml  ");ligne5Text.setText("160 ml  ");
			ligne1.getChildren().addAll((getTailleTasseBoiFav()==180?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTailleTasseBoiFav()==200?choixLangue:new ImageView()));
			ligne3.getChildren().addAll((getTailleTasseBoiFav()==120?choixLangue:new ImageView()));ligne4.getChildren().addAll((getTailleTasseBoiFav()==140?choixLangue:new ImageView()));
			ligne5.getChildren().addAll((getTailleTasseBoiFav()==160?choixLangue:new ImageView()));
			    break;
			case 200:ligne1Text.setText("200 ml  ");ligne2Text.setText("120 ml  ");ligne3Text.setText("140 ml  ");ligne4Text.setText("160 ml  ");ligne5Text.setText("180 ml  ");
			ligne1.getChildren().addAll((getTailleTasseBoiFav()==200?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTailleTasseBoiFav()==120?choixLangue:new ImageView()));
			ligne3.getChildren().addAll((getTailleTasseBoiFav()==140?choixLangue:new ImageView()));ligne4.getChildren().addAll((getTailleTasseBoiFav()==160?choixLangue:new ImageView()));
			ligne5.getChildren().addAll((getTailleTasseBoiFav()==180?choixLangue:new ImageView()));
			    break;
			default:
				break;
			}
			
			VBox centralScreen = new VBox();
			 centralScreen.setPadding(new Insets(15,0,0,0));
			 centralScreen.getChildren().addAll(pane,ligne2,ligne3,ligne4);
			 centralScreenText.getChildren().add(centralScreen); 
			
			
			GridPane bandeauScreenText = new GridPane();
			bandeauScreenText.add(leftSetting, 0, 0);
			bandeauScreenText.add(centralScreenText, 1, 0);
			bandeauScreenText.add(rightSetting, 2, 0);
			bandeauScreenText.setHgap(15);

			
			VBox ScreenSelectDrink = new VBox(5);
			ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
			ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
			//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
			ScreenSelectDrink.setStyle("-fx-background-color: black");

			Scene scene = new Scene(ScreenSelectDrink,700,300);
			stage.setScene(scene);
			  
			return;
		}
	
	public void displayReglageProportionLaitCafe(String value) {
		
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("expressomacch"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text);
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1);

		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString("lattemacchiato"));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne2.getChildren().addAll(ligne2Text);
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString("cappuccino"));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text);
		 ligne3.setAlignment(Pos.CENTER);
		 
		 HBox ligne4 = new HBox(); 
		 Text ligne4Text = new Text(getLangueBundle().getString("cafeaulait"));
		 ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne4.getChildren().addAll(ligne4Text);
		 ligne4.setAlignment(Pos.CENTER);
		 
		 HBox ligne5 = new HBox(); 
		 Text ligne5Text = new Text(getLangueBundle().getString("flatwhite"));
		 ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne5.getChildren().addAll(ligne5Text);
		 ligne5.setAlignment(Pos.CENTER);
		 
		 HBox ligne6 = new HBox(); 
		 Text ligne6Text = new Text(getLangueBundle().getString("cafecortado"));
		 ligne6Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne6.getChildren().addAll(ligne6Text);
		 ligne6.setAlignment(Pos.CENTER);
		 
		 		 
		switch (value) {
		case "lattemacchiato":ligne1Text.setText(getLangueBundle().getString("lattemacchiato"));ligne2Text.setText(getLangueBundle().getString("cappuccino"));ligne3Text.setText(getLangueBundle().getString("cafeaulait"));
		ligne4Text.setText(getLangueBundle().getString("flatwhite"));ligne5Text.setText(getLangueBundle().getString("cafecortado"));ligne6Text.setText(getLangueBundle().getString("expressomacch"));
			break;
		case "cappuccino":ligne6Text.setText(getLangueBundle().getString("lattemacchiato"));ligne1Text.setText(getLangueBundle().getString("cappuccino"));ligne2Text.setText(getLangueBundle().getString("cafeaulait"));
		ligne3Text.setText(getLangueBundle().getString("flatwhite"));ligne4Text.setText(getLangueBundle().getString("cafecortado"));ligne5Text.setText(getLangueBundle().getString("expressomacch"));			
			break;
		case "cafeaulait":ligne5Text.setText(getLangueBundle().getString("lattemacchiato"));ligne6Text.setText(getLangueBundle().getString("cappuccino"));ligne1Text.setText(getLangueBundle().getString("cafeaulait"));
		ligne2Text.setText(getLangueBundle().getString("flatwhite"));ligne3Text.setText(getLangueBundle().getString("cafecortado"));ligne4Text.setText(getLangueBundle().getString("expressomacch"));
			break;
		case "flatwhite":ligne4Text.setText(getLangueBundle().getString("lattemacchiato"));ligne5Text.setText(getLangueBundle().getString("cappuccino"));ligne6Text.setText(getLangueBundle().getString("cafeaulait"));
		ligne1Text.setText(getLangueBundle().getString("flatwhite"));ligne2Text.setText(getLangueBundle().getString("cafecortado"));ligne3Text.setText(getLangueBundle().getString("expressomacch"));
			break;
		case "cafecortado":ligne3Text.setText(getLangueBundle().getString("lattemacchiato"));ligne4Text.setText(getLangueBundle().getString("cappuccino"));ligne5Text.setText(getLangueBundle().getString("cafeaulait"));
		ligne6Text.setText(getLangueBundle().getString("flatwhite"));ligne1Text.setText(getLangueBundle().getString("cafecortado"));ligne2Text.setText(getLangueBundle().getString("expressomacch"));
			break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3,ligne4,ligne5);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}
	
	public void displayProportionLaitCafe(Long value) {
		HBox btNavBandeau = new HBox(); 
		btNavBandeau.getChildren().addAll(btNav);
		btNavBandeau.setAlignment(Pos.CENTER);
		
		ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		choixLangue.setFitHeight(16);
		choixLangue.setFitWidth(15);
		choixLangue.setStyle("-fx-background-color:lightgray");
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(btRetour, HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
        Pane pane = new StackPane();
		
        Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		
//		HBox selectIntensiteTailleCafeMessage = new HBox(); 
//		Text selectIntensiteTailleCafeMessageText = new Text(getLangueBundle().getString(getMessage()));
//		selectIntensiteTailleCafeMessageText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.REGULAR,12));
//		selectIntensiteTailleCafeMessage.getChildren().addAll(selectIntensiteTailleCafeMessageText);
//		selectIntensiteTailleCafeMessage.setAlignment(Pos.CENTER);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text("50 %  ");
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text,(getRatioLaitCafe()==50?choixLangue:new ImageView()));
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1); 
		 
		HBox ligne2 = new HBox(); 
		Text ligne2Text = new Text("60 %  ");
		ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne2.getChildren().addAll(ligne2Text,(getRatioLaitCafe()==60?choixLangue:new ImageView()));
		ligne2.setAlignment(Pos.CENTER);

		HBox ligne3 = new HBox(); 
		Text ligne3Text = new Text("70 %  ");
		ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne3.getChildren().addAll(ligne3Text,(getRatioLaitCafe()==70?choixLangue:new ImageView()));
		ligne3.setAlignment(Pos.CENTER);
		
		HBox ligne4 = new HBox(); 
		Text ligne4Text = new Text("80 %  ");
		ligne4Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne4.getChildren().addAll(ligne4Text,(getRatioLaitCafe()==80?choixLangue:new ImageView()));
		ligne4.setAlignment(Pos.CENTER);
		
		HBox ligne5 = new HBox(); 
		Text ligne5Text = new Text("90 %  ");
		ligne5Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne5.getChildren().addAll(ligne5Text,(getRatioLaitCafe()==90?choixLangue:new ImageView()));
		ligne5.setAlignment(Pos.CENTER);
		
		switch ((int)(double)value) {
		case 60:ligne1Text.setText("60 %  ");ligne2Text.setText("70 %  ");ligne3Text.setText("80 %  ");ligne4Text.setText("90 %  ");ligne5Text.setText("50 %  ");
		ligne1.getChildren().addAll((getRatioLaitCafe()==60?choixLangue:new ImageView()));ligne2.getChildren().addAll((getRatioLaitCafe()==70?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getRatioLaitCafe()==80?choixLangue:new ImageView()));ligne4.getChildren().addAll((getRatioLaitCafe()==90?choixLangue:new ImageView()));
		ligne5.getChildren().addAll((getRatioLaitCafe()==50?choixLangue:new ImageView()));
			break;
		case 70:ligne1Text.setText("70 %  ");ligne2Text.setText("80 %  ");ligne3Text.setText("90 %  ");ligne4Text.setText("50 %  ");ligne5Text.setText("60 %  ");
		ligne1.getChildren().addAll((getRatioLaitCafe()==70?choixLangue:new ImageView()));ligne2.getChildren().addAll((getRatioLaitCafe()==80?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getRatioLaitCafe()==90?choixLangue:new ImageView()));ligne4.getChildren().addAll((getRatioLaitCafe()==50?choixLangue:new ImageView()));
		ligne5.getChildren().addAll((getRatioLaitCafe()==60?choixLangue:new ImageView()));
		    break;
		case 80:ligne1Text.setText("80 %  ");ligne2Text.setText("90 %  ");ligne3Text.setText("50 %  ");ligne4Text.setText("60 %  ");ligne5Text.setText("70 %  ");
		ligne1.getChildren().addAll((getRatioLaitCafe()==80?choixLangue:new ImageView()));ligne2.getChildren().addAll((getRatioLaitCafe()==90?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getRatioLaitCafe()==50?choixLangue:new ImageView()));ligne4.getChildren().addAll((getRatioLaitCafe()==60?choixLangue:new ImageView()));
		ligne5.getChildren().addAll((getRatioLaitCafe()==70?choixLangue:new ImageView()));
			break;
		case 90:ligne1Text.setText("90 %  ");ligne2Text.setText("50 %  ");ligne3Text.setText("60 %  ");ligne4Text.setText("70 %  ");ligne5Text.setText("80 %  ");
		ligne1.getChildren().addAll((getRatioLaitCafe()==90?choixLangue:new ImageView()));ligne2.getChildren().addAll((getRatioLaitCafe()==50?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getRatioLaitCafe()==60?choixLangue:new ImageView()));ligne4.getChildren().addAll((getRatioLaitCafe()==70?choixLangue:new ImageView()));
		ligne5.getChildren().addAll((getRatioLaitCafe()==80?choixLangue:new ImageView()));
	    	break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3,ligne4,ligne5);
		 centralScreenText.getChildren().add(centralScreen); 
		
		//VBox centralScreen = new VBox();
		 //centralScreen.setPadding(new Insets(0,0,0,0));
		 //centralScreen.getChildren().addAll(pane);
		 //centralScreenText.getChildren().add(centralScreen);
		 //centralScreenText.getChildren().addAll(intensiteCafe,tailleDeLaTasse);
			
		//Text selectedDrink =(value=="selectBoisFav")? new Text(100, 30,getLangueBundle().getString(value)): new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		//selectedDrink.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD,FontPosture.REGULAR, 20));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text messageContinu1 = (value=="selectBoisFav")?new Text(100, 90,""):new Text(100, 90, getLangueBundle().getString("messageContinu1"));
		//messageContinu1.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR, 10));
		//Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		//centralScreenText .getChildren().add(messageContinu1);
		//Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
		//centralScreenText .getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");

		
		/*
		 * BorderPane ScreenSelectDrink = new BorderPane();
		 * ScreenSelectDrink.setTop(bandeauCommandesAndNavBt);
		 * ScreenSelectDrink.setLeft(leftSetting);
		 * ScreenSelectDrink.setRight(rightSetting);
		 * ScreenSelectDrink.setCenter(centralScreenText);
		 */
		//BorderPane root = new BorderPane();
		//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		  
		return;

	}


 public void displayReglageTemperatureBoisson(String value) {
				
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(btNav);
		 btNavBandeau.setAlignment(Pos.CENTER);
		 
		 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
		 choixLangue.setFitHeight(16);
		 choixLangue.setFitWidth(15);
		 choixLangue.setStyle("-fx-background-color:lightgray");
		 
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
		bandeauDeCommandes.setHgap(2);
		//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setStyle("-fx-background-color: black");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
		
		GridPane leftSetting = new GridPane();
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(btRetour, 1, 0);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(btOk, 0, 0);
		rightSetting.add(btMenu, 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		centralScreenText.setPrefWidth(285);
		centralScreenText.setStyle("-fx-background-color: lightgray");
		Pane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(20);
		rectangle.setStroke(Color.WHITE);
		rectangle.setFill(Color.WHITE);
		rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
		pane.getChildren().add(rectangle);
		 
		HBox ligne1 = new HBox(); 
		Text ligne1Text = new Text(getLangueBundle().getString("normale"));
		ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		ligne1.getChildren().addAll(ligne1Text,(getTemperatureBoissonFav()=="normale"?choixLangue:new ImageView()));
		ligne1.setAlignment(Pos.CENTER);
		pane.getChildren().add(ligne1);

		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text(getLangueBundle().getString("haute"));
		 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
    	 ligne2.getChildren().addAll(ligne2Text,(getTemperatureBoissonFav()=="haute"?choixLangue:new ImageView()));
		 ligne2.setAlignment(Pos.CENTER);
		 
		 HBox ligne3 = new HBox(); 
		 Text ligne3Text = new Text(getLangueBundle().getString("maxi"));
		 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
		 ligne3.getChildren().addAll(ligne3Text,(getTemperatureBoissonFav()=="maxi"?choixLangue:new ImageView()));
		 ligne3.setAlignment(Pos.CENTER);
		 
		 		 
		switch (value) {
		case "haute":ligne1Text.setText(getLangueBundle().getString("haute"));ligne2Text.setText(getLangueBundle().getString("maxi"));
		ligne3Text.setText(getLangueBundle().getString("normale"));
		ligne1.getChildren().addAll((getTemperatureBoissonFav()=="haute"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTemperatureBoissonFav()=="maxi"?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getTemperatureBoissonFav()=="normale"?choixLangue:new ImageView()));
		    break;
		case "maxi":ligne1Text.setText(getLangueBundle().getString("maxi"));ligne2Text.setText(getLangueBundle().getString("normale"));
		ligne3Text.setText(getLangueBundle().getString("haute"));
		ligne1.getChildren().addAll((getTemperatureBoissonFav()=="maxi"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTemperatureBoissonFav()=="normale"?choixLangue:new ImageView()));
		ligne3.getChildren().addAll((getTemperatureBoissonFav()=="haute"?choixLangue:new ImageView()));
		    break;
		default:
			break;
		}
		 
		 VBox centralScreen = new VBox();
		 centralScreen.setPadding(new Insets(15,0,0,0));
		 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
		 centralScreenText.getChildren().add(centralScreen);
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);
		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		ScreenSelectDrink.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
		
	}

 public void displayReglageArretAutomatique(String value) {
	
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(btNav);
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
	 choixLangue.setFitHeight(16);
	 choixLangue.setFitWidth(15);
	 choixLangue.setStyle("-fx-background-color:lightgray");
	 
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(btRetour, 1, 0);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	leftSetting.add(getEmptyButtonType2(), 1, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(btOk, 0, 0);
	rightSetting.add(btMenu, 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	centralScreenText.setPrefWidth(285);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(20);
	rectangle.setStroke(Color.WHITE);
	rectangle.setFill(Color.WHITE);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
	pane.getChildren().add(rectangle);
	 
	HBox ligne1 = new HBox(); 
	Text ligne1Text = new Text(getLangueBundle().getString("30minutes"));
	ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	ligne1.getChildren().addAll(ligne1Text,(getTempsArretAutomatique()=="30minutes"?choixLangue:new ImageView()));
	ligne1.setAlignment(Pos.CENTER);
	pane.getChildren().add(ligne1);

	 
	 HBox ligne2 = new HBox(); 
	 Text ligne2Text = new Text(getLangueBundle().getString("1heure"));
	 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 ligne2.getChildren().addAll(ligne2Text,(getTempsArretAutomatique()=="1heure"?choixLangue:new ImageView()));
	 ligne2.setAlignment(Pos.CENTER);
	 
	 HBox ligne3 = new HBox(); 
	 Text ligne3Text = new Text(getLangueBundle().getString("2heures"));
	 ligne3Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 ligne3.getChildren().addAll(ligne3Text,(getTempsArretAutomatique()=="2heures"?choixLangue:new ImageView()));
	 ligne3.setAlignment(Pos.CENTER);
	 
	 		 
	switch (value) {
	case "1heure":ligne1Text.setText(getLangueBundle().getString("1heure"));ligne2Text.setText(getLangueBundle().getString("2heures"));
	ligne3Text.setText(getLangueBundle().getString("30minutes"));
	ligne1.getChildren().addAll((getTempsArretAutomatique()=="1heure"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTempsArretAutomatique()=="2heures"?choixLangue:new ImageView()));
	ligne3.getChildren().addAll((getTempsArretAutomatique()=="30minutes"?choixLangue:new ImageView()));
	    break;
	case "2heures":ligne1Text.setText(getLangueBundle().getString("2heures"));ligne2Text.setText(getLangueBundle().getString("30minutes"));
	ligne3Text.setText(getLangueBundle().getString("1heure"));
	ligne1.getChildren().addAll((getTempsArretAutomatique()=="2heures"?choixLangue:new ImageView()));ligne2.getChildren().addAll((getTempsArretAutomatique()=="30minutes"?choixLangue:new ImageView()));
	ligne3.getChildren().addAll((getTempsArretAutomatique()=="1heure"?choixLangue:new ImageView()));
	    break;
	default:
		break;
	}
	 
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(15,0,0,0));
	 centralScreen.getChildren().addAll(pane,ligne2,ligne3);
	 centralScreenText.getChildren().add(centralScreen);
	
	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);
	
	VBox ScreenSelectDrink = new VBox(5);
	ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
	ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenSelectDrink.setStyle("-fx-background-color: black");
	
	Scene scene = new Scene(ScreenSelectDrink,700,300);
	stage.setScene(scene);
	return;
   }
 
 public void displayReglageFiltreEau(String value) {
		
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(btNav);
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
	 choixLangue.setFitHeight(16);
	 choixLangue.setFitWidth(15);
	 choixLangue.setStyle("-fx-background-color:lightgray");
	 
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(btRetour, 1, 0);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	leftSetting.add(getEmptyButtonType2(), 1, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(btOk, 0, 0);
	rightSetting.add(btMenu, 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	centralScreenText.setPrefWidth(285);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(20);
	rectangle.setStroke(Color.WHITE);
	rectangle.setFill(Color.WHITE);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
	pane.getChildren().add(rectangle);
	 
	HBox ligne1 = new HBox(); 
	Text ligne1Text = new Text(getLangueBundle().getString("pasDeFiltre"));
	ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	ligne1.getChildren().addAll(ligne1Text,(!getIsFilterPresent()?choixLangue:new ImageView()));
	ligne1.setAlignment(Pos.CENTER);
	pane.getChildren().add(ligne1);

	 
	 HBox ligne2 = new HBox(); 
	 Text ligne2Text = new Text(getLangueBundle().getString("filtre"));
	 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 ligne2.getChildren().addAll(ligne2Text,(getIsFilterPresent()?choixLangue:new ImageView()));
	 ligne2.setAlignment(Pos.CENTER);
	 		 
	switch (value) {
	case "filtre":ligne1Text.setText(getLangueBundle().getString("filtre"));ligne2Text.setText(getLangueBundle().getString("pasDeFiltre"));
	ligne1.getChildren().addAll((getIsFilterPresent()?choixLangue:new ImageView()));ligne2.getChildren().addAll((!getIsFilterPresent()?choixLangue:new ImageView()));
	    break;
	default:
		break;
	}
	 
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(15,0,0,0));
	 centralScreen.getChildren().addAll(pane,ligne2);
	 centralScreenText.getChildren().add(centralScreen);
	
	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);
	
	VBox ScreenSelectDrink = new VBox(5);
	ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
	ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenSelectDrink.setStyle("-fx-background-color: black");
	
	Scene scene = new Scene(ScreenSelectDrink,700,300);
	stage.setScene(scene);
	return;
 }

 public void displayReglageBipsonore(String value) {
		
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(btNav);
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	 ImageView choixLangue = new ImageView(new Image("/images/choixLangue.png"));
	 choixLangue.setFitHeight(16);
	 choixLangue.setFitWidth(15);
	 choixLangue.setStyle("-fx-background-color:lightgray");
	 
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(getEmptyButtonType2(), 1, 0);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	leftSetting.add(btRetour, 1, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(btOk, 0, 0);
	rightSetting.add(btMenu, 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	centralScreenText.setPrefWidth(285);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(20);
	rectangle.setStroke(Color.WHITE);
	rectangle.setFill(Color.WHITE);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(1));
	pane.getChildren().add(rectangle);
	 
	HBox ligne1 = new HBox(); 
	Text ligne1Text = new Text(getLangueBundle().getString("bipActiver"));
	ligne1Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	ligne1.getChildren().addAll(ligne1Text,(getBipSonore()?choixLangue:new ImageView()));
	ligne1.setAlignment(Pos.CENTER);
	pane.getChildren().add(ligne1);

	 
	 HBox ligne2 = new HBox(); 
	 Text ligne2Text = new Text(getLangueBundle().getString("bipDesactiver"));
	 ligne2Text.setFont(Font.font("Courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 ligne2.getChildren().addAll(ligne2Text,(!getBipSonore()?choixLangue:new ImageView()));
	 ligne2.setAlignment(Pos.CENTER);
	 		 
	switch (value) {
	case "bipDesactiver":ligne1Text.setText(getLangueBundle().getString("bipDesactiver"));ligne2Text.setText(getLangueBundle().getString("bipActiver"));
	ligne1.getChildren().addAll((!getBipSonore()?choixLangue:new ImageView()));ligne2.getChildren().addAll((getBipSonore()?choixLangue:new ImageView()));
	    break;
	default:
		break;
	}
	 
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(15,0,0,0));
	 centralScreen.getChildren().addAll(pane,ligne2);
	 centralScreenText.getChildren().add(centralScreen);
	
	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);
	
	VBox ScreenSelectDrink = new VBox(5);
	ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
	ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	//ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenSelectDrink.setStyle("-fx-background-color: black");
	
	Scene scene = new Scene(ScreenSelectDrink,700,300);
	stage.setScene(scene);
	return;
 }

 public void displayProgMaintCalcNclean(String value) {
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	Button btnStartStop = (value=="step0"||value=="step2"||value=="step3"||value=="step4"||value=="step6")?btStartStop:getEmptyButtonType1();
	Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
	Button btnOk = (value=="step1"||value=="step9")?btOk:getEmptyButtonType1();
	//btBacCollecteurVider=new Button(getLangueBundle().getString("bacCollecteurVider"));
	//btBacCollecteurVider.setStyle("-fx-background-color: black");
	
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(btnStartStop, 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(btnRetour, 1, 0);
	leftSetting.add(getEmptyButtonType2(), 1, 1);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(btnOk, 0, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	//centralScreenText.setPrefWidth(285);
	centralScreenText.setPrefWidth(300);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(80);
	rectangle.setStroke(Color.LIGHTGRAY);
	//rectangle.setStroke(Color.BLACK);
	rectangle.setFill(Color.LIGHTGRAY);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
	pane.getChildren().add(rectangle);
	 
	 HBox message = new HBox(); 
	 Text messageText = new Text(getLangueBundle().getString(getMessage()));
	 messageText.setFont(Font.font("courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 messageText.setTextAlignment(TextAlignment.CENTER);
	 message.getChildren().addAll(messageText);
	 message.setAlignment(Pos.CENTER);
	 pane.getChildren().add(message); 
	 
	
	    HBox progressBar = new HBox(); 
		ProgressBar progressbar1=new ProgressBar(0);
		ProgressBar progressbar2=new ProgressBar(0);
		ProgressBar progressbar3=new ProgressBar(0);
		ProgressBar progressbar4=new ProgressBar(0);
		ProgressBar progressbar5=new ProgressBar(0);
		ProgressBar progressbar6=new ProgressBar(0);
		ProgressBar progressbar7=new ProgressBar(0);
		ProgressBar progressbar8=new ProgressBar(0);
		ProgressBar progressbar9=new ProgressBar(0);
		String step="";
		switch (value) {
		case "step1":progressbar1.setProgress(1);step="1";
			break;
		case "step2":progressbar1.setProgress(1);progressbar2.setProgress(1);step="2";
		    break;
		case "step3":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);step="3";
			break;
		case "step4":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);step="4";
			break;
		case "step5":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);progressbar5.setProgress(1);step="5";
			break;
		case "step6":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);progressbar5.setProgress(1);progressbar6.setProgress(1);step="6";
			break;
		case "step7":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);progressbar5.setProgress(1);progressbar6.setProgress(1);progressbar7.setProgress(1);step="7";
			break;
		case "step8":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);progressbar5.setProgress(1);progressbar6.setProgress(1);progressbar7.setProgress(1);progressbar8.setProgress(1);step="8";
			break;
		case "step9":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);progressbar5.setProgress(1);progressbar6.setProgress(1);progressbar7.setProgress(1);progressbar8.setProgress(1);progressbar9.setProgress(1);step="9";
			break;
		default:
			break;
		}
		progressBar.setMaxWidth(285);
		progressBar.getChildren().addAll(progressbar1,progressbar2,progressbar3,progressbar4,progressbar5,progressbar6,progressbar7,progressbar8,progressbar9,new Text("  "+step+"/9 "));
		progressBar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
		//btNavBandeau.setStyle("-fx-background-color: black");
		progressBar.setAlignment(Pos.CENTER);
	
		
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(15,15,15,15));
	 centralScreen.getChildren().addAll(pane,value!="step0"?progressBar:new Text());
	 centralScreenText.getChildren().add(centralScreen);

	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);
	
	//GridPane basdEcran = new GridPane();
	//basdEcran.add(btBacCollecteurVider, 0, 0);
	
	VBox ScreenLogo = new VBox();
	ScreenLogo.setPadding(new Insets(15,15, 15, 15));
	ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	//ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText,value=="step1"?basdEcran:new Text());
	//ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenLogo.setStyle("-fx-background-color: black");

	Scene scene = new Scene(ScreenLogo,700,300);
	stage.setScene(scene);
	return;	
 }
 public void displayProgMaintDetartrage(String value) {
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	Button btnStartStop = (value=="step0"||value=="step2"||value=="step3"||value=="step5"||(value=="step1"&&getIsFilterPresent()))?btStartStop:getEmptyButtonType1();
	Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
	Button btnOk = (value=="step1"||value=="step7")?btOk:getEmptyButtonType1();
	//btBacCollecteurVider=new Button(getLangueBundle().getString("bacCollecteurVider"));
	//btBacCollecteurVider.setStyle("-fx-background-color: black");
	
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(btnStartStop, 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(btnRetour, 1, 0);
	leftSetting.add(getEmptyButtonType2(), 1, 1);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(btnOk, 0, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	//centralScreenText.setPrefWidth(285);
	centralScreenText.setPrefWidth(300);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(80);
	rectangle.setStroke(Color.LIGHTGRAY);
	//rectangle.setStroke(Color.BLACK);
	rectangle.setFill(Color.LIGHTGRAY);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
	pane.getChildren().add(rectangle);
	 
	 HBox message = new HBox(); 
	 Text messageText = new Text(getLangueBundle().getString(getMessage()));
	 messageText.setFont(Font.font("courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 messageText.setTextAlignment(TextAlignment.CENTER);
	 message.getChildren().addAll(messageText);
	 message.setAlignment(Pos.CENTER);
	 pane.getChildren().add(message); 
	 
	
	    HBox progressBar = new HBox(); 
		ProgressBar progressbar1=new ProgressBar(0);
		ProgressBar progressbar2=new ProgressBar(0);
		ProgressBar progressbar3=new ProgressBar(0);
		ProgressBar progressbar4=new ProgressBar(0);
		ProgressBar progressbar5=new ProgressBar(0);
		ProgressBar progressbar6=new ProgressBar(0);
		ProgressBar progressbar7=new ProgressBar(0);
		String step="";
		switch (value) {
		case "step1":progressbar1.setProgress(1);step="1";
			break;
		case "step2":progressbar1.setProgress(1);progressbar2.setProgress(1);step="2";
		    break;
		case "step3":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);step="3";
			break;
		case "step4":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);step="4";
			break;
		case "step5":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);progressbar5.setProgress(1);step="5";
			break;
		case "step6":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);progressbar5.setProgress(1);progressbar6.setProgress(1);step="6";
			break;
		case "step7":progressbar1.setProgress(1);progressbar2.setProgress(1);progressbar3.setProgress(1);progressbar4.setProgress(1);progressbar5.setProgress(1);progressbar6.setProgress(1);progressbar7.setProgress(1);step="7";
			break;
		default:
			break;
		}
		progressBar.setMaxWidth(285);
		progressBar.getChildren().addAll(progressbar1,progressbar2,progressbar3,progressbar4,progressbar5,progressbar6,progressbar7,new Text("  "+step+"/7 "));
		progressBar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
		//btNavBandeau.setStyle("-fx-background-color: black");
		progressBar.setAlignment(Pos.CENTER);
	
		
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(15,15,15,15));
	 centralScreen.getChildren().addAll(pane,value!="step0"?progressBar:new Text());
	 centralScreenText.getChildren().add(centralScreen);

	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);
	
	VBox ScreenLogo = new VBox();
	ScreenLogo.setPadding(new Insets(15,15, 15, 15));
	ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	//ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText,value=="step1"?basdEcran:new Text());
	//ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenLogo.setStyle("-fx-background-color: black");

	Scene scene = new Scene(ScreenLogo,700,300);
	stage.setScene(scene);
	return;	
 }

 public void displayProgMaintNettoyage(String value) {
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	Button btnStartStop = (value=="step0"||value=="step2")?btStartStop:getEmptyButtonType1();
	Button btnOk = (value=="step1"||value=="step4")?btOk:getEmptyButtonType1();
	Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
	
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(btnStartStop, 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(btnRetour, 1, 0);
	leftSetting.add(getEmptyButtonType2(), 1, 1);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(btnOk, 0, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	//centralScreenText.setPrefWidth(285);
	centralScreenText.setPrefWidth(300);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(80);
	rectangle.setStroke(Color.LIGHTGRAY);
	//rectangle.setStroke(Color.BLACK);
	rectangle.setFill(Color.LIGHTGRAY);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
	pane.getChildren().add(rectangle);
	 
	 HBox message = new HBox(); 
	 Text messageText = new Text(getLangueBundle().getString(getMessage()));
	 messageText.setFont(Font.font("courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 messageText.setTextAlignment(TextAlignment.CENTER);
	 message.getChildren().addAll(messageText);
	 message.setAlignment(Pos.CENTER);
	 pane.getChildren().add(message); 
	 
	
    HBox progressBar = new HBox(); 
	ProgressBar progressbar=new ProgressBar(getProgressBarValue());
	progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
	progressBar.getChildren().addAll(progressbar);
	//btNavBandeau.setStyle("-fx-background-color: black");
	progressBar.setAlignment(Pos.CENTER);
		
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(5,5,5,5));
	 centralScreen.getChildren().addAll(pane,value=="step3"?progressBar:new Text());
	 centralScreenText.getChildren().add(centralScreen);

	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);
	
	//GridPane basdEcran = new GridPane();
	//basdEcran.add(btBacCollecteurVider, 0, 0);
	
	VBox ScreenLogo = new VBox();
	ScreenLogo.setPadding(new Insets(5,5,5,5));
	ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	//ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText,value=="step1"?basdEcran:new Text());
	//ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenLogo.setStyle("-fx-background-color: black");

	Scene scene = new Scene(ScreenLogo,700,300);
	stage.setScene(scene);
	return;
 }

 
 public void displayProgMaintMousseLait(String value) {
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	Button btnStartStop = (value=="step0"||value=="step1")?btStartStop:getEmptyButtonType1();
	Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
	
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(btnStartStop, 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(btnRetour, 1, 0);
	leftSetting.add(getEmptyButtonType2(), 1, 1);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(getEmptyButtonType2(), 0, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	//centralScreenText.setPrefWidth(285);
	centralScreenText.setPrefWidth(300);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(80);
	rectangle.setStroke(Color.LIGHTGRAY);
	//rectangle.setStroke(Color.BLACK);
	rectangle.setFill(Color.LIGHTGRAY);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
	pane.getChildren().add(rectangle);
	 
	 HBox message = new HBox(); 
	 Text messageText = new Text(getLangueBundle().getString(getMessage()));
	 messageText.setFont(Font.font("courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 messageText.setTextAlignment(TextAlignment.CENTER);
	 message.getChildren().addAll(messageText);
	 message.setAlignment(Pos.CENTER);
	 pane.getChildren().add(message); 
	 
	
    HBox progressBar = new HBox(); 
	ProgressBar progressbar=new ProgressBar(getProgressBarValue());
	progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
	progressBar.getChildren().addAll(progressbar);
	//btNavBandeau.setStyle("-fx-background-color: black");
	progressBar.setAlignment(Pos.CENTER);
		
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(5,5,5,5));
	 centralScreen.getChildren().addAll(pane,value=="step2"?progressBar:new Text());
	 centralScreenText.getChildren().add(centralScreen);

	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);
	
	//GridPane basdEcran = new GridPane();
	//basdEcran.add(btBacCollecteurVider, 0, 0);
	
	VBox ScreenLogo = new VBox();
	ScreenLogo.setPadding(new Insets(5,5,5,5));
	ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	//ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText,value=="step1"?basdEcran:new Text());
	//ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenLogo.setStyle("-fx-background-color: black");

	Scene scene = new Scene(ScreenLogo,700,300);
	stage.setScene(scene);
	return;
 }
	
 public void displayAlertMessage(String value) {
	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
	 btNavBandeau.setAlignment(Pos.CENTER);
	 
	//Button btnStartStop = (value=="step0"||value=="step1")?btStartStop:getEmptyButtonType1();
	//Button btnRetour = (value=="step0")?btRetour:getEmptyButtonType1();
	//btBacCollecteurVider.setText(value=="alertActionMessage1"?getLangueBundle().getString("filtreRemplacer"):(value=="alertActionMessage2"?getLangueBundle().getString("reservoirEauRempli"):(value=="alertActionMessage3"?getLangueBundle().getString("bacCollecteurVider"):("reservoirGrainsRempli"))));
	
	if(value=="alertActionMessage1") {
	btFiltreRemplacer.setText(getLangueBundle().getString("filtreRemplacer"));
	//btFiltreRemplacer = new Button(getLangueBundle().getString("filtreRemplacer"));
	//btFiltreRemplacer.setOnAction((e)->{statemachine.raiseFiltreRemplacer();});
	}else if(value=="alertActionMessage2") {
    btReservoirEauRempli.setText(getLangueBundle().getString("reservoirEauRempli"));
	//btReservoirEauRempli = new Button(getLangueBundle().getString("reservoirEauRempli"));
	//btReservoirEauRempli.setOnAction((e)->{statemachine.raiseReservoirRempli();});
	}else if(value=="alertActionMessage3") {
	btBacCollecteurVider.setText(getLangueBundle().getString("bacCollecteurVider"));
	//btBacCollecteurVider = new Button(getLangueBundle().getString("bacCollecteurVider"));
	//btBacCollecteurVider.setOnAction((e)->{statemachine.raiseBacCollectorVider();});
	}else if(value=="alertActionMessage4") {
	btReservoirGrainsRempli.setText(getLangueBundle().getString("reservoirGrainsRempli"));
	//btReservoirGrainsRempli = new Button(getLangueBundle().getString("reservoirGrainsRempli"));
	//btReservoirGrainsRempli.setOnAction((e)->{statemachine.raiseGrainsAjouter();});
	}
	
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(getEmptyButtonType2(), 1, 0);
	leftSetting.add(getEmptyButtonType2(), 1, 1);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(getEmptyButtonType2(), 0, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	//centralScreenText.setPrefWidth(285);
	centralScreenText.setPrefWidth(300);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(40);
	rectangle.setStroke(Color.LIGHTGRAY);
	//rectangle.setStroke(Color.BLACK);
	rectangle.setFill(Color.LIGHTGRAY);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
	pane.getChildren().add(rectangle);
	 
	 HBox message = new HBox(); 
	 Text messageText = new Text(getLangueBundle().getString(value));
	 messageText.setFont(Font.font("courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 messageText.setTextAlignment(TextAlignment.CENTER);
	 message.getChildren().addAll(messageText);
	 message.setAlignment(Pos.CENTER);
	 pane.getChildren().add(message); 
	 
	
    /*HBox progressBar = new HBox(); 
	ProgressBar progressbar=new ProgressBar(getProgressBarValue());
	progressbar.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(10));
	progressBar.getChildren().addAll(progressbar);
	//btNavBandeau.setStyle("-fx-background-color: black");
	progressBar.setAlignment(Pos.CENTER);*/
		
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(5,5,5,5));
	 //centralScreen.getChildren().addAll(pane,value=="step2"?progressBar:new Text());
	 centralScreen.getChildren().addAll(pane);
	 centralScreenText.getChildren().add(centralScreen);

	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);
	
	GridPane basdEcran = new GridPane();
	//basdEcran.add(btBacCollecteurVider, 0, 0);
	basdEcran.add(value=="alertActionMessage1"?btFiltreRemplacer:(value=="alertActionMessage2"?btReservoirEauRempli:(value=="alertActionMessage3"?btBacCollecteurVider:(btReservoirGrainsRempli))), 0, 0);
	
	VBox ScreenLogo = new VBox();
	ScreenLogo.setPadding(new Insets(5,5,5,5));
	//ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText,new Text(),new Text(),basdEcran);
	//ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenLogo.setStyle("-fx-background-color: black");

	Scene scene = new Scene(ScreenLogo,700,300);
	stage.setScene(scene);
	return;
 }
 public void displayAttenteActionMessage(String value) {

	 HBox btNavBandeau = new HBox(); 
	 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
	 btNavBandeau.setAlignment(Pos.CENTER);
	
	GridPane bandeauDeCommandes = new GridPane();
	bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
	bandeauDeCommandes.add(getEmptyButtonType1(), 8, 0);
	bandeauDeCommandes.setHgap(2);
	//bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
	bandeauDeCommandes.setStyle("-fx-background-color: black");
	bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));
	
	GridPane leftSetting = new GridPane();
	leftSetting.setHgap(5.5);
	leftSetting.setVgap(5.5);
	leftSetting.add(getEmptyButtonType2(), 1, 0);
	leftSetting.add(getEmptyButtonType2(), 1, 1);
	leftSetting.add(getEmptyButtonType2(), 0, 1);
	GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
	
	GridPane rightSetting = new GridPane();
	rightSetting.setHgap(5.5);
	rightSetting.setVgap(5.5);
	rightSetting.add(getEmptyButtonType2(), 0, 0);
	rightSetting.add(btMenu, 1, 0);
	rightSetting.add(getEmptyButtonType2(), 1, 1);
	rightSetting.add(getEmptyButtonType2(), 0, 1);
	
	Pane centralScreenText = new Pane();
	//centralScreenText.setPrefWidth(285);
	centralScreenText.setPrefWidth(300);
	centralScreenText.setStyle("-fx-background-color: lightgray");
	Pane pane = new StackPane();
	
	Rectangle rectangle = new Rectangle();
	rectangle.setHeight(40);
	rectangle.setStroke(Color.LIGHTGRAY);
	//rectangle.setStroke(Color.BLACK);
	rectangle.setFill(Color.LIGHTGRAY);
	rectangle.widthProperty().bind(centralScreenText.widthProperty().subtract(30));
	pane.getChildren().add(rectangle);
	 
	 HBox message = new HBox(); 
	 Text messageText = new Text(getLangueBundle().getString(value));
	 messageText.setFont(Font.font("courier", FontWeight.NORMAL,FontPosture.REGULAR,12));
	 messageText.setTextAlignment(TextAlignment.CENTER);
	 message.getChildren().addAll(messageText);
	 message.setAlignment(Pos.CENTER);
	 pane.getChildren().add(message); 
	 
		
	 VBox centralScreen = new VBox();
	 centralScreen.setPadding(new Insets(5,5,5,5));
	 //centralScreen.getChildren().addAll(pane,value=="step2"?progressBar:new Text());
	 centralScreen.getChildren().addAll(pane);
	 centralScreenText.getChildren().add(centralScreen);

	GridPane bandeauScreenText = new GridPane();
	bandeauScreenText.add(leftSetting, 0, 0);
	bandeauScreenText.add(centralScreenText, 1, 0);
	bandeauScreenText.add(rightSetting, 2, 0);
	bandeauScreenText.setHgap(15);

	VBox ScreenLogo = new VBox();
	ScreenLogo.setPadding(new Insets(5,5,5,5));
	//ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	ScreenLogo.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
	//ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
	ScreenLogo.setStyle("-fx-background-color: black");

	Scene scene = new Scene(ScreenLogo,700,300);
	stage.setScene(scene);
	return;
 }

 
 	public void displayNettogaState() {
		// TODO Auto-generated method stub
		
	}

	public void displayDetartrageState() {
		// TODO Auto-generated method stub
		
	}

	public void displayCalcnCleanState() {
		// TODO Auto-generated method stub
		
	}

	public void displayNettoyageSystemeLaitState() {
		// TODO Auto-generated method stub
		
	}
	
	public Button getBtStartStop(){
		return btStartStop;
	}
	
	public Button getBtNav() {
		return btNav;
	}
	
	public void displayOffStateTest() {
		 HBox btNavBandeau = new HBox(); 
		 btNavBandeau.getChildren().addAll(getEmptyButtonType3());
		 //btNavBandeau.setStyle("-fx-background-color: black");
		 btNavBandeau.setAlignment(Pos.CENTER);
				
		GridPane bandeauDeCommandes = new GridPane();
		bandeauDeCommandes.add(getEmptyButtonType1(), 0, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 1, 0);
		bandeauDeCommandes.add(btCafeSelected, 2, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		//bandeauDeCommandes.add(getEmptyButtonType1(), 2, 0);
		//bandeauDeCommandes.add(getEmptyButtonType1(), 3, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 4, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 5, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 6, 0);
		bandeauDeCommandes.add(getEmptyButtonType1(), 7, 0);
		bandeauDeCommandes.add(btStartStop, 8, 0);
		bandeauDeCommandes.setHgap(2);
		bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
		bandeauDeCommandes.setPadding(new Insets(2, 2, 2, 2));

		GridPane leftSetting = new GridPane();
		//leftSetting.setAlignment(Pos.CENTER);
		//leftSetting.setPadding(new Insets(0, 10, 10, 10));
		leftSetting.setHgap(5.5);
		leftSetting.setVgap(5.5);
		leftSetting.add(getEmptyButtonType2(), 1, 0);
		leftSetting.add(getEmptyButtonType2(), 1, 1);
		leftSetting.add(getEmptyButtonType2(), 0, 1);
		GridPane.setHalignment(getEmptyButtonType2(), HPos.RIGHT);
		
		GridPane rightSetting = new GridPane();
		//rightSetting.setAlignment(Pos.CENTER);
		//rightSetting.setPadding(new Insets(0, 10, 10, 10));
		rightSetting.setHgap(5.5);
		rightSetting.setVgap(5.5);
		rightSetting.add(getEmptyButtonType2(), 0, 0);
		//rightSetting.add(new Pane(), 0, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 0);
		rightSetting.add(getEmptyButtonType2(), 1, 1);
		rightSetting.add(getEmptyButtonType2(), 0, 1);
		
		Pane centralScreenText = new Pane();
		//centralScreenText.setPadding(new Insets(0, 0, 100, 0));
		centralScreenText.setPrefWidth(285);;
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		//Text selectedDrink = new Text(100, 30, "Expresso");
		//selectedDrink.setFont(Font.font("Courier", FontWeight.BOLD,
		//FontPosture.ITALIC, 15));
		//centralScreenText.getChildren().add(selectedDrink);
		//Text intensiteCafe = new Text(30, 90, "normal");
		//centralScreenText.getChildren().add(intensiteCafe);
		//Text cupSize = new Text(220, 90, "moyen");
		//centralScreenText.getChildren().add(cupSize);
		
		/*
		 * HBox bandeauBottom = new HBox();
		 * bandeauBottom.getChildren().addAll(leftSetting, centralScreenText,
		 * rightSetting); //btNavBandeau.setStyle("-fx-background-color: black");
		 * btNavBandeau.setAlignment(Pos.CENTER);
		 */
		
		GridPane bandeauScreenText = new GridPane();
		bandeauScreenText.add(leftSetting, 0, 0);
		bandeauScreenText.add(centralScreenText, 1, 0);
		bandeauScreenText.add(rightSetting, 2, 0);
		bandeauScreenText.setHgap(15);

		
		VBox ScreenSelectDrink = new VBox(5);
		ScreenSelectDrink.setPadding(new Insets(15,15, 15, 15));
		ScreenSelectDrink.getChildren().addAll(bandeauDeCommandes,btNavBandeau,bandeauScreenText);
		ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");


		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
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