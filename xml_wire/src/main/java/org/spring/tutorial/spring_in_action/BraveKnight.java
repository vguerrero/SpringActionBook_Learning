package org.spring.tutorial.spring_in_action;

public class BraveKnight implements Knight {
	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}
}
