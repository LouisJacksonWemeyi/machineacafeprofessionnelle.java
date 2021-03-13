package com.yakindu.sct.machineacafeprofessionnelle.java;


import machineacafeprofessionnelle.MachineAcafeProfessionnelleCtrl;

public class OperationCallback implements MachineAcafeProfessionnelleCtrl.OperationCallback {

final int MAX_TEMP = 95;
final int MIN_TEMP = 20;

MachineAcafeProfessionnelleCtrl statemachine;
	
	public OperationCallback(MachineAcafeProfessionnelleCtrl statemachine) {
		this.statemachine=statemachine;
	}

	@Override
	public void startHeating() {
		statemachine.setIsHeating(true);
	}

	@Override
	public void stopHeating() {
		statemachine.setIsHeating(false);
	}

	@Override
	public void startMouture(String a) {
		System.out.println(a);		
	}

	@Override
	public void stopMouture(String a) {
		System.out.println(a);		
	}

	@Override
	public void startPumping(String a) {
		System.out.println(a);		
	}

	@Override
	public void stopPumping(String a) {
		System.out.println(a);		
	}

	@Override
	public void updateHeating(long a) {
		if (statemachine.getIsHeating() && statemachine.getTempEau() < MAX_TEMP) {
			statemachine.setTempEau(statemachine.getTempEau() + a);
			System.out.println("Water temperature is : "+statemachine.getTempEau()+" °C");
		} else if (!statemachine.getIsHeating() && statemachine.getTempEau() > MIN_TEMP) {
			statemachine.setTempEau(statemachine.getTempEau() - a);
			System.out.println("Water temperature is : "+statemachine.getTempEau()+" °C");
		}

	}

	@Override
	public void show(String a) {
		System.out.print(a);
	}

}
