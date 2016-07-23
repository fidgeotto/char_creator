package com.df.dnd.char_creator.controller;

import java.util.ArrayList;
import java.util.List;

import com.df.dnd.char_creator.model.impl.Skill;

public class SkillCreator {
	
	public List<Skill> getSkillList() {
	
		List<Skill> skillList = new ArrayList<Skill>();
		
		String[] appraiseClasses = {"Bard", "Rogue"};
		Skill appraise = new Skill("Appraise", true, "int", appraiseClasses, 0);
		
		String[] balanceClasses = {"Bard", "Monk", "Rogue"};
		Skill balance = new Skill("Balance", true, "dex", balanceClasses, 1);
		
		String[] bluffClasses = {"Bard", "Rogue", "Sorcerer"};
		Skill bluff = new Skill("Bluff", true, "cha", bluffClasses, 0);
		
		String[] climbClasses = {"Barbarian", "Bard", "Fighter", "Monk", "Ranger", "Rogue"};
		Skill climb = new Skill("Climb", true, "str", climbClasses, 1);
		
		String[] concentrationClasses = {"Bard", "Cleric", "Druid", "Monk", "Paladin", "Ranger", "Sorcerer", "Wizard"};
		Skill concentration = new Skill("Concentration", true, "con", concentrationClasses, 0);
		
		String[] craftClasses = {"Barbarian", "Bard", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Wizard"};
		Skill craft = new Skill("Craft", true, "int", craftClasses, 0);
		
		String[] decipherScriptClasses = {"Bard", "Rogue", "Wizard"};
		Skill decipherScript = new Skill("Decipher Script", false, "int", decipherScriptClasses, 0);
		
		String[] diplomacyClasses = {"Bard", "Cleric", "Druid", "Monk", "Paladin", "Rogue"};
		Skill diplomacy = new Skill("Diplomacy", true, "cha", diplomacyClasses, 0);
		
		String[] disableDeviceClasses = {"Rogue"};
		Skill disableDevice = new Skill("Disable Device", false, "int", disableDeviceClasses, 0);
		
		String[] disguiseClasses = {"Bard", "Rogue"};
		Skill disguise = new Skill ("Disguise", true, "cha", disguiseClasses, 0);
		
		String[] escapeArtistClasses = {"Bard", "Monk", "Rogue"};
		Skill escapeArtist = new Skill("Escape Artist", true, "dex", escapeArtistClasses, 1);
		
		String[] forgeryClasses = {"Rogue"};
		Skill forgery = new Skill("Forgery", true, "int", forgeryClasses, 0);
		
		String[] gatherInformationClasses = {"Bard", "Rogue"};
		Skill gatherInformation = new Skill("Gather Information", true, "cha", gatherInformationClasses, 0);
		
		String[] handleAnimalClasses = {"Barbarian", "Druid", "Fighter", "Paladin", "Ranger"};
		Skill handleAnimal = new Skill("Handle Animal", false, "cha", handleAnimalClasses, 0);
		
		String[] healClasses = {"Cleric", "Druid", "Paladin", "Ranger"};
		Skill heal = new Skill("Heal", true, "wis", healClasses, 0);
		
		String[] hideClasses = {"Bard", "Monk", "Ranger", "Rogue"};
		Skill hide = new Skill("Hide", true, "dex", hideClasses, 1);
		
		String[] intimidateClasses = {"Barbarian", "Fighter", "Rogue"};
		Skill intimidate = new Skill("Intimidate", true, "cha", intimidateClasses, 0);
		
		String[] jumpClasses = {"Barbarian", "Bard", "Fighter", "Monk", "Ranger", "Rogue"};
		Skill jump = new Skill("Jump", true, "str", jumpClasses, 1);
		
		String[] knowledgeArcanaClasses = {"Bard", "Cleric", "Monk", "Sorcerer", "Wizard"};
		Skill knowledgeArcana = new Skill("Knowledge (arcana)", false, "int", knowledgeArcanaClasses, 0);
		
		String[] knowledgeArchAndEngClasses = {"Bard", "Wizard"};
		Skill knowledgeArchAndEng = new Skill ("Knowledge (architecture and engineering)", false, "int", knowledgeArchAndEngClasses, 0);
		
		String[] knowledgeDungeoneeringClasses = {"Bard", "Ranger", "Wizard"};
		Skill knowledgeDungeoneering = new Skill("Knowledge (dungeoneering)", false, "int", knowledgeDungeoneeringClasses, 0);
		
		String[] knowledgeGeographyClasses = {"Bard", "Ranger", "Wizard"};
		Skill knowledgeGeography = new Skill("Knowledge (geography)", false, "int", knowledgeGeographyClasses, 0);
		
		String[] knowledgeHistoryClasses = {"Bard", "Cleric", "Wizard"};
		Skill knowledgeHistory = new Skill("Knowledge (history)", false, "int", knowledgeHistoryClasses, 0);
		
		String[] knowledgeLocalClasses = {"Bard", "Rogue", "Wizard"};
		Skill knowledgeLocal = new Skill("Knowledge (local)", false, "int", knowledgeLocalClasses, 0);
		
		String[] knowledgeNatureClasses = {"Bard", "Druid", "Ranger", "Wizard"};
		Skill knowledgeNature = new Skill("Knowledge (nature)", false, "int", knowledgeNatureClasses, 0);
		
		String[] knowledgeNobilityClasses = {"Bard", "Paladin", "Wizard"};
		Skill knowledgeNobility = new Skill("Knowledge (nobility and royalty)", false, "int", knowledgeNobilityClasses, 0);
		
		String[] knowledgeReligionClasses = {"Bard", "Cleric", "Monk", "Paladin", "Wizard"};
		Skill knowledgeReligion = new Skill("Knowledge (religion)", false, "int", knowledgeReligionClasses, 0);
		
		String[] knowledgePlanesClasses = {"Bard", "Cleric", "Wizard"};
		Skill knowledgePlanes = new Skill("Knowledge (the planes)", false, "Int", knowledgePlanesClasses, 0);
		
		String[] listenClasses = {"Barbarian", "Bard", "Druid", "Monk", "Ranger", "Rogue"};
		Skill listen = new Skill("Listen", true, "wis", listenClasses, 0);
		
		String[] moveSilentlyClasses = {"Bard", "Monk", "Ranger", "Rogue"};
		Skill moveSilently = new Skill("Move Silently", true, "dex", moveSilentlyClasses, 1);
		
		String[] openLockClasses = {"Rogue"};
		Skill openLock = new Skill("Open Lock", false, "dex", openLockClasses, 0);
		
		String[] performClasses = {"Bard", "Monk", "Rogue"};
		Skill perform = new Skill("Perform", true, "cha", performClasses, 0);
		
		String[] professionClasses = {"Bard", "Cleric", "Druid", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Wizard"};
		Skill profession = new Skill("Profession", false, "wis", professionClasses, 0);
		
		String[] rideClasses = {"Barbarian", "Druid", "Fighter", "Paladin", "Ranger"};
		Skill ride = new Skill("Ride", true, "dex", rideClasses, 0);
		
		String[] searchClasses = {"Ranger", "Rogue"};
		Skill search = new Skill("Search", true, "int", searchClasses, 0);
		
		String[] senseMotiveClasses = {"Bard", "Monk", "Paladin", "Rogue"};
		Skill senseMotive = new Skill("Sense Motive", true, "wis", senseMotiveClasses, 0);
		
		String[] sleightOfHandClasses = {"Bard", "Rogue"};
		Skill sleightOfHand = new Skill("Sleight of Hand", false, "dex", sleightOfHandClasses, 1);
		
		String[] speakLanguageClasses = {"Bard"};
		Skill speakLanguage = new Skill("Speak Language", false, "none", speakLanguageClasses, 0);
		
		String[] spellcraftClasses = {"Bard", "Cleric", "Druid", "Sorcerer", "Wizard"};
		Skill spellcraft = new Skill("Spellcraft", false, "int", spellcraftClasses, 0);
		
		String[] spotClasses = {"Druid", "Monk", "Ranger", "Rogue"};
		Skill spot = new Skill("Spot", true, "wis", spotClasses, 0);
		
		String[] survivalClasses = {"Barbarian", "Druid", "Ranger"};
		Skill survival = new Skill("Survival", true, "wis", survivalClasses, 0);
		
		String[] swimClasses = {"Barbarian", "Bard", "Druid", "Fighter", "Monk", "Ranger", "Rogue"};
		Skill swim = new Skill("Swim", true, "str", swimClasses, 2);
		
		String[] tumbleClasses = {"Bard", "Monk", "Rogue"};
		Skill tumble = new Skill("Tumble", false, "dex", tumbleClasses, 1);
		
		String[] useMagicDeviceClasses = {"Bard", "Rogue"};
		Skill useMagicDevice = new Skill("Use Magic Device", false, "cha", useMagicDeviceClasses, 0);
		
		String[] useRopeClasses = {"Ranger", "Rogue"};
		Skill useRope = new Skill("Use Rope", true, "dex", useRopeClasses, 0);
		
		skillList.add(appraise);
		skillList.add(balance);
		skillList.add(bluff);
		skillList.add(climb);
		skillList.add(concentration);
		skillList.add(craft);
		skillList.add(decipherScript);
		skillList.add(diplomacy);
		skillList.add(disableDevice);
		skillList.add(disguise);
		skillList.add(escapeArtist);
		skillList.add(forgery);
		skillList.add(gatherInformation);
		skillList.add(handleAnimal);
		skillList.add(heal);
		skillList.add(hide);
		skillList.add(intimidate);
		skillList.add(jump);
		skillList.add(knowledgeArcana);
		skillList.add(knowledgeArchAndEng);
		skillList.add(knowledgeDungeoneering);
		skillList.add(knowledgeGeography);
		skillList.add(knowledgeHistory);
		skillList.add(knowledgeLocal);
		skillList.add(knowledgeNature);
		skillList.add(knowledgeNobility);
		skillList.add(knowledgeReligion);
		skillList.add(knowledgePlanes);
		skillList.add(listen);
		skillList.add(moveSilently);
		skillList.add(openLock);
		skillList.add(perform);
		skillList.add(profession);
		skillList.add(ride);
		skillList.add(search);
		skillList.add(senseMotive);
		skillList.add(sleightOfHand);
		skillList.add(speakLanguage);
		skillList.add(spellcraft);
		skillList.add(spot);
		skillList.add(survival);
		skillList.add(swim);
		skillList.add(tumble);
		skillList.add(useMagicDevice);
		skillList.add(useRope);
		
		return skillList;
	}
	
}
