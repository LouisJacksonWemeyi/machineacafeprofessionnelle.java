package com.yakindu.sct.machineacafeprofessionnelle.java;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl;
import com.yakindu.core.TimerService;
public class MachineAcafeProfessionnelleMain extends Application {
	
	private TimerService timerService;
	private Ecran coffeMachineScreen;
	private MachineAcafeProfessionnelleCtrl statemachine;
	/*
	 * class ScreenDisplayOffObserver implements Observer<Void>{
	 * 
	 * @Override public void next(Void T) { coffeMachineScreen.displayOffState(); }
	 * }
	 * 
	 * class ScreenDisplayLanguageChoiceObserver implements Observer<String>{
	 * 
	 * @Override public void next(String value) {
	 * coffeMachineScreen.displayLanguageChoiceState(value); } }
	 * 
	 * class ScreenDisplayLogoObserver implements Observer<Void>{
	 * 
	 * @Override public void next(Void T) { coffeMachineScreen.displayLogoState(); }
	 * }
	 * 
	 * class ScreenDisplayRincageObserver implements Observer<Void>{
	 * 
	 * @Override public void next(Void T) {
	 * coffeMachineScreen.displayRincageState(); } }
	 * 
	 * class ScreenDisplayNormalDrinkSelectObserver implements Observer<String>{
	 * 
	 * @Override public void next(String value) {
	 * coffeMachineScreen.displayNormalDrinkSelectState(value); } }
	 * 
	 * class ScreenDisplaySpecialDrinkSelectObserver implements Observer<String>{
	 * 
	 * @Override public void next(String value) {
	 * coffeMachineScreen.displaySpecialDrinkSelectState(value); } }
	 * 
	 * class ScreenDisplayPreparationBoissonObserver implements Observer<String>{
	 * 
	 * @Override public void next(String value) {
	 * coffeMachineScreen.displayPreparationBoissonState(value); } } class
	 * ScreenDisplayErrorMessageObserver implements Observer<String>{
	 * 
	 * @Override public void next(String value) {
	 * coffeMachineScreen.displayErrorMessageState(value); } } class
	 * ScreenDisplayMenuObserver implements Observer<Void>{
	 * 
	 * @Override public void next(Void T) { coffeMachineScreen.displayMenuState(); }
	 * } class ScreenDisplayNettoyageObserver implements Observer<Void>{
	 * 
	 * @Override public void next(Void T) {
	 * coffeMachineScreen.displayNettogaState(); } } class
	 * ScreenDisplayDetartrageObserver implements Observer<Void>{
	 * 
	 * @Override public void next(Void T) {
	 * coffeMachineScreen.displayDetartrageState(); } } class
	 * ScreenDisplayCalcnCleanObserver implements Observer<Void>{
	 * 
	 * @Override public void next(Void T) {
	 * coffeMachineScreen.displayCalcnCleanState(); } } class
	 * ScreenDisplayNettoyageSystemeLaitObserver implements Observer<Void>{
	 * 
	 * @Override public void next(Void T) {
	 * coffeMachineScreen.displayNettoyageSystemeLaitState(); } }
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			MachineAcafeProfessionnelleMain app=new MachineAcafeProfessionnelleMain();
			app.setupStatemachine(primaryStage);
			app.run();
			//BorderPane root = new BorderPane();
			//VBox root = new CoffeMachineScreen().ScreenSelectDrink();
			//new Ecran(primaryStage).screenSelectDrink();
			//Scene scene = new Scene(root,700,300);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//scene.getStylesheets().add(getClass().getResource("/coffeMachineScreen/coffeMachineScreen.css").toExternalForm());
			//primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	protected void run() {
		statemachine.enter();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	private  void setupStatemachine(Stage stage) {
		statemachine = new MachineAcafeProfessionnelleCtrl();
		timerService = new TimerService();
		coffeMachineScreen = new Ecran(stage);
		statemachine.setTimerService(timerService);
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.screen().getDisplayOff().subscribe((e) -> Platform.runLater(()->coffeMachineScreen.displayOffState()));
		statemachine.screen().getDisplayChoixLangue().subscribe((value)->coffeMachineScreen.displayChoixLangueState(value));
		statemachine.screen().getDisplayLogo().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayLogoState(value)));
		statemachine.screen().getDisplayHeatingUp().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayHeatingUpState(value)));
		statemachine.screen().getDisplayRincage().subscribe((e) -> Platform.runLater(()->coffeMachineScreen.displayRincageState()));
		statemachine.screen().getDisplayNormalDrinkSelected().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayNormalDrinkSelected(value)));
		statemachine.screen().getDisplayPreparationBoisson().subscribe((value)->Platform.runLater(()->coffeMachineScreen.displayPreparationBoissonState(value)));
		statemachine.screen().getUpdateIntensiteCafe().subscribe((value) -> coffeMachineScreen.setIntensiteDucafe(value));
		statemachine.screen().getUpdateTailleDeLaTasse().subscribe((value) -> coffeMachineScreen.setTailleDeLaTasse(value));
		statemachine.screen().getUpdateTailleTasseBoiFav().subscribe((value) -> coffeMachineScreen.setTailleTasseBoiFav(value));
		statemachine.screen().getUpdateDeuxTasseAlafois().subscribe((value)->coffeMachineScreen.setDeuxTasses(value));
		statemachine.screen().getUpdateProgressBar().subscribe((value)->coffeMachineScreen.setProgressBarValue(value));
		statemachine.screen().getUpdateProgressBarCafe().subscribe((value)->coffeMachineScreen.setProgressBarCafe(value));
		statemachine.screen().getUpdateProgressBarLait().subscribe((value)->coffeMachineScreen.setProgressBarLait(value));
		statemachine.screen().getDisplayPrepBoissonDone().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayBoissonReadyState(value)));
		statemachine.screen().getDisplayMessage().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayMessageState(value)));
		statemachine.screen().getDisplayMenu().subscribe((value)->coffeMachineScreen.displayMenuState(value));
		statemachine.screen().getDisplayChoixBoissonFavori().subscribe((value)->coffeMachineScreen.displayChoixBoissonFavori(value));
		statemachine.screen().getDisplaySelectTailleIntensiteBoissonFav().subscribe((value)->Platform.runLater(()->coffeMachineScreen.displaySelectTailleIntensiteBoissonFav(value)));
		statemachine.screen().getUpdateMessage().subscribe((value)->coffeMachineScreen.setMessage(value));
		statemachine.screen().getDisplayAjusterTailleTasseFav().subscribe((value)->coffeMachineScreen.displayTailleTasseBoissonFavMessage(value));
		statemachine.screen().getDisplaySelectTailleTasseFav().subscribe((value)->coffeMachineScreen.displaySelectTailleTasseBoissonFav(value));
		statemachine.screen().getDisplayTemperatureBoissonFav().subscribe((value)->coffeMachineScreen.displayTemperatureBoissonFavMessage(value));
		statemachine.screen().getDisplaySelectTemperatureBoissonFav().subscribe((value)->coffeMachineScreen.displaySelectTemperatureBoissonFav(value));
		statemachine.screen().getUpdateTemperatureBoisson().subscribe((value)->coffeMachineScreen.setTemperatureBoissonFav(value));
		statemachine.screen().getDisplayRatioLaitCafeFav().subscribe((value)->coffeMachineScreen.displayRatioLaitCafeFavMessage(value));
		statemachine.screen().getDisplaySelectRatioLaitafeFav().subscribe((value)->coffeMachineScreen.displaySelectRatioLaitCafeFav(value));
		statemachine.screen().getUpdateRatioLaitCafe().subscribe((value)->coffeMachineScreen.setRatioLaitCafe(value));
		statemachine.screen().getUpdateNumfavBoisson().subscribe((value)->coffeMachineScreen.setNumFavBoisson(value));
		statemachine.screen().getUpdateIsHandlingBoissonFav().subscribe((value)->coffeMachineScreen.setIsHandlingBoissonFav(value));
		statemachine.screen().getBeepSound().subscribe((e)->coffeMachineScreen.beepSound());
		statemachine.screen().getDisplayMenuNetEntretien().subscribe((value)->coffeMachineScreen.displayMenuNettoyageEtEntretien(value));
		statemachine.screen().getUpdateIsFilterPresent().subscribe((value)->coffeMachineScreen.setIsFilterPresent(value));
		statemachine.screen().getUpdateNbreBoissons().subscribe((value)->coffeMachineScreen.setNbreBoissons(value));
		statemachine.screen().getDisplayReglageDureteDeLeau().subscribe((value)->coffeMachineScreen.displayReglageDureteDeLeau(value));
		statemachine.screen().getUpdateDureteDeLeau().subscribe((value)->coffeMachineScreen.setDureteDeLeau(value));
		statemachine.screen().getDisplayReglageLangue().subscribe((value)->coffeMachineScreen.displayReglageLangue(value));
		statemachine.screen().getUpdateLangue().subscribe((value)->coffeMachineScreen.setLangue(value));
		statemachine.screen().getDisplayReglageQteBoisson().subscribe((value)->coffeMachineScreen.displayReglageQteBoisson(value));
		statemachine.screen().getDisplayReglageQteBoissonPetit().subscribe((value)->coffeMachineScreen.displayReglageQteBoissonPetit(value)); 
		statemachine.screen().getDisplayReglageQteBoissonMoyen().subscribe((value)->coffeMachineScreen.displayReglageQteBoissonMoyen(value)); 
		statemachine.screen().getDisplayReglageQteBoissonGrand().subscribe((value)->coffeMachineScreen.displayReglageQteBoissonGrand(value)); 
		statemachine.screen().getUpdateIsTailleDeLaTasseMlValeurDifUsine().subscribe((value)->coffeMachineScreen.setIsTailleDeLaTasseMlValeurDifUsine(value));
		statemachine.screen().getUpdateTemps().subscribe((value)->coffeMachineScreen.setTempsArretAutomatique(value));
		statemachine.screen().getUpdateBeepSonore().subscribe((value)->coffeMachineScreen.setBipSonore(value));
		statemachine.screen().getDisplayReglageProportionLaitCafe().subscribe((value)->coffeMachineScreen.displayReglageProportionLaitCafe(value));
		statemachine.screen().getDisplayProportionLaitCafe().subscribe((value)->coffeMachineScreen.displayProportionLaitCafe(value));
		statemachine.screen().getDisplayReglageTemperatureBoisson().subscribe((value)->coffeMachineScreen.displayReglageTemperatureBoisson(value));
		statemachine.screen().getDisplayReglageArretAutomatique().subscribe((value)->coffeMachineScreen.displayReglageArretAutomatique(value));
		statemachine.screen().getDisplayReglageFiltreEau().subscribe((value)->coffeMachineScreen.displayReglageFiltreEau(value));
		statemachine.screen().getDisplayReglageBeepSonore().subscribe((value)->coffeMachineScreen.displayReglageBipsonore(value));
		statemachine.screen().getDisplayProgMaintCalcNclean().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayProgMaintCalcNclean(value)));
		statemachine.screen().getDisplayProgMaintDetartrage().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayProgMaintDetartrage(value)));
		statemachine.screen().getDisplayProgMaintNettoyage().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayProgMaintNettoyage(value)));
		statemachine.screen().getDisplayProgMaintMousseLait().subscribe((value)-> Platform.runLater(()->coffeMachineScreen.displayProgMaintMousseLait(value)));

		
		coffeMachineScreen.getBtStartStop().setOnAction((e)->{statemachine.raiseStartStop();});
		coffeMachineScreen.getBtNav().setOnAction((e)->{statemachine.raiseNavButtonClick();});
		coffeMachineScreen.getBtExpresso().setOnAction((e)->{statemachine.raiseSelectNormalDrink("expresso");});
		coffeMachineScreen.getBtExpressoMacch().setOnAction((e)->{statemachine.raiseSelectNormalDrink("expressomacch");});
		coffeMachineScreen.getBtCafe().setOnAction((e)->{statemachine.raiseSelectNormalDrink("cafe");});
		coffeMachineScreen.getBtCappuccino().setOnAction((e)->{statemachine.raiseSelectNormalDrink("cappuccino");});
		coffeMachineScreen.getBtLatteMacchiato().setOnAction((e)->{statemachine.raiseSelectNormalDrink("lattemacchiato");});
		coffeMachineScreen.getBtCafeAuLait().setOnAction((e)->{statemachine.raiseSelectNormalDrink("cafeaulait");});
		coffeMachineScreen.getBtMousseLait().setOnAction((e)->{statemachine.raiseSelectNormalDrink("mousselait");});
		coffeMachineScreen.getBtBoissonSpeciales().setOnAction((e)->{statemachine.raiseSelectSpecialDrink();});
		coffeMachineScreen.getBtIntensite().setOnAction((e)->{statemachine.raiseIntensiteCafeButtonClick();});
		coffeMachineScreen.getBtMl().setOnAction((e)->{statemachine.raiseTailleDeLaTasseButtonClick();});
		coffeMachineScreen.getBtDeuxTasses().setOnAction((e)->{statemachine.raiseDeuxTasseAlafoisButtonClick();});
		coffeMachineScreen.getBtBoissonSpecialeSelected().setOnAction((e)->{statemachine.raiseSelectSpecialDrink();});
		coffeMachineScreen.getBtDeuxTasses().setOnAction((e)->{statemachine.raiseDeuxTasseAlafoisButtonClick();});
		coffeMachineScreen.getBtMenu().setOnAction((e)->{statemachine.raiseMenuButtonClick();});
		coffeMachineScreen.getBtOk().setOnAction((e)->{statemachine.raiseOkButtonClick();});
		coffeMachineScreen.getBtSecuEnfant().setOnAction((e)->{statemachine.raiseFavButtonClick();});
		coffeMachineScreen.getBtRetour().setOnAction((e)->{statemachine.raiseRetourButtonClick();});
		coffeMachineScreen.getBtBacCollecteurVider().setOnAction((e)->{statemachine.raiseBacCollectorVider();});
		
		
		
		
		//statemachine.screen().getDisplayOff().subscribe(new ScreenDisplayOffObserver());
		//statemachine.screen().getDisplayLanguageChoice().subscribe(new ScreenDisplayLanguageChoiceObserver());
		//ainsi de suite pour tous les obsevables
	}
	
}