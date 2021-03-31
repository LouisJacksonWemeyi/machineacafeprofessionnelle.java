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
		assertTrue(statemachine.isStateActive(machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl.State.R1_ON_R1_MACHINEPRETEAFONCTIONNER));
	}
}
