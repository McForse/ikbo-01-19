package ru.mirea.pr9.exercise2;

public class LabClass {
	private final LabClassUi labClassUi;

	public LabClass() {
		this.labClassUi = new LabClassDriver();
	}

	public LabClassUi getLabClassUi() {
		return labClassUi;
	}
}
