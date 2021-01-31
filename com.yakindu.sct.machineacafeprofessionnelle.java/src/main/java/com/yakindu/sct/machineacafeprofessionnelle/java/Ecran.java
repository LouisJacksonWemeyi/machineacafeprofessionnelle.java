package com.yakindu.sct.machineacafeprofessionnelle.java;


import java.text.DecimalFormat;
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
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
private String intensiteDucafe = "normal";
private String tailleDeLaTasse = "moyen";
private boolean deuxTasses=false;
private double progressBarValue = 0.0;
private double progressBarCafe = 0.0;
private double progressBarLait = 0.0;


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
		btExpresso.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView expressoMacch= new ImageView(new Image("/images/expressoMacch.png"));
		expressoMacch.setFitHeight(66);
		expressoMacch.setFitWidth(55);
		btExpressoMacch = new Button("", expressoMacch);
		btExpressoMacch.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView cafe= new ImageView(new Image("/images/cafe.png"));
		cafe.setFitHeight(66);
		cafe.setFitWidth(55);
		btCafe = new Button("",cafe);
		btCafe.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView cappuccino= new ImageView(new Image("/images/cappuccino.png"));
		cappuccino.setFitHeight(66);
		cappuccino.setFitWidth(55);
		btCappuccino = new Button("",cappuccino);
		btCappuccino.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView latteMacchiato= new ImageView(new Image("/images/latteMacchiato.png"));
		latteMacchiato.setFitHeight(66);
		latteMacchiato.setFitWidth(55);
		btLatteMacchiato = new Button("", latteMacchiato);
		btLatteMacchiato.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView cafeAuLait = new ImageView(new Image("/images/cafeAuLait.png"));
		cafeAuLait.setFitHeight(66);
		cafeAuLait.setFitWidth(55);
		btCafeAuLait = new Button("", cafeAuLait);
		btCafeAuLait.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView MousseLait = new ImageView(new Image("/images/MousseLait.png"));
		MousseLait.setFitHeight(66);
		MousseLait.setFitWidth(55);
		btMousseLait = new Button("", MousseLait);
		btMousseLait.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView boissonSpeciales = new ImageView(new Image("/images/boissonSpeciales.png"));
		boissonSpeciales.setFitHeight(66);
		boissonSpeciales.setFitWidth(55);
		btBoissonSpeciales = new Button("", boissonSpeciales);
		btBoissonSpeciales.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView startStop = new ImageView(new Image("/images/startStop.png"));
		startStop.setFitHeight(66);
		startStop.setFitWidth(55);
		btStartStop = new Button("", startStop);
		btStartStop.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView menu = new ImageView(new Image("/images/menu.png"));
		menu.setFitHeight(41);
		menu.setFitWidth(66);
		btMenu = new Button("", menu);
		btMenu.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView ok = new ImageView(new Image("/images/ok.png"));
		ok.setFitHeight(41);
		ok.setFitWidth(66);
		btOk = new Button("", ok);
		btOk.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView secuEnfant = new ImageView(new Image("/images/secuEnfant.png"));
		secuEnfant.setFitHeight(41);
		secuEnfant.setFitWidth(66);
		btSecuEnfant = new Button("", secuEnfant);
		btSecuEnfant.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView ml = new ImageView(new Image("/images/ml.png"));
		ml.setFitHeight(41);
		ml.setFitWidth(66);
		btMl = new Button("", ml);
		btMl.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView retourArriere = new ImageView(new Image("/images/retourArriere.png"));
		retourArriere.setFitHeight(41);
		retourArriere.setFitWidth(66);
		btRetour= new Button("", retourArriere);
		btRetour.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView intensite = new ImageView(new Image("/images/intensite.png"));
		intensite.setFitHeight(41);
		intensite.setFitWidth(66);
		btIntensite = new Button("", intensite);
		btIntensite.setStyle("-fx-background-color: derive(grey, -60%)");

		ImageView deuxtasses = new ImageView(new Image("/images/deuxtasses.png"));
		deuxtasses.setFitHeight(41);
		deuxtasses.setFitWidth(66);
		btDeuxTasses = new Button("", deuxtasses);
		btDeuxTasses.setStyle("-fx-background-color: derive(grey, -60%)");

		
		ImageView navi = new ImageView(new Image("/images/navi.png"));
		navi.setFitHeight(17);
		navi.setFitWidth(27);
		btNav = new Button("",navi);
		btNav.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView expressoSelected= new ImageView(new Image("/images/expressoSel.png"));
		expressoSelected.setFitHeight(66);
		expressoSelected.setFitWidth(55);
		btExpressoSelected = new Button("",expressoSelected);
		btExpressoSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView expressoMacchSelected= new ImageView(new Image("/images/expressoMacchSel.png"));
		expressoMacchSelected.setFitHeight(66);
		expressoMacchSelected.setFitWidth(55);
		btExpressoMacchSelected = new Button("", expressoMacchSelected);
		btExpressoMacchSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView cafeSelected= new ImageView(new Image("/images/cafeSel.png"));
		cafeSelected.setFitHeight(66);
		cafeSelected.setFitWidth(55);
		btCafeSelected = new Button("",cafeSelected);
		btCafeSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView cappuccinoSelected = new ImageView(new Image("/images/cappuccinoSel.png"));
		cappuccinoSelected.setFitHeight(66);
		cappuccinoSelected.setFitWidth(55);
		btCappuccinoSelected = new Button("",cappuccinoSelected);
		btCappuccinoSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView latteMacchiatoSelected= new ImageView(new Image("/images/latteMacchiatoSel.png"));
		latteMacchiatoSelected.setFitHeight(66);
		latteMacchiatoSelected.setFitWidth(55);
		btLatteMacchiatoSelected = new Button("", latteMacchiatoSelected);
		btLatteMacchiatoSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView cafeAuLaitSelected = new ImageView(new Image("/images/cafeAuLaitSel.png"));
		cafeAuLaitSelected.setFitHeight(66);
		cafeAuLaitSelected.setFitWidth(55);
		btCafeAuLaitSelected = new Button("", cafeAuLaitSelected);
		btCafeAuLaitSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView MousseLaitSelected = new ImageView(new Image("/images/MousseLaitSel.png"));
		MousseLaitSelected.setFitHeight(66);
		MousseLaitSelected.setFitWidth(55);
		btMousseLaitSelected = new Button("", MousseLaitSelected);
		btMousseLaitSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		
		ImageView boissonSpecialeSelected = new ImageView(new Image("/images/boissonSpecialeSel.png"));
		boissonSpecialeSelected.setFitHeight(66);
		boissonSpecialeSelected.setFitWidth(55);
		btBoissonSpecialeSelected = new Button("", boissonSpecialeSelected);
		btBoissonSpecialeSelected.setStyle("-fx-background-color: derive(grey, -60%)");
		
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
		centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
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
		ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");


		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
	}

	public void displayChoixLangueState(String langue){
		
		setLangue(langue);
		this.langueBundle=this.langue=="deutsch"?bundleNL:this.langue=="english"?bundleEN:bundleFR;
				
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
		bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
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
		ligne1.getChildren().addAll(ligne1Text,choixLangue);
		ligne1.setAlignment(Pos.CENTER);
		 
		 HBox ligne2 = new HBox(); 
		 Text ligne2Text = new Text("Deutsch");
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
		case "english":ligne3Text.setText("English");ligne2Text.setText("Français");ligne1Text.setText("Deutsch");
			break;
		case "deutsch":ligne3Text.setText("Deutsch");ligne2Text.setText("Français");ligne1Text.setText("English");
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
		ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");
		
		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
	}
	
	public void displayLogoState() {
		
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
		bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
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
		ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
		
		Scene scene = new Scene(ScreenLogo,700,300);
		stage.setScene(scene);
		return;
	}
	
	private Button getEmptyButtonType1() {
		ImageView empty = new ImageView();
		empty.setFitHeight(66);
		empty.setFitWidth(55);
		Button btempty = new Button("", empty);
		btempty.setStyle("-fx-background-color: derive(grey, -60%)");
		return btempty;

	}
	
	private Button getEmptyButtonType2() {
		ImageView empty = new ImageView();
		empty.setFitHeight(41);
		empty.setFitWidth(66);
		Button btempty = new Button("", empty);
		btempty.setStyle("-fx-background-color: derive(grey, -60%)");
		return btempty;
	}
	
	private Button getEmptyButtonType3() {
		ImageView empty = new ImageView();
		empty.setFitHeight(17);
		empty.setFitWidth(27);
		Button btempty = new Button("", empty);
		btempty.setStyle("-fx-background-color: derive(grey, -60%)");
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
		bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
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
		ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");


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
		bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
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
		screen.setStyle("-fx-background-color: derive(grey, -60%)");


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
		Text selectedDrink = new Text(100, 30, deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
		selectedDrink.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
		centralScreenText.getChildren().add(selectedDrink);
		Text intensiteCafe = new Text(30, 90, getLangueBundle().getString(getIntensiteDucafe()));
		centralScreenText .getChildren().add(intensiteCafe);
		Text cupSize = new Text(220, 90, getLangueBundle().getString(getTailleDeLaTasse()));
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
		centralScreenText.setPrefWidth(285);
		//centralScreenText.setStyle("-fx-background-color: derive(grey, -60%)");
		centralScreenText.setStyle("-fx-background-color: lightgray");
		
		if((value=="expressomacch"||value=="cappuccino"||value=="lattemacchiato"||value=="cafeaulait"||value=="flatwhite"||value=="cafecortado")) {
			
		    HBox drink = new HBox(); 
			Text drinkText = new Text(deuxTasses?("2 "+ getLangueBundle().getString(value)):getLangueBundle().getString(value));
			//btNavBandeau.setStyle("-fx-background-color: black");
			drinkText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 20));
			//drink.prefWidthProperty().bind(centralScreenText.widthProperty().subtract(0));
			drink.getChildren().addAll(drinkText);
			drink.setAlignment(Pos.CENTER);
			
			HBox action = new HBox(); 
			Text actionText = new Text(getLangueBundle().getString("annuler"));
			actionText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 12));
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
			 drinkText.setFont(Font.font("Courier", FontWeight.BOLD,
						FontPosture.ITALIC, 20));
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
			 drinkText.setFont(Font.font("Courier", FontWeight.BOLD,
						FontPosture.ITALIC, 20));
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
		 drinkText.setFont(Font.font("Courier", FontWeight.BOLD,
					FontPosture.ITALIC, 20));
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
		ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");


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
		bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
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
		ScreenSelectDrink.setStyle("-fx-background-color: derive(grey, -60%)");


		Scene scene = new Scene(ScreenSelectDrink,700,300);
		stage.setScene(scene);
		return;
	}

	public void displayMessageState(String value) {
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
		bandeauDeCommandes.add(btStartStop, 8, 0);
		bandeauDeCommandes.setHgap(2);
		bandeauDeCommandes.setStyle("-fx-background-color: derive(grey, -60%)");
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
		ScreenLogo.setStyle("-fx-background-color: derive(grey, -60%)");
		
		Scene scene = new Scene(ScreenLogo,700,300);
		stage.setScene(scene);
		return;	
	}

	public void displayMenuState() {
		// TODO Auto-generated method stub
		
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

