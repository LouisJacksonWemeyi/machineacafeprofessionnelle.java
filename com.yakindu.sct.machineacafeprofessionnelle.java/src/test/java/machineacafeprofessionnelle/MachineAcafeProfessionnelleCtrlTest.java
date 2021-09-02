package machineacafeprofessionnelle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.yakindu.core.TimerService;
import com.yakindu.sct.machineacafeprofessionnelle.java.OperationCallback;

class MachineAcafeProfessionnelleCtrlTest {

	@Test
	void testActiveDisplayLogoSTATE() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_DISPLAYLOGO));
	}
	
	@Test
	void testActiveHeatingUpSTATE() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_HEATINGUP));
	}
	
	@Test
	void testActiveRincageSTATE() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_RINCAGE));
	}
	
	@Test
	void testActiveMachinePreteAfonctionnerSTATE() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		//System.out.println(statemachine.getNbreBoisson());
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_MACHINEPRETEAFONCTIONNER));
	}
	
	@Test
	void testActivePreparationDeBoissonSTATE() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseSelectNormalDrink("cafe");
		statemachine.raiseStartStop();
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_PREPARATION_DE_BOISSON));
	}
	
	@Test
	void testNombreDeBoissonsPreparer() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseSelectNormalDrink("cafe");
		statemachine.raiseStartStop();
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_PREPARATION_DE_BOISSON));
		statemachine.exit();
		System.out.println(statemachine.getNbreBoisson());
		assertTrue(statemachine.getNbreBoisson()==1);
	}
	
	@Test
	void testIsDetartrageMachine() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.setNbreBoisson(60);
		statemachine.raiseTimeEvent(3);
		assertTrue(statemachine.getIsDetartrage());
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_ATTENTE_ACTION_));
	}
	
	@Test
	void testIsNettoyageMachine() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.setNbreBoissonAuCafe(30);
		statemachine.raiseTimeEvent(3);
		assertTrue(statemachine.getIsNettoyage());
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_ATTENTE_ACTION_));
	}
	
	@Test
	void testIsCalcnCleanMachine() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.setNbreBoissonAuCafe(30);
		statemachine.setNbreBoisson(60);
		statemachine.raiseTimeEvent(3);
		assertTrue(statemachine.getIsCalcnClean());
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_ATTENTE_ACTION_));
	}
	
	@Test
	void testReserVoirEauMachineVide() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.setVolumeEau(statemachine.getVolumeEau()-2000);
		statemachine.raiseTimeEvent(3);
		assertTrue(statemachine.getIsReservoirEmpty());
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_ALERT_ACTION));
	}
	
	@Test
	void testBacCollectorMachinePlein() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.setMasseCafeUtiliser(300);
		statemachine.raiseTimeEvent(3);
		assertTrue(statemachine.getIsViderBacCollector());
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_ALERT_ACTION));
	}
	
	@Test
	void testReservoiGrainsMachineVide() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.setMasseGrain(statemachine.getMasseGrain()-300);
		statemachine.raiseTimeEvent(3);
		assertTrue(statemachine.getIsGrainsAjouter());
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_ALERT_ACTION));
	}
	
	@Test
	void testChangerFiltreMachine() {
		MachineAcafeProfessionnelleCtrl statemachine = new MachineAcafeProfessionnelleCtrl();
		statemachine.setTimerService(new TimerService());
		statemachine.setOperationCallback(new OperationCallback(statemachine));
		statemachine.enter();
		statemachine.raiseStartStop();
		statemachine.raiseStartStop();
		statemachine.raiseTimeEvent(0);
		statemachine.setTempEau(96);
		statemachine.raiseTimeEvent(3);
		statemachine.raiseTimeEvent(3);
		statemachine.setFiltreAeau(true);
		statemachine.setVolumeEauUtilise(50000);
		statemachine.raiseTimeEvent(3);
		assertTrue(statemachine.getIsFilterChange());
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_ALERT_ACTION));
	}
}
