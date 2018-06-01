package com.qa.tracker.converter;

import com.qa.tracker.dto.SkillDto;
import com.qa.tracker.entity.Skill;

public class SkillConverter {
	
	public static Skill dtoToEntity(SkillDto SkillDto) {
		Skill Skill = new Skill(SkillDto.getSkillName(), null);
		Skill.setSkillId(SkillDto.getSkillId());
		return Skill;
	}

	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName());
	}
}
