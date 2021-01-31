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
		statemachine.screen().getDisplayLogo().subscribe((e) -> coffeMachineScreen.displayLogoState());
		statemachine.screen().getDisplayHeatingUp().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayHeatingUpState(value)));
		statemachine.screen().getDisplayRincage().subscribe((e) -> Platform.runLater(()->coffeMachineScreen.displayRincageState()));
		statemachine.screen().getDisplayNormalDrinkSelected().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayNormalDrinkSelected(value)));
		statemachine.screen().getDisplayPreparationBoisson().subscribe((value)->Platform.runLater(()->coffeMachineScreen.displayPreparationBoissonState(value)));
		statemachine.screen().getUpdateIntensiteCafe().subscribe((value) -> coffeMachineScreen.setIntensiteDucafe(value));
		statemachine.screen().getUpdateTailleDeLaTasse().subscribe((value) -> coffeMachineScreen.setTailleDeLaTasse(value));
		statemachine.screen().getUpdateDeuxTasseAlafois().subscribe((value)->coffeMachineScreen.setDeuxTasses(value));
		statemachine.screen().getUpdateProgressBar().subscribe((value)->coffeMachineScreen.setProgressBarValue(value));
		statemachine.screen().getUpdateProgressBarCafe().subscribe((value)->coffeMachineScreen.setProgressBarCafe(value));
		statemachine.screen().getUpdateProgressBarLait().subscribe((value)->coffeMachineScreen.setProgressBarLait(value));
		statemachine.screen().getDisplayPrepBoissonDone().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayBoissonReadyState(value)));
		statemachine.screen().getDisplayMessage().subscribe((value) -> Platform.runLater(()->coffeMachineScreen.displayMessageState(value)));
		
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
		
		//statemachine.screen().getDisplayOff().subscribe(new ScreenDisplayOffObserver());
		//statemachine.screen().getDisplayLanguageChoice().subscribe(new ScreenDisplayLanguageChoiceObserver());
		//ainsi de suite pour tous les obsevables
	}
	
}